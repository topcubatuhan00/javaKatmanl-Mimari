package Business.Abstracts;

import Entities.Concretes.Product;
import java.util.ArrayList;

public interface ProductService {
    void add(Product product);
    ArrayList<Product> getAll();
}
