/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;

/**
 *
 * @author Student
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;

/**
 *
 * @author Student
 */
import java.util.Scanner;

/**
 * MAIN CLASS: Handles user input and instantiates the ConsoleSales object.
 */
public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ----- ASK FOR CONSOLE TYPE -----
        System.out.print("Enter the console device type: ");
        String consoleType = scanner.nextLine();

        // ----- ASK FOR STORE NAME -----
        System.out.print("Enter the store name: ");
        String store = scanner.nextLine();

        // ----- ASK FOR TOTAL SALES -----
        System.out.print("Enter the total sales for " + store + ": ");
        double totalSales = scanner.nextDouble();
        scanner.nextLine(); // Clear the Enter key

        // ----- CREATE THE OBJECT -----
        // WHY: We instantiate the subclass (ConsoleSales), not the abstract class.
        ConsoleSales sale = new ConsoleSales(consoleType, store, totalSales);

        // ----- PRINT THE REPORT -----
        sale.printReport();

        scanner.close();
    }
}
