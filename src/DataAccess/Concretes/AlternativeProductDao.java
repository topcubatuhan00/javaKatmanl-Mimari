package DataAccess.Concretes;

import DataAccess.Abstracts.ProductDao;
import Entities.Concretes.Product;

import java.util.ArrayList;

public class AlternativeProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Alternative class used for : "+product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public ArrayList<Product> getAll() {
        return null;
    }
}
