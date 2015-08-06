

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
//implementamos la interfaz Comparable
public class Datos implements Comparable{
    private Integer dato;
    //constructor de la clase
    public Datos(Integer d){
	this.dato = d;
    }
    /* Este metodo permite comparar objetos
    Extrae el valor del objeto que llama al metodo y luego
    extrae el valor del objeto que se ingresa dentro de () para comparar
    El metodo compareTo devuelve un 1 si el primero es mayor, un -1 si el primero es menor y un 0 si son iguales
    */
    public int compareTo(Object other) {
        Integer dato2 = ((Datos)other).getDato();
        Integer result = dato.compareTo(dato2); 
        return result;
    }
    //devuelve el valor del atributo dato
    public int getDato(){
	return dato;
    }
}
