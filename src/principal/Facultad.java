package principal;
import entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Facultad {
    
    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");
      
    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList ();
        
        /**
         * ArrayList para agregarle a los alumnos a que materia esta Matriculado
         */
        ArrayList<String> matricula = new ArrayList <String> ();
        
        //Instancia de Estudiantes
        personas.add(new Estudiante(matricula, "Alejandro", "Ayala", "Divorciado", 01));
        personas.add(new Estudiante(matricula, "Pedro", "Picapiedra", "Soltero", 02));
        
        //Instancia de Profesor
        personas.add(new Profesor("DMatematica", 2020, 5, "Juan", "Alonso", "Casado", 001));
        personas.add(new Profesor("DLiteratura", 2019, 2, "Federico", "Alonso", "Soltero", 002));
        
        //Insatancia de personal de servicio
        personas.add(new PersonalServicio("Biblioteca", 2015, 1, "Analia", "Martinez", "Casada", 0001));
        personas.add(new PersonalServicio("Secretaria", 2015, 9, "Soledad", "Dias", "Casada", 0002));

        int opc;
        
        String dec;
        do{
            
             System.out.println("1- Cambio estado civil\n2- Reasignacion de despacho\n3- Matriculacion Estudiante\n4- Cambio de departamento\n5- Traslado de Seccion\n6- Informacion de Persona\n7- Salir");
                opc = sc.nextInt();
                
            switch(opc){
                case 1:
                    estadoCivil(personas);
                        
                    break;

                case 2:
                    reasignacionDespacho(personas);
                    
                    break;

                case 3:
                    matriculacionEstudiante(personas);

                    break;

                case 4:
                    departamentoProfesor(personas);
                    break;

                case 5:
                    trasladoSeccion(personas);
                    break;

                case 6:
                   mostrarPersona(personas);
                break;

            }
            
        }while(opc != 7);
       
    }
    
    public static void mostrarPersona(ArrayList<Persona> personas){
        
        System.out.println("Ingrese nombre de la persona");
        String nombre = sc.next();
        
         for (Persona persona : personas) {
             
             if(persona.getNombre().equals(nombre)){
                 
              System.out.println(persona);
             }
             
         }
    }
    
    public static void matriculacionEstudiante(ArrayList<Persona> personas){
        
        System.out.println("Nombre del estudiante");
        String nombre = sc.next();
        System.out.println("A que materia se matricula");
        String matriculacion = sc.next();
        
        for (Persona persona : personas) {
            
            if(persona instanceof Estudiante){
                
                if(nombre.equals(persona.getNombre())){
                
                    ((Estudiante) persona).getCursoMatriculado().add(matriculacion);
                }
            
            }
            
        }
    }
    
    public static void estadoCivil(ArrayList<Persona> personas){
        
        System.out.println("Nombre de persona");
        String nombre = sc.next();
        System.out.println("Nuevo estado civil");
        String civil = sc.next();
        
        for (Persona persona : personas) {
            
                if(nombre.equals(persona.getNombre())){
                
                    persona.setEstadoCivil(civil);
                
                }
            
        }
    }
    
     public static void reasignacionDespacho(ArrayList<Persona> personas){
        
        System.out.println("Nombre del empleado");
        String nombre = sc.next();
        System.out.println("Nuevo despacho");
        int despacho = sc.nextInt();
        
        for (Persona persona : personas) {
            
            if(persona instanceof Empleado){
                
                if(nombre.equals(persona.getNombre())){
                
                    ((Empleado) persona).setNumDespacho(despacho);
                
                }
            
            }
            
        }
    }
     
    public static void departamentoProfesor(ArrayList<Persona> personas){
        
        System.out.println("Nombre del profesor");
        String nombre = sc.next();
        System.out.println("Nuevo departamento");
        String departamento = sc.next();
        
        for (Persona persona : personas) {
            
            if(persona instanceof Profesor){
                
                if(nombre.equals(persona.getNombre())){
                
                    ((Profesor) persona).setDepartamento(departamento);
                
                }
            
            }
            
        }
    }
     public static void trasladoSeccion(ArrayList<Persona> personas){
        
        System.out.println("Nombre del personal de servicio");
        String nombre = sc.next();
        System.out.println("Nueva seccion");
        String seccion = sc.next();
        
        for (Persona persona : personas) {
            
            if(persona instanceof PersonalServicio){
                
                if(nombre.equals(persona.getNombre())){
                
                    ((PersonalServicio) persona).setSeccion(seccion);
                
                }
            
            }
            
        }
    }
    
}
