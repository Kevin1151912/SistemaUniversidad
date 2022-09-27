/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public class Profesor_Planta extends Profesor{
    
    private double salario_basico=450000;
    private double puntos_salariales=20;
    private double valor_punto;
    private String categoria;
    private String num_res_nomb;
    private String fecha_nombramiento;
    double vp;

    public Profesor_Planta() {
    }

    public Profesor_Planta(double salario_basico, double puntos_salariales, double valor_punto, String categoria, String num_res_nomb, String fecha_nombramiento, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salario_basico = salario_basico;
        this.puntos_salariales = puntos_salariales;
        this.valor_punto = valor_punto;
        this.categoria = categoria;
        this.num_res_nomb = num_res_nomb;
        this.fecha_nombramiento = fecha_nombramiento;
    }

    public double getSalario_basico() {
        return salario_basico;
    }

    public void setSalario_basico(double salario_basico) {
        this.salario_basico = salario_basico;
    }

    public double getPuntos_salariales() {
        return puntos_salariales;
    }

    public void setPuntos_salariales(double puntos_salariales) {
        this.puntos_salariales = puntos_salariales;
    }

    public double getValor_punto() {
        return valor_punto;
    }

    public void setValor_punto(double valor_punto) {
        this.valor_punto = valor_punto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNum_res_nomb() {
        return num_res_nomb;
    }

    public void setNum_res_nomb(String num_res_nomb) {
        this.num_res_nomb = num_res_nomb;
    }

    public String getFecha_nombramiento() {
        return fecha_nombramiento;
    }

    public void setFecha_nombramiento(String fecha_nombramiento) {
        this.fecha_nombramiento = fecha_nombramiento;
    }
    
    
    public void calcular_Salario(double valorPunto){
        
        double calcularSalario;
        
        calcularSalario= getSalario_basico() + (getPuntos_salariales()*valorPunto );
        System.out.println(calcularSalario);
    }
    
    /*public static void main(String args []){
        
        Profesor_Planta p = new Profesor_Planta();
        
        p.calcular_Salario(2000);
        
    }*/
    
}
