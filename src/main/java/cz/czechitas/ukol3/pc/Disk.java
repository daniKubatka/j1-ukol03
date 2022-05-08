package cz.czechitas.ukol3.pc;

public class Disk {

    private long kapacitaDisku;
    private long vyziteMisto;

    public long getKapacitaDisku() {
        return kapacitaDisku;
    }

    public void setKapacitaDisku(long kapacitaDisku) {
        this.kapacitaDisku = kapacitaDisku;
    }

    public long getVyuziteMisto() {
        return vyziteMisto;
    }

    public void setVyuziteMisto(long vyuzitemisto) {
        this.vyziteMisto = vyuzitemisto;
    }

    @Override
    public String toString() {
        return "Disk ma kapacitu " + kapacitaDisku + " bajtu, z toho vyuzitych " + vyziteMisto + " bajtu.";
    }
}
