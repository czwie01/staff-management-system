package hc.managementsystem;

import java.util.Map;

public class Project {
    private String Name;
    private double projektStunden;
    private String projektBeschreibung;

    private Map<StaffMember, Integer> StundenJeMitarbeiterMap;

    public Project() {
    }
}
