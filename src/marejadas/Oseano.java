package marejadas;

public class Oseano extends Dato{
    private double hm0; // Altura media de las Olas horas
    private double tz; // Periodo medio de la Ola segundos
    private double te; // Periodo energia de las holas segundos

    public Oseano(double hm0, double tz, double te, double anio, double mes, double dia, double hora) {
        super(anio, mes, dia, hora);
        this.hm0 = hm0;
        this.tz = tz;
        this.te = te;
    }

    @Override
    public void mostrar() {
        super.mostrar(); // Generated from 

    
    }
    
}
