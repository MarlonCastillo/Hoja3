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
http://www.geekviewpoint.com/java/sorting/mergesort
http://www.mycstutorials.com/articles/sorting/mergesort
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
    public Datos [] mergesort(Datos input[]) {
                if (input.length>1){
                    int elementsInA1 = input.length/2;
                    int elementsInA2 = input.length/2;
                    if ((input.length % 2)==1){
                        elementsInA2 += 1;   
                    }
                    Datos arr1[]=new Datos [elementsInA1];
                    Datos arr2[]=new Datos [elementsInA1];
                    for(int i = 0; i < elementsInA1; i++){
			arr1[i] = input[i];
                    }
                    for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++){
			arr2[i - elementsInA1] = input[i];
                    }
                    arr1 = mergesort (arr1);
                    arr2 = mergesort (arr2);
                    int i=0, j=0, k=0;
                    while(arr1.length != j && arr2.length !=k){
                        if (arr1[j] < arr2[k]){
                            input[1] = arr1[j];
                            i++;
                            j++;
                        }
                        else{
                            input[i]=arr2[k];
                            i++;
                            k++;
                        }
                    }
                    while (arr1.length!=j){
                        input[i]=arr1[j];
                        i++;
                        j++;
                    }
                    while (arr1.length!=j){
                        input[i]=arr1[j];
                        i++;
                        k++;
                    }
                }
            return input;
        }
    
}
