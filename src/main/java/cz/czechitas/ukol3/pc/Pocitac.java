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

    //Aby bylo možné počítač zapnout, musí mít procesor, paměť a disk. Při pokusu o zapnutí počítače tedy musíte zkontrolovat, zda se daná část v počítači nachází. Poku dnějaké chybí (např. ram == null), metoda pro zapnutí vypíše do konzle chybovou hlášku a metoda se ukončí (počítač se nezapne).

    public void zapnitSe(){
        if (this.pevnyDisk == null || this.cpu == null || this.ram == null){
            System.err.println("Pocitacu chybeji komponenty.");
        }
        else if (jeZapnuty){
            System.err.println("Pocitac uz je zapnuty.");
        }
        else {
            jeZapnuty = true;
            System.out.println("Zapnul jsem pocitac.");
        }
    }

}
