package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class FileEditDisplayGUI implements ActionListener {
    //field decleration
    public JLabel Label;
    public JLabel Label1;
    public JLabel Label2;
    public JLabel Label3;

    public JFrame Frame;
    public JPanel Panel;

    public JButton Button1;
    public JButton Button2;
    public JButton Button3;

    public JTextField TInput1;
    public JTextField TInput2;
    public JTextPane CInput1;

    public JComboBox DropDownSelecter;
    public ArrayList<Content> ContentList;
    public Integer[] DropDownItemIDString;


    public static void main(String args[]) {
        new com.company.FileEditDisplayGUI();
    }

    public FileEditDisplayGUI() {
        DataGeneration();
        Frame = new JFrame("Test Title");
        Panel = new JPanel();
        Panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));

        Frame.add(Panel, BorderLayout.CENTER);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(560, 580);
        Frame.getContentPane().setBackground(Color.gray); //this can be rgb or hex value for custom colours

    //element generation
        DropDownSelecter = new JComboBox(DropDownItemIDString);

        DropDownSelecter.addActionListener(this);
        DropDownSelecter.setEditable(true);

        Button1 = new JButton("Save"); //this can be added to frame or panel
        Button1.addActionListener(this); // this points to the parent class and uses action listener method
        Button2 = new JButton("Delete");
        Button2.addActionListener(this);
        Button3 = new JButton("Select");
        Button3.addActionListener(this);

        Label = new JLabel("Element List");
        Label1 = new JLabel("ID");
        Label2 = new JLabel("File Name");
        Label3 = new JLabel("File Content");

        TInput1 = new JTextField();
        TInput2 = new JTextField();

        CInput1 = new JTextPane();
        //

    //panel adding
        Panel.add(DropDownSelecter);

        Panel.add(Button1);
        Panel.add(Button2);
        Panel.add(Button3);
        Panel.add(Label);
        Panel.add(Label1);
        Panel.add(Label2);
        Panel.add(Label3);
        Panel.add(TInput1);
        Panel.add(TInput2);

        Panel.add(CInput1);

        Frame.setVisible(true);
        Panel.setLayout(null);
        //

    //bounds
        DropDownSelecter.setBounds(350, 20, 150, 30);
        Label.setBounds(250, -15, 100, 100);

        Label1.setBounds(10, -15, 100, 100);
        TInput1.setBounds(100, 20, 100, 30);

        Label2.setBounds(10, 25, 100, 100);
        TInput2.setBounds(100, 60, 100, 30);

        Label3.setBounds(10, 110, 100, 100);
        CInput1.setBounds(100, 150, 300, 320);

        Button1.setBounds(100, 490, 100, 30);
        Button2.setBounds(230, 490, 100, 30);

        Button3.setBounds(350, 55, 100, 30);
        //
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Button1) { InsertItem(); }
        else if (e.getSource() == Button2) { DeleteItem(); }
        else if (e.getSource() == Button3) { EditItem(); }

    }


    public void DataGeneration() {

        //Creating a File object for directory
        File directoryPath = new File("E:\\Java\\Java repo\\src\\com\\company\\Test");
        //List of all files and directories
        String contents[] = directoryPath.list();
        System.out.println("List of files and directories in the specified directory:");

        DropDownItemIDString = new Integer[directoryPath.list().length];
       // DropDownItemIDString = new Integer[contents.length()];
        //DropDownItemIDString = new Integer[contents.size];
        int inc = 1;

        for(int i=0; i<contents.length; i++)
        {
            System.out.println(contents[i]);
            DropDownItemIDString[i] = inc;
            inc++;
        }





     //   for (int i = 0; i < PersonList.size(); i++) {
     //       DropDownItemIDString[i] = inc;
      //      inc++;
     //   }
    }

    public void EditItem() {
        var q = DropDownSelecter.getSelectedIndex(); //was -1 no matter what was selected but not anymore???
        var w = DropDownSelecter.getSelectedItem();
        var selectedContent = ContentList.get(q);

        String content = ReadWriteOperations.Read(selectedContent.getFileName());
    //    var content = PersonList.get(q);


      //  Cinput1.setText(String.valueOf());

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

            //Date newDate = new Date(Integer.ParseInt(TInput4D.getText()),Integer.ParseInt(TInput4M.getText()),Integer.ParseInt(TInput4Y.getText())); // this would be cool

          //  Date newDate = new Date(day, month, year);
          //  Address newAddress = new Address(addressNumber, TInput5L1.getText(), TInput5L2.getText(), TInput5L3.getText(), TInput5P.getText());
          //  Person newPerson = new Person(id, fname, lname, newDate, newAddress, decimal, character, bool);
          //  PersonList.add(newPerson);
            JOptionPane.showMessageDialog(null, "Entry: " + TInput1.getText() + " Added","Success" ,JOptionPane.INFORMATION_MESSAGE );
        }
        catch (Exception x) { System.out.println(x); }
    }

    public void DeleteItem()
    {
//        System.out.println(PersonList.size());
//        int z = 0;
//        for (Person person : PersonList)
//        {
//            if (person.ID == Integer.parseInt(TInput1.getText()) && z != -1)
//            {
//                PersonList.remove(person);
//                z=-1;
//            }
//            else if (person.ID != Integer.parseInt(TInput1.getText()) && z != -1) { z++; }
//        }
//        //this doesnt run for some reason? VVVVVVVV
//        if (z == -1){ JOptionPane.showMessageDialog(null, "Entry ID: " + TInput1.getText() + " Deleted","Success" ,JOptionPane.INFORMATION_MESSAGE ); }
//        else if(z != -1) { JOptionPane.showMessageDialog(null, "Entry ID: " + TInput1.getText() + " Doesnt exist","Error" ,JOptionPane.ERROR_MESSAGE ); }
    }

}
