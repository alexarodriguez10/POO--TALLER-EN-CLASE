/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminario2;

/**
 *
 * @author 10
 */
public class Administrativo extends Empleado {
    private static final float FACTOR =0.1f;
    private Jefe jefe;

    public Administrativo(Jefe jefe, String nombre, float salario, int anyoAlta) {
        super(nombre, salario, anyoAlta);
        this.jefe = jefe;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public float getSalario(){
        return super.getSalario() * jefe.getBonificacion() * FACTOR;
    }
    
    
    
}
