/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package integrador.alumnos;

/**
 *
 * @author yofac
 */
public class Alumnos {

//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
    
    
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String correo;
    private String telefono;
    private String anio;
    private String curso;
    private String especialidad;
    private String matricula;
    
    
    public Alumnos(){
        
    }

    public Alumnos(String nombre, String apellido, String dni, String direccion,
            String correo, String telefono, String anio, String curso, 
            String especialidad, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.anio = anio;
        this.curso = curso;
        this.especialidad = especialidad;
        this.matricula = matricula;
    }
    
    // ----------------- SET & GET --------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String año) {
        this.anio = anio;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
//    @Override
//    public String toString() {
//        return "Alumnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + ", a\u00f1o=" + anio + ", curso=" + curso + ", especialidad=" + especialidad + ", matricula=" + matricula + '}';
//    }
    
    
    
    
    
    
    
    
    
    
    
    
}
