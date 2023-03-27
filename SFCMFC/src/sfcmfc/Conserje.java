package sfcmfc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conserje extends Persona{
    private Fecha fechaIngreso;
    private int añoServ;
    private String turno;
    public String azul = " \u001B[34m";
    
    public Conserje() {
        super();
        fechaIngreso = new Fecha();
        añoServ = 0;
        turno = "";
    }

    public Conserje(Fecha fechaIngreso, int añoServ, String turno) {
        this.fechaIngreso = fechaIngreso;
        this.añoServ = añoServ;
        this.turno = turno;
    }

    public Conserje(Fecha fechaIngreso, int añoServ, String turno, String nombre, String apellido, String cedula, int edad, Fecha fechaNac, String telefono, String direccion, String contraseña, String correo, int rol, String fechaReg) {
        super(nombre, apellido, cedula, edad, fechaNac, telefono, direccion, contraseña, correo, rol, fechaReg);
        this.fechaIngreso = fechaIngreso;
        this.añoServ = añoServ;
        this.turno = turno;
    }
    
    

    

    public void setFechaIngreso(Fecha fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setAñoServ(int añoServ) {
        this.añoServ = añoServ;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    
    public Fecha getFechaIngreso() {
        return fechaIngreso;
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
        System.out.println(azul+"FECHA DE REGISTRO CONSERJE: "+Formato.format(fecha));
        return Formato.format(fecha);
    }
    
    
}
