
package sfcmfc;

public class Fecha {
    private int dia;
    private int mes;
    private int year;

    public Fecha(int dia, int mes, int year) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }
    
    public Fecha() {
        dia = 0;
        mes = 0;
        year = 0;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getYear() {
        return year;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
 
}
