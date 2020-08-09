package com.latihan.restful.model.request;

import com.latihan.restful.validation.BrandMustExist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BrandRequest {
    @BrandMustExist
    private String brand;
}
