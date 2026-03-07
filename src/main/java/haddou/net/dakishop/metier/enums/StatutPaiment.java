package haddou.net.dakishop.metier.enums;

/**
 * @author haddou
 * comme vous voiyez ici M.yassine enum c'est un type de classe dans java et dan
 * cette exemple ona l'attribut label par ce que les enum contient des axants juste pour un besoin de specification
 */

public enum StatutPaiment {
    EN_ATTENTE("En attente"),
    PAYE("Payé"),
    ECHOUE("Échoué");

    private final String label;

    StatutPaiment(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
