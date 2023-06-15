public class PostManager {

    private String[] title = new String[0];
    private int lim;

    public PostManager() {
        this.lim = 5;
    }

    public PostManager(int lim) {
        this.lim = lim;
    }

    public void addNewFilm(String newTitle) {
        String[] intermediate = new String[title.length + 1];
        for (int i = 0; i < title.length; i++) {
            intermediate[i] = title[i];
        }
        intermediate[intermediate.length - 1] = newTitle;
        title = intermediate;
    }

    public String[] findAllFilms() {
        return title;
    }

    public String[] findLastFilms() {
        int resultLength;
        if (title.length < lim) {
            resultLength = title.length;
        } else {
            resultLength = this.lim;
        }
        String[] intermediate = new String[resultLength];
        for (int i = 0; i < intermediate.length ; i++) {
            intermediate[i] = title[title.length - i - 1];
        }
        return intermediate;
    }
}
