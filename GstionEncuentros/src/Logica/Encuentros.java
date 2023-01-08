/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author ASUS
 */
public class Encuentros {
    private String EquipoLocal;
    private String EquipoVisitante;
    private String Fecha;
    private String Hora;
    private String lugar;
    
    public Encuentros(){
        this.EquipoLocal="";
        this.EquipoVisitante="";
        this.Fecha="";
        this.Hora="";
       }
    
    public Encuentros(String EquipoLocal, String EquipoVisitante, String Fecha, String Hora, String lugar) {
        this.EquipoLocal = EquipoLocal;
        this.EquipoVisitante = EquipoVisitante;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.lugar = lugar;
    }
    

    public String getEquipoLocal() {
        return EquipoLocal;
    }

    public String getEquipoVisitante() {
        return EquipoVisitante;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setEquipoLocal(String EquipoLocal) {
        this.EquipoLocal = EquipoLocal;
    }

    public void setEquipoVisitante(String EquipoVisitante) {
        this.EquipoVisitante = EquipoVisitante;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void getLugar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
