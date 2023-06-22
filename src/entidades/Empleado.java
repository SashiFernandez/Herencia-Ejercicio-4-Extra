package entidades;

public class Empleado extends Persona{
    
    protected int incorporacion;
    protected int numDespacho;

    public Empleado(int incorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int identificacion) {
        super(nombre, apellido, estadoCivil, identificacion);
        this.incorporacion = incorporacion;
        this.numDespacho = numDespacho;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "incorporacion=" + incorporacion + ", Despacho=" + numDespacho + '}';
    }
    
    
}
