package com.latihan.restful.repository;

import com.latihan.restful.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query(value = "select p from Product p left join p.brand b where b.brandName = :brandName")
    List<Product> findProductsByBrand(@Param("brandName") String brandName);

}
