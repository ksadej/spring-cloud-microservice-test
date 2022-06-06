package com.ksa.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "product_type")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String type;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name ="productTypeId", referencedColumnName = "productTypeId")
//    private List<Product> product;
}
