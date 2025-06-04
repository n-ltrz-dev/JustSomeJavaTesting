package org.example.invoices;

public class DeliveryInvoice extends Invoice {
    public DeliveryInvoice(int id, String userInput) {
        super(id, "Delivery", userInput);
    }
}
