package com.example.hubspot.model;
public class ContactProperty
{
    private String property;
    private String value;
    public ContactProperty(String property, String value)
    {
        this.property = property;
        this.value = value;
    }
    public String getProperty()
    {
        return property;
    }
    public void setProperty(String property)
    {
        this.property = property;
    }
    public String getValue()
    {
        return value;
    }
    public void setValue(String value)
    {
        this.value = value;
    }
}
