/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaz;

/**
 *
 * @author FAMILIA 
 * 
 * Cach
 */
public class Curso {
    private String nombre;
    private String descripcion;
    private int duracion;
    private String requisitosEspecificos;
    private Docente docente;
    private Estudiante[] estudiantes;
    private Categoria categoria;

    public Curso(String nombre, String descripcion, int duracion, String requisitosEspecificos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.requisitosEspecificos = requisitosEspecificos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getRequisitosEspecificos() {
        return requisitosEspecificos;
    }

    public void setRequisitosEspecificos(String requisitosEspecificos) {
        this.requisitosEspecificos = requisitosEspecificos;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", \ndescripcion=" + descripcion + ", \nduracion=" + duracion
                + ", \nrequisitosEspecificos=" + requisitosEspecificos + ", \ndocente=" + docente 
                + ", \ncategoria=" + categoria +", \nNiveles= "+"Basico,Intermedio, Avansado\n"+'}';
    }
}
