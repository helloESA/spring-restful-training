package com.latihan.restful.validation.validator;

import com.latihan.restful.repository.BrandRepository;
import com.latihan.restful.validation.BrandMustExist;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BrandMustExistValidator implements ConstraintValidator<BrandMustExist, String> {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandMustExistValidator(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null)
        {
            return true;
        }

        return brandRepository.findBrandByBrandName(s) != null;
    }
}
