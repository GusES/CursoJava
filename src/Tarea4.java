//TAREA 4
//En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, para ello deberemos crear las siguientes variables:
//  alto (int)
//  ancho (int)
//El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el siguiente formato(no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):
//  Proporciona el alto:
//  Proporciona el ancho:
//  Area: <area>
//  Perimetro: <perimetro>

import java.util.Scanner;

public class Tarea4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//instancia clase scanner

        System.out.println("Proporciona el alto:"); //imprime en consola
        int alto = Integer.parseInt(scanner.nextLine()); //solicita dato en consola

        System.out.println("Proporciona el ancho:"); //imprime en consola
        int ancho = Integer.parseInt(scanner.nextLine()); //solicita dato en consola

        System.out.println("Area: " + (alto * ancho)); //imprime en consola
        System.out.println("Perimetro: " + ((alto * ancho) * 2)); //imprime en consola
    }
}
