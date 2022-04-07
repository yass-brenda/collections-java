package collection.bank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountUser {
    public static void main(String[] args) {
        Client c1 =  new Client("Ulisses","00001",1200.0);
        Client c2 =  new Client("Diego","00002",1600.0);
        Client c3 =  new Client("Barrios","00003",1800.0);
        Client c4 =  new Client("Barrios","00003",1800.0);
        Client c5 =  new Client("Becerra","00004",1900.0);


        // Defined collection set of type Hasshet
        Set<Client> clientsBank = new HashSet<Client>();

        //Add elementos
        clientsBank.add(c1);
        clientsBank.add(c2);
        clientsBank.add(c3);
        clientsBank.add(c4);
        clientsBank.add(c5);

        /* Search all objets of type CLient in tthe map clientBank
        for (Client clients : clientsBank){
            if(clients.getName().equals("Barrios")){
                clientsBank.remove(clients);
            }
        } */

        for (Client clients : clientsBank){
            System.out.println(clients.getName() + " " +clients.getNumberCount() + " "+ clients.getSalary());
        }

        Iterator<Client> it = clientsBank.iterator();
        while (it.hasNext()){
            String name_client = it.next().getName();
            if(name_client.equals("Barrios")){
                it.remove(); // elimina el objeto que toma el iterador.
            }
        }




        /**
        Iterator<Client> it = clientsBank.iterator();
        while (it.hasNext()){
            String name_client = it.next().getName();
            System.out.println(name_client);

            /* No puede haber dos next porque avanzara dos saltos
            ya que un next significa da un salto y inspecciona el anterior
            En este ejemplo darias dos saltos y inspeccionas el anterior.

            String number_count = it.next().getNumberCount();
            System.out.println(number_count);
        } **/



    }
}
