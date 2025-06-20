# Lab Activity 6: Swing To-Do List Application

This Java application uses **Swing** to implement a simple To-Do List with two windows:  
1. A viewer window to display tasks in a table  
2. A form window to add new tasks with descriptions and status

## Features

- GUI-based to-do list using **JFrame**, **JTable**, and **JTextField**
- Add tasks with:
  - Task name
  - Task description
  - Task status (`Not Started`, `Ongoing`, or `Completed`)
- Prevents multiple add-task windows from opening at the same time
- Validates input before adding to the list

## App Structure

### Main Viewer Window (`ToDoListViewer`)
- Displays the list of tasks in a table
- Contains an **"Add Task"** button
- Uses a `DefaultTableModel` to manage tasks

### Task Form Window (`ToDoListForm`)
- Inputs:
  - Task name (`JTextField`)
  - Task description (`JTextArea`)
  - Task status (`JComboBox`)
- Adds the task to the viewer table when fields are complete

## Sample Task

| Task Name      | Task Description       | Status      |
|----------------|------------------------|-------------|
| Java Practice  | Complete LabActivity 6 | Ongoing     |


## Requirements

- Java JDK 8 or higher
- GUI-capable system (Windows, macOS, or Linux with desktop)

## Author

Mary Jane Ausan
