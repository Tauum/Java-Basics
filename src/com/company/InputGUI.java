package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InputGUI implements ActionListener {

    //field decleration

    public JLabel Label;
    public JLabel Label1;
    public JLabel Label2;
    public JLabel Label3;
    public JLabel Label4;
    public JLabel Label5;
    public JLabel Label6;
    public JLabel Label7;
    public JLabel Label8;

    public JFrame Frame;
    public JPanel Panel;

    public JButton Button1;
    public JButton Button2;
    public JButton Button3;

    public JTextField TInput1;
    public JTextField TInput2;
    public JTextField TInput3;

    public JTextField TInput4D;
    public JTextField TInput4M;
    public JTextField TInput4Y;

    public JTextField TInput5N;
    public JTextField TInput5P;
    public JTextField TInput5L1;
    public JTextField TInput5L2;
    public JTextField TInput5L3;

    public JTextField TInput6;
    public JTextField TInput7;

    public JCheckBox BoolInput;

    public ImageIcon Image;

    public JComboBox DropDownSelecter;

    public ArrayList<Person> PersonList;
    public Integer[] DropDownItemIDString;
//

    public static void main(String args[]) {
        new InputGUI();
    }

    public InputGUI() {
        DataGeneration();
        Frame = new JFrame("Test Title");
        Panel = new JPanel();
        Image = new ImageIcon("download.png");
        Frame.setIconImage(Image.getImage()); //sets frame icon to image
        Panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));

        Frame.add(Panel, BorderLayout.CENTER);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(700, 700);
        Frame.getContentPane().setBackground(Color.gray); //this can be rgb or hex value for custom colours

//element generation
        DropDownSelecter = new JComboBox(DropDownItemIDString);

        DropDownSelecter.addActionListener(this);
        DropDownSelecter.setEditable(true);
        Button3 = new JButton("Edit");
        Button3.addActionListener(this);

        Button1 = new JButton("Submit"); //this can be added to frame or panel
        Button1.addActionListener(this); // this points to the parent class and uses action listener method
        Button2 = new JButton("Delete");
        Button2.addActionListener(this);

        Label = new JLabel("Element List");
        Label1 = new JLabel("ID");
        Label2 = new JLabel("First Name");
        Label3 = new JLabel("Last Name");
        Label4 = new JLabel("Date (D/M/Y)");
        Label5 = new JLabel("Address");
        Label6 = new JLabel("Decimal");
        Label7 = new JLabel("Character");
        Label8 = new JLabel("Boolean");

        TInput1 = new JTextField();
        TInput2 = new JTextField();
        TInput3 = new JTextField();

        TInput4D = new JTextField();
        TInput4M = new JTextField();
        TInput4Y = new JTextField();

        TInput5N = new JTextField();
        TInput5P = new JTextField();
        TInput5L1 = new JTextField();
        TInput5L2 = new JTextField();
        TInput5L3 = new JTextField();

        TInput6 = new JTextField();
        TInput7 = new JTextField();

        BoolInput = new JCheckBox();
        BoolInput.setText("True/False");

//panel adding
        Panel.add(DropDownSelecter);

        Panel.add(Button1);
        Panel.add(Button2);
        Panel.add(Button3);
        Panel.add(Label);

        Panel.add(Label1);
        Panel.add(Label2);
        Panel.add(Label3);
        Panel.add(Label4);
        Panel.add(Label5);
        Panel.add(Label6);
        Panel.add(Label7);
        Panel.add(Label8);

        Panel.add(TInput1);
        Panel.add(TInput2);
        Panel.add(TInput3);

        Panel.add(TInput4D);
        Panel.add(TInput4M);
        Panel.add(TInput4Y);

        Panel.add(TInput5N);
        Panel.add(TInput5P);
        Panel.add(TInput5L1);
        Panel.add(TInput5L2);
        Panel.add(TInput5L3);

        Panel.add(TInput6);
        Panel.add(TInput7);

        Panel.add(BoolInput);

        Frame.setVisible(true);
        Panel.setLayout(null);

