package coursjava;

import coursjava.banque.Banque;
import coursjava.banque.Client;
import coursjava.banque.Compte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static coursjava.banque.Compte.getComptes;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static List<Banque> banques = new ArrayList<>();

    public static List<Client> clients = new ArrayList<>();


    public static void MenuPrincipal() {


        System.out.println("1-creer une banque");
        System.out.println("2-gerer une banque");
        System.out.println("3-Voir mes banques");
        System.out.println("4-Quitter");

        System.out.println("entrer votre choix");
        int choix = scanner.nextInt();

        switch (choix) {
            case (1):
                creerBanque();
            case (2):

                MenuGestionBanque(creerBanque());
            case (3):
                affichageBanque();
            case (4):
                quiter();
            default:
                ;

        }
    }

    public static void MenuGestionBanque(Banque banque){
        isBank();
        //gerer la banque:menu banque
        System.out.println("veuillez choisir une option");

        System.out.println("1-Ajouter un compte");
        System.out.println("2-Faire un transfert");
        System.out.println("3-Voir la liste des comptes");
        System.out.println("4-Rechercher un compte");
        System.out.println("5-Rechercher un client");
        System.out.println("6-Revenir au menu principal");

        int choix1 = scanner.nextInt();

        switch (choix1) {
            case 1:
                ajouterCompte();
            case 2:
                faitTransfert();
            case 3:
                getComptes();
            case 4:
                rechercheCompte();
            case 5:
                rechercheClient();
            case 6:
                quiter();
            default:
                System.out.println("veuillez choisir une option");
        }
    }


    public static Banque creerBanque() {
        System.out.println("entrer le nom de votre banque");
        String nomBanque = scanner.next();
        scanner.nextLine();
        System.out.println("entrer l'adresse de votre banque");
        String adresseBanque = scanner.next();

        Banque banque = new Banque(nomBanque, adresseBanque);


        banques.add(banque);


        return banque;
    }

    public static void affichageBanque(){

        for (Banque banque:banques) {
            System.out.println(banques.indexOf(banque)+"-"+banque);

        }
    }

    /**
     * Methode gestion de la banque
     */
    public static void isBank() {
        //tester s'il y'a des banques qui existent
        if(banques.size()>0){
            affichageBanque();
        }else{
            System.out.println("il n'ya aucune banque afficher");
        }

        //demander à l'utilisateur de choisir une banque
        System.out.println("veuillez choisir votre banque");
        //choix par index
        int choixBanqueIndex = scanner.nextInt();
        //Banque banqueChoisi = banques.get(choixBanqueIndex);
        MenuGestionBanque(banques.get(choixBanqueIndex));


        //choix par nom de banque
        /*String choixBanque = scanner.next();

        for(Banque banque:banques){
            if(banque.getNom().equals(choixBanque)){
                MenuGestionBanque(banque);
            }
        }*/


    }

    public static Boolean isCompte() {

        return null;
    }

    public static void nouveauClient() {
        System.out.println("entrer votre nom");
        String nomClient = scanner.next();
        System.out.println("entrer votre prenom");
        String prenomClient = scanner.next();

        Client client = new Client(nomClient, prenomClient);
        //creerBanque().addClient(nomClient,prenomClient);
        clients.add(client);

    }

    public static void ajouterCompte() {
        System.out.println("entrer le nom de votre compte");
        String nomCompte = scanner.next();
        System.out.println("entrer un montant");
        System.out.println("entrer votre nom");
        String nomClient = scanner.next();


        for(Client client:clients){
            System.out.println(client);
            if(client.getNom().equals(nomClient)){

            System.out.println("vous êtes sur la liste des clients");

            }else {
                nouveauClient();
            }
        }

        //afficher la liste des clients

        //creer un nouveau client

    }

    public static void faitTransfert() {
        System.out.println("entrer le numero du compte debiteur");
        int numeroCompteDebiteur = scanner.nextInt();
        System.out.println("entrer le numero du compte à crediter");
        int numeroCompteCredit = scanner.nextInt();

        //verifier si les numeros de compte existe
        //for()
    }
    //############## la liste des comptes ######################"

    private static Client rechercheClient() {
        return null;
    }

    private static Compte rechercheCompte() {
        return null;
    }

    public static String quiter() {

        return null;
    }

    public static void generateTestData(){
        Banque banque1 = new Banque("bnp","rue Albert1");
        Banque banque2 = new Banque("post","rue Albert2");
        Banque banque3 = new Banque("ing","rue Albert3");
        Banque banque4 = new Banque("belfuis","rue Albert4");

        banques.add(banque1);
        banques.add(banque2);
        banques.add(banque3);
        banques.add(banque4);

        Client client1 = new Client("Alain","Marcel");
        Client client2 = new Client("Kady","Armel");
        Client client3 = new Client("Mado","Assou");

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);







    }

    public static void main(String[] args) {

        generateTestData();
        MenuPrincipal();



        //recherche d'un compte par son numero
        //entrer un nom puis afficher les utilisateurs qui ont le nom-afficher egalement les comptes associés


        /**banque.addClient("Antoine","xxx");
         banque.addClient("Jack","xxx1");
         banque.addClient("Mariam","xxx2");

         banque.affichageClient();

         banque.addCompteCourant(125,"perso",banque.addClient("meiry","cisse"));
         banque.affichageCompte();

         System.out.println(CompteCourant.getNbCompteOuvert());*/


        /**Vehicule maVoiture = new Vehicule("rtez");
         System.out.println(maVoiture.immatriculation);
         maVoiture.getImmatriculation();
         maVoiture.setImmatriculation("hgdz");
         System.out.println(maVoiture.immatriculation);
         Scanner in = new Scanner(System.in);
         System.out.println("entrer un choix");
         int choix_utilisateur = in.nextInt();
         System.out.println("1-choix1");
         System.out.println("2-choix2");
         System.out.println("3-choix3");
         System.out.println("4-choix4");
         switch (choix_utilisateur){
         case 1:
         System.out.println("choix1");
         case 2:
         System.out.println("choix2");
         break;
         default:

         }


         }

         do{
         System.out.println("entrer un choix");
         choix_utilisateur = in.nextInt();
         }while(choix_utilisateur!=2);
         System.out.println("c'est le bon choix");
         /**String[]liste = new String[]{"bon","voila","mariam"};
         for(String listes:liste){
         System.out.println(listes);
         }*/
    }

}

