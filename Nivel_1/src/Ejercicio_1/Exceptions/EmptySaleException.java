package Ejercicio_1.Exceptions;

public class EmptySaleException extends Exception {

    public EmptySaleException (){

        super("Per fer una venda primer has d’afegir productes");
    }
}