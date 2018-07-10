/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayinter;

/**
 *
 * @author silverrt
 */
public class ArrayInter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arraybidim ab = new Arraybidim();
        ab.name = "puta"; //se asigna valor a la variable local
        ab.ingresaNombres(); // se hace llamado a la funcion que ingresa al array bidimensional
        ab.name = "la chocha";
        ab.ingresaNombres();
        ab.name = "vagina de jony";
        ab.ingresaNombres();
        ab.name = "el sicario";
        ab.ingresaNombres();
        ab.name = "cuco";
        ab.ingresaNombres();
        ab.name = "pito";
        ab.ingresaNombres();
        ab.name = "jotis";
        ab.ingresaNombres();
        ab.imprimeNombres();  //se llama a la funcion que recorre el array y lo imprime
    }
    
}
