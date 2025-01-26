package Ejercicio_1;

import java.util.List;
import java.util.ArrayList;

class Sale {

    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {

        products.add(product);
    }

    // Método para calcular el total
    public void calculateTotalPrice() throws EmptySaleException {

        if (products.isEmpty()) {
            throw new EmptySaleException("Para hacer una venta primero debes añadir productos");
        }

        totalPrice = 0; // Reiniciar el precio total
        for (Product product : products) {
            totalPrice += product.getPrice();
        }

        System.out.println("El precio total de la venta es: " + totalPrice);
    }
}
