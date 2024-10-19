package com.example.hubspot.model;
import java.util.List;

public class Contact
{
    private List<ContactProperty> properties;
    public List<ContactProperty> getProperties()
    {
        return properties;
    }
    public void setProperties(List<ContactProperty> properties)
    {
        this.properties = properties;
    }
}
