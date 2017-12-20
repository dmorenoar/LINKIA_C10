/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author 
 */
public class Fibra extends Contrato implements PoliticaEmpresa{
    private String domicilio;
    private String DNI;
    private final int PRECIO_FIJO = 10;
    private int licencia;

    public Fibra() {
    }

    public Fibra(String domicilio, String DNI, int licencia, int numContrato) {
        //La primera llamada tiene que ser al constructor del padre
        super(numContrato);
        this.domicilio = domicilio;
        this.DNI = DNI;
        this.licencia = licencia;
    }
    
    
/*
    public Fibra(String domicilio, String DNI, int licencia) {
        this.domicilio = domicilio;
        this.DNI = DNI;
        this.licencia = licencia;
    }
   */ 
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String calle) {
        domicilio = calle;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Fibra{" + "domicilio=" + domicilio + ", DNI=" + DNI + ", PRECIO_FIJO=" + PRECIO_FIJO + ", licencia=" + licencia + '}';
    }
    
    @Override
    public int calcularPrecio(int precio){
        return 1;
        
    }

    @Override
    public int generarContrato(int Licencia) {
       return 2 * 3;
    }
    
}
