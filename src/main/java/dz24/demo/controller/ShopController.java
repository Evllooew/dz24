package dz24.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import dz24.demo.service.ShopServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class ShopController {

    private final ShopServiceImpl shopServiceImpl;

    public ShopController(ShopServiceImpl shopServiceImpl) {
        this.shopServiceImpl = shopServiceImpl;
    }

    @GetMapping("/add")
    public String addItemToCart(@RequestParam(value = "itemID") List<Integer> itemID) {
        shopServiceImpl.addItemToCart(itemID);
        return "Items added to the cart: " + itemID;
    }

    @GetMapping("/get")
    public List<Integer> getShoppingCart() {
        return shopServiceImpl.getCart();
    }
}

