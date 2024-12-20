package pro.sky.shopping.cart.model;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@SessionScope
public class ShoppingCart {
    public Set<Integer> shopingCatrs = new HashSet<>(List.of());

    public void addProduct(List<Integer> numbers) {
        numbers.stream().forEach((Integer number) -> {
            shopingCatrs.add(number);
        });


    }

    public Set<Integer> getShopingCatrs() {
        return shopingCatrs;
    }


}
