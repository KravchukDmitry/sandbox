package org.pet.projects.sandbox.serialization.annotation;

import org.pet.projects.sandbox.serialization.validator.CustomRequestValidator;

import javax.validation.Constraint;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CustomRequestValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomRequestConstraint {
}
