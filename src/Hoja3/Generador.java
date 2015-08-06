

/**
 *
 * @author Marlon
 */
/*INTEGRANTES:
Marlon Castillo		14427
Cristian Castillo	14015
Javier Lima		14373
María Fernanda Dávila	14482
*/
/*---------------------------
COMPLEJIDAD TEORICA
-----------------------------
Selection Sort 		O(n^2)
Insertion Sort 		O(n^2)
Merge Sort 		O(nlog)
Quick Sort 		O(nlog)
Radix Sort          	O(n)
-----------------------------*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Generador {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Datos[] numeros = new Datos[3000]; //creamos una lista de objetos de tipo Datos
	try{
            //indicamos la direccion y el nombre del archivo a leer
            FileReader lector = new FileReader("D:\\Users\\MARLON\\Documents\\UVG\\4to Semestre\\Algoritmos y Estructuras de Datos\\Hoja3\\src\\Hoja3\\texto.txt"); 
            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector); 
            
            //instanciamos cada objeto y le colocamos el valor que lee del txt
            for (int a=0;a<=2999;a++) {
                numeros[a] = new Datos(Integer.parseInt(contenido.readLine()));  
            }
            //usamos un algoritmo de sorting para ordenar la lista
            Sorting.radixSort(numeros);
            
            
            //recorremos cada objeto de la lista y luego extraemos su valor para imprimirlo
            for (Datos numero : numeros){
                System.out.println(numero.getDato());
            }
            
            lector.close(); //cerramos el lector del archivo
        }
        //Si se causa un error al leer cae aqui
        catch(Exception e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
