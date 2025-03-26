package alg1.main;

public class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private static int numRec = 0;

    public ContainerRect(int n) {
        this.n = n;
        this.rectangulos = new Rectangulo[n];
        this.distancias = new double[n];
        this.areas = new double[n];
    }
    
    public void addRectangulo(Rectangulo r) {
        if (numRec < n) {
            rectangulos[numRec] = r;
            distancias[numRec] = r.getEsquina1().distancia(r.getEsquina2());
            areas[numRec] = r.calculoArea();
            numRec++;
        } else {
            System.out.println("No se pueden agregar más rectángulos. Capacidad máxima alcanzada.");
        }

}
