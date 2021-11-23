package poo.main;

import java.util.Scanner;

import poo.model.Figura;
import poo.model.impl.Circulo;
import poo.model.impl.Rectangulo;
import poo.model.impl.Triangulo;

public class FiguraMain {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PI: "+ Circulo.PI);
        int valor1 = 5, valor2 = 5;
        System.out.println("nuevo valor1: " + (5 * valor1++));
        System.out.println("nuevo valor1: " + (5 * valor1++));
        System.out.println("nuevo valor2: " + (5 * ++valor2));
        System.out.println("nuevo valor2: " + (5 * ++valor2));
        System.out.println("valor1: " + valor1);
        System.out.println("valor2: " + valor2);
        System.out.println("Escriba 1 para Circulo, 2 para Cuadrado, 3 para Triángulo");
        int valor = scanner.nextInt();

        Figura figura;

        switch (valor) {
            case 1:
                Circulo cir = new Circulo();
                cir.setRadio(15.0);
                figura = cir;
                break;
            case 2:
                Rectangulo rect = new Rectangulo();
                rect.setBase(4.2);
                rect.setAltura(3.5);
                figura = rect;
                break;
            case 3:
                Triangulo tria = new Triangulo();
                tria.setBase(4.2);
                tria.setAltura(3.5);
                tria.setLadoA(12.4);
                tria.setLadoB(14.3);
                tria.setLadoC(8.5);
                figura = tria;
                break;
            default:
                figura = new Circulo();
                System.err.println("Caracter equivocado");
                break;
        } 
        System.out.println("Area: " + figura.calcularArea());
        scanner.close();
    }
}
