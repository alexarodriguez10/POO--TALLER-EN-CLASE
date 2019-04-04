/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminario2;

/**
 *
 * @author Estudiante
 */
public class Jefe extends Empleado {
    
    private float bonificacion;

    public Jefe(float bonificacion, String nombre, float salario, int anyoAlta) {
        super(nombre, salario, anyoAlta);
        this.bonificacion = bonificacion;
    }
    
    public String getDescripcion(){
        return "Soy " + getNombre() + "y gano " + getSalario();
    }
       
   public float getSalario(){
       return super.getSalario() + super.getSalario() * bonificacion;
    }

    public float getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(float bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    
    
}
