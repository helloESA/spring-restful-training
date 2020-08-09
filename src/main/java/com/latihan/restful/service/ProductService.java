package com.latihan.restful.service;

import com.latihan.restful.entity.Product;
import com.latihan.restful.model.request.BrandRequest;
import com.latihan.restful.model.response.ProductResponse;
import com.latihan.restful.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Service
@Validated
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductResponse> findAllProducts()
    {
        List<ProductResponse> productResponseList = new ArrayList<>();

        List<Product> productResponses = productRepository.findAll();

        for (Product p : productResponses)
        {
            productResponseList.add(ProductResponse.builder()
                    .id(p.getId())
                    .productName(p.getProductName())
                    .brandName(p.getBrand().getBrandName())
                    .build()
                    );
        }

        return productResponseList;
    }

    public List<ProductResponse> findProductByBrand(@Valid BrandRequest product)
    {
        List<ProductResponse> productResponses = new ArrayList<>();

        List<Product> products = productRepository.findProductsByBrand(product.getBrand());

        for (Product p : products)
        {
            productResponses.add(ProductResponse.builder()
                    .id(p.getId())
                    .productName(p.getProductName())
                    .brandName(p.getBrand().getBrandName())
                    .build());
        }

        return productResponses;
    }
}
