package Homework3;

import java.util.*;

public class PhoneBook {
    Map<String, Set<String>> phonebook = new TreeMap<>();

    public void add(String surname, String phone){
        Set<String> phones = phonebook.getOrDefault(surname, new HashSet<>());
        phones.add(phone);
        phonebook.put(surname, phones);
    }

    public Set<String> get(String surname){
        return phonebook.get(surname);
    }

    public Set<String> allSurnames(){
        return phonebook.keySet();
    }
}

