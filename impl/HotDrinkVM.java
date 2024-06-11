package less1.practice.impl;

import less1.practice.Product;
import less1.practice.VendingMachine;


import java.util.ArrayList;
import java.util.List;

public class HotDrinkVM extends VendingMachine {

    public HotDrinkVM() {
        super();
    }

    /*public HotDrinkVM getProduct(String name, int volume, int temperature) {

        for (HotDrinkVM param : products) {
            if (param.getName().equals(name)) {
                products.remove(param);
                return param;
            }
        }

        throw new RuntimeException("No such product: " + name);
    }*/

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }
}
