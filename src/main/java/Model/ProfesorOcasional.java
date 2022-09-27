/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public class ProfesorOcasional extends Profesor{
    
    private double salario_basico;

    public ProfesorOcasional() {
    }

    public ProfesorOcasional(double salario_basico, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salario_basico = salario_basico;
    }

    public double getSalario_basico() {
        return salario_basico;
    }

    public void setSalario_basico(double salario_basico) {
        this.salario_basico = salario_basico;
    }
    
    
    
}
