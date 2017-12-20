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
public class Contrato {
    private int numContrato;
    private int COSTE_FIJO = 44;

    public Contrato() {
    }

    public Contrato(int numContrato) {
        this.numContrato = numContrato;
    }

    public int getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(int numContrato) {
        this.numContrato = numContrato;
    }

    public int getCOSTE_FIJO() {
        return COSTE_FIJO;
    }

    public void setCOSTE_FIJO(int COSTE_FIJO) {
        this.COSTE_FIJO = COSTE_FIJO;
    }

    @Override
    public String toString() {
        return "Contrato{" + "numContrato=" + numContrato + ", COSTE_FIJO=" + COSTE_FIJO + '}';
    }
    
    public int calcularPrecio(int precio){
        return precio * 2;
    }
    
}
