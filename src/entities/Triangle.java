package entities;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {
  String name;
  public double a, b, c;

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double area() {
    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  public void showProperties() {
    Locale.setDefault(Locale.US);
    System.out.printf("Name: %s%n", this.name);
    System.out.printf("Side a: %.2f%n", a);
    System.out.printf("Side b: %.2f%n", b);
    System.out.printf("Side c: %.2f%n", c);
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.println("**********************");
    System.out.println("** TRIANGLE CREATOR **");
    System.out.println("**********************\n");
    System.out.println("WRITE TRIANGLE NAME: ");
    String name = sc.nextLine();
    System.out.println("WRITE A-SIDE VALUE: ");
    double a = sc.nextDouble();
    System.out.println("WRITE B-SIDE VALUE: ");
    double b = sc.nextDouble();
    System.out.println("WRITE C-SIDE VALUE: ");
    double c = sc.nextDouble();

    Triangle triangle1 = new Triangle(a,b, c);
    triangle1.name = name;
    System.out.println("\n*************");
    System.out.println("TRIANGLE INFO");
    System.out.println("*************\n");

    System.out.printf("NAME: %s%n", name);
    System.out.printf("A SIDE: %.2f%n", a);
    System.out.printf("B SIDE: %.2f%n", b);
    System.out.printf("C SIDE: %.2f%n", c);
    System.out.printf("AREA: %.2f", triangle1.area());

  }
}
