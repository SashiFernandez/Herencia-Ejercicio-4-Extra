package entidades;

import java.util.ArrayList;

public class Estudiante extends Persona{
    
    private ArrayList <String> cursoMatriculado;

    public Estudiante(ArrayList <String> cursoMatriculado, String nombre, String apellido, String estadoCivil, int identificacion) {
        super(nombre, apellido, estadoCivil, identificacion);
        this.cursoMatriculado = cursoMatriculado;
    }

    public ArrayList<String> getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(ArrayList<String> cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

 

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "Matriculado=" + cursoMatriculado + '}';
    }
    
    
}
