import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostManagerTest {

    @Test
    public void shouldNotAddNewFilm() {
        PostManager manager = new PostManager();

        manager.addNewFilm(null);

        String[] expected = {null};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNewFilm1() {
        PostManager manager = new PostManager();

        manager.addNewFilm("Film1");

        String[] expected = {"Film1"};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNewFilm5() {
        PostManager manager = new PostManager();

        manager.addNewFilm("Film1");
        manager.addNewFilm("Film2");
        manager.addNewFilm("Film3");
        manager.addNewFilm("Film4");
        manager.addNewFilm("Film5");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5"};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmsIfEqualToIim() {
        PostManager manager = new PostManager();

        manager.addNewFilm("Film1");
        manager.addNewFilm("Film2");
        manager.addNewFilm("Film3");
        manager.addNewFilm("Film4");
        manager.addNewFilm("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLastFilms();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmsIfUnderIim() {
        PostManager manager = new PostManager();

        manager.addNewFilm("Film1");
        manager.addNewFilm("Film2");
        manager.addNewFilm("Film3");


        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = manager.findLastFilms();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmsIfAboveIim() {
        PostManager manager = new PostManager();

        manager.addNewFilm("Film1");
        manager.addNewFilm("Film2");
        manager.addNewFilm("Film3");
        manager.addNewFilm("Film4");
        manager.addNewFilm("Film5");
        manager.addNewFilm("Film6");

        String[] expected = {"Film6", "Film5","Film4", "Film3", "Film2"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastFilmsIfNull() {
        PostManager manager = new PostManager();

        manager.addNewFilm(null);

        String[] expected = {null};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLim() {
        PostManager manager = new PostManager();


    }

}




