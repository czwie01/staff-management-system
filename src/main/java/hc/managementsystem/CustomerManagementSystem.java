package hc.managementsystem;

import java.util.LinkedList;
import java.util.List;

public class CustomerManagementSystem {
    private final List<Customer> kundenListe = new LinkedList<>();


    public void kundenAnlegen(Customer neuerCustomer) {
        if(getKundenIndex(neuerCustomer) >= 0) {
            this.kundenListe.add(neuerCustomer);
        }
        else {
            System.out.println("Kunde bereits im System enthalten.");
        }

    }

    public void kundenEntfernen(Customer customer){
        if( this.getKundenIndex(customer) >= 0){
            this.kundenListe.remove(this.getKundenIndex(customer));
        }
        else{
            //LoggerInfo stattdessen
            System.out.println("Zu entfernender Kunde nicht gefunden");
        }
    }

    private int getKundenIndex(Customer customer){
        for(int i = 0; i < this.kundenListe.size() - 1; i++){
            if(this.kundenListe.get(i).compareTo(customer) == 0) {
                return i;
            }
        }
        return -1;
    }



}
