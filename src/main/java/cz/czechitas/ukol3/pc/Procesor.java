package cz.czechitas.ukol3.pc;

public class Procesor {

    private String vyrobce;
    private long rychlost;

    private String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }

    @Override
    public String toString() {
        return "Procesor je od vyrobce " + vyrobce + "." +  " Rychlost procesoru je " + rychlost + " herzu.";
    }
}
