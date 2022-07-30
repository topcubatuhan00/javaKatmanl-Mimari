package Business.Concretes;
import Business.Abstracts.ProductService;
import Core.Abstracts.LoggerService;
import DataAccess.Abstracts.ProductDao;
import DataAccess.Concretes.HibernateProductDao;
import Entities.Concretes.Product;

import java.util.ArrayList;

public class ProductManager implements ProductService {

    // dependency injection

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService){
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        // business codes will write inline -> simple code here
        if (product.getCategoryId() == 1){
            System.out.println("Invalid product");
            return;
        }
        this.loggerService.logToSystem(product.getName());
        this.productDao.add(product);
    }

    @Override
    public ArrayList<Product> getAll() {
        return null;
    }
}
