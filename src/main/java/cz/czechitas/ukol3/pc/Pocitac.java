package cz.czechitas.ukol3.pc;

import java.rmi.ServerError;

public class Pocitac {

    Procesor cpu;
    Pamet ram;
    Disk pevnyDisk1;
    Disk pevnyDisk2;



    @Override
    public String toString() {
        return "Informace o daniPocitac:" +
                " CPU: " + cpu + " RAM: " + ram + " Disk: " + pevnyDisk1;
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

    public Disk getPevnyDisk1() {
        return pevnyDisk1;
    }

    public void setPevnyDisk1(Disk pevnyDisk1) {
        this.pevnyDisk1 = pevnyDisk1;
    }

    public Disk getPevnyDisk2() {
        return pevnyDisk2;
    }

    public void setPevnyDisk2(Disk pevnyDisk2) {
        this.pevnyDisk2 = pevnyDisk2;
    }

    public boolean jeZapnuty = false;

    public void zapniSe(){
        if (this.pevnyDisk1 == null || this.cpu == null || this.ram == null){
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
            long volneMistoNaDisku1 = pevnyDisk1.getKapacitaDisku() - pevnyDisk1.getVyuziteMisto();
            long volneMistoNaDisku2 = pevnyDisk2.getKapacitaDisku() - pevnyDisk2.getVyuziteMisto();

            if(volneMistoNaDisku1 >= velikost) {
                pevnyDisk1.setVyuziteMisto(pevnyDisk1.getVyuziteMisto() + velikost);
                System.out.println("Vytvoril se soubor o velikosti " + velikost + ". Na disku 1 je vyuzite misto " + pevnyDisk1.getVyuziteMisto() + " bajtu z celkove kapacity " + pevnyDisk1.getKapacitaDisku() + " bajtu.");
            }

            else if(volneMistoNaDisku2 >= velikost){
                System.out.println("Na disku 1 neni dost mista. Soubor se zapise na disk 2.");
                pevnyDisk2.setVyuziteMisto(pevnyDisk2.getVyuziteMisto() + velikost);
                System.out.println("Vytvoril se soubor o velikosti " + velikost + ". Na disku 2 je vyuzite misto " + pevnyDisk2.getVyuziteMisto() + " bajtu z celkove kapacity " + pevnyDisk2.getKapacitaDisku() + " bajtu.");
            }

            else {
                System.err.println("Na discich neni dostatek mista.");
            }
        }

        else {
            System.err.println("Nelze vytvaret soubory pokud je pocitac vypnuty!");
        }
    }



    public void vymazSouborOVelikosti(long velikost){
        if (jeZapnuty){
            if(pevnyDisk2.getVyuziteMisto() >= velikost) {
                pevnyDisk2.setVyuziteMisto((pevnyDisk2.getVyuziteMisto() - velikost));
                System.out.println("Smazal se soubor o velikosti " + velikost + ". Na disku 2 je vyuzite misto " + pevnyDisk2.getVyuziteMisto() + " bajtu z celkove kapacity " + pevnyDisk2.getKapacitaDisku() + " bajtu.");
            }

            else if(pevnyDisk1.getVyuziteMisto() >= velikost) {
                pevnyDisk1.setVyuziteMisto(pevnyDisk1.getVyuziteMisto() - velikost);
                System.out.println("Smazal se soubor o velikosti " + velikost + ". Na disku 1 je vyuzite misto " + pevnyDisk1.getVyuziteMisto() + " bajtu z celkove kapacity " + pevnyDisk1.getKapacitaDisku() + " bajtu.");
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
