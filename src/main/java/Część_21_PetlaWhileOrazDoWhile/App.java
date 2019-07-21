package Część_21_PetlaWhileOrazDoWhile;

public class App {

    public static void main(String[] args) {

        String[] array = {

                "Poland",
                "Germany",
                "France"
        };

        System.out.println("Pętla While");
        int i = 0;
        while (i < array.length){
            System.out.println(array[i]);
            i++;
        }

        System.out.println();
        System.out.println("Pętla DoWhile");

        int j = 0;
        do {
            System.out.println(array[j]);
            j++;
        }
        while (j < array.length);
    }
}
