package alg1.main;

public class Verificador {

    // este método determina si dos rectángulos se superponen en el espacio
    public static boolean sobreponen(Rectangulo A, Rectangulo B) {

        ///verifica cuándo dos rectángulos noo se superponen
        
                // ! sirve para invertir el resultado para que devuelva true cuando si se superponen
        return !(A.getEsquina2().getX() <= B.getEsquina1().getX() || //vemos si su esquina superior derecha está a la izquierda de la esquina inferior izquierda del otro rectángulo
                 B.getEsquina2().getX() <= A.getEsquina1().getX() || //vemos si su esquina inferior izquierda está a la derecha de la esquina superior derecha del otro
                 A.getEsquina2().getY() <= B.getEsquina1().getY() || //vemos si su esquina superior derecha está debajo de la esquina inferior izquierda del otro
                 B.getEsquina2().getY() <= A.getEsquina1().getY());  //vemos si su  esquina inferior izquierda está arriba de la esquina superior derecha del otro

                 //si ninguna de estas condiciones se cumple, significa que los rectángulos sí se superponen
    }

    // este metodo verifica si dos rectángulos se tocan, pero no se superponen

    public static boolean tocan(Rectangulo A, Rectangulo B) {
        return (A.getEsquina2().getX() == B.getEsquina1().getX() || //vemos si el lado derecho de A toca el lado izquierdo de B
                B.getEsquina2().getX() == A.getEsquina1().getX() || //vemos si el lado derecho de B toca el lado izquierdo de A
                A.getEsquina2().getY() == B.getEsquina1().getY() || //vemos si el lado superior de A toca el lado inferior de B
                B.getEsquina2().getY() == A.getEsquina1().getY());  //vemos si el  }lado superior de B toca el lado inferior de A
    }
}



