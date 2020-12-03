package com.example.Szoft.Mod.Project2.service;

import com.example.Szoft.Mod.Project2.entity.Category;
import com.example.Szoft.Mod.Project2.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void insertCategory(Category category) {
        this.categoryRepository.save(category);
    }


    public Iterable<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Integer id){
        return this.categoryRepository.findById(id);
    }

    public void updateCategory(Category category) {
        this.categoryRepository.save(category);
    }

    public String removeCategoryById(Integer id) {
        try {
            this.categoryRepository.deleteById(id);
            return "Sikeres törlés!";
        }
        catch(EmptyResultDataAccessException e) {
            return "Nem létezik ilyen id!";
        }
    }
}
