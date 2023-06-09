import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textField extends JFrame {
    private JTextField firstNameField;
    private JTextField surnameField;
    private JTextField lastNameField;

    public textField() {
        setTitle("Name Form");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField(15);
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(firstNameLabel, constraints);
        constraints.gridx = 1;
        add(firstNameField, constraints);

        JLabel surnameLabel = new JLabel("Surname:");
        surnameField = new JTextField(15);
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(surnameLabel, constraints);
        constraints.gridx = 1;
        add(surnameField, constraints);


        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField(15);
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(lastNameLabel, constraints);
        constraints.gridx = 1;
        add(lastNameField, constraints);


        JButton submitButton = new JButton("Submit");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        add(submitButton, constraints);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText().trim();
                String surname = surnameField.getText().trim();
                String lastName = lastNameField.getText().trim();

                if (firstName.isEmpty() || surname.isEmpty() || lastName.isEmpty()) {
                    JOptionPane.showMessageDialog(textField.this,
                            "Please fill in all the fields",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(textField.this,
                            "First Name: " + firstName + "\n" +
                                    "Surname: " + surname + "\n" +
                                    "Last Name: " + lastName,
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Center the JFrame on the monitor screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new textField().setVisible(true);
            }
        });
    }


    }

