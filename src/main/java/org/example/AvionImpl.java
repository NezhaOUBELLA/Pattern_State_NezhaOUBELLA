package org.example;

public class AvionImpl implements Avion {
    private Etat etat;
    public AvionImpl(Etat etat) {
        this.etat=etat;
    }
    public AvionImpl() {
        this.etat= new AuGarage(this);
    }
    @Override
    public void entrerAuGarage() {
        etat.entrerAuGarage();
    }

    @Override
    public void sortirDuGarage() {
        etat.sortirDuGarage();
    }

    @Override
    public void decoller() {
        etat.decoller();
    }

    @Override
    public void atterir() {
        etat.atterir();
    }

    @Override
    public void doActivity() {
        etat.doActivity();
    }

    @Override
    public void Stop() {
        etat.stop();
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
