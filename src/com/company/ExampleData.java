package com.company;

import java.util.ArrayList;

public class ExampleData {

    private static ArrayList<Person> PersonList;

    public static ArrayList<Person> Generate()
    {
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

        PersonList = new ArrayList<Person>();
        PersonList.add(Person1);
        PersonList.add(Person2);
        PersonList.add(Person3);
        PersonList.add(Person4);
        return PersonList;
    }

}
