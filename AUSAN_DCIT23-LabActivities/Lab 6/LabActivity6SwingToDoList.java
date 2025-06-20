import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class LabActivity6SwingToDoList {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ToDoListViewer());
    }
}

// Viewer Window
class ToDoListViewer extends JFrame {
    private DefaultTableModel tableModel;

    public ToDoListViewer() {
        setTitle("To-Do List Viewer");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Table columns
        String[] columns = {"Task Name", "Task Description", "Status"};
        tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);

        JButton addTaskButton = new JButton("Add Task");
        addTaskButton.addActionListener(e -> {
            if (!ToDoListForm.isOpen) {
                new ToDoListForm(this, tableModel);
            }
        });

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.add(addTaskButton);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}

// Form Window
class ToDoListForm extends JFrame {
    public static boolean isOpen = false;

    public ToDoListForm(JFrame parent, DefaultTableModel model) {
        setTitle("Add Task");
        setSize(400, 300);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout());
        isOpen = true;

        // Form fields
        JTextField taskNameField = new JTextField(20);
        JTextArea taskDescriptionArea = new JTextArea(5, 20);
        String[] statuses = {"Not Started", "Ongoing", "Completed"};
        JComboBox<String> statusComboBox = new JComboBox<>(statuses);

        // Form layout
        JPanel formPanel = new JPanel(new GridLayout(6, 1));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        formPanel.add(new JLabel("Task Name:"));
        formPanel.add(taskNameField);
        formPanel.add(new JLabel("Task Description:"));
        formPanel.add(new JScrollPane(taskDescriptionArea));
        formPanel.add(new JLabel("Status:"));
        formPanel.add(statusComboBox);

        // Save button
        JButton saveButton = new JButton("Save Task");
        saveButton.addActionListener(e -> {
            String name = taskNameField.getText().trim();
            String desc = taskDescriptionArea.getText().trim();
            String status = (String) statusComboBox.getSelectedItem();

            if (!name.isEmpty() && !desc.isEmpty()) {
                model.addRow(new Object[]{name, desc, status});
                dispose();
                isOpen = false;
            } else {
                JOptionPane.showMessageDialog(this, "Please fill out all fields.");
            }
        });

        add(formPanel, BorderLayout.CENTER);
        add(saveButton, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                isOpen = false;
            }
        });

        setVisible(true);
    }
}