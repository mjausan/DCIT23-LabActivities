# Lab Activity 3: Conditional Statement - Employee Information System

This Java program collects employee information, calculates salary details, and uses conditional statements to determine the employee's role based on a role code input.

## Features

- Accepts the following employee details:
  - First name
  - Last name
  - Age
  - Hours worked per day
  - Hourly wage
  - Role code (1 to 4)
- Calculates:
  - Full name in uppercase format
  - Years to retirement (based on age 65)
  - Daily, weekly, monthly, gross yearly, and net yearly salary
  - Role/position based on user input using `switch` statement

## Role Code Reference

| Code | Position    |
|------|-------------|
| 1    | Manager     |
| 2    | Supervisor  |
| 3    | Staff       |
| 4    | Intern      |

If the code is not within 1–4, the position will be shown as `"Unknown"`.

## How to Run

1. Save the file as `LabActivity3ConditionalStatement.java`
2. Open your terminal or command prompt.
3. Compile the code:

```
javac LabActivity3ConditionalStatement.java
```

4. Run the program:

```
java LabActivity3ConditionalStatement
```

## Requirements

- Java JDK 8 or higher installed

## Author

Mary Jane Ausan
