import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numeroMaximo=0;
        Random rand = new Random();
        //Creamos los dos arrays
        int[] numeros = new int[10];
        int[] frecuencia = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(10);
        }
        //Hacemos un array para aumentar la frecuencia de cada
        for (int j : numeros) {

            frecuencia[j]++;
        }
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }



        System.out.println();
        System.out.println("Array con las frecuencias");
        //Hacemos este bucle para buscar cuál es el maximo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(i + ": "+frecuencia[i]+" ");
            if (numeroMaximo<frecuencia[i]) {
                numeroMaximo=frecuencia[i];

                }

            }

        System.out.println();
        //Hacemos este bucle para que nos muestre todos los numeros que tengan la frecuencia maxima
        for (int i = 0; i <frecuencia.length ; i++) {
            if (frecuencia[i] == numeroMaximo) {
                System.out.println("El numero que mas aparece es: " + i + " apareciendo estas veces: " + numeroMaximo);

            }
        }



        }
        /*System.out.println();
        System.out.println("El numero que mas aparece es: " + numeroConFrecuencia +" apareciendo estas veces: "+numeroMaximo);
*/


    }


