package com.company;

public class Person {

    public int ID;
    public String FName;
    public String LName;
    public com.company.Date Date; //person.date.year
    public com.company.Address Address;
    public double Decimal;
    public char Character;
    public boolean Bool;

    public Person(int id, String fName, String lName, Date date, Address address, double decimal, char character, boolean bool)
    {
        this.ID = id;
        this.FName = fName;
        this.LName = lName;
        this.Date = date;
        this.Address = address;
        this.Decimal = decimal;
        this.Character = character;
        this.Bool = bool;
    }

    public void setID(int id)
    {
        this.ID = id;
    }
    public void setFName(String fName)
    {
        this.FName = fName;
    }
    public void setLName(String lName)
    {
     this.LName = lName;
    }
    public void setDate(Date date)
    {
        this.Date = date;
    }
    public void setAddress(Address address)
    {
        this.Address = address;
    }
    public void setDecimal(Double decimal)
    {
        this.Decimal = decimal;
    }
    public void setCharacter(char character)
    {
        this.Character = character;
    }
    public void setBool(boolean bool)
    {
        this.Bool = bool;
    }

    public int getID()
    {
        return this.ID;
    }
    public String getFName()
    {
        return this.FName;
    }
    public String getLName()
    {
        return this.LName;
    }
    public Date getDate()
    {
        return this.Date;
    }
    public Address getAddress()
    {
        return this.Address;
    }
    public Double getDecimal()
    {
        return this.Decimal;
    }
    public char getCharacter()
    {
        return this.Character;
    }
    public boolean getBool()
    {
        return this.Bool;
    }

    public String getAddressToString()
    {
        return Address.Ln1 +"/"+ Address.Ln2 +"/"+ Address.Ln3 +"/"+ Address.PostCode;
    }
    public String getDateToString()
    {
        return Date.Day +"/"+ Date.Month +"/"+ Date.Year;
    }
}
