# Interactive_Form-with-java
# Candidate Information Form - Java Application

This project is a simple GUI-based Java application that collects candidate information such as name, date of birth, gender, educational qualifications, known languages, and a brief introduction. The data is displayed in the console when the form is submitted.

## Features
- Collects user information through an interactive GUI form.
- Outputs the collected information to the console upon submission.
- Includes "Submit" and "Cancel" buttons for user interaction.
- Responsive and easy-to-use design.

## Technologies Used
- Java AWT (Abstract Window Toolkit): Used for building the GUI components.
- Event Handling: Implemented to manage button clicks and window events.

## Components
1. TextFields: For inputting the first name, last name, and known languages.
2. Choices: Dropdown for selecting the date of birth (day, month, year), gender, and educational qualifications.
3. TextArea: For entering a brief introduction.
4. Buttons: "Submit" to process the form and "Cancel" to close the application.

## How It Works
1. Launch the application by running the `InteractiveForm1` class.
2. Fill in the form fields:
   - First Name
   - Last Name
   - Date of Birth (Day, Month, Year)
   - Gender (Male, Female, Others)
   - Educational Qualification (e.g., B.Tech, M.Tech, PhD)
   - Languages Known (Comma-separated values)
   - Brief Introduction
3. Click "Submit" to print the entered data to the console and close the application.
4. Alternatively, click "Cancel" to exit without submitting.

## How to Run
1. Ensure you have the Java Development Kit (JDK) installed on your system.
2. Copy the source code from the `InteractiveForm1.java` file.
3. Compile the code using the `javac` command:
   ```bash
   javac InteractiveForm1.java
   ```
4. Run the compiled class using the `java` command:
   ```bash
   java InteractiveForm1
   ```

## Example Output
When the form is submitted, the following information is printed to the console:

```
First Name: Lata
Last Name: Pattanayak
DOB: 28/08/2004
Gender: Female
Educational Qualification: B.Tech
Languages Known: English, Bengali
Brief Intro About Yourself: I am 3rd year undergraduate student pursuing computer science engineering from XYZ COLLEGE. 
```

## Screenshots
![Screenshot 2025-01-13 133330](https://github.com/user-attachments/assets/bbd2c9e5-4736-48f5-aa9a-8fdf4662a2e6)
![Screenshot 2025-01-13 133307](https://github.com/user-attachments/assets/649141fa-518b-47ba-a15f-431bffc16b11)



## License

This project is licensed under the MIT License. Feel free to use, modify, and distribute this code as per the license terms
