package alg1.main;

public class Rectangulo {
    private Coordenada esquina1; //putno inferior izquierdo
    private Coordenada esquina2; //punto superior derecho

    public Rectangulo(Coordenada c1, Coordenada c2) {
        double xMin = Math.min(c1.getX(), c2.getX());   //Math.min(a, b): Retorna el menor de a y b
        double yMin = Math.min(c1.getY(), c2.getY());
        double xMax = Math.max(c1.getX(), c2.getX());   //Math.max(a, b): Retorna el mayor de a y b
        double yMax = Math.max(c1.getY(), c2.getY());

        this.esquina1 = new Coordenada(xMin, yMin); // Inferior izquierda
        this.esquina2 = new Coordenada(xMax, yMax); // Superior derecha
    }


    // para modificar las esquinas del rectángulo
    public void setEsquina1(Coordenada coo) {
        this.esquina1 = new Coordenada(coo); 
    }

    public void setEsquina2(Coordenada coo) {
        this.esquina2 = new Coordenada(coo); 
    }
    // estas devuelven copias de las coordenadas para evitar modificaciones externas
    public Coordenada getEsquina1() {
        return new Coordenada(this.esquina1); 
    }

    public Coordenada getEsquina2() {
        return new Coordenada(this.esquina2);
    }
    
    @Override
    public String toString() {
        return "Rectángulo formado por las esquinas " + esquina1.toString() + " y " + esquina2.toString();
    }

    public double calculoArea() {
        
        //hallo la diferencia de coordenadas para calcular área = base × altura.
        double base = Math.abs(esquina2.getX() - esquina1.getX());   //Math.abs devuelve el valor absoluto
        double altura = Math.abs(esquina2.getY() - esquina1.getY());  //Lo uso para asegurarme que la base y la altura sean positivos.
        
        return base * altura;
    }
}
