package DZ35;

import java.util.Collection;
import java.util.Map;

public class Controller {
    private Model model;
    private View userInterface;

    public Controller() {
        this.model = new Model();
        this.userInterface = new View();
    }

    public void run() {
        String answerUser = "";
        while (!(answerUser).equals("q")) {
            answerUser = userInterface.userHomeScreen();
            processingAnswerUser(answerUser);
        }
    }

    public void processingAnswerUser(String answerUser) {
        if (answerUser.equals("1")) {
            Map movieDataEntry = userInterface.createDataFilm();
            model.addCatalogMovies(movieDataEntry);
        } else if (answerUser.equals("2")) {
            Collection catalogMovies = model.getAllCatalogMovies();
            userInterface.showAllCatalogMovies(catalogMovies);
        } else if (answerUser.equals("3")) {
            Collection catalogMovies = model.getAllCatalogMovies();
            try {
                userInterface.watchCardFilm((model.getOneCardFilm(userInterface.watchCatalogMovies(catalogMovies, answerUser))));
            } catch (NullPointerException e) {
                userInterface.error("Такого фильма нет в каталоге", 2);
            }
        } else if (answerUser.equals("4")) {
            String answerUserFilmTitle;
            Collection catalogMovies = model.getAllCatalogMovies();
            answerUserFilmTitle = userInterface.watchCatalogMovies(catalogMovies, answerUser);
            if ((model.removeCardFilm(answerUserFilmTitle)) != null){
                userInterface.removeCardFilm(answerUserFilmTitle);
            }else {
                userInterface.error("Фильм не найден, возможно допушена ошибка при вводе данных", 2);
            }
        } else if (answerUser.equals("q")) {
            model.saveFilesCatalog();
        } else {
            userInterface.error(answerUser, 1);
        }
    }
}
