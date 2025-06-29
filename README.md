# Java Employee Management System

A Java project that explores **Object-Oriented**, **Procedural**, and **Event-Driven** programming. It models a simple employee management system for a game company with distinct behaviors for different employee types.

This project is ideal for learning, testing, and comparing software development paradigms in Java.

---

## ✅ Key Features

- **Multi-Paradigm Design**
  - **OOP**: Core logic using classes, inheritance, and polymorphism
  - **Procedural**: Console-based linear flow using Scanner
  - **Event-Driven**: GUI-based version using `JOptionPane`

- **OOP Class Structure**
  - Base class: `Emp`
  - Subclasses: `Developer`, `Manager`
  - Encapsulation via private attributes and public getters/setters
  - Polymorphic behavior via overridden `sayHello()` methods

- **Error Handling**
  - Practical examples for:
    - Syntax errors
    - Runtime errors
    - Logical errors
  - Uses `try-catch` blocks and debug print statements

- **Debugging Practices**
  - Isolated test cases
  - Clear output messages
  - Commented code for issue tracking

- **Clean Code Standards**
  - Follows Java naming conventions
  - Proper indentation and code comments

---

## 🧱 Architectural Overview

The same system is implemented in three styles to illustrate how each paradigm handles the same problem.

### 1. Object-Oriented Programming (OOP)

```text
      +-----------+
      |    Emp    |
      +-----------+
            ^
     Inheritance
      +-----+-----+
      |           |
+-----------+ +-----------+
| Developer | |  Manager  |
+-----------+ +-----------+
