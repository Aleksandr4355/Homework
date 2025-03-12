package DZ35;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner inputUser = new Scanner(System.in);

    public String userHomeScreen() {
        String answerUser;
        System.out.println("===== Редактирование данных каталогов фильмов =====");
        System.out.print("Действия с фильмами: \n1 - добавление фильмов \n2 - каталог фильмов \n3 - просмотр определенного фильма \n4 - удаление фильма \nq - выход из программы \nВыбирите вариант действия -> ");
        answerUser = inputUser.nextLine();
        System.out.println("===================================================");
        return answerUser;
    }

    public Map createDataFilm() {
        Map<String, String> movieDataEntry = new LinkedHashMap<>();
        System.out.println("================ Добавить фильм ===============");
        movieDataEntry.put("название", "");
        movieDataEntry.put("жанр", "");
        movieDataEntry.put("режиссер", "");
        movieDataEntry.put("год выпуска", "");
        movieDataEntry.put("длительность", "");
        movieDataEntry.put("студия", "");
        movieDataEntry.put("актеры", "");
        movieDataEntry.entrySet().forEach((s) -> {
            System.out.print("Введите " + s.getKey() + " фильма: ");
            movieDataEntry.put(s.getKey(), inputUser.nextLine());
        });
        System.out.println("================================================");
        return movieDataEntry;
    }

    public void showAllCatalogMovies(Collection catalogMovies) {
        System.out.println("================ Каталог фильмов ===============");
        catalogMovies.forEach(System.out::println);
        System.out.println("================================================");
    }

    public String watchCatalogMovies(Collection catalogMovies, String answerUser) {
        String answerUserFilmTitle;
        System.out.println("================ Каталог фильмов ===============");
        catalogMovies.forEach(System.out::println);
        System.out.println("================================================");
        System.out.print("Напишите название фильма, который хотите " + (answerUser.equals("3") ? "посмотреть" : "удалить") + " -> ");
        answerUserFilmTitle = inputUser.nextLine();
        System.out.println("================================================");
        return answerUserFilmTitle;
    }

    public void watchCardFilm(CardFilm cardFilm) {
        System.out.println("================ Просмотр фильма ===============");
        System.out.println("название: " + cardFilm.title + "\nжанр: " + cardFilm.genre + "\nрижессер: " + cardFilm.director + "\nгод выпуска: " + cardFilm.createAge + "\nдлительность: " + cardFilm.duration + "\nстудия: " + cardFilm.studio + "\nактеры: " + cardFilm.actor);
        System.out.println("==================================================");
    }

    public void removeCardFilm(String answerUserFilmTitle){
        System.out.println("================ Удаление фильма ===============");
        System.out.println("Фильм " + answerUserFilmTitle + " удален из католога");
        System.out.println("==================================================");
    }

    public void error(String message, int number){
        System.out.println("===================== Ошибка ====================");
        if (number == 1){
        System.out.println("Неверный ввод команды ");
        } else if (number == 2) {
            System.out.println(message);
        }
        System.out.println("==================================================");
    }
}
