package sfcmfc;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private Fecha fechaNac;
    private String telefono;
    private String direccion;
    private String contraseña;
    private String correo;
    private int rol;
    private String fechaReg;
    
    public Persona() {
        nombre = "";
        apellido = "";
        cedula = "";
        edad = 0;
        fechaNac = new Fecha();
        telefono = "";
        direccion = "";
        contraseña = "";
        correo = "";
        rol = 0;
        fechaReg = "";
    }

    public Persona(String nombre, String apellido, String cedula, int edad, Fecha fechaNac, String telefono, String direccion, String contraseña, String correo, int rol, String fechaReg) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contraseña = contraseña;
        this.correo = correo;
        this.rol = rol;
        this.fechaReg = fechaReg;
    }

    public String getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(String fechaReg) {
        this.fechaReg = fechaReg;
    }

    
    
          
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public int getRol() {
        return rol;
    }
        
    public abstract String RegistrarIngreso();
    
}
