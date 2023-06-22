package entidades;


public class Profesor extends Empleado{
    
    private String departamento;

    public Profesor(String departamento, int incorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int identificacion) {
        super(incorporacion, numDespacho, nombre, apellido, estadoCivil, identificacion);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "departamento=" + departamento + '}';
    }

    
    
}
