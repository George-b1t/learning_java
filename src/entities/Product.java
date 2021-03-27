package entities;

import java.util.Locale;
import java.util.Scanner;

public class Product {
  public String name;
  public double price;
  public int quantity;

  public double totalValueInStock() {
    return price * quantity;
  }

  public void addProduct(int quantity) {
    this.quantity += quantity;
  }

  public void removeProduct(int quantity) {
    this.quantity -= quantity;
  }

  public String toString() { // RESERVED METHOD OF A CLASS
    return name
      + ", $ "
      + String.format("%.2f", price)
      + ", "
      + quantity
      + " units, Total: $ "
      + String.format("%.2f", this.totalValueInStock());
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Product product1 = new Product();
    System.out.println("ENTER PRODUCT DATA\n");
    System.out.print("NAME: ");
    product1.name = sc.nextLine();
    System.out.print("PRICE: ");
    product1.price = sc.nextDouble();
    System.out.print("QUANTITY: ");
    product1.quantity = sc.nextInt();

    System.out.println("\nPRODUCT DATA:\n" + product1);

    System.out.print("\nENTER A NUMBER OF PRODUCTS TO BE ADDED IN STOCK: ");
    int quantity = sc.nextInt();
    product1.addProduct(quantity);

    System.out.println("\nUPDATED DATA:\n" + product1);

    System.out.print("\nENTER A NUMBER OF PRODUCTS TO BE REMOVED IN STOCK: ");
    quantity = sc.nextInt();
    product1.removeProduct(quantity);

    System.out.println("\nUPDATED DATA:\n" + product1);

    sc.close();
  }
}
