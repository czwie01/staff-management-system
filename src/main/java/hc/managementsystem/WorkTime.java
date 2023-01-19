package hc.managementsystem;

public class WorkTime {
    private double contractHours;
    private double finalisedHours;
    private double bookedHours;

    public WorkTime(double contractHours){
        this.contractHours = contractHours;
    }

    public double getContractHours() {
        return contractHours;
    }

    public void setContractHours(double contractHours) {
        this.contractHours = contractHours;
    }

    public double getFinalisedHours() {
        return finalisedHours;
    }

    public void setFinalisedHours(double finalisedHours) {
        this.finalisedHours = finalisedHours;
    }

    public double getBookedHours() {
        return bookedHours;
    }

    public void setBookedHours(double bookedHours) {
        this.bookedHours = bookedHours;
    }
}
