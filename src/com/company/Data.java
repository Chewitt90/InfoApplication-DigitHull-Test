package com.company;


import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Client> Clients() {
        var l = new ArrayList<Client>();
        l.add(new Client("Dustin Roads", "22 Bobble Street, Bobbleton, BB0 5TT", 22));
        l.add(new Client("Roderick Piper", "37 Loop Street, Loopton, LP7 4PT",33));
        l.add(new Client("Randall Savage", "29 Elizabeth Street, Elizabethtown, EL3 8ZZ", 50));
        l.add(new Client("Jacob Roberts", "11 Cobra Road, Finsberg, FN4, 4FN",11));

        return l;
    }

    public static void addTooArray(String clientName, String clientAddress, String clientAge){

        Clients().add(Clients().size(), clientName, clientAddress, clientAge);

    }

}

