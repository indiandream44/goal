package learning.framework.service;

import java.util.List;

import learning.framework.springhibernate.onetomany.Product;

public interface ProductService {

    List<Product> getAllProducts();

}
