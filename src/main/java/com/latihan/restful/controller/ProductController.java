package com.latihan.restful.controller;

import com.latihan.restful.entity.Product;
import com.latihan.restful.model.request.BrandRequest;
import com.latihan.restful.model.response.ProductResponse;
import com.latihan.restful.model.response.WebResponse;
import com.latihan.restful.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public WebResponse findAllProducts()
    {
        List<ProductResponse> productResponses = productService.findAllProducts();

        return WebResponse.builder()
                .status(HttpStatus.OK.value())
                .message(HttpStatus.OK.name())
                .data(productResponses)
                .build();
    }

    @PostMapping("/brand")
    public WebResponse findProductByBrand(@Valid @RequestBody BrandRequest product)
    {
        List<ProductResponse> products = productService.findProductByBrand(product);

        return WebResponse.builder()
                .status(HttpStatus.OK.value())
                .message(HttpStatus.OK.name())
                .data(products)
                .build();
    }
}
