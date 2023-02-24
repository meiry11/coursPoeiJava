package coursjava.banque;

public class CompteEpargne extends Compte {

    TypeEpargne typeEpargne;

    public CompteEpargne(Client client, TypeEpargne typeEpargne) {
        super(client);

        this.typeEpargne = typeEpargne;
    }

    public TypeEpargne getTypeEpargne() {
        return typeEpargne;
    }

    public void setTypeEpargne(TypeEpargne typeEpargne) {
        this.typeEpargne = typeEpargne;
    }

    @Override
    public String resume() {

        return "Le compte numéro " + this.getNumero() + " (" + this.getIntitule() + ") à un solde de " + this.getMontant() + " et une epargne de type " + this.getTypeEpargne() + ".\nIl s'agit d'un compte epargne.";

    }
}
