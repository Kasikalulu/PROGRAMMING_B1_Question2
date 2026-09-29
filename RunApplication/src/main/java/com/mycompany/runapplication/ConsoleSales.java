/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

/**
 *
 * @author Student
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

/**
 *
 * @author Student
 */
/**
 * SUBCLASS: Inherits from Console.
 * WHY? It "is-a" Console record, but adds specific behaviour
 * (printing the sales report).
 */
public class ConsoleSales extends Console {

    // ----- CONSTRUCTOR -----
    // WHY: We call super() to let the parent class handle its own fields.
    // This is known as "constructor chaining".
    public ConsoleSales(String consoleType, String store, double totalSales) {
        super(consoleType, store, totalSales); // Calls the parent constructor
    }

    // ----- METHOD: printReport -----
    // WHY: This is the specific behaviour of a ConsoleSales record.
    // It displays the details in a clear format.
    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("**********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.printf("TOTAL SALES: R%.2f%n", getTotalSales());
        System.out.println("**********************");
    }
}
