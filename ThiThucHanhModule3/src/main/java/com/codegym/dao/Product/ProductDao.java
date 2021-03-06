package com.codegym.dao.Product;

import com.codegym.dao.DBConnection;
import com.codegym.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements IProductDao{
    public static final String SELECT_ALL_PRODUCTS = "SELECT * FROM product";
    public static final String INSERT_NEW_PRODUCT = "INSERT INTO product (name, price, quantity, color, description,categoryId) VALUES (?,?,?,?,?,?)";
    public static final String SELECT_PRODUCT_BY_NAME = "SELECT * FROM product WHERE name like ?";
    public static final String UPDATE_PRODUCT_BY_ID = "UPDATE product SET name = ?, price = ?, quantity = ?, color = ?, description = ?, categoryId = ? WHERE id = ?";
    public static final String DELETE_PRODUCT_BY_ID = "DELETE FROM product WHERE id = ?";
    public static final String SELECT_PRODUCT_BY_ID = "SELECT * FROM product WHERE id = ?";
    Connection connection = DBConnection.getConnection();

    @Override
    public List<Product> show() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_PRODUCTS);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String keyName = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                int categoryId = resultSet.getInt("categoryId");
                products.add(new Product(id, keyName, price, quantity, color,description, categoryId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public boolean create(Product product) {
        boolean isCreated = false;
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_NEW_PRODUCT);
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setInt(3, product.getQuantity());
            statement.setString(4, product.getColor());
            statement.setString(5, product.getDescription());
            statement.setInt(6,product.getCategoryId());
            isCreated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isCreated;
    }

    @Override
    public boolean update(int id, Product product) {
        boolean isUpdated = false;
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUCT_BY_ID);
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setInt(3, product.getQuantity());
            statement.setString(4, product.getColor());
            statement.setString(5, product.getDescription());
            statement.setInt(6,product.getCategoryId());
            statement.setInt(7, id);
            isUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean delete(int id) {
        boolean isDeleted = false;
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_PRODUCT_BY_ID);
            statement.setInt(1, id);
            isDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isDeleted;
    }

    @Override
    public boolean save(Product product) {
        return false;
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String keyName = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                int categoryId = resultSet.getInt("categoryId");
                product=new Product(id, keyName, price, quantity, color,description, categoryId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }
}
