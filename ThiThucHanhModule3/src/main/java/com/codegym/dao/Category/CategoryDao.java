package com.codegym.dao.Category;

import com.codegym.model.Category;

import java.util.List;

public class CategoryDao implements ICategory{
    @Override
    public List<Category> show() {
        return null;
    }

    @Override
    public boolean create(Category category) {
        return false;
    }

    @Override
    public boolean update(int id, Category category) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean save(Category category) {
        return false;
    }

    @Override
    public Category findById(int id) {
        return null;
    }
}
