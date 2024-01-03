import java.util.Scanner;

public class App {

  public static void menu() {
    System.out.println(
      "----Welcome to Employee Management System----" +
      "\n1. Add Employee" +
      "\n2. View Employee" +
      "\n3. Update Employee" +
      "\n4. Delete Employee" +
      "\n5. View All Employee" +
      "\n6. Exist"
    );
  }

  public static void main(String[] args) throws Exception {
    // Emp Employee=new Emp();
    // Employee.setId(10);
    // System.out.println(Employee.getId());
    // System.out.println(Employee);

    Scanner sc = new Scanner(System.in);
    Services services = new Services();
    do {
      App.menu();
      System.out.println("Enter your Choice");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Add Employee");
          break;
        case 2:
          System.out.println("View Employee");
          services.viewAllEmps();
          break;
        case 3:
          System.out.println("Update Employee");
          break;
        case 4:
          System.out.println("Delete Employee");
          break;
        case 5:
          System.out.println("View All Employee");
          break;
        case 6:
          System.out.println("Thank you for using Application!");
          System.exit(0);
          break;
        default:
          System.out.println("Please Enter valid Choice");
          break;
      }
      System.out.println();
    } while (true);
  }
}
