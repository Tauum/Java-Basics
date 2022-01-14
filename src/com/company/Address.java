package com.company;

public class Address {
    public int Number;
    public String Ln1;
    public String Ln2;
    public String Ln3;
    public String PostCode;

    public Address(int number, String ln1, String ln2, String ln3, String postCode)
    {
     this.Number = number;
     this.Ln1 = ln1;
     this.Ln2 = ln2;
     this.Ln3 = ln3;
     this.PostCode = postCode;
    }

    public void setNumber(int number)
    {
        this.Number = number;
    }
    public void setLn1(String ln1)
    {
        this.Ln1 = ln1;
    }
    public void setLn2(String ln2)
    {
        this.Ln2 = ln2;
    }
    public void setLn3(String ln3)
    {
        this.Ln3 = ln3;
    }
    public void setPostCode(String postCode)
    {
        this.PostCode = postCode;
    }

    public int getNumber()
    {
        return this.Number;
    }
    public String getLn1()
    {
        return this.Ln1;
    }
    public String getLn2()
    {
        return this.Ln2;
    }
    public String getLn3()
    {
        return this.Ln3;
    }
    public String getPostCode()
    {
        return this.PostCode;
    }
}
