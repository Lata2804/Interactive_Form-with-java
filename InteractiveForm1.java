import java.awt.*;
import java.awt.event.*;

public class InteractiveForm1 extends Frame implements ActionListener {
    private TextField firstNameField, lastNameField;
    private Choice dobMonth, dobDay, dobYear, genderChoice, eduQualChoice;
    private TextField languagesField;
    private TextArea introTextArea;

    public InteractiveForm1() {
        setTitle("CANDIDATE INFORMATION");
        setSize(400, 400);
        setLayout(new GridLayout(8, 2));
        setFont(new Font("Arial", Font.PLAIN, 14));
        Color customColor = new Color(153, 153, 255);
        setBackground(customColor);

        Label firstNameLabel = new Label("First Name:");
        firstNameLabel.setAlignment(Label.RIGHT);
        firstNameField = new TextField(20);
        Label lastNameLabel = new Label("Last Name:");
        lastNameLabel.setAlignment(Label.RIGHT);
        lastNameField = new TextField(20);
        Label dobLabel = new Label("Date of Birth (MM/DD/YY):");
        dobLabel.setAlignment(Label.RIGHT);
        dobMonth = new Choice();
        for (int i = 1; i <= 12; i++) {
            dobMonth.add(String.valueOf(i));
        }
        dobDay = new Choice();
        for (int i = 1; i <= 31; i++) {
            dobDay.add(String.valueOf(i));
        }
        dobYear = new Choice();
        for (int i = 1960; i <= 2025; i++) {
            dobYear.add(String.valueOf(i));
        }
        Label genderLabel = new Label("Gender:");
        genderLabel.setAlignment(Label.RIGHT);
        genderChoice = new Choice();
        genderChoice.add("Male");
        genderChoice.add("Female");
        genderChoice.add("Others");
        Label eduQualLabel = new Label("Educational Qualification:");
        eduQualLabel.setAlignment(Label.RIGHT);
        eduQualChoice = new Choice();
        eduQualChoice.add("B.Tech");
        eduQualChoice.add("M.Tech");
        eduQualChoice.add("PhD");
        Label languagesLabel = new Label("Languages Known:");
        languagesLabel.setAlignment(Label.RIGHT);
        languagesField = new TextField(20);
        Label introLabel = new Label("Brief Intro About Yourself:");
        introLabel.setAlignment(Label.RIGHT);
        introTextArea = new TextArea(5, 20);
        Button submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        Button cancelButton = new Button("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(dobLabel);
        Panel dobPanel = new Panel(new FlowLayout(FlowLayout.CENTER));
        dobPanel.add(dobMonth);
        dobPanel.add(new Label("/"));
        dobPanel.add(dobDay);
        dobPanel.add(new Label("/"));
        dobPanel.add(dobYear);
        add(dobPanel);
        add(genderLabel);
        add(genderChoice);
        add(eduQualLabel);
        add(eduQualChoice);
        add(languagesLabel);
        add(languagesField);
        add(introLabel);
        add(introTextArea);
        add(submitButton);
        add(cancelButton);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String dob = dobMonth.getSelectedItem() + "/" + dobDay.getSelectedItem() + "/" + dobYear.getSelectedItem();
            String gender = genderChoice.getSelectedItem();
            String eduQual = eduQualChoice.getSelectedItem();
            String languages = languagesField.getText();
            String intro = introTextArea.getText();
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("DOB: " + dob);
            System.out.println("Gender: " + gender);
            System.out.println("Educational Qualification: " + eduQual);
            System.out.println("Languages Known: " + languages);
            System.out.println("Brief Intro About Yourself: " + intro);
            dispose();
        }
    }

    public static void main(String[] args) {
        InteractiveForm1 form = new InteractiveForm1();
        form.setVisible(true);
    }
}
