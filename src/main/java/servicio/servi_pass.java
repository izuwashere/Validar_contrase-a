
package servicio;

import java.util.Scanner;
import modelo.Pass;


public class servi_pass {
    Scanner leer=new Scanner(System.in);
    Pass datos=new Pass();
    
    public void crearPass(){
        System.out.println("cree su contraseña");
        String contra=leer.next();
        if(contra.length()>= 10){
            System.out.println("contraseña valida");
            datos.setPass(contra);
        }else{
            System.out.println("pocos caracteres");
        }
    }
    
    public void analizarPass(){
       int var_a=0;
       int i=0;
       while(i<datos.getPass().length())
       {
           if(datos.getPass().charAt(i)=='a' || datos.getPass().charAt(i)=='A')
           {
               var_a++;
               //System.out.println("tiene a");
           }
           
           i++;
       }
       if(var_a >= 2 && datos.getPass().contains("z") || datos.getPass().contains("Z")){
           System.out.println("la contraseña es de alto nivel");
       }else if(datos.getPass().contains("z")|| datos.getPass().contains("Z")){
           System.out.println("la contraseña es de nivel medio");
       } else {
           System.out.println("la contraseña tiene pocos caracteres");
       }
       
           
    }
    
    
    public void modificar(){
        String contra=datos.getPass();
        System.out.println("valide contraseña");
        String contra2 = leer.next();
        if(contra2.equals(contra)){
            System.out.println("ingrese el nuevo DNI: ");
            datos.setDNI(leer.nextInt());
            System.out.println("ingrese el nuevo nombre");
            datos.setNombre(leer.next());
        }else{
            System.out.println("contraseña incorrecta");
        }
    }
        
        public void registro(){
            System.out.println("Datos modificaddos: ");
            System.out.println("Nombre del titular: "+datos.getNombre());
            System.out.println("DNI del titular: "+datos.getDNI());
        }
        
        
        /* if (contra2 == datos.getPass()){
            System.out.println("ingrese su nuevo nombre");
        } else {
            System.out.println("las contraseñas no coinciden");
        } */

    
}
