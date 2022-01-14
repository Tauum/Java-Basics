package com.company;

public class ItemEntry2 {

    public int ID;
    public String FName;
    public String LName;

    public int DateDay;
    public int DateMonth;
    public int DateYear;

    public int AddressNumber;
    public String AddressPostCode;
    public String AddressLine1;
    public String AddressLine2;
    public String AddressLine3;

    public Double Decimal ;
    public char Character;
    public Boolean Bool;

    public ItemEntry2(int id, String fName, String lName,
                     int dateDay, int dateMonth, int dateYear,
                     int addressNumber, String addressPostCode,
                     String addressLine1, String addressLine2, String addressLine3
            , Double decimal, char character, Boolean bool)
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

    public void setDateDay(int dateDay)
    {
        this.DateDay = dateDay;
    }
    public void setDateMonth(int dateMonth)
    {
        this.DateDay = dateMonth;
    }
    public void setDateYear(int dateYear)
    {
        this.DateDay = dateYear;
    }

    public void setAddressNumber(int addressNumber)
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

    public void setDecimal(Double decimal)
    {
        this.Decimal = decimal;
    }
    public void setCharacter(char character) { this.Character = character; }
    public void setBool(Boolean bool) { this.Bool = bool; }

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

    public int getDateDay()
    {
        return this.DateDay;
    }
    public int getDateMonth()
    {
        return this.DateMonth;
    }
    public int getDateYear()
    {
        return this.DateYear;
    }

    public int getAddressNumber()
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

    public Double getDecimal()
    {
        return this.Decimal;
    }
    public char getCharacter()
    {
        return this.Character;
    }
    public Boolean getBool() { return this.Bool; }

}


