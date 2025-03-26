package alg1.main;

import java.util.Scanner;

//clase que ejecuta el programa
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creo un objeto Scanner para leer datos del teclado

        System.out.println("Ingrese las coordenadas del primer rectángulo (x1 y1 x2 y2):");
        Coordenada c1 = new Coordenada(sc.nextDouble(), sc.nextDouble()); //lee las coordenadas x1, y1, x2, y2 usando sc.nextDouble
        Coordenada c2 = new Coordenada(sc.nextDouble(), sc.nextDouble()); // método de la clase Scanner en Java que lee un número decimal
        Rectangulo rectA = new Rectangulo(c1, c2); //creo un objeto Rectangulo llamado rectA usando c1 y c2

        System.out.println("Ingrese las coordenadas del segundo rectángulo (x1 y1 x2 y2):");
        Coordenada c3 = new Coordenada(sc.nextDouble(), sc.nextDouble());
        Coordenada c4 = new Coordenada(sc.nextDouble(), sc.nextDouble());
        Rectangulo rectB = new Rectangulo(c3, c4);

        mostrarRectangulo(rectA, "A");
        mostrarRectangulo(rectB, "B");

        //lama al método sobreponen de la clase Verificador
        if (Verificador.sobreponen(rectA, rectB)) {
            System.out.println("Los rectángulos A y B se sobreponen.");
            Rectangulo areaSobre = calcularSobreposicion(rectA, rectB); //calcula el área de la intersección llamando a calcularSobreposicion
            System.out.println("Área de sobreposición: " + areaSobre.calculoArea());
        } else if (Verificador.tocan(rectA, rectB)) {
            System.out.println("Los rectángulos A y B están juntos.");
        } else {
            System.out.println("Los rectángulos A y B son disjuntos.");
        }
        sc.close();
    }
    
    public static void mostrarRectangulo(Rectangulo r, String nombre) {
        System.out.println("Rectángulo " + nombre + ": " + r); // Imprime la información del rectángulo usando toString.
    }
    public static Rectangulo calcularSobreposicion(Rectangulo A, Rectangulo B) {
        double x1 = Math.max(A.getEsquina1().getX(), B.getEsquina1().getX());    //Uso Math.max para encontrar la esquina inferior izquierda del área de sobreposición
        double y1 = Math.max(A.getEsquina1().getY(), B.getEsquina1().getY());
        double x2 = Math.min(A.getEsquina2().getX(), B.getEsquina2().getX());    //Uso Math.min para encontrar la esquina superior derecha.
        double y2 = Math.min(A.getEsquina2().getY(), B.getEsquina2().getY());

        return new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
    }

}
