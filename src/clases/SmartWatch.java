package clases;

public class SmartWatch extends SmartDevice{
    String marca;
    boolean cuadranteSlim;

    public SmartWatch() {
    }

    public SmartWatch(int duracionBat, double medidaPantalla, boolean bluetooth3Punto0, String marca, boolean cuadranteSlim) {
        super(duracionBat, medidaPantalla, bluetooth3Punto0);
        this.marca = marca;
        this.cuadranteSlim = cuadranteSlim;
    }
}
