# 📂 IO Programming in Java

Welcome to the **IO Programming** repository — a comprehensive resource for mastering Java Input/Output operations! This repo is designed to help developers understand and implement various IO techniques, including file handling, stream manipulation, CSV processing, and JSON parsing using Java.

> "The real world is all about input and output. Learn how Java talks to it."

---

## 📂 Branch Overview

| Branch Name           | Topics Covered                                                                                   |
|-----------------------|--------------------------------------------------------------------------------------------------|
| `java-streams`        | 🔄 **Java I/O Streams**: Comprehensive guide to using Java I/O stream classes including FileInputStream, FileOutputStream, Object streams, ByteArray streams, Buffered streams, and Reader/Writer. Emphasizes practical applications, exception safety, and performance optimization. |
| `json-data-handling`  | 🧾 **JSON Data Processing**: Demonstrates parsing, reading, writing, and validating JSON using libraries like Jackson or Gson. Includes schema validation, serialization of objects, and handling nested JSON structures. |
| `csv-data-handling`   | 📑 **CSV Handling in Java**: Provides examples for reading from and writing to CSV files using core Java and external libraries such as OpenCSV. Covers mapping data to Java objects, handling headers, and data transformation for reports. |

---

## 🚀 Solutions to

- ✅ How to handle real-world file formats (CSV & JSON)
- ✅ Java's powerful I/O stream classes (FileInputStream, BufferedReader, ObjectOutputStream, etc.)
- ✅ Reading and writing structured data efficiently
- ✅ Applying best practices for exception handling and stream management
- ✅ Working with data in both text and binary forms

---

## 🧰 Tech Stack

- **Java** – Core language for implementing I/O operations
- **OpenCSV / Jackson / org.json** – For handling CSV and JSON data respectively
- **JUnit 5** – To test I/O logic with robust test cases
- **Maven** – For project structure and dependency management
- **IntelliJ IDEA / Eclipse / VS Code** – IDE support for seamless development

---

## 🛣️ Roadmap

Below is the learning flow this repository follows:

### 1️⃣ CSV Data Handling
- Understand CSV format & delimiters
- Parse CSV using manual parsing and OpenCSV
- Write Java objects to CSV
- Handle edge cases like missing values or malformed lines

### 2️⃣ Java I/O Streams
- Understand stream types and hierarchy
- Work with:
    - File Streams (FileInputStream, FileOutputStream)
    - Object Streams (Serialization & Deserialization)
    - Buffered Streams for performance
    - ByteArray Streams for memory-based I/O
    - Reader and Writer for character data
- Explore I/O Best Practices

### 3️⃣ JSON Data Handling
- Introduction to JSON format and structure
- Parse JSON data into Java objects using libraries like Jackson / org.json
- Write Java objects as JSON
- Validate against JSON Schema

---

## 📦 How to Use

1. **Clone the Repository**
   ```bash
   https://github.com/disha2301/IO-Programming/tree/json-data-handling

2. **Checkout Topic Branch**
   ```bash
   git checkout <branch-name>

3. **Open with an IDE**
   ```bash
   - Use IntelliJ, Eclipse, or VS Code
   - Run individual Java files or test classes

4. **Run Tests**
   ```bash
   mvn test

## 🧪 Solutions cover

- ✅ **Convert and export** data from Java objects to CSV/JSON for generating structured reports
- ✅ **Deserialize** data streams from files or APIs into usable Java objects
- ✅ **Handle complex I/O** operations efficiently using buffering, stream chaining, and proper exception handling  