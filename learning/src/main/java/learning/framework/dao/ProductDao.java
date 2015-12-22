package learning.framework.dao;

import java.util.List;

import learning.framework.springhibernate.onetomany.Product;

public interface ProductDao {

    List<Product> getAll();

    
}
