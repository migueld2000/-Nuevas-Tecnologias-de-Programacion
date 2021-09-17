/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import empleados.Empleado;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int opcion;
        int contador=0;
        
        
        Empleado [] empleados=new Empleado[10];
        
        do{
            
            System.out.println("Bienbenido");
            System.out.println("****************************");
            System.out.println("1. Agregar emleado");
            System.out.println("2. Mostrar empleado");
            System.out.println("3. Mostrar empleados");
            System.out.println("4. Salir");
            //System.out.println("");
            
            System.out.println("Digite la opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
            
                case 1:
                    //contador
                    if ( i;empleados<=10;i++)
                    {
                        empleados[contador]=new Empleado();
                        System.out.println("Digita el id del empleado: ");
                        empleados[contador].setId(entrada.nextInt());
                        System.out.println("Digita el nombre: ");
                        empleados[contador].setNombre(entrada.next());
                        System.out.println("Digite el cargo: ");
                        empleados[contador].setCargo(entrada.next());
                        System.out.println("Digite el telefono: ");
                        empleados[contador].setTelefono(entrada.next());
                        System.out.println("Digite la direccion: ");
                        empleados[contador].setDireccion(entrada.next());
                        
                    }
                    else
                    {
                        System.out.println("Ya no se puede ingresar mas empleados");
                    }
                    
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    for(int i=0; i<contador;i++)
                    {
                        System.out.println(empleados[i].getNombre());
                        System.out.println(empleados[i].getCargo());
                        System.out.println(empleados[i].getSalario());
                        System.out.println(empleados[i].getTelefono());
                        System.out.println(empleados[i].getDireccion());
                        
                    }
                    
                    
                    break;
                case 4:
                    //msj
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
            
            
            
        }while(opcion!=4);
        
    }
    
}
