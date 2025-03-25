package alg1.main;

public class Verificador {
    public static boolean sobreponen(Rectangulo A, Rectangulo B) {
        return !(A.getEsquina2().getX() <= B.getEsquina1().getX() ||
                 B.getEsquina2().getX() <= A.getEsquina1().getX() ||
                 A.getEsquina2().getY() <= B.getEsquina1().getY() ||
                 B.getEsquina2().getY() <= A.getEsquina1().getY());
    }

}
