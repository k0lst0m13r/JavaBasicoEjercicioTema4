package clases;

public class SmartDevice {
    int duracionBat;  //en horas
    double medidaPantalla; //en pulgadas
    boolean bluetooth3Punto0;

    public SmartDevice(int duracionBat, double medidaPantalla, boolean bluetooth3Punto0) {

        this.duracionBat = duracionBat;
        this.medidaPantalla = medidaPantalla;
        this.bluetooth3Punto0 = bluetooth3Punto0;
    }

    public SmartDevice() {
    }
}
