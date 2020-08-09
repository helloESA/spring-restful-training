package com.latihan.restful.repository;

import com.latihan.restful.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
    @Query
    Brand findBrandByBrandName(@Param("brandName") String brandName);
}
