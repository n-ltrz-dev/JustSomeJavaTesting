package org.example;

import org.example.invoices.CarInvoice;
import org.example.invoices.Invoice;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Customer sergej = new Customer("Sergej", 20, "Sergej@ILoveKufer.kufer");

                System.out.println(sergej.getName());
                sergej.setName("Tobias");
                System.out.println(sergej.getName());

                sergej.drinking();

                String input = scanner.nextLine();
                var invoice = new Invoice(1, "Test", input);
                var carinvoice = new CarInvoice(2, input);

                System.out.println(carinvoice.type);


                System.out.println("Your Invoice is of type: " + carinvoice.type + " and has the ID of " + carinvoice.id + " and this is your random text is: " + carinvoice.userInput);

                scanner.close();



            }
        }
