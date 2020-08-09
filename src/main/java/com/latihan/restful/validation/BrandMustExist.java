package com.latihan.restful.validation;

import com.latihan.restful.validation.validator.BrandMustExistValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {BrandMustExistValidator.class})
@Target({METHOD, FIELD, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
public @interface BrandMustExist {
    String message() default "Brand Must Exist";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default {};
}
