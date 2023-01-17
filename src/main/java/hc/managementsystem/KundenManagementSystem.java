package hc.managementsystem;

import java.util.LinkedList;
import java.util.List;

public class KundenManagementSystem {
    private final List<Kunde> kundenListe = new LinkedList<>();


    public void kundenAnlegen(Kunde neuerKunde) {
        if(getKundenIndex(neuerKunde) >= 0) {
            this.kundenListe.add(neuerKunde);
        }
        else {
            System.out.println("Kunde bereits im System enthalten.");
        }

    }

    public void kundenEntfernen(Kunde kunde){
        if( this.getKundenIndex(kunde) >= 0){
            this.kundenListe.remove(this.getKundenIndex(kunde));
        }
        else{
            //LoggerInfo stattdessen
            System.out.println("Zu entfernender Kunde nicht gefunden");
        }
    }

    private int getKundenIndex(Kunde kunde){
        for(int i = 0; i < this.kundenListe.size() - 1; i++){
            if(this.kundenListe.get(i).compareTo(kunde) == 0) {
                return i;
            }
        }
        return -1;
    }



}
