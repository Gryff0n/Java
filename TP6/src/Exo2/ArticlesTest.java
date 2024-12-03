package Exo2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArticlesTest {
    private SortedSet<Article> articles= new TreeSet<Article>((o1,o2) -> o1.getDescription().compareTo(o2.getDescription()));

    public ArticlesTest(Article ... articles) {
        if(articles.length==0) {
            throw new IllegalArgumentException("liste nulle");
        }
        for(Article article : articles) {
            this.articles.add(article);
        }
    }

    public String toString() {
        return articles.toString();
    }
}
