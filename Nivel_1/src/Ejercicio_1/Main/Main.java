package Ejercicio_1.Main;

import Ejercicio_1.Exceptions.EmptySaleException;
import Ejercicio_1.Classes.Product;
import Ejercicio_1.Classes.Sale;

public class Main {

    public static void main(String[] args) {

        Sale actualSale = new Sale();

        try {

            actualSale.calculateTotalPrice();
        }

        catch (EmptySaleException e) {

            System.out.println(e.getMessage());
        }

        actualSale.addProduct(new Product("Manzana", 1.5));
        actualSale.addProduct(new Product("Naranja", 2.0));

        try {

            actualSale.calculateTotalPrice();
        }

        catch (EmptySaleException e) {

            System.out.println(e.getMessage());
        }

        try {

            System.out.println(actualSale.getProducts().get(10));
        }

        catch (IndexOutOfBoundsException e) {

            System.out.println("Error: Index out of bounds");
        }
    }
}