//TAREA 3
//Se solicita capturar la siguiente información de una tienda de libros

import java.util.Scanner;

public class Tarea3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //instancia clase scanner

        System.out.println("Proporciona el nombre:"); //impreime en consola
        String nombre = scanner.nextLine(); //solicita dato en consola

        System.out.println("Proporciona el id:"); //impreime en consola
        int id = Integer.parseInt(scanner.nextLine()); //solicita dato en consola

        System.out.println("Proporciona el precio:"); //impreime en consola
        double precio = Double.parseDouble(scanner.nextLine()); //solicita dato en consola

        System.out.println("Proporciona el envio gratuito:"); //impreime en consola
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine()); //solicita dato en consola

        System.out.println(nombre + " #" + id); //impreime en consola
        System.out.println("Precio: $" + precio); //impreime en consola
        System.out.println("Envio Gratuito: " + envioGratuito); //impreime en consola
    }
}
