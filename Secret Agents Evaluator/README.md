# Secret Agent Evaluator 🕵️‍♂️

A Java-based CLI system designed to process, sanitize, and evaluate secret agent mission data using core Java programming principles.

## 📝 Description

This program simulates a security agency terminal. It takes unformatted agent code-names and an upper limit in how many agents were  successfully evaluated, processes them, assigns security tiers and verifies mission clearance based on random performance scores.

## 🚀 Features

* **Data Sanitization:** Trims whitespace and converts raw string inputs to uppercase.
* **Smart Filtering:** Validates agent codes based on length (minimum 3 characters), stopping in case it encounters a "STOP" message in the array.
* **Unicode Analysis:** Displays the numeric Unicode value of the agent's first name's letter.
* **Precision Scoring:** Creates random performance scores (0-100) using the `Math` class.
* **Tier Classification:** Categorizes agents into security levels (**Top Secret**, **Confidential**, **Restricted**) using modulo arithmetic and `switch` statements.
* **Operational Limits:** Tracks successful evaluations and enforces a system-wide `MAX_ATTEMPTS` limit to simulate resource management.

## 🛠️ Technologies Used

* **Language:** Java 8+
* **Key Concepts:** * **String Manipulation:** `trim()`, `toUpperCase()`, `equals()`, `length()`.
    * **Mathematical Logic:** `Math.random()`, Modulo operator (`%`).
    * **Type Casting:** Widening and Narrowing casting (e.g., `double` to `int` to `byte`).
    * **Control Flow:** `for` loops, `switch` statements, and Ternary operators (`? :`).
    * **Memory Management:** Final variables and Array indexing.

## 📅 Version History

* **v1.0** - Initial Release: Core evaluation engine with string sanitization, random score generation, and security tier assignment.

---
*Created by [FRONX] - AUEB Informatics Undergraduate*
