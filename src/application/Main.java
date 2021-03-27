package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void class24() {
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);

        Locale.setDefault(Locale.US);
        System.out.printf("%.3f%n", x);
        System.out.println("RESULTADO = " + x + " metros");
        System.out.printf("RESULTADO = %.3f metros%n", x);

        String nome = "George";
        int idade = 17;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }

    public static void quest24() {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);

        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }

    public static void class25() {
        float b, B, h;
        double area;
        b = 6f;
        B = 8f;
        h = 5f;

        area = (b + B) / 2.0 * h;
        System.out.println(area);

        int x, y;
        double resultado;
        x = 5;
        y = 2;

        resultado = (double) x / y;
        System.out.println(resultado);
    }

    public static void class26() {
        Locale.setDefault(Locale.US);
        // Change Locale to user double with "."

        Scanner sc = new Scanner(System.in);

        String x;
        int y, w;
        double z;
        w = sc.nextInt();
        sc.nextLine(); // To absorb the line break
        x = sc.nextLine();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Inputed values: ");
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // nextDouble receive value accordingly
        // with the system location
        // If char x ==> x = sc.next().charAt(0);
        // Take first letter of inputed value

        sc.close();
    }

    public static void class28() {
        Locale.setDefault(Locale.US);

        double A, B, C, x, y, z;
        x = 25.0;

        A = Math.sqrt(x);
        System.out.printf("A raiz quadrada de %.2f é %.2f%n", x, A);

        A = Math.pow(x, 2);
        System.out.printf("%.2f ao quadrado é %.2f%n", x, A);

        x = -10.0;
        A = Math.abs(x);
        System.out.printf("O valor absoluto de %.2f é %.2f%n", x, A);
    }

    public static void class35() {
        Scanner sc = new Scanner(System.in);

        System.out.println("What time is it? ");
        int x = sc.nextInt();

        if ( x >= 4 && x < 12 ) {
            System.out.println("GOOD MORNING");
        } else if ( x >= 12 && x < 18 ) {
            System.out.println("GOOD EVENING");
        } else if ( x >= 18 && x <= 23 || x >= 0 && x < 4 ) {
            System.out.println("GOOD NIGHT");
        } else {
            System.out.println("INVALID HOUR");
        }

        sc.close();
    }

    public static void class39() {
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT THE WEEK-DAY NUMBER: ");
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "SUNDAY";
                break;
            case 2:
                dia = "MONDAY";
                break;
            case 3:
                dia = "TUESDAY";
                break;
            case 4:
                dia = "WEDNESDAY";
                break;
            case 5:
                dia = "THURSDAY";
                break;
            case 6:
                dia = "FRIDAY";
                break;
            case 7:
                dia = "SATURDAY";
                break;
            default:
                dia = "INVALID DAY";
                break;
        }

        System.out.println(dia);

        sc.close();
    }

    public static void class40() {
        // Ternary Expression
        // ( condition ) ? value_if_true : value_if_false

        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT A NUMBER: ");
        int aNumber = sc.nextInt();
        int result = ( aNumber > 20 ) ? 1 : 0;

        System.out.println("YOUR NUMBER IS BIGGER THAN 20?");
        System.out.println((result == 0) ? "NO" : "YES");
        sc.close();
    }

    public static void class45() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int x, soma;
        x = sc.nextInt();
        soma = 0;

        while (x != 0) {
            soma += x;
            System.out.print("Input a number: ");
            x = sc.nextInt();
        }

        System.out.printf("The sum of the inputted numbers is: %d", soma);

        sc.close();
    }

    public static void class50() {
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT THE NUMBERS QUANTITY: ");
        int N, soma;
        N = sc.nextInt();
        soma = 0;

        for(int i = 0; i < N; i++) {
            System.out.printf("INPUT THE %dº NUMBER: ", i+1);
            int x = sc.nextInt();
            soma += x;
        }

        System.out.printf("THE SUM OF INPUTED NUMBERS: %d", soma);

        sc.close();
    }

    public static void class55() {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double c, f;
        char wantC;

        System.out.println("*********");
        System.out.println("ºC TO ºF");
        System.out.println("*********");

        do {
            System.out.print("INPUT A TEMPERATURE IN ºC: ");
            c = sc.nextDouble();
            f = (9 * (c / 5)) + 32;
            System.out.printf("IS: %.1f ºF%n", f);
            System.out.print("WANT TO CONTINUE [s/n]? ");
            wantC = sc.next().charAt(0);

        } while (wantC == 's' || wantC == 'S');

        sc.close();
    }

    public static void class59() {
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s1 = original.toLowerCase(); // Para minusculo
        System.out.println("-" + s1 + "-");

        String s2 = original.toUpperCase(); // Para maiusculo
        System.out.println("-" + s2 + "-");

        String s3 = original.trim(); // Elimina espaços dos cantos
        System.out.println("-" + s3 + "-");

        String s4 = original.substring(2); // Do index passado em diante
        System.out.println("-" + s4 + "-");

        String s5 = original.substring(2, 9); // De um ao outro
        System.out.println("-" + s5 + "-");

        String s6 = original.replace("abc", "xyz");
        System.out.println("-" + s6 + "-");

        int i1 = original.indexOf("bc"); // Posição da primeira ocorrência
        System.out.println(i1);

        int i2 = original.lastIndexOf("bc"); // Posição da última ocorrência
        System.out.println(i2);

        String[] myList = original.split(" ");
        for (String s : myList) {
            System.out.println(s);
        }
    }

    public static int max(int a, int b, int c) {
        int max;
        max = Math.max(a, Math.max(b, c));
        return max;
    }

    public static void showResult(int result) {
        System.out.println("RESULT");
        System.out.printf("The bigger number is: %d", result);
    }

    public static void class61(int n1, int n2, int n3) {
        System.out.println("");
        showResult(max(n1, n2, n3));
    }

    public static void listTest() {
        String[] myList = { "George", "JT", "ANA", "JOANA" };

        for(String s : myList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

    }

}
