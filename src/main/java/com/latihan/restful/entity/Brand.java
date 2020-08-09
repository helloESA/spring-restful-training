package com.latihan.restful.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "brand")
public class Brand {
    @Id
    private Long id;

    @NotNull
    private String brandName;

    @OneToMany(mappedBy = "brand")
    private List<Product> products;
}
