package hc.managementsystem;

import java.util.LinkedList;

public class Mitarbeiter implements Comparable<Mitarbeiter>{
    private String vorname;
    private String nachname;
    private Anschrift anschrift;
    private LinkedList<Object> taetigkeitenUndProjekte;

    private boolean istAktiv = true;
    private boolean imUrlaub = false;
    private boolean istKrank = true;
    public Mitarbeiter(String vorname, String nachname, String strasse, String hausnummer, String plz) {
        this.vorname = vorname;
        this.nachname = nachname;
        String name = vorname+" "+nachname;
        this.anschrift = new Anschrift(name, strasse, hausnummer, plz);
    }

    public Anschrift getAnschrift() {
        return anschrift;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setAnschrift(Anschrift anschrift) {
        this.anschrift = anschrift;
    }

    public void setImUrlaub(boolean imUrlaub) {
        this.imUrlaub = imUrlaub;
    }

    public void setIstAktiv(boolean istAktiv) {
        this.istAktiv = istAktiv;
    }

    public void setIstKrank(boolean istKrank) {
        this.istKrank = istKrank;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public int compareTo(Mitarbeiter o) {
        if(this.vorname.compareTo(o.getVorname()) !=0) {

            return this.vorname.compareTo(o.getVorname());

        }
        else if (this.nachname.compareTo(o.getNachname()) !=0) {

            return this.nachname.compareTo(o.getNachname());

        }
        else {

            return this.anschrift.compareTo(o.getAnschrift());

        }
    }
}
