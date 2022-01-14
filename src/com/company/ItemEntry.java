package com.company;

import javax.swing.*;

public class ItemEntry {

    public String ID;
    public String FName;
    public String LName;

    public String DateDay;
    public String DateMonth;
    public String DateYear;

    public String AddressNumber;
    public String AddressPostCode;
    public String AddressLine1;
    public String AddressLine2;
    public String AddressLine3;

    public String Decimal ;
    public String Character;
    public String Bool;

    public ItemEntry(String id, String fName, String lName, String dateDay, String dateMonth, String dateYear,
                     String addressNumber, String addressPostCode, String addressLine1, String addressLine2, String addressLine3
                        , String decimal, String character, String bool)
    {
        this.ID = id;
        this.FName = fName;
        this.LName = lName;
        this.DateDay = dateDay;
        this.DateMonth = dateMonth;
        this.DateYear = dateYear;
        this.AddressNumber = addressNumber;
        this.AddressPostCode = addressPostCode;
        this.AddressLine1 = addressLine1;
        this.AddressLine2 = addressLine2;
        this.AddressLine3 = addressLine3;
        this.Decimal = decimal;
        this.Character = character;
        this.Bool = bool;
    }

    public void setID(String id)
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
    public void setDateDay(String dateDay)
    {
        this.DateDay = dateDay;
    }

    public void setDateMonth(String dateMonth)
    {
        this.DateDay = dateMonth;
    }
    public void setDateYear(String dateYear)
    {
        this.DateDay = dateYear;
    }

    public void setAddressNumber(String addressNumber)
    {
        this.AddressNumber = addressNumber;
    }
    public void setAddressPostCode(String addressPostCode)
    {
        this.AddressPostCode = addressPostCode;
    }
    public void setAddressLine1(String addressLine1)
    {
        this.AddressLine1 = addressLine1;
    }
    public void setAddressLine2(String addressLine2)
    {
        this.AddressLine2 = addressLine2;
    }
    public void setAddressLine3(String addressLine3)
    {
        this.AddressLine3 = addressLine3;
    }

    public void setDecimal(String decimal)
    {
        this.Decimal = decimal;
    }
    public void setCharacter(String character) { this.Character = character; }
    public void setBool(String bool) { this.Bool = bool; }

    public String getID()
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

    public String getDateDay()
    {
        return this.DateDay;
    }
    public String getDateMonth()
    {
        return this.DateMonth;
    }
    public String getDateYear()
    {
        return this.DateYear;
    }

    public String getAddressNumber()
    {
        return this.AddressNumber;
    }
    public String getAddressPostcode()
    {
        return this.AddressPostCode;
    }
    public String getAddressLine1()
    {
        return this.AddressLine1;
    }
    public String getAddressLine2()
    {
        return this.AddressLine2;
    }
    public String getAddressLine3()
    {
        return this.AddressLine3;
    }

    public String getDecimal()
    {
        return this.Decimal;
    }
    public String getCharacter()
    {
        return this.Character;
    }
    public String getBool() { return this.Bool; }

}
