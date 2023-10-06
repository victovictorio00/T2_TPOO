/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agost
 */
public class Clase {
    private Profesor profesor;
    private List<Alumno> alumnos;

    public Clase(Profesor profesor) {
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        if (alumnos.size() < 10) {
            alumnos.add(alumno);
        } else {
            System.out.println("La clase está llena. No se puede agregar más alumnos.");
        }
    }

   
}
