package Homework3;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Petrov", "89771234567");
        phoneBook.add("Fedorov", "89037774567");
        phoneBook.add("Ivashkin", "89146663355");
        phoneBook.add("Ivanova", "89335678475");
        phoneBook.add("Petrov", "89565534324");

        phoneBook.get("Fedorov");
        System.out.println();
        phoneBook.get("Petrov");
    }
}
