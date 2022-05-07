package cz.czechitas.ukol3.pc;

public class Pamet {

    long kapacita = 16_000_000_000L;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    @Override
    public String toString() {
        return "Pamet ma kapacitu " + kapacita + " bajtu.";
    }
}
