package com.company;

public class Content {
    public int ID;
    public String FileName;
    public String Content;

    public Content(int id, String fileName, String content)
    {
        this.ID = id;
        this.FileName = fileName;
        this.Content = content;
    }

    public void setID(int id) { ID = id; }
    public void setFileName(String fileName) { FileName = fileName; }
    public void setContent(String content) { Content = content; }

    public int getID(){return this.ID;}
    public String getFileName(){return this.FileName;}
    public String getContent(){return this.Content;}
}
