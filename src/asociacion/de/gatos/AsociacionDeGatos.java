/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacion.de.gatos;

/**
 *
 * @author UCA
 */
public class AsociacionDeGatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato gato1 = new Gato("Jerry");
        Gato gato2 = new Gato("Alma de Jerry","exotico",2,"gris","rojo SATANICO","mediano");
        System.out.println("La ID de "+gato1.getNombre()+ " es " + gato1.getID());
        System.out.println("");
        gato1.maullar();
        gato1.morir();
        System.out.println("");
        gato2.maullar();
        System.out.println(gato2.getNombre()+": Era "+gato1.getNombre()+" mi raza era "+gato2.getRaza()+" mis ojos ahora son "+gato2.getColorOjos());
        System.out.println("");
        gato1.rasgar();
        System.out.println("Por eso "+ gato1.getNombre()+ " murio para pasar a ser el " + gato2.getNombre());
        System.out.println("");
        Gato gato3 = new Gato("Merlín");
        System.out.println("La ID de "+gato3.getNombre()+ " es " + gato3.getID());
        gato3.trucoMagico();
        System.out.println("");
        System.out.println(gato3.getNombre()+": TSUMINAKI MONONGAMI TORUGA I...");
        System.out.println("            ¡GARDEN OF AVALON!");
        System.out.println("");
        System.out.println("¡¡¡"+gato1.nombre+" Ha revivido!!!");
        gato2=null;
        System.out.println("");
        System.out.println(gato1.nombre+": He revivido. ");
        gato3.maullar();
        System.out.println(gato3.nombre+": Ha sido un placer joven gato "+gato1.nombre+"~");
        System.out.println("");
        gato1.bailar();
        gato3.bailar();
        gato2.bailar();
        
        
    }
    
}
