package DataAccess.Concretes;

import DataAccess.Abstracts.ProductDao;
import Entities.Concretes.Product;

import java.util.ArrayList;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Added with hibernate : "+product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Updated with hibernate : "+product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Deleted with hibernate : "+product.getName());
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public ArrayList<Product> getAll() {
        return null;
    }
    // we will write data access codes
}
