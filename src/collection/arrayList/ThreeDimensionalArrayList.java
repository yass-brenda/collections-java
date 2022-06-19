package collection.arrayList;

import java.util.ArrayList;

public class ThreeDimensionalArrayList {
    public static void main(String[] args) {
        int x_axies_length = 2;
        int y_axies_length = 2;
        int z_axies_length = 2;

        // Se inicializa  el arraylist principal como strings
        ArrayList<ArrayList<ArrayList<String>>> space = new ArrayList<>();
        System.out.println(space);

        // Inicializa un arrayList con un arraylist de string
        for(int i=0; i< x_axies_length;i++){
            space.add(new ArrayList<ArrayList<String>>(y_axies_length));
            System.out.println(space);
            for (int j=0; j < y_axies_length;j++){
                space.get(i).add(new ArrayList<String>(z_axies_length));
            }
        }
        System.out.println(space);

        // Añadiendo colores dando sus cordenadas
        space.get(0).get(0).add(0,"Blue");
        space.get(0).get(0).add(1,"red");
        System.out.println(space);
    }
}
