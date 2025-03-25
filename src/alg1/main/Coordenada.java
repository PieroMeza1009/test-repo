package alg1.main;
//atributos
public class Coordenada {
    private double x; //aca se almacena la posicion en el eje X
    private double y; //aca se almacena la posicion en el eje Y

//constructor que no tiene parametros
    public Coordenada() {
        this.x = 0.0;
        this.y = 0.0;
    }

//constructor con parametros que permine iniciar una coordenada especifica    
    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    } 
//constructor de copia que crea una nueva coordenada a partir de otra existente    
    public Coordenada(Coordenada c) {
        this.x = c.x;
        this.y = c.y;
    }

//metodos set para modificar un atributo desde fuera de la clase
    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }
//metodos get para obtener el valor de un atributo
    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

//Calcula la distancia entre el punto actual y otro punto c usando la fórmula de distancia euclidiana
    double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2));
    }

//Permite calcular la distancia sin necesidad de crear un objeto.
    static double distancia(Coordenada c1, Coordenada c2) {
        return Math.sqrt(Math.pow(c1.x - c2.x, 2) + Math.pow(c1.y - c2.y, 2));
    }

//Devuelve la coordenada en formato (x, y), útil para mostrar en pantalla.


    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
