package learning.framework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import learning.framework.service.ProductService;
import learning.framework.springhibernate.onetomany.Product;

@Controller
public class ProductController {
 
    @Autowired
    private ProductService productService;
    
    @RequestMapping(value = "/product.htm", method = RequestMethod.GET)
    public String listPersons(Model model) {
        System.out.println("WOrking");
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }
    
}
