import Business.Abstracts.ProductService;
import Business.Concretes.ProductManager;
import Core.Concretes.JLoggerManagerAdapter;
import DataAccess.Concretes.AlternativeProductDao;
import DataAccess.Concretes.HibernateProductDao;
import Entities.Concretes.Product;
import JLogger.JLoggerManager;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,2,"Elma",12,50);

        // todo : spring IoC
        ProductService productService = new ProductManager(new AlternativeProductDao(), new JLoggerManagerAdapter());
        productService.add(product);
    }
}
