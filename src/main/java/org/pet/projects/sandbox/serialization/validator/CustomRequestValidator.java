package org.pet.projects.sandbox.serialization.validator;

import org.pet.projects.sandbox.serialization.annotation.CustomRequestConstraint;
import org.pet.projects.sandbox.serialization.model.request.Request;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;

public class CustomRequestValidator implements ConstraintValidator<CustomRequestConstraint, Request> {


    @Override
    public void initialize(CustomRequestConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(Request request, ConstraintValidatorContext context) {
        if (request.getTypes().equals("ters")) {
            try {
                Field field = Request.class.getDeclaredField("name");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

        }
        return true;
    }

}