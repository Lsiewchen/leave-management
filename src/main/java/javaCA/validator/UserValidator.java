package javaCA.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javaCA.model.User;

@Component
public class UserValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "userId", "error.user.userid.empty");
		ValidationUtils.rejectIfEmpty(errors, "employeeId", "error.user.employeeid.empty");
//		ValidationUtils.rejectIfEmpty(errors, "name", "error.user.name.empty");
//		ValidationUtils.rejectIfEmpty(errors, "password", "error.user.password.empty");
	}
}
