# 🔢 Safe Calculator in Java

A console-based calculator that performs basic arithmetic operations with robust error handling. Built to practice Java's exception handling mechanism and clean I/O management.

## ✨ Features
- Basic operations: addition (`+`), subtraction (`-`), multiplication (`*`), division (`/`)
- Graceful division-by-zero handling (`ArithmeticException`)
- Input type validation (`InputMismatchException`)
- Unsupported operation rejection (`IllegalArgumentException`)
- Guaranteed resource cleanup with `finally` block

## 🛠️ Technologies
- **Language:** Java 17+
- **I/O:** `java.util.Scanner`, `java.util.Locale`
- **Error Handling:** `try/catch/finally`, manual exception throwing

## ▶️ How to Run
Make sure you have Java installed. Then run:
```bash
javac Program.java
java Program