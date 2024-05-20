import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {

        int multiplicationResult = multiplication(3, 5);
        System.out.println("Il risultato della moltiplicazione e': " + multiplicationResult);

        String concatenationResult = concatanation("Ciao ", 5);
        System.out.println("Il risultato della concatenazione e': " + concatenationResult);


        String[] arrayProva = {"Il", "mio", "gatto", "si", "chiama"};

        // String[] pushedArrayResult = pushedArray(arrayProva, "Francesco");
        String[] pushedArrayResult = pushedArray(new String[]{"Il", "mio", "gatto", "si", "chiama"}, "Francesco");

        for (int i = 0; i < pushedArrayResult.length; i++) {
            System.out.println(pushedArrayResult[i]);
        }

    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static String concatanation(String a, int b) {
        return a + b;
    }


    public static String[] pushedArray(String[] array, String a) {

        String[] newArray = new String[array.length + 1];
        newArray[0] = array[0];
        newArray[1] = array[1];
        newArray[2] = array[2];
        newArray[3] = a;
        newArray[4] = array[3];
        newArray[5] = array[4];

        return newArray;
    }

//    String[] result = new String[6];
//for(
//    int i = 0;
//    i<result.length;i++)
//
//    {
//        if (i < 2) {
//            result[i] = array[i];
//        } else if (i == 2) {
//            result[i] = string;
//        } else {
//            result[i] = array[i - 1];
//        }
//    }
//return result;


}

