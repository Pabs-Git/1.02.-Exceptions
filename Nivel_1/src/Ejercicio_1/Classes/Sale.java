package Ejercicio_1.Classes;

import Ejercicio_1.Exceptions.EmptySaleException;

import java.util.List;
import java.util.ArrayList;

public class Sale {

    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void calculateTotalPrice() throws EmptySaleException {

        if (products.isEmpty()) {

            throw new EmptySaleException();
        }

        totalPrice = 0;

        for (Product product : products) {

            totalPrice += product.getPrice();
        }

        System.out.println("The total sale price is: " + totalPrice);
    }
}
