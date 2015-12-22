package learning.framework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learning.framework.dao.ProductDao;
import learning.framework.springhibernate.onetomany.Product;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    
    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        return productDao.getAll();
    }

}
