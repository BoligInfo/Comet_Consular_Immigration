package dk.comet.prototyping;

import java.util.ArrayList;
import java.util.List;

public class Question implements Comparable<Question> {

    //region --fields--
    private static int counter = 0;

    private int id = -1;
    private String title = "Tidøhl!";
    private String text = "Dægsd";

    private List<Option> paths  = new ArrayList<>();
    //endregion

    //region --Constructors--
    public Question() {
        counter++;
        this.id = counter;
        this.title = "Tidøhl " + counter;
        this.text = "Dægzd " + counter;
    }

    public Question(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;

        paths.add(new Option());
        paths.add(new Option());
        paths.add(new Option());
        paths.add(new Option());
    }

    //endregion

    //region --Getters--
    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public List<Option> getPaths() {
        return paths;
    }

    //endregion


    @Override
    public String toString() {
        return "Q-" + id;
    }


    @Override
    public int compareTo(Question o) {
        if (this.id < o.id)
            return -1;
        if (this.id > o.id)
            return 1;
        return 0;

    }
}
