package alg1.main;

public class Coordenada {
    private double x;
    private double y;
    
    public Coordenada() {
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    } 
    public Coordenada(Coordenada c) {
        this.x = c.x;
        this.y = c.y;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }
    double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2));
    }
    static double distancia(Coordenada c1, Coordenada c2) {
        return Math.sqrt(Math.pow(c1.x - c2.x, 2) + Math.pow(c1.y - c2.y, 2));
    }

    }