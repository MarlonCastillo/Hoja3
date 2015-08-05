//-------------------------------------------------------------------------------
//PRUEBAS DE JUNIT
//este programa realizar las pruebas de los metodos en la clase Calcu
//-------------------------------------------------------------------------------

//se importan las librerias necesarias para las pruebas
import Hoja3.Datos;
import Hoja3.Sorting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author MARLON
 */
public class SortingTest {
    Datos[] numeros = new Datos[6];
    Datos[] numeros2 = new Datos[6];

//creamos los datos que seran en comun para todos los metodos
    @Before
    public void setUp() {
        numeros[0] = new Datos(100);
        numeros[1] = new Datos(345);
        numeros[2] = new Datos(98);
        numeros[3] = new Datos(987);
        numeros[4] = new Datos(67);
        numeros[5] = new Datos(1);
        
        numeros2[0] = new Datos(1);
        numeros2[1] = new Datos(67);
        numeros2[2] = new Datos(98);
        numeros2[3] = new Datos(99);
        numeros2[4] = new Datos(345);
        numeros2[5] = new Datos(987);
    }
//test para el algoritmo RadixSort    
    @Test
    public void radixSort(){
        Sorting.radixSort(numeros);
        for (int a=0;a<=5;a++){
            assertEquals(numeros2[a].getDato(),numeros[a].getDato());
        }
    } 
}
