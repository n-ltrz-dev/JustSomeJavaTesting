package org.example;

import org.example.invoices.CarInvoice;
import org.example.invoices.Invoice;
import org.example.tier.*;

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

                Kolibri littleKolibri = new Kolibri("Sascha", 2);
                littleKolibri.eating();

                Tier koala = new Koala("Bimbo", 3);
                Tier kolibri = new Kolibri("Heinrich", 6);
                Tier clownfish = new Clownfish("Freddy", 2);

                System.out.println("Bitte gib ein Tier ein, von welchem du eine Information haben magst: (Koala, Kolibri, Clownfish)");
                String whichAnimal = scanner.nextLine();

                switch (whichAnimal) {
                    case "Koala":
                        koala.drinking();
                        koala.eating();
                        if (koala instanceof ISound) {
                            ((ISound) koala).makeSound();
                        }
                        break;
                    case "Clownfish":
                        clownfish.drinking();
                        clownfish.eating();
                        if (clownfish instanceof ISound) {
                            ((ISound) koala).makeSound();
                        }
                        break;
                    case "Kolibri":
                        kolibri.drinking();
                        kolibri.eating();
                        if (kolibri instanceof ISound) {
                            ((ISound) koala).makeSound();
                        }
                        break;
                    default:
                        System.out.println("Unbekanntes Tier");
                }

                scanner.close();




            }
        }
