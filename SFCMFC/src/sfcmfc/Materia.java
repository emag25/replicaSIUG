package sfcmfc;

public class Materia {
    private String nombreMat;
    private int codigoMat;
    private int semestreMat;
    private String idCarrera;    
    private float[] calificaciones = new float[4];
    private boolean AprobActa;
    
    public Materia() {
        nombreMat = "";
        codigoMat = 0;
        semestreMat = 0;
        idCarrera = "";
        calificaciones[0] = 0;
        calificaciones[1] = 0;
        calificaciones[2] = 0;
        calificaciones[3] = 0;
        AprobActa = false;
    }

    public Materia(String nombreMat, int codigoMat, int semestreMat, String idCarrera, boolean AprobActa) {
        this.nombreMat = nombreMat;
        this.codigoMat = codigoMat;
        this.semestreMat = semestreMat;
        this.idCarrera = idCarrera;
        this.AprobActa = AprobActa;
    }

    
    
    public Materia(String nombreMat, int codigoMat, int semestreMat, String idCarrera) {
        this.nombreMat = nombreMat;
        this.codigoMat = codigoMat;
        this.semestreMat = semestreMat;
        this.idCarrera = idCarrera;
    }

    
    public boolean isAprobActa() {
        return AprobActa;
    }

    public void setAprobActa(boolean AprobActa) {
        this.AprobActa = AprobActa;
    }

    
     
    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

    public void setCodigoMat(int codigoMat) {
        this.codigoMat = codigoMat;
    }

    public void setSemestreMat(int semestreMat) {
        this.semestreMat = semestreMat;
    }

    public void setIdCarrera(String idCarrera) {
        this.idCarrera = idCarrera;
    }      
 
    
    public String getNombreMat() {
        return nombreMat;
    }

    public int getCodigoMat() {
        return codigoMat;
    }

    public int getSemestreMat() {
        return semestreMat;
    }

    public String getIdCarrera() {
        return idCarrera;
    }

    public float[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(float[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public float CalcularNf(float p1, float p2)
    {
        float nf;
        nf = (p1+p2)/2;
        return nf;
    }
}
