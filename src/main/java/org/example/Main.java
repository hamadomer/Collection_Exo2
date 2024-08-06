package org.example;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Login> list = new ArrayList<Login>();
        Client client1 = new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12));
        Client client2 = new Client("Dupont", "Benoit", LocalDate.of(2001, 8, 31));
        Login log1 = new Login(client1, LocalDate.of(20204, 6, 4));
        Login log2 = new Login(client1, LocalDate.of(20204, 7, 4));
        Login log3 = new Login(client1, LocalDate.of(20204, 7, 20));
        Login log4 = new Login(client1, LocalDate.of(20204, 8, 1));
        Login log5 = new Login(client1, LocalDate.of(20204, 8, 2));
        Login log6 = new Login(client2, LocalDate.of(20204, 8, 1));

        list.add(log1);
        list.add(log2);
        list.add(log3);
        list.add(log4);
        list.add(log5);
        list.add(log6);

        Map<Client, Integer> map = new HashMap<Client, Integer>();

       for(Login login : list) {
           if(!map.containsKey(login.getClient())) {
               map.put(login.getClient(), 1);
           } else {
               map.put(login.getClient(), map.get(login.getClient()) + 1);
           }
       }

       for(Map.Entry<Client, Integer> entry : map.entrySet()) {
           System.out.println(entry.getKey().getLastName() + " - " + map.get(entry.getKey()));
       }
    }
}