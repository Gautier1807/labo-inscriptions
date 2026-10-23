package cm.laboacademy.labo_inscriptions;

public class FraisInscription {

    public int calculer(String niveau, boolean boursier) {
        return calculer(niveau, boursier, false);
    }

    public int calculer(String niveau, boolean boursier, boolean avantDateLimite) {
        int base;
        switch (niveau) {
            case "L1":
            case "L2":
            case "L3":
                base = 50000;
                break;
            case "M1":
            case "M2":
                base = 75000;
                break;
            default:
                throw new IllegalArgumentException("Niveau inconnu : " + niveau);
        }
        int frais = boursier ? base / 2 : base;
        return avantDateLimite ? frais * 90 / 100 : frais;
    }
}
