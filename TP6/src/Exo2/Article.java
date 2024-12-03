package Exo2;

import java.util.Objects;

public class Article implements Comparable<Article> {
    private int numero;
    private String description;

    public Article(int numero, String description) {
        this.numero = numero;
        this.description = description;
    }

    public int compareTo(Article article) {
        if (this.numero > article.numero) {
            return 1;
        }
        if (this.numero < article.numero) {
            return -1;
        }
        return 0;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return numero + " " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return numero == article.numero && Objects.equals(description, article.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, description);
    }
}
