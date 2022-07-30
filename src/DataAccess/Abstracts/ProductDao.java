package DataAccess.Abstracts;

import Entities.Concretes.Product;

import java.util.ArrayList;

public interface ProductDao {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product get(int id);
    ArrayList<Product> getAll();
}
