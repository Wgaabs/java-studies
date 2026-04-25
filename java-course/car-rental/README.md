# 🚗 Car Rental

A Java application that calculates the rental invoice for a car rental
company, applying hourly or daily rates and taxes based on Brazilian rules.

## ✨ Features

- **Smart Billing** → Charges per hour (up to 12h) or per day (above 12h)
- **Tax Calculation** → Applies Brazilian tax rules automatically
- **Rounded Hours** → Partial hours are rounded up (e.g. 4h10min = 5h)
- **Clean Architecture** → Separated into entities and services packages

## 💰 Business Rules

### Billing
- Up to 12 hours → charged per hour
- Above 12 hours → charged per day

### Brazilian Tax
- Basic payment up to 100.00 → 20% tax
- Basic payment above 100.00 → 15% tax

## 🛠️ Tech Stack

- Java 21
- LocalDateTime / ChronoUnit
- Interface + Implementation pattern
- Math.ceil for hour rounding

## 📂 Project Structure
car-rental/
└── src/
├── entities/
│   ├── CarRental.java   → Rental data model
│   └── Invoice.java     → Invoice data model
├── services/
│   ├── TaxService.java          → Tax interface
│   ├── BrazilianTaxService.java → Brazilian tax implementation
│   └── RentalService.java       → Rental calculation logic
└── Program.java         → Main class

## 🏁 How to Run

```bash
# Clone the repository
git clone https://github.com/Wgaabs/java-studies.git

# Navigate to the project
cd java-course/car-rental

# Compile
javac -d bin src/entities/*.java src/services/*.java src/Program.java

# Run
java -cp bin Program
```

## 📝 Example
Enter rental data
Car model: Civic
Pickup (dd/MM/yyyy HH:mm): 25/06/2018 10:30
Return (dd/MM/yyyy HH:mm): 25/06/2018 14:40
Enter price per hour: 10.00
Enter price per day: 130.00
INVOICE:
Basic payment: 50.00
Tax: 10.00
Total payment: 60.00

## 📌 Concepts Applied

- Interface and implementation
- LocalDateTime and ChronoUnit
- Math.ceil for rounding
- Packages and clean architecture
- Encapsulation and OOP principles

---
*Part of my Java learning journey — github.com/Wgaabs*