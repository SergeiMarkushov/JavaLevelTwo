package Homework3;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Petrov", "89771234567");
        phoneBook.add("Fedorov", "89037774567");
        phoneBook.add("Ivashkin", "89146663355");
        phoneBook.add("Ivanova", "89335678475");
        phoneBook.add("Petrov", "89565534324");

        Set<String> surnames = phoneBook.allSurnames();
        for (String surname : surnames) {
            System.out.printf("%s got number %s %n", surname, phoneBook.get(surname));
        }
    }
}
