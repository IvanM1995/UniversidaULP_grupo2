/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Javi
 */
public class Inscripcion {
    
    private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    private int nota;
    
    //Constructor vacio
    public Inscripcion(){
        
    }
    
    //Constructor sin IdInscripcion
    public Inscripcion(Alumno alumno, Materia materia, int nota){
        
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
    
    
    //constructor todos atributos
    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, int nota){
        
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
    
    
    //Getters
    public int getIdInscripcion(){
        return idInscripcion;
    }
    public Alumno getAlumno(){
        return alumno;
    }
    public Materia getMateria(){
        return materia;
    }
    public int getNota(){
        return nota;
    }
    
      public int getIdMateria(){
        return materia.getIdMateria();
    }
        public int getIdAlumno(){
        return alumno.getIdAlumno();
    }
    
        
        //Setters
    public void setIdInscripcion(int idInscripcion){
        this.idInscripcion = idInscripcion;
    }
      
    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
    }
    
        public void setMateria(Materia materia){
        this.materia = materia;
    }
        
          public void setNota(int nota){
        this.nota = nota;
    }
          
     public void setIdAlumno(int idAlumno){
        alumno.setIdAlumno(idAlumno);
    }
        public void setIdMateria(int idMateria){
        materia.setIdMateria(idMateria);
    }
}
