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
public class PruebaEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado[] empleados = new Empleado[3];
         empleados [0]= new Empleado("juan", 1000,2001);
          Jefe jefe =  new Jefe(0.5f,"pedro", 1200,1999);
          empleados[1]=jefe;
          empleados[2]=new Administrativo(jefe,"Enrrique", 900, 2003);
          
          for(Empleado empleado: empleados){
              
          if(empleado instanceof Jefe){
          Jefe jefe2 = (Jefe)empleado;
          System.out.println("Soy " + jefe2.getNombre() +"y gano " + jefe2.getSalario());
          }else if (empleado instanceof Administrativo){
              Administrativo admin = (Administrativo )empleado;
              System.out.println("Soy " + admin.getNombre()  + "y gano " + admin.getSalario());
          }else{
              System.out.println("Soy" + empleado.getNombre() +"y gano " + empleado.getSalario());
          }
          }
       // Jefe jefe = new Jefe( 0.5f,"Pedro", 1200, 1999);
        //System.out.println("Jefe: " + jefe.getNombre());
        
        
        
        
       // System.out.println("Salario del jefe: " + jefe.getSalario());
    
       // System.out.println(jefe.getDescripcion());
       
       // otra forma de hacerlo
       
      //Administrativo admin = new Administrativo(jefe,"pedro",900,2003);
      // System.out.println("Administrativo: " + admin.getNombre());
      // System.out.println("Gana: " + admin.getSalario());
    }
    
    
    
}
