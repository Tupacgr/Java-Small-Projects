# Electronics Store Management 💻

A Java-based CLI system designed to process, and evaluate data from an Electronics Store simulating its functions.

## 📝 Description

This program simulates an electronics store terminal. It receives orders from the user, such as creating a product or reducing its quantity and updates the store's/product's information during runtime.

## 🚀 Features

* **Create a Product and provide information such as its Name, CODE, Description, Quantity, Price and Weight** 
* **Change a Product's Name, Code, Description, Release Date, Color, Quantity, Price and Weight** 
* **Print all the information of a Product at once** 
* **Print all the information of all products of a specific type at once (e.g. all the smartphones information)**


## 🛠️ Technologies Used

* **Language:** Java 17+
* **Key Concepts:** 
    * **OOP (Object Oriented Programming): Implementing multiple classes utilizing Inheritance, Encapsulation, Abstraction and Polymorphism** 
    * **User Input Processing: Accepting user input utilizing the Scanner Class and filtering it**  
    * **Data Management: Utilizing ArrayList to store Products information and access the cli menu**
    * **Enhanced Switch Statements: Utilizing enhanced switch statements to control the user's input**
    * **Automated Inventory Management: Updating Products information in real-time**  
    * **Java Time API: Displaying a formatted version of date and time utilizing LocalDateTime and DateTimeFormatter classes** 
    * **Immutable Record Class: Utilizing this type of class to get the basic product's data**
    * **Exception Handling: Utilizing try and catch statements to prevent unexpected crashes when wrong input is given by the user**
    * **Multiple lines String Formatting: Utilizing Text Blocks (""" with %s) and .formatted()**
    * **DRY: Utilizing Java 17 Records to enhance data management and provide a shared logic in products creation**
    * **Input Filtering: Utilizing .trim() and .toUpperCase()**
    * **Type Checking: Utilizing .isInstance() and Class<? extends Product> to filter objects that extend the Product Class**
    

## 📅 Version History

* **v1.0** - Initial Release: An Electronics Store Management program with multiple possibilities
* **v1.1** - v1.1 Release: Added a date & time display and the option to change a product's weight with a validity check
* **v1.2** - v1.2 Release: Improved Data Management. Implemented Exception handling methods to ensure the application is not vulnerable to crashes.

---
*Created by [FRONX] - AUEB Informatics Undergraduate*
