# Inheritance Price Tag

## Description
Program that reads data from N products and displays the price tag
of each product in the order they were entered.

## Business Rules
- Common products display name and price
- Imported products have a customs fee added to the final price
- Used products display the manufacture date

## Class Diagram
- Product (base class)
    - ImportedProduct (extends Product)
    - UsedProduct (extends Product)

## Concepts Applied
- Inheritance (extends)
- Polymorphism
- Method Override (@Override)
- SimpleDateFormat for date formatting

## Technologies
- Java 21

## How to Run
1. Clone the repository
2. Open in IntelliJ IDEA
3. Run Program.java
4. Enter the number of products
5. For each product choose: c (common), i (imported) or u (used)