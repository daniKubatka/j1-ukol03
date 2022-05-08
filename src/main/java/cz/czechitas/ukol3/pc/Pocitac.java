package cz.czechitas.ukol3.pc;

import java.rmi.ServerError;

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

    public void vytvorSouborOVelikosti(long velikost){
        if (jeZapnuty){
            long volneMistoNaDisku = pevnyDisk.getKapacitaDisku() - pevnyDisk.getVyuziteMisto();

            if(volneMistoNaDisku >= velikost) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
                System.out.println("Vytvoril se soubor o velikosti " + velikost + ". Na disku je vyuzite misto " + pevnyDisk.getVyuziteMisto() + " bajtu z celkove kapacity " + pevnyDisk.getKapacitaDisku() + " bajtu.");
            }
            else {
                System.err.println("Na disku neni dostatek mista.");
            }
        }

        else {
            System.err.println("Nelze vytvaret soubory pokud je pocitac vypnuty!");
        }
    }

    public void vymazSouborOVelikosti(long velikost){
        if (jeZapnuty){
            if(pevnyDisk.getVyuziteMisto() - velikost > 0) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
                System.out.println("Smazal se soubor o velikosti " + velikost + ". Na disku je vyuzite misto " + pevnyDisk.getVyuziteMisto() + " bajtu z celkove kapacity " + pevnyDisk.getKapacitaDisku() + " bajtu.");
            }
            else {
                System.err.println("Do minusu nemuzeme.");
            }
        }

        else {
            System.err.println("Nelze mazat soubory pokud je pocitac vypnuty!");
        }
    }

}
