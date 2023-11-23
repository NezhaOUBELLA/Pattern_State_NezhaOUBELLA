package org.example;

public class AuGarage extends Etat {
    public AuGarage(Avion avion) {
        super(avion);
    }

    @Override
    public void entrerAuGarage() {
        System.out.println("L'avion est déja dans le garage");
    }

    @Override
    public void sortirDuGarage() {
        System.out.println("Sortir du garage");
    }

    @Override
    public void decoller() {
        System.out.println("Impossible de decoller...");
    }

    @Override
    public void atterir() {
        System.out.println("Impossible d'atterir ...");
    }

    @Override
    public void doActivity() {
        System.out.println("L'avion est dans le garage");
    }

    @Override
    public void stop() {
        System.out.println("Stop ...");
    }
}
