package cz.czechitas.ukol3.pc;

public class Pocitac {

    Procesor cpu;
    Pamet ram;
    Disk pevnyDisk;

    @Override
    public String toString() {
        return "Informace o daniPocitac:" +
                " CPU: " + cpu + " RAM: " + ram + " Disk: " + pevnyDisk;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public boolean jeZapnuty = false;

    public void zapniSe(){
        if (this.pevnyDisk == null || this.cpu == null || this.ram == null){
            System.err.println("Pocitacu chybeji komponenty.");
        }
        else if (jeZapnuty){
            System.err.println("Pocitac uz je zapnuty.");
        }
        else {
            jeZapnuty = true;
            System.out.println("Pocitac se zapnul.");
        }
    }

    public void vypniSe(){
        if (jeZapnuty){
            jeZapnuty = false;
            System.out.println("Pocitac se vypnul.");
        }
    }

}