//bounds
        DropDownSelecter.setBounds(350, 20, 150, 30);
        Label.setBounds(250, -15, 100, 100);

        Label1.setBounds(10, -15, 100, 100);
        TInput1.setBounds(100, 20, 100, 30);

        Label2.setBounds(10, 25, 100, 100);
        TInput2.setBounds(100, 60, 100, 30);

        Label3.setBounds(10, 65, 100, 100);
        TInput3.setBounds(100, 100, 100, 30);

        Label4.setBounds(10, 105, 100, 100);
        TInput4D.setBounds(100, 140, 25, 30);
        TInput4M.setBounds(133, 140, 25, 30);
        TInput4Y.setBounds(166, 140, 35, 30);

        Label5.setBounds(10, 145, 100, 100);
        TInput5N.setBounds(100, 180, 35, 30);
        TInput5P.setBounds(155, 180, 45, 30);

        TInput5L1.setBounds(100, 220, 100, 30);
        TInput5L2.setBounds(100, 260, 100, 30);
        TInput5L3.setBounds(100, 300, 100, 30);

        Label6.setBounds(10, 300, 100, 100);
        TInput6.setBounds(100, 340, 100, 30);

        Label7.setBounds(10, 340, 100, 100);
        TInput7.setBounds(100, 380, 100, 30);

        Label8.setBounds(10, 380, 100, 100);
        BoolInput.setBounds(100, 410, 100, 40);

        Button1.setBounds(20, 490, 100, 30);
        Button2.setBounds(160, 490, 100, 30);
        Button3.setBounds(350, 60, 130, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Button1) {
            InsertItem();
        } else if (e.getSource() == Button2) {
            DeleteItem();
        } else if (e.getSource() == Button3) {
            EditItem();
        }

        //Label.setText("Clicks > " );

        //String input1 = JOptionPane.showInputDialog("somekindofinput");
        //System.out.println(input1);

        //standard optionpane stuff     //options given                 //change image icon
        //JOptionPane.ShowOptionDialog(null, "message", "title", JOptionPane.Yes_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null, null, 0);

        //string[] responses= {"no", "yes", "maybe", "sometimes"}                                                                        //VVV uses response array
        //JOptionPane.ShowOptionDialog(null, "message", "title", JOptionPane.Yes_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null, responses, 0);

        //button.setEnabled(false);
        //textfield.stEditable(false); //disables allowing to edit text input fields
    }


    public void DataGeneration() {
        PersonList = ExampleData.Generate();
        DropDownItemIDString = new Integer[PersonList.size()];

        int inc = 1;
        for (int i = 0; i < PersonList.size(); i++) {
            DropDownItemIDString[i] = inc;
            inc++;
        }
    }

    public void EditItem() {
        var q = DropDownSelecter.getSelectedIndex(); //was -1 no matter what was selected but not anymore???
        var w = DropDownSelecter.getSelectedItem();
        var person = PersonList.get(q);

        var currentEditing = new ItemEntry2(person.ID, person.FName, person.LName,
                person.Date.Day, person.Date.Month, person.Date.Year,
                person.Address.Number, person.Address.PostCode, person.Address.Ln1,
                person.Address.Ln2, person.Address.Ln3,
                person.Decimal, person.Character, person.Bool);

        TInput1.setText(String.valueOf(currentEditing.ID));

        //TInput1.setText(currentEditing.ID.toString());
        TInput2.setText(currentEditing.FName);
        TInput3.setText(currentEditing.LName);
        TInput4D.setText(String.valueOf(currentEditing.DateDay));
        TInput4M.setText(String.valueOf(currentEditing.DateMonth));
        TInput4Y.setText(String.valueOf(currentEditing.DateYear));
        TInput5N.setText(String.valueOf(currentEditing.AddressNumber));
        TInput5P.setText(currentEditing.AddressPostCode);
        TInput5L1.setText(currentEditing.AddressLine1);
        TInput5L2.setText(currentEditing.AddressLine2);
        TInput5L3.setText(currentEditing.AddressLine3);

        TInput6.setText(String.valueOf(currentEditing.Decimal));
        TInput7.setText(String.valueOf(currentEditing.Character));
        BoolInput.setText(String.valueOf(currentEditing.Bool));
    }

    public void InsertItem() {
        //    if (InputVerifier.CheckString(TInput2.getText()) == false || InputVerifier.CheckString(TInput3.getText()) == false ||
//                InputVerifier.CheckString(TInput4D.getText()) == false || InputVerifier.CheckString(TInput4M.getText()) == false ||
//                InputVerifier.CheckString(TInput4Y.getText()) == false || InputVerifier.CheckString(TInput5P.getText()) == false ||
//                InputVerifier.CheckString(TInput5L1.getText()) == false || InputVerifier.CheckString(TInput5L2.getText()) == false)
//            {
//                JOptionPane.showMessageDialog(null, "Missing essential fields","Error" ,JOptionPane.ERROR_MESSAGE );
//            }
        ArrayList<String> InputList = new ArrayList<String>();

        InputList.add(TInput1.getText());//string
        InputList.add(TInput2.getText());//string
        InputList.add(TInput3.getText());//string
        InputList.add(TInput4D.getText());//int
        InputList.add(TInput4M.getText());//int
        InputList.add(TInput4Y.getText());//int
        InputList.add(TInput5N.getText());//int
        InputList.add(TInput5P.getText());//string
        InputList.add(TInput5L1.getText());//string
        InputList.add(TInput5L2.getText());//string
        InputList.add(TInput5L3.getText());//string
        InputList.add(TInput6.getText()); //decimal
        InputList.add(TInput7.getText()); //char
        InputList.add(BoolInput.getText()); //bool


        System.out.println(InputList.size());

        for (String x : InputList) {
            if (InputVerifier.CheckString(x) != true) {
                JOptionPane.showMessageDialog(null, "Missing fields", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }

        try {
//                int id = Integer.parseInt(TInput1.getText());
//                String fname = TInput2.getText();
//                String lname = TInput3.getText();
//                int day = Integer.parseInt(TInput4D.getText());
//                int month = Integer.parseInt(TInput4M.getText());
//                int year = Integer.parseInt(TInput4Y.getText());
//                int addressNumber = Integer.parseInt(TInput5N.getText());
//                double decimal = Double.parseDouble(TInput6.getText());
//                char character = TInput7.getText().charAt(0);
//                boolean bool = BoolInput.isSelected();

            int id = Integer.parseInt(InputList.get(0));
            String fname = InputList.get(1);
            String lname = InputList.get(2);
            int day = Integer.parseInt(InputList.get(3)); //maybe failed here?
            int month = Integer.parseInt(InputList.get(4));
            int year = Integer.parseInt(InputList.get(5));
            int addressNumber = Integer.parseInt(InputList.get(6));
            double decimal = Double.parseDouble(InputList.get(11));
            char character = InputList.get(12).charAt(0);
            boolean bool = BoolInput.isSelected();

            //Date newDate = new Date(Integer.ParseInt(TInput4D.getText()),Integer.ParseInt(TInput4M.getText()),Integer.ParseInt(TInput4Y.getText())); // this would be cool

            Date newDate = new Date(day, month, year);
            Address newAddress = new Address(addressNumber, TInput5L1.getText(), TInput5L2.getText(), TInput5L3.getText(), TInput5P.getText());
            Person newPerson = new Person(id, fname, lname, newDate, newAddress, decimal, character, bool);
            PersonList.add(newPerson);
            JOptionPane.showMessageDialog(null, "Entry: " + TInput1.getText() + " Added","Success" ,JOptionPane.INFORMATION_MESSAGE );
        }
        catch (Exception x) { System.out.println(x); }
    }

    public void DeleteItem()
    {
        System.out.println(PersonList.size());
        int z = 0;
        for (Person person : PersonList)
        {
            if (person.ID == Integer.parseInt(TInput1.getText()) && z != -1)
            {
                PersonList.remove(person);
                z=-1;
            }
            else if (person.ID != Integer.parseInt(TInput1.getText()) && z != -1) { z++; }
        }
        //this doesnt run for some reason? VVVVVVVV
        if (z == -1){ JOptionPane.showMessageDialog(null, "Entry ID: " + TInput1.getText() + " Deleted","Success" ,JOptionPane.INFORMATION_MESSAGE ); }
        else if(z != -1) { JOptionPane.showMessageDialog(null, "Entry ID: " + TInput1.getText() + " Doesnt exist","Error" ,JOptionPane.ERROR_MESSAGE ); }
    }

}


