# Lab Activity 4: Employee Information System (GUI Version)

This Java program provides a graphical user interface (GUI) using AWT to input employee data and calculate their daily salary.

## Features

- GUI-based input using `TextField`s and `Button`
- Displays:
  - Full name
  - Age
  - Daily salary
- Validates user input (non-empty names, positive numbers)
- Handles input errors (like wrong number formats)

## How It Works

- User enters:
  - First name
  - Last name
  - Age
  - Hours worked
  - Hourly rate
- After clicking the **Submit** button:
  - The program calculates `salary = hours × wage`
  - Displays a result summary in a non-editable `TextArea`

## Validation Rules

- All fields must be filled.
- Age must be a positive number.
- Hours worked and hourly wage must be zero or higher.
- Any invalid input will show an error message in the result area.

## How to Run

1. Save the file as `LabActivity4EmpInfoSystemGUI.java`
2. Open terminal or command prompt.
3. Compile:

```
javac LabActivity4EmpInfoSystemGUI.java
```

4. Run:

```
java LabActivity4EmpInfoSystemGUI
```

## Requirements

- Java JDK 8 or higher
- AWT-compatible system (like Windows, macOS, Linux with GUI)

## Author

Mary Jane Ausan