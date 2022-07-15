package com.wesleycardososilva.vendas_online.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "tb_product")
public class Product {
    @Id
    @SequenceGenerator(
       name = "product_sequence",
       sequenceName = "product_sequence",
       allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Integer id;
    private String name;
    private long price;
}
