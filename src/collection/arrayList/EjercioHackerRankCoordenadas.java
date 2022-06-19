package collection.arrayList;

import java.io.*;
import java.util.*;

public class EjercioHackerRankCoordenadas {

    public static void main(String[] args) {
        List<List<Integer>> listaGeneral = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int totalArrays= sc.nextInt();


        for(int i = 1 ; i<= totalArrays; i++){
            int cantidadElementos = sc.nextInt();
            List<Integer> lista1 = new ArrayList<>();
            for(int j=1; j<=cantidadElementos; j++){
                int datos = sc.nextInt();
                lista1.add(datos);
            }

            listaGeneral.add(lista1);

        }
        int x = 0 ;
        int y = 0 ;

        int totalPares = sc.nextInt();
        int coordenada1;
        int coordenada2;
        for(int j= 0; j < totalPares ; j++){
            coordenada1 = sc.nextInt();
            coordenada2 = sc.nextInt();
            try {
                System.out.println(listaGeneral.get(coordenada1-1).get(coordenada2-1));
            } catch (RuntimeException e) {
                    System.out.println("ERROR!");
            }

        }

    }
}
