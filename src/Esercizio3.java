public class Esercizio3 {
    public static void main(String[] args) {

        double perimRectangle = perimRectangle(10.5, 20.4);
        System.out.println("Il perimetro del rettangolo e': " + perimRectangle);


        int evenOrOdd = evenOrOdd(5);
        System.out.println("Il numero inserito e' pari? " + evenOrOdd);


        double areaTri = areaTri(10.5, 20.6, 30.8);
        System.out.println("L'area del triangolo e': " + areaTri);
        System.out.println("L'area del triangolo e': " + Double.toString(areaTri).substring(0, 5));


    }

    public static double perimRectangle(double a, double b) {
        return (a + b) * 2;
    }

    public static int evenOrOdd(int a) {
        if (a % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static double areaTri(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
