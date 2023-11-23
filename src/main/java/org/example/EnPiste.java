package org.example;

public class EnPiste extends Etat {
    public EnPiste(Avion avion) {
        super(avion);
    }

    @Override
    public void entrerAuGarage() {
        System.out.println("Entere au garage");
    }

    @Override
    public void sortirDuGarage() {
        System.out.println("Impossible de sortir du garage ...");
    }

    @Override
    public void decoller() {
        System.out.println("Decoller !");
    }

    @Override
    public void atterir() {
        System.out.println("Impossible d'atterir ...");
    }

    @Override
    public void doActivity() {
        System.out.println("L'avion est en piste");
    }

    @Override
    public void stop() {
        System.out.println("Impossible de stop ...");
    }
}
