package pro.sky.shopping.cart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shopping.cart.service.ShoppigCartServiceImpl;

import java.util.List;
import java.util.Set;

@RestController
public class ShoppingCartController {
    private final ShoppigCartServiceImpl shoppingCartServiceImpl;

    public ShoppingCartController(ShoppigCartServiceImpl shoppingCartServiceImpl) {
        this.shoppingCartServiceImpl = shoppingCartServiceImpl;
    }

    @GetMapping(path = "/add")
    public List<Integer> addProducts(@RequestParam List<Integer> products) {
        shoppingCartServiceImpl.addProduct(products);
        return products;
    }

    @GetMapping(path = "/get")
    public Set<Integer> getProducts() {
        return shoppingCartServiceImpl.getShoppingCatrs();
    }

    @GetMapping(path = "/hello")
    public String getProduct() {
        return "Hello earth";
    }

    @GetMapping(path = "/bye")
    public String buyProduct() {
        return "Goodbye earth";
    }

    @GetMapping(path = "/good afternoon")
    public String goodAfternoon() {
        return "Goodbye morning";
    }
}
