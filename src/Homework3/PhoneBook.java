package Homework3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<String,String> phonebook;

    public PhoneBook(){
        phonebook = new HashMap<>();
    }

    public void add(String surname, String number){
        phonebook.put(number,surname);
    }

    public void get(String surname) {

        if (phonebook.containsValue(surname)) {
            Set<Map.Entry<String, String>> set = phonebook.entrySet();
            for (Map.Entry<String, String> personSurname : set) {
                if (personSurname.getValue().equals(surname)) {
                    System.out.println(personSurname.getValue() + "'s phone number is: " + personSurname.getKey());
                }
            }
        } else {
            System.out.println("There is no person with this surname");
        }
    }
}

