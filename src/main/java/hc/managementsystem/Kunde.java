package hc.managementsystem;

public class Kunde implements Comparable<Kunde>{
    private String name;
    private Anschrift anschrift;

    public Kunde(String name, String strasse, String hausnummer, String plz) {
        this.name = name;
        this.anschrift= new Anschrift(name, strasse, hausnummer, plz);
    }

    public String getName() {
        return name;
    }

    public Anschrift getAnschrift() {
        return anschrift;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnschrift(String name, String strasse, String hausnummer, String plz) {
        this.anschrift = new Anschrift(name, strasse, hausnummer, plz);
    }

    @Override
    public int compareTo(Kunde o) {
        if(this.name.compareTo(o.getName()) != 0){
            return this.name.compareTo(o.getName());
        }
        else {
            return this.anschrift.compareTo(o.getAnschrift());
        }
    }
}

