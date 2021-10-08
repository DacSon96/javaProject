package com.codegym.service.product;

import com.codegym.dao.Product.IProductDao;
import com.codegym.dao.Product.ProductDao;
import com.codegym.model.Product;

import java.util.List;

public class ProductService implements IProductService {
    IProductDao productDao = new ProductDao();

    @Override
    public List<Product> show() {
        return productDao.show();
    }

    @Override
    public boolean create(Product product) {
        return productDao.create(product);
    }

    @Override
    public boolean update(int id, Product product) {
        return productDao.update(id, product);
    }

    @Override
    public boolean delete(int id) {
        return productDao.delete(id);
    }

    @Override
    public Product findById(int id) {
        return productDao.findById(id);
    }


}