import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numeroMaximo=0;
        int numeroConFrecuencia=0;
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
        //Y mostramos la informacion de los dos array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(i + ": "+frecuencia[i]+" ");
            if (numeroMaximo<frecuencia[i]) {
                numeroMaximo=frecuencia[i];
                numeroConFrecuencia=i;
            }

        }
        System.out.println();
        System.out.println("El numero que mas aparece es: " + numeroConFrecuencia +" apareciendo estas veces: "+numeroMaximo);
    }
}

