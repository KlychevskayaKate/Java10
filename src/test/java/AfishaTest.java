import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    // когда в менеджере фильмов больше, чем лимит по умолчанию (10)
    @Test
    public void addFilmMoreLimit10(){
        String film1 = "Film1";
        String film2 = "Film2";
        String film3 = "Film3";
        String film4 = "Film4";
        String film5 = "Film5";
        String film6 = "Film6";
        String film7 = "Film7";
        String film8 = "Film8";
        String film9 = "Film9";
        String film10 = "Film10";
        String film11 = "Film11";

        Afisha afisha = new Afisha();

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);
        afisha.add(film6);
        afisha.add(film7);
        afisha.add(film8);
        afisha.add(film9);
        afisha.add(film10);
        afisha.add(film11);

        String[] actual = afisha.findLast();
        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        Assertions.assertArrayEquals(expected, actual);
    }


    // когда в менеджере фильмов больше, чем заданный лимит
    @Test
    public void addFilmMoreLimit() {
        String film1 = "Film1";
        String film2 = "Film2";
        String film3 = "Film3";
        String film4 = "Film4";
        String film5 = "Film5";
        String film6 = "Film6";
        String film7 = "Film7";

        Afisha afisha = new Afisha(5);

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);
        afisha.add(film6);
        afisha.add(film7);

        String[] actual = afisha.findLast();
        String[] expected = {film7, film6, film5, film4, film3};
        Assertions.assertArrayEquals(expected, actual);
    }


    // когда в менеджере фильмов меньше, чем заданный лимит
    @Test
    public void addFilm() {
        String film1 = "Film1";
        String film2 = "Film2";
        String film3 = "Film3";
        String film4 = "Film4";

        Afisha afisha = new Afisha(5);

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);

        String[] actual = afisha.findLast();
        String[] expected = {film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);
    }


    // когда в менеджере фильмов столько же, сколько задано в лимите
    @Test
    public void findLast() {
        String film1 = "Film1";
        String film2 = "Film2";
        String film3 = "Film3";
        String film4 = "Film4";
        String film5 = "Film5";

        Afisha afisha = new Afisha(5);

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);

        String[] actual = afisha.findLast();
        String[] expected = {film5, film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);
    }


    // вывод всех фильмов в порядке добавления
    @Test
    public void findAllFilm() {
        String film1 = "Film1";
        String film2 = "Film2";
        String film3 = "Film3";
        String film4 = "Film4";
        String film5 = "Film5";
        String film6 = "Film6";
        String film7 = "Film7";
        String film8 = "Film8";
        String film9 = "Film9";
        String film10 = "Film10";

        Afisha afisha = new Afisha();

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);
        afisha.add(film6);
        afisha.add(film7);
        afisha.add(film8);
        afisha.add(film9);
        afisha.add(film10);

        String[] actual = afisha.findAll();
        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        Assertions.assertArrayEquals(expected, actual);
    }
}
