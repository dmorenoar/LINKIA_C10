/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dam10;

import entidades.Contrato;
import entidades.DemasiadosObjetos;
import entidades.Fibra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 
 */
public class LINKIA_DAM10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Fibra fibra1 = new Fibra("Calle 111", "111111P", 1111,123456);
        Fibra fibra2 = new Fibra("Calle 222", "222222E", 2222,678923);
        Fibra fibra3 = new Fibra("Calle 333", "333333Z", 3333,000111);
        
        
        ArrayList<Fibra> fibras = new ArrayList<>();
        
        fibras.add(fibra1);
        fibras.add(fibra2);
        fibras.add(fibra3);
        
        for(Fibra f: fibras){
            System.out.println(f);
        }
        
       
        HashMap<Fibra, Integer> listaFibras = new HashMap<>();
       
        listaFibras.put(fibra1, 111);
        listaFibras.put(fibra2, 222);
        listaFibras.put(fibra3, 2223);         
        
        for(Map.Entry<Fibra,Integer> fib: listaFibras.entrySet()){
            
        }
        try {
            System.out.println("Hola");
        } catch (Exception e) {
            System.out.println("Error leyendo datos");
        }    
    }   
}
