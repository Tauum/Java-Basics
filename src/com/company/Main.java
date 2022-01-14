package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class Main {

    public ArrayList<Person> DecimalList;

    public static void main(String[] args) {

        System.out.print("aaaaaaaaaaaaaa\n");

        Address Address1 = new Address(1,"a","b","c","def");
        Address Address2 = new Address(2,"d","e","f","hij");
        Address Address3 = new Address(3,"h","i","j","klm");
        Address Address4 = new Address(4,"k","l","m","nop");
        Date Date1 = new Date(1,1,2011);
        Date Date2 = new Date(2,2,2012);
        Date Date3 = new Date(3,3,2013);
        Date Date4 = new Date(4,4,2014);

        Person Person1 = new Person(1, "aaa", "bbb", Date1, Address1, 0.1, 'A', true);
        Person Person2 = new Person(2, "ccc", "ddd", Date2, Address2, 0.25, 'B', false);
        Person Person3 = new Person(3, "eee", "ddd", Date3, Address3, 0.5, 'C', true);
        Person Person4 = new Person(4, "ggg", "hhh", Date4, Address4, 0.75, 'D', false);

        System.out.println(Person1.ID);

        Person[] PersonArray = {null};
        System.out.println(PersonArray.length);

        ArrayList<Person> list = new ArrayList<Person>();
        System.out.println(list.size());
        list.add(Person1);
        list.add(Person2);
        list.add(Person3);
        list.add(Person4);
        System.out.println(list.size());

        System.out.println(Person1.Address.toString());
        System.out.println(Person1.getAddressToString());
        System.out.println(Person1.getDateToString());

        for( Person Person : list)
        {
            System.out.println(" ID: " + Person.ID + " FName: " + Person.FName + " LName " + Person.LName + " Date: " + Person.getDateToString() + " Address: " + Person.getAddressToString() + " Decimal: " + Person.Decimal + " Char: " + Person.Character + " Bool: " + Person.Bool );
        }

        List<Person> TrueBoolPersonList = new ArrayList<Person>();

        for(Person Person : list)
        {
            if (Person.Bool == true)
            {
                TrueBoolPersonList.add(Person);
            }
        }
        System.out.println(TrueBoolPersonList.size());

        //System.out.println(ReturnListDecimal(list));

    }

/*    public static ArrayList<Person> ReturnListDecimal(ArrayList<Person> list)
    {
        for (Person Person : list)
        {
            if (Person.Decimal >= 0.1 && Person.Decimal <= 0.5)
            {
                DecimalList.add(Person);
            }
        }
        return DecimalList;
    }*/


}
