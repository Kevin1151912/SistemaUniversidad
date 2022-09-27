/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public class Horario {
    
    private String hora_in;
    private String hora_fin;
    private String salon;

    public Horario(String hora_in, String hora_fin, String salon) {
        this.hora_in = hora_in;
        this.hora_fin = hora_fin;
        this.salon = salon;
    }

    public String getHora_in() {
        return hora_in;
    }

    public void setHora_in(String hora_in) {
        this.hora_in = hora_in;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "Horario{" + "hora_in=" + hora_in + ", hora_fin=" + hora_fin + ", salon=" + salon + '}';
    }
    
    
    
}
