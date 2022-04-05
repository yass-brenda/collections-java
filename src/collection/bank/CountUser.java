package collection.bank;

import java.util.HashSet;
import java.util.Set;

public class CountUser {
    public static void main(String[] args) {
        Client c1 =  new Client("Ulisses","00001",1200.0);
        Client c2 =  new Client("Diego","00002",1600.0);
        Client c3 =  new Client("Barrios","00003",1800.0);
        Client c4 =  c3;
        c4.setName("Nuevo");
        Client c5 =  new Client("Becerra","00004",1900.0);


        // Defined collection set of type Hasshet
        Set<Client> clientsBank = new HashSet<Client>();

        //Add elementos
        clientsBank.add(c1);
        clientsBank.add(c2);
        clientsBank.add(c3);
        clientsBank.add(c4);
        clientsBank.add(c5);

        // Search all objets of type CLient in tthe map clientBank
        for (Client clients : clientsBank){
            System.out.println(clients.getName() + " " +clients.getNumberCount() + " "+ clients.getSalary());
        }


    }
}
