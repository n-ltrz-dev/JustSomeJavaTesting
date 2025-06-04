package org.example.invoices;

public class Invoice {

    public int id;
    public String type;
    public String userInput;

    public Invoice(int id, String type, String userInput) {
        this.id = id;
        this.type = type;
        this.userInput = userInput;

    }
}
