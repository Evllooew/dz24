package dz24.demo.service;

import java.util.List;

public interface ShopService {
    public void addItemToCart(List<Integer> itemID);

    public List<Integer> getCart();
}