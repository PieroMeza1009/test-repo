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
        return x;
    }

    double getY() {
        return y;
    }
    }