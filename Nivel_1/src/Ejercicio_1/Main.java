package Ejercicio_1;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Crear una venta
        Sale sale = new Sale();

        // Capturar VendaBuidaException
        try {
            sale.calculateTotalPrice();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        // Añadir productos y recalcular
        sale.addProduct(new Product("Manzana", 1.5));
        sale.addProduct(new Product("Naranja", 2.0));

        try {
            sale.calculateTotalPrice();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        // Generar y capturar IndexOutOfBoundsException
        try {

            List<Integer> numbers = new ArrayList<>();
            System.out.println(numbers.get(0)); // Genera la excepción
        }

        catch (IndexOutOfBoundsException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}