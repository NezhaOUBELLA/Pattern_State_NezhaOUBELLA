package org.example;

public class EnAir extends Etat {
    public EnAir(Avion avion) {
        super(avion);
    }

    @Override
    public void entrerAuGarage() {
        System.out.println("Impossible d'entrer au garage ...");
    }

    @Override
    public void sortirDuGarage() {
        System.out.println("Impossible de sortir du garage ...");
    }

    @Override
    public void decoller() {
        System.out.println("L'avion est déja en air");
    }

    @Override
    public void atterir() {
        System.out.println("Atterir !");
    }

    @Override
    public void doActivity() {
        System.out.println("L'avion en air");
    }

    @Override
    public void stop() {
        System.out.println("Impossible de stop ...");
    }
}
