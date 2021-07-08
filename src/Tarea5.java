//TAREA 5
//Solicitar al usuario dos valores, y determinar cual número es el mayor

import java.util.Scanner;

public class Tarea5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//instancia clase scanner

        System.out.println("Proporciona el numero1:"); //impreime en consola
        int numero1 = Integer.parseInt(scanner.nextLine()); //solicita dato en consola

        System.out.println("Proporciona el numero2:"); //impreime en consola
        int numero2 = Integer.parseInt(scanner.nextLine()); //solicita dato en consola

        System.out.println("El numero mayor es:"); //impreime en consola
        System.out.println((numero1 >= numero2) ? numero1 : numero2); //impreime en consola
    }
}
