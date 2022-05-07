package cz.czechitas.ukol3.pc;

public class Disk {

    private long kapacitaDisku = 10_498_617_344L;
    private long vyziteMisto;

    private long nevuziteMisto = kapacitaDisku - vyziteMisto;

    public long getKapacitaDisku() {
        return kapacitaDisku;
    }

    public void setKapacitaDisku(long kapacitaDisku) {
        this.kapacitaDisku = kapacitaDisku;
    }

    public long getVyziteMisto() {
        return vyziteMisto;
    }

    public void setVyziteMisto(long vyziteMisto) {
        this.vyziteMisto = vyziteMisto;
    }

    @Override
    public String toString() {
        return "Disk ma kapacitu " + kapacitaDisku + " bajtu" +
                "z toho vyuzitych " + vyziteMisto + " bajtu." + " Na disku zbyva " + nevuziteMisto + " bajtu";
    }
}
