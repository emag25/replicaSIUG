package sfcmfc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Persona{
    private String carrera;
    private int semestre;
    private ArrayList<Fecha> fechaInicio = new ArrayList();   
    private ArrayList<Materia> materias = new ArrayList();
    public String azul = " \u001B[34m";
    public Estudiante() {
        super();
        carrera = "";
        semestre = 0;           
    }
    
    public Estudiante(String carrera, int semestre, String nombre, String apellido, String cedula, int edad, Fecha fechaNac, String telefono, String direccion, String contraseña, String correo, int rol, String fechaReg) {
        super(nombre, apellido, cedula, edad, fechaNac, telefono, direccion, contraseña, correo, rol, fechaReg);
        this.carrera = carrera;
        this.semestre = semestre;
    }

   

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setFechaInicio(ArrayList<Fecha> fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
     
    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public ArrayList<Fecha> getFechaInicio() {
        return fechaInicio;
    }
    
    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
   } 
       
    @Override
    public String RegistrarIngreso()
    {
        Date fecha = new Date();
        DateFormat Formato = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        System.out.println(azul+"FECHA DE REGISTRO ESTUDIANTE: "+Formato.format(fecha));
        return Formato.format(fecha);
    }
    
}
