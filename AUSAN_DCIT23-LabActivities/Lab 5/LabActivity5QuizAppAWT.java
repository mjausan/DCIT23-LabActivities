import java.awt.*;
import java.awt.event.*;

public class LabActivity5QuizAppAWT extends Frame implements ActionListener {
    Label questionLabel;
    CheckboxGroup choicesGroup;
    Checkbox choice1, choice2, choice3, choice4;
    Button nextButton;
    Panel mainPanel;

    String[] questions = {
        "What is the brain of the computer?",
        "Which of the following is a programming language?",
        "Which device is used to input text?"
    };

    String[][] options = {
        {"Monitor", "Mouse", "CPU", "RAM"},
        {"HTML", "Java", "HTTP", "URL"},
        {"Monitor", "Mouse", "Printer", "Keyboard"}
    };

    int[] correctAnswers = {2, 1, 3}; // indexes of correct options
    int currentQuestion = 0;
    int score = 0;

    public LabActivity5QuizAppAWT() {
        setTitle("Java AWT Quiz App");
        setSize(500, 300);
        setLayout(new BorderLayout());

        questionLabel = new Label();
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));

        choicesGroup = new CheckboxGroup();
        choice1 = new Checkbox("", choicesGroup, false);
        choice2 = new Checkbox("", choicesGroup, false);
        choice3 = new Checkbox("", choicesGroup, false);
        choice4 = new Checkbox("", choicesGroup, false);

        choice1.setBackground(Color.lightGray);
        choice2.setBackground(Color.lightGray);
        choice3.setBackground(Color.lightGray);
        choice4.setBackground(Color.lightGray);

        nextButton = new Button("Next");
        nextButton.setBackground(Color.cyan);
        nextButton.addActionListener(this);

        mainPanel = new Panel();
        mainPanel.setLayout(new GridLayout(6, 1, 5, 5));
        mainPanel.setBackground(Color.white);
        mainPanel.add(questionLabel);
        mainPanel.add(choice1);
        mainPanel.add(choice2);
        mainPanel.add(choice3);
        mainPanel.add(choice4);
        mainPanel.add(nextButton);

        add(mainPanel, BorderLayout.CENTER);

        showQuestion();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    void showQuestion() {
        if (currentQuestion < questions.length) {
            questionLabel.setText("Q" + (currentQuestion + 1) + ": " + questions[currentQuestion]);
            choice1.setLabel(options[currentQuestion][0]);
            choice2.setLabel(options[currentQuestion][1]);
            choice3.setLabel(options[currentQuestion][2]);
            choice4.setLabel(options[currentQuestion][3]);
            choicesGroup.setSelectedCheckbox(null);
        } else {
            questionLabel.setText("You got " + score + " out of " + questions.length + " correct!");
            choice1.setEnabled(false);
            choice2.setEnabled(false);
            choice3.setEnabled(false);
            choice4.setEnabled(false);
            nextButton.setEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent e) {
        Checkbox selected = choicesGroup.getSelectedCheckbox();
        if (selected != null) {
            String answer = selected.getLabel();
            if (answer.equals(options[currentQuestion][correctAnswers[currentQuestion]])) {
                score++;
            }
        }
        currentQuestion++;
        showQuestion();
    }

    public static void main(String[] args) {
        new LabActivity5QuizAppAWT();
    }
}