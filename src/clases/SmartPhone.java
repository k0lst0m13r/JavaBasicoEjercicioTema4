package clases;

public class SmartPhone extends SmartDevice {
    String marca;
    boolean tecnologia5G;

    public SmartPhone(int duracionBat, double medidaPantalla, boolean bluetooth3Punto0, String marca, boolean tecnologia5G) {
        super(duracionBat, medidaPantalla, bluetooth3Punto0);
        this.marca = marca;
        this.tecnologia5G = tecnologia5G;
    }

    public SmartPhone() {
    }
}
