package com.wesleycardososilva.vendas_online.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_category")
public class Category {
    @Id
    @SequenceGenerator(
        name = "category_sequence",
        sequenceName = "category_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "category_sequence"
    )
    private Integer id;
    private String name;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "product_category",
            joinColumns = @JoinColumn(
                    name = "category_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "product_id",
                    referencedColumnName = "id"
            )

    )
    private List<Product> products;

    public void addProducts(Product product){
        if(products == null) products = new ArrayList<>();
        products.add(product);
    }

}
