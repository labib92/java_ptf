package ru.stqa.ptf.addressbooktwo.GUI;

import org.testng.annotations.Test;
import ru.stqa.ptf.addressbooktwo.tests.TestGUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GroupAddContactGUI extends JFrame {
    JPanel namePanel = new JPanel();
    JPanel addressPanel = new JPanel();
    JPanel birthdayPanel = new JPanel();
    JLabel firstNameLabel = new JLabel("Firstname:");
    JLabel middleNameLabel = new JLabel("Middlename:");
    JLabel lastNameLabel = new JLabel("Lastname:");
    JLabel nicknameLabel = new JLabel("Nickname:");
    JLabel tittleLabel = new JLabel("Tittle:");
    JLabel companyLabel = new JLabel("Company:");
    JLabel addressLabel = new JLabel("Address:");
    JLabel mobileLabel = new JLabel("mobile number:");
    JLabel emailLabel = new JLabel("email:");
    JLabel dayLabel = new JLabel("Day:");
    JLabel monthLabel = new JLabel("Month:");
    JLabel yearLabel = new JLabel("Year:");
    JTextField firstNameTextField = new JTextField(10);
    JTextField middleNameTextField = new JTextField(10);
    JTextField lastNameTextField = new JTextField(10);
    JTextField nicknameTextField = new JTextField(10);
    JTextField tittleTextField = new JTextField(10);
    JTextField companyTextField = new JTextField(10);
    JTextField addressTextField = new JTextField(10);
    JTextField mobileTextField = new JTextField(10);
    JTextField emailTextField = new JTextField(26);
    JTextField dayTextField = new JTextField(10);
    JTextField monthTextField = new JTextField(10);
    JTextField yearTextField = new JTextField(10);

    JButton button = new JButton("Run Test");



    public GroupAddContactGUI(){
        setTitle("Add Contact Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout());
        //setResizable(false);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        namePanel.add(firstNameLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        namePanel.add(firstNameTextField , gridBagConstraints);
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        namePanel.add(middleNameLabel, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        namePanel.add(middleNameTextField, gridBagConstraints);
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        namePanel.add(lastNameLabel, gridBagConstraints);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        namePanel.add(lastNameTextField, gridBagConstraints);
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        namePanel.add(nicknameLabel, gridBagConstraints);
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        namePanel.add(nicknameTextField, gridBagConstraints);
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        namePanel.add(tittleLabel, gridBagConstraints);
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        namePanel.add(tittleTextField, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        namePanel.setBackground(new Color(255,255,0));
        Border border = BorderFactory.createTitledBorder("Full Name");
        namePanel.setBorder(border);
        add(namePanel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        addressPanel.add(companyLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        addressPanel.add(companyTextField, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        addressPanel.add(addressLabel, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        addressPanel.add(addressTextField, gridBagConstraints);
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        addressPanel.add(mobileLabel, gridBagConstraints);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        addressPanel.add(mobileTextField, gridBagConstraints);
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        addressPanel.add(emailLabel, gridBagConstraints);
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        addressPanel.add(emailTextField, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        addressPanel.setBackground(new Color(0,255,255));
        Border border2 = BorderFactory.createTitledBorder("Full Address");
        addressPanel.setBorder(border2);
        add(addressPanel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        birthdayPanel.add(dayLabel, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        birthdayPanel.add(dayTextField, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        birthdayPanel.add(monthLabel, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        birthdayPanel.add(monthTextField, gridBagConstraints);
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        birthdayPanel.add(yearLabel, gridBagConstraints);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        birthdayPanel.add(yearTextField, gridBagConstraints);
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        button.addActionListener(e -> {
            TestGUI testGUI = new TestGUI();
            testGUI.initialize();
            test1();
            testGUI.stop();
        });
        birthdayPanel.add(button, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        birthdayPanel.setBackground(new Color(255,150,255));
        Border border3 = BorderFactory.createTitledBorder("Full Birthday");
        birthdayPanel.setBorder(border3);
        add(birthdayPanel, gridBagConstraints);

        pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (0.5 * (dimension.width - getWidth())), (int) (0.5 * (dimension.height - getHeight())), getWidth(), getHeight());
    }

    @Test
    public void test1(){
        TestGUI testGUI = new TestGUI();
        testGUI.addNewPersonTest(firstNameTextField.getName(), middleNameTextField.getName(), lastNameTextField.getName(),
                nicknameTextField.getName(), tittleTextField.getName(),
                companyTextField.getName(), addressTextField.getName(), mobileTextField.getName(), emailTextField.getName(),
                dayTextField.getName(), monthTextField.getName(), yearTextField.getName());
    }

    public static void main(String[] args) {
        new GroupAddContactGUI().setVisible(true);
    }
}
