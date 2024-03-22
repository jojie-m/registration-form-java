import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        // Create a window
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Set window size

        // Create form components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel mobileLabel = new JLabel("mobile number:");
        JTextField mobileField = new JTextField(20);

        // Create radio buttons for gender
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");

        // Group the radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset"); // New Reset button

        // Create layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2)); // 5 rows, 2 columns
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(mobileLabel);
        panel.add(mobileField);
        panel.add(new JLabel("Gender:"));
        panel.add(maleRadioButton);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(femaleRadioButton);
        panel.add(submitButton);
        panel.add(resetButton); // Add Reset button

        // Add panel to the frame
        frame.add(panel);

        // Display the window
        frame.setVisible(true);
    }
}
