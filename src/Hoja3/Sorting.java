package Hoja3;

/**
 *
 * @author Marlon
 */

//importamos las clases a utilizar
import java.util.List;
import java.util.ArrayList;

public class Sorting {
    
/*--------------------------------------------------------------------------
ALGORITMO DE SORTING
este algoritmo fue tomado del siguiente enlace: 
http://www.geekviewpoint.com/java/sorting/radixsort
----------------------------------------------------------------------------*/
    public static void radixSort(Datos[] input) {
	  	final int RADIX = 10;
	  	// declare and initialize bucket[]
	  	List<Datos>[] bucket = new ArrayList[RADIX];
	  	for (int i = 0; i < bucket.length; i++) {
                    bucket[i] = new ArrayList<Datos>();
	  	}
	 
	  	// sort
	  	boolean maxLength = false;
	  	int tmp = -1, placement = 1;
	  	while (!maxLength) {
                    maxLength = true;
                    // split input between lists
                    for (Datos i : input) {
                            tmp = i.getDato() / placement;
                            bucket[tmp % RADIX].add(i);
                            if (maxLength && tmp > 0) {
                                    maxLength = false;
                            }
                    }
                    // empty lists into input array
                    int a = 0;
                    for (int b = 0; b < RADIX; b++) {
                            for (Datos i : bucket[b]) {
                                    input[a++] = i;
                            }
                            bucket[b].clear();
                    }
                    // move to next digit
                    placement *= RADIX;
	  	}
	}
}
