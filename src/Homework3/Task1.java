package Homework3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        List<String> word = Arrays.asList(

                    "World", "Peace", "Java", "Exception", "Code",
                    "Table", "Map", "Room", "Door", "Core",
                    "World", "Java", "Room", "File", "Home"
        );

        Set<String> unique = new HashSet<>(word);

        System.out.println("First we have: " + word);
        System.out.println("Unique words: " + unique);
        System.out.println("How many times repeats each word");
        for (String s : unique) {
            System.out.println(s + ": " + Collections.frequency(word, s));
        }
    }
    /*ВЫВОД ПРОГРАММЫ:
    * First we have: [World, Peace, Java, Exception, Code, Table, Map, Room, Door, Core, World, Java, Room, File, Home]
      Unique words: [Java, Table, World, Code, Exception, Door, Peace, Map, Room, File, Home, Core]
      How many times repeats each word
        Java: 2
        Table: 1
        World: 2
        Code: 1
        Exception: 1
        Door: 1
        Peace: 1
        Map: 1
        Room: 2
        File: 1
        Home: 1
        Core: 1*/
}


