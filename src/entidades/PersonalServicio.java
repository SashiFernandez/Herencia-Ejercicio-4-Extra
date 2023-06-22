package entidades;

public class PersonalServicio extends Empleado{
    
    private String seccion;

    public PersonalServicio(String seccion, int incorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int identificacion) {
        super(incorporacion, numDespacho, nombre, apellido, estadoCivil, identificacion);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "Personal de Servicio{" + "seccion=" + seccion + '}';
    }
    
}
