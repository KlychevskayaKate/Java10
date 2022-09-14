import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest{

    @Test
    public void add() {
        Afisha afisha = new Afisha();

        afisha.add("Film 1");
        afisha.add("Film 2");

        String[] actual = afisha.findAll();
        String[] expected = {"Film 1", "Film 2"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        Afisha afisha = new Afisha();

        afisha.add("Film 1");
        afisha.add("Film 2");
        afisha.add("Film 3");

        String[] actual = afisha.findLast();
        String[] expected = {"Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limit10() {
        Afisha afisha = new Afisha();

        afisha.add("Film 1");
        afisha.add("Film 2");
        afisha.add("Film 3");
        afisha.add("Film 4");
        afisha.add("Film 5");
        afisha.add("Film 6");
        afisha.add("Film 7");
        afisha.add("Film 8");
        afisha.add("Film 9");
        afisha.add("Film 10");

        String[] actual = afisha.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);

    }
}

