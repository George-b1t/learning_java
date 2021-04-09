package entities;

import java.util.Locale;
import java.util.Scanner;

public class Product {
  public String name;
  public double price;
  public int quantity;

  public Product() {} // Default constructor (overload)

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Product(String name, double price) { // Overload: Other constructor
    this.name = name;                         // with minus parameters
    this.price = price;
  }

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

    System.out.println("ENTER PRODUCT DATA\n");
    System.out.print("NAME: ");
    String productName = sc.nextLine();
    System.out.print("PRICE: ");
    double productPrice = sc.nextDouble();
    System.out.print("QUANTITY: ");
    int productQuantity = sc.nextInt();
    Product product1 = new Product(productName,
                                   productPrice,
                                   productQuantity);

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
