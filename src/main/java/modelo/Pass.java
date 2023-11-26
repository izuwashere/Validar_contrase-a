
package modelo;


public class Pass {
    private String pass;
    private String nombre;
    private int DNI;

    public Pass() {
    }

    public Pass(String pass, String nombre, int DNI) {
        this.pass = pass;
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    
}
