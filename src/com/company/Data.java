package com.company;


import java.util.ArrayList;
import java.util.List;

public class Data {

    // Singleton
    private static Data instance = null;

    public static Data getInstance() {

        if (instance == null){
            instance = new Data();
        }
        return instance;

    }

    private ArrayList<Client> clients = new ArrayList<>();

    public Data() {
        clients.add(new Client("Dustin Roads", "22 Bobble Street, Bobbleton, BB0 5TT", 22));
        clients.add(new Client("Roderick Piper", "37 Loop Street, Loopton, LP7 4PT",33));
        clients.add(new Client("Randall Savage", "29 Elizabeth Street, Elizabethtown, EL3 8ZZ", 50));
        clients.add(new Client("Jacob Roberts", "11 Cobra Road, Finsberg, FN4, 4FN",11));
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addClient(Client client){
        clients.add(client);

        for (Client clients : Data.getInstance().getClients())
              {
                  System.out.println(clients.toString());
        }


    }

}

