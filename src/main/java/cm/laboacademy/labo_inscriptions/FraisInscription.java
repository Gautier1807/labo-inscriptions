package cm.laboacademy.labo_inscriptions;

public class FraisInscription {

    public int calculer(String niveau, boolean boursier) {
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
        return boursier ? base / 2 : base;
    }
}
