/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public class ProfesorCatedra extends Profesor{
    
    private String num_cont_semes;
    private double num_horas_seman;
    private double valor_hora;

    public ProfesorCatedra() {
    }

    public ProfesorCatedra(String num_cont_semes, double num_horas_seman, double valor_hora, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.num_cont_semes = num_cont_semes;
        this.num_horas_seman = num_horas_seman;
        this.valor_hora = valor_hora;
    }

    public String getNum_cont_semes() {
        return num_cont_semes;
    }

    public void setNum_cont_semes(String num_cont_semes) {
        this.num_cont_semes = num_cont_semes;
    }

    public double getNum_horas_seman() {
        return num_horas_seman;
    }

    public void setNum_horas_seman(double num_horas_seman) {
        this.num_horas_seman = num_horas_seman;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
    
    
    
}
