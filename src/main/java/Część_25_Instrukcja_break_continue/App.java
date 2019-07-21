package Część_25_Instrukcja_break_continue;

public class App {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){

            if (i % 2 != 0)
                continue;

    // przerwij iterację od tego momentu i nie wykonuj już żadnych  instrukcji

            System.out.println(i);
        }
    }
}
