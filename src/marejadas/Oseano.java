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

    /**
     * @return the hm0
     */
    public double getHm0() {
        return hm0;
    }

    /**
     * @param hm0 the hm0 to set
     */
    public void setHm0(double hm0) {
        this.hm0 = hm0;
    }

    /**
     * @return the tz
     */
    public double getTz() {
        return tz;
    }

    /**
     * @param tz the tz to set
     */
    public void setTz(double tz) {
        this.tz = tz;
    }

    /**
     * @return the te
     */
    public double getTe() {
        return te;
    }

    /**
     * @param te the te to set
     */
    public void setTe(double te) {
        this.te = te;
    }
    
}
