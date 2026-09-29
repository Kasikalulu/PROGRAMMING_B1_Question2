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
 * ABSTRACT CLASS: Holds the common data for any console sales record.
 * WHY abstract? We don't want a "plain" Console object.
 * It is meant to be extended by specific report types (ConsoleSales).
 *
 * The class also IMPLEMENTS the IConsoles interface.
 * WHY? So every subclass automatically provides the required getter methods.
 */
public abstract class Console implements Iconsoles {

    // ----- PRIVATE FIELDS (Information Hiding) -----
    // WHY private? So no other class can change them directly.
    private String consoleType;
    private String store;
    private double totalSales;

    // ----- CONSTRUCTOR -----
    // WHY? Accepts all three values when the object is created.
    public Console(String consoleType, String store, double totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // ----- GETTERS (Required by the IConsoles interface) -----
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public double getTotalSales() {
        return totalSales;
    }
}

