package hc.managementsystem;

public class Anschrift implements Comparable<Anschrift> {
    private String name;
    private String strasse;
    private String hausnummer;
    private String plz;

    public Anschrift(String name, String strasse, String hausnummer, String plz) {

        this.name = name;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
    }

    public String getName() {
        return name;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }


    @Override
    public int compareTo(Anschrift o) {

        if(this.name.compareTo(o.getName()) != 0) {

            return this.name.compareTo(o.getName());

        }
        else if (this.strasse.compareTo(o.getStrasse()) != 0) {

            return this.strasse.compareTo(o.getStrasse());

        }
        else if (this.hausnummer.compareTo(o.getHausnummer()) != 0) {

            return this.hausnummer.compareTo(o.getHausnummer());
        }
        else {

            return this.plz.compareTo(o.getPlz());

        }
    }
}
