package com.wesleycardososilva.vendas_online.controller;

import com.wesleycardososilva.vendas_online.entity.Category;
import com.wesleycardososilva.vendas_online.service.CategoryService;
import com.wesleycardososilva.vendas_online.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    public Category saveCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
        return category;
    }


}
