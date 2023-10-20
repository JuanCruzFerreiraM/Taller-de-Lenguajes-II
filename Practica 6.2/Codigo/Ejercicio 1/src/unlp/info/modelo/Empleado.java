package unlp.info.modelo;

public class Empleado extends Persona {
    private long leagajo;
    private double sueldo;
   
    public long getLeagajo() {
        return leagajo;
    }
    public void setLeagajo(long leagajo) {
        this.leagajo = leagajo;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    

}
