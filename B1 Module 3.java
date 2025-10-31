import java.util.Scanner;

public class B1_Module_3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int Quantite_produits_recue, Quantite_produits_vendue, stock_actuel, Jour;
        String ATTENTION = " le stock est sous le seuil d'alerte !";
        String ERREUR = "le stock est négatif. Simulation arrêtée. ";
        boolean simulationEnCours = false;

        System.out.println("Quel est le stock initial ?");
        int stockInitial = sc.nextInt();
        System.out.println("Quel est le seuil d'alerte ?");
        int seuil_alerte = sc.nextInt();
        System.out.println("Combien de jours doit durer la simulation ?");
        int jour = sc.nextInt();

        if (stockInitial <= seuil_alerte) {
            System.out.println(ATTENTION);
        } else if (stock_actuel < 0) {
            System.out.println(ERREUR);
        }
        for (int numJour = 5; Jour <= numJour; Jour++)
            System.out.println("Jour" + Jour);
        Systeme.out.println("------");
        System.out.println("Quantité de produits reçue ?");
        Scanner QuantiteProduitsRecue = sc.nextInt();
        Systeme.out.Println("Quantité de produits vendue ?");
        Scanner QuantiteDeProduitsVendue = sc.next.Int();
        Systeme.out.println("Le stock actuel est de :");
        Scanner StockActuel = sc.next.Int();
        {
            clavier.close();
            stock_actuel = (stockInitial + Quantite_produits_recue) - Quantite_produits_vendue;
        }
        System.out.println("Simulation terminée. Stock final :" + stock_actuel);
    }
}
