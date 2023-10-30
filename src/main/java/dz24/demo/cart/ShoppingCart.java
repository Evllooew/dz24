package dz24.demo.cart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SessionScope
@Component
public class ShoppingCart {
    private List<Integer> itemID;

    public ShoppingCart() {
        this.itemID = new ArrayList<>();
    }

    public void addItemToCart(Integer itemID) {
        this.itemID.add(itemID);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itemID=" + itemID +
                '}';
    }

    public List<Integer> getItemID() {
        return this.itemID;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Bean  is created");
    }
}