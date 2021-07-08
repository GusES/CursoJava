//TAREA 2
//Se solicita incluir la siguiente información acerca de un libro:
//    titulo
//    autor
//Debes imprimir la información en el siguiente formato:
//    Proporciona el titulo:
//    Proporciona el autor:
//    <titulo> fue escrito por <autor>

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);//instancia clase scanner

        System.out.println("Proporciona el titulo:"); //imprime en consola
        String titulo = consola.nextLine(); //ingresa dato en consola

        System.out.println("Proporciona el autor:"); //imprime en consola
        String autor = consola.nextLine();//ingresa dato en consola

        System.out.println(titulo + " fue escrito por " + autor); //imprime en consola
    }
}
