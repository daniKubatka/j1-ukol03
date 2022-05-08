package cz.czechitas.ukol3;

import cz.czechitas.ukol3.pc.Disk;
import cz.czechitas.ukol3.pc.Pamet;
import cz.czechitas.ukol3.pc.Pocitac;
import cz.czechitas.ukol3.pc.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        Pocitac daniPocitac = new Pocitac();

        daniPocitac.zapniSe();

        Procesor daniProcesor = new Procesor();
        daniProcesor.setRychlost(320_000_000_000L);
        daniProcesor.setVyrobce("Intel");

        Pamet daniPamet = new Pamet();
        daniPamet.setKapacita(16_000_000_000L);

        Disk daniDisk = new Disk();
        daniDisk.setKapacitaDisku(10_498_617_344L);
        daniDisk.setVyuziteMisto(7_657_362_891L);

        daniPocitac.setCpu(daniProcesor);
        daniPocitac.setRam(daniPamet);
        daniPocitac.setPevnyDisk(daniDisk);

        System.out.println(daniPocitac);

        daniPocitac.zapniSe();
        daniPocitac.zapniSe();

        daniPocitac.vypniSe();
        daniPocitac.vypniSe();







    }

}
