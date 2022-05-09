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
        //cast 1
        Pocitac daniPocitac = new Pocitac();

        daniPocitac.zapniSe();

        Procesor daniProcesor = new Procesor();
        daniProcesor.setRychlost(320_000_000_000L);
        daniProcesor.setVyrobce("Intel");

        Pamet daniPamet = new Pamet();
        daniPamet.setKapacita(16_000_000_000L);

        Disk daniDisk1 = new Disk();
        daniDisk1.setKapacitaDisku(10_498_617_344L);
        daniDisk1.setVyuziteMisto(7_657_362_891L);

        Disk daniDisk2 = new Disk();
        daniDisk2.setKapacitaDisku(9_500_000_000L);
        daniDisk2.setVyuziteMisto(0L);

        daniPocitac.setCpu(daniProcesor);
        daniPocitac.setRam(daniPamet);
        daniPocitac.setPevnyDisk1(daniDisk1);
        daniPocitac.setPevnyDisk2(daniDisk2);

        System.out.println(daniPocitac);

        daniPocitac.zapniSe();
        daniPocitac.zapniSe();

        daniPocitac.vypniSe();
        daniPocitac.vypniSe();

        //cast2
        daniPocitac.vytvorSouborOVelikosti(1_500_001_210L);

        daniPocitac.zapniSe();

        System.out.println(daniPocitac);

        daniPocitac.vytvorSouborOVelikosti(1_500_001_210L);
        daniPocitac.vytvorSouborOVelikosti(1_500_001_210L);
        daniPocitac.vytvorSouborOVelikosti(10_500_001_210L);

        daniPocitac.vypniSe();

        daniPocitac.vymazSouborOVelikosti(5_830_156_234L);

        daniPocitac.zapniSe();
        daniPocitac.vymazSouborOVelikosti(5_830_156_234L);
        daniPocitac.vymazSouborOVelikosti(5_830_156_234L);

    }

}
