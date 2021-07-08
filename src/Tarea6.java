//TAREA 6
//Crear un sistema de calificaciones según se solicita.

import java.util.Scanner;

public class Tarea6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //instancia clase scanner

        System.out.println("Proporciona un valor entre 0 y 10:"); //imprime en consola
        int numero = Integer.parseInt(scanner.nextLine()); //convierte a entero el valor, seria mejor double, pero pedia int

        String calificacion = "Valor desconocido"; //Inicializacion variable, valor default

        if ((numero >= 9) && (numero <= 10)) {
            calificacion = "A"; //reasignamos valor a la variable
        } else if ((numero >= 8) && (numero < 9)) {
            calificacion = "B"; //reasignamos valor a la variable
        } else if ((numero >= 7) && (numero < 8)) {
            calificacion = "C"; //reasignamos valor a la variable
        } else if ((numero >= 6) && (numero < 7)) {
            calificacion = "D"; //reasignamos valor a la variable
        } else if ((numero >= 0) && (numero < 6)) {
            calificacion = "F"; //reasignamos valor a la variable
        }

        System.out.println(calificacion); //imprime en consola
    }
}
