package DZ35;

import java.io.*;
import java.util.*;

public class Model {
    private static Map<String, CardFilm> catalogMovies;
    private static String fileCatalog;

    public Model() {
        this.fileCatalog = "catalog movies.txt";
        this.catalogMovies = writeFilesCatalog();
    }

    public void addCatalogMovies(Map movieDataEntry) {
        CardFilm cardFilm = new CardFilm(movieDataEntry);
        catalogMovies.put((String) (movieDataEntry.get("название")), cardFilm);
    }

    public Collection getAllCatalogMovies() {
        return catalogMovies.values();
    }

    public CardFilm getOneCardFilm(String answerUserFilmTitle) throws NoSuchElementException {
        return catalogMovies.get(answerUserFilmTitle);
    }

    public CardFilm removeCardFilm(String remove) {
        return catalogMovies.remove(remove);
    }

    public static LinkedHashMap writeFilesCatalog() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileCatalog))) {
            return (LinkedHashMap) ois.readObject();
        } catch (Exception e) {
            return new LinkedHashMap<>();
        }
    }
    public void saveFilesCatalog() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileCatalog))) {
            oos.writeObject(catalogMovies);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class CardFilm implements Serializable {
    String title;
    String genre;
    String director;
    String createAge;
    String duration;
    String studio;
    String actor;

    public CardFilm(Map movieDataEntry) {
        this.title = (String) movieDataEntry.get("название");
        this.genre = (String) movieDataEntry.get("жанр");
        this.director = (String) movieDataEntry.get("режиссер");
        this.createAge = (String) movieDataEntry.get("год выпуска");
        this.duration = (String) movieDataEntry.get("длительность");
        this.studio = (String) movieDataEntry.get("студия");
        this.actor = (String) movieDataEntry.get("актеры");
    }

    @Override
    public String toString() {
        return title + " год выпуска: " + createAge;
    }
}