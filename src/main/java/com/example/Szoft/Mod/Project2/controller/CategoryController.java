package com.example.Szoft.Mod.Project2.controller;


import com.example.Szoft.Mod.Project2.entity.Category;
import com.example.Szoft.Mod.Project2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Category> getAllAvailableMovies() {
        return categoryService.getAllCategory();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Category> getCategoryById(@PathVariable("id") int id){
        return categoryService.getCategoryById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteCategoryById(@PathVariable("id") int id) {
        return categoryService.removeCategoryById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertCategory(@RequestBody Category category){
        categoryService.insertCategory(category);
    }
}
