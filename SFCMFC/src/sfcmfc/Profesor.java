package sfcmfc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Profesor extends Persona{
    private ArrayList<Materia> materias = new ArrayList();   
    private ArrayList<String> CarreraProf = new ArrayList(); 
    public String azul = " \u001B[34m";
    
    
    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String cedula, int edad, Fecha fechaNac, String telefono, String direccion, String contraseña, String correo, int rol, String fechaReg) {
        super(nombre, apellido, cedula, edad, fechaNac, telefono, direccion, contraseña, correo, rol, fechaReg);
    }

    
    

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public ArrayList<String> getCarreraProf() {
        return CarreraProf;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public void setCarreraProf(ArrayList<String> CarreraProf) {
        this.CarreraProf = CarreraProf;
    }
   
    
    @Override
    public String RegistrarIngreso()
    {
        Date fecha = new Date();
        DateFormat Formato = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        System.out.println(azul+"FECHA DE REGISTRO PROFESOR: "+Formato.format(fecha));
        return Formato.format(fecha);
    }
    
}
