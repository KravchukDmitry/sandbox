package org.pet.projects.sandbox.serialization.validator;


import org.pet.projects.sandbox.serialization.annotation.CustomFieldConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomFieldValidator implements ConstraintValidator<CustomFieldConstraint, String> {

    private boolean isActive;

    @Override
    public void initialize(CustomFieldConstraint constraintAnnotation) {
        isActive = constraintAnnotation.isActive();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        if (isActive) {
            context.buildConstraintViolationWithTemplate("template").addConstraintViolation();
            return false;
        }
        return true;
    }
}
