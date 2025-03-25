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

        if (Verificador.sobreponen(rectA, rectB)) {
            System.out.println("Los rectángulos A y B se sobreponen.");
            Rectangulo areaSobre = calcularSobreposicion(rectA, rectB);
            System.out.println("Área de sobreposición: " + areaSobre.calculoArea());
        } else if (Verificador.tocan(rectA, rectB)) {
            System.out.println("Los rectángulos A y B están juntos.");
        } else {
            System.out.println("Los rectángulos A y B son disjuntos.");
        }
        sc.close();
    }
    
    public static void mostrarRectangulo(Rectangulo r, String nombre) {
        System.out.println("Rectángulo " + nombre + ": " + r);
    }
    public static Rectangulo calcularSobreposicion(Rectangulo A, Rectangulo B) {
        double x1 = Math.max(A.getEsquina1().getX(), B.getEsquina1().getX());
        double y1 = Math.max(A.getEsquina1().getY(), B.getEsquina1().getY());
        double x2 = Math.min(A.getEsquina2().getX(), B.getEsquina2().getX());
        double y2 = Math.min(A.getEsquina2().getY(), B.getEsquina2().getY());

        return new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
    }



}
