package Exo2;

public class Main {
    public static void main(String[] args) {
        // Création de quelques articles
        Article article1 = new Article(101, "Ordinateur portable");
        Article article2 = new Article(102, "Smartphone");
        Article article3 = new Article(103, "Casque Bluetooth");
        Article article4 = new Article(101, "Ordinateur portable"); // article identique au premier
        Article article5 = new Article(104, "Clé USB");
        Article article6 = new Article(105, "Souris sans fil");

        // Test de la classe ArticlesTest avec ces articles
        ArticlesTest test = new ArticlesTest(article1, article2, article3, article4, article5, article6);

        // Affichage de l'ensemble d'articles
        System.out.println(test);
    }
}
