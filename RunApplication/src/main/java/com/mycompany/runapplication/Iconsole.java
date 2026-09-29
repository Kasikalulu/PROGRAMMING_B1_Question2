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
 * INTERFACE: Defines the contract that any Console class must follow.
 * WHY: An interface forces any implementing class to provide these methods.
 * This makes the code predictable and reusable.
 */
public interface Iconsoles {
    String getConsoleType();      // Returns the type of console (e.g., PlayStation)
    String getStore();            // Returns the store name
    double getTotalSales();       // Returns the total sales amount
    // NOTE: Your question showed "String getTotalSales()" but a sales AMOUNT
    // should be a number (double), not text. This is a common typo in papers.
}
