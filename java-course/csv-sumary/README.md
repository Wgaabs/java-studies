# 📄 CSV Summary

A Java command-line application that reads a CSV file containing
sold items and generates a summary file with the total value per item.

## ✨ Features

- **File Reading** → Reads a CSV file with item name, unit price and quantity
- **Automatic Calculation** → Calculates total value (price × quantity) per item
- **File Writing** → Generates a summary.csv in the out/ folder automatically
- **Folder Creation** → Creates the output folder if it doesn't exist

## 🛠️ Tech Stack

- Java 21
- BufferedReader / BufferedWriter
- Try-with-resources
- IOException handling

## 📂 Project Structure
csv-summary/
├── in/
│   └── sales.csv       → Input file
├── out/
│   └── summary.csv     → Generated output file
└── src/
└── Program.java    → Main class

## 📝 Input File Format
ItemName,UnitPrice,Quantity
TV LED,1290.99,1
Video Game Chair,350.50,3

## 🏁 How to Run

```bash
# Clone the repository
git clone https://github.com/Wgaabs/java-studies.git

# Navigate to the project
cd java-course/csv-sumary

# Compile
javac src/Program.java

# Run
java -cp src Program
```

## 📊 Example

**Input (in/sales.csv):**
TV LED,1290.99,1
Video Game Chair,350.50,3
Iphone X,900.00,2
Samsung Galaxy 9,850.00,2

**Output (out/summary.csv):**
TV LED,1290.99
Video Game Chair,1051.50
Iphone X,1800.00
Samsung Galaxy 9,1700.00

## 📌 Concepts Applied

- File reading with BufferedReader
- File writing with BufferedWriter
- Try-with-resources
- CSV parsing with split()
- Automatic directory creation with mkdirs()
- IOException handling

---
*Part of my Java learning journey — github.com/Wgaabs*