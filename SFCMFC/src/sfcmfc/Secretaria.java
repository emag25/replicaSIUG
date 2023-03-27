package sfcmfc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Secretaria extends Persona{
   
    private int añoServ;
    private String turno;
    public String azul = " \u001B[34m";
    public Secretaria() {
    }

    public Secretaria(int añoServ, String turno) {
        this.añoServ = añoServ;
        this.turno = turno;
    }

    public Secretaria(int añoServ, String turno, String nombre, String apellido, String cedula, int edad, Fecha fechaNac, String telefono, String direccion, String contraseña, String correo, int rol, String fechaReg) {
        super(nombre, apellido, cedula, edad, fechaNac, telefono, direccion, contraseña, correo, rol, fechaReg);
        this.añoServ = añoServ;
        this.turno = turno;
    }


    public void setAñoServ(int añoServ) {
        this.añoServ = añoServ;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

   
    public int getAñoServ() {
        return añoServ;
    }

    public String getTurno() {
        return turno;
    }
  
    
    @Override
    public String RegistrarIngreso()
    {
        Date fecha = new Date();
        DateFormat Formato = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        System.out.println(azul+"FECHA DE REGISTRO SECRETARIA: "+Formato.format(fecha));
        return Formato.format(fecha);
    }
}
