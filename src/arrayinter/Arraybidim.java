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
public class Arraybidim {
    String[][] arr1 = new String[3][4]; // declaro array bidimensional de 3 filas y 4 columnas
    public String name;
    public Boolean flag = false; // el flag solo funciona para indicar que ya no se debe de ejecutar el bucle for de abajo
    
    public void ingresaNombres()
    {
        flag = false;
         for (int i = 0; i< arr1.length ; i++) // recorro las filas
        {
            for (int j = 0; j < arr1.length; j++)// recorro las columnas
            {
                if(arr1[i][j] == null && flag == false)// si la fila y columna indicada es nula y el flag no se a cambiado a true, ingresamos valor
                {
                    arr1[i][j] = name;
                    flag = true; // se pone el flag como true para que ya no ingrese valores repetidos
                    
                }
                
            }
           
        }
    }
    public void imprimeNombres()
    {
        for (int i = 0; i< arr1.length ; i++) // recorre el array e inprime todo
        {
            for (int j = 0; j < arr1.length; j++)
            {
                System.out.println(arr1[i][j]);
            }
        }
    }
}
