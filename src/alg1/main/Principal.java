package alg1.main;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del primer rectángulo (x1 y1 x2 y2):");
        Coordenada c1 = new Coordenada(sc.nextDouble(), sc.nextDouble());
        Coordenada c2 = new Coordenada(sc.nextDouble(), sc.nextDouble());
        Rectangulo rectA = new Rectangulo(c1, c2);

        System.out.println("Ingrese las coordenadas del segundo rectángulo (x1 y1 x2 y2):");
        Coordenada c3 = new Coordenada(sc.nextDouble(), sc.nextDouble());
        Coordenada c4 = new Coordenada(sc.nextDouble(), sc.nextDouble());
        Rectangulo rectB = new Rectangulo(c3, c4);

        mostrarRectangulo(rectA, "A");
        mostrarRectangulo(rectB, "B");
    
     public static void mostrarRectangulo(Rectangulo r, String nombre) {
        System.out.println("Rectángulo " + nombre + ": " + r);
    }

}
