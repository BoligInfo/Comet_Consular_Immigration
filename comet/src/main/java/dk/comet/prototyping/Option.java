package dk.comet.prototyping;

public class Option {

    //region -- Fields --
    private int id = -1;
    private int optionId = -1;
    private String text = "Åbshån!";
    private static int count = 0;
    //endregion


    //region -- Constructors --

    public Option() {
        count++;
        id = count;
        optionId = count * 2;
        text = "Txt-" + count;
    }

    public Option(int id, int pageId, String text) {
        this.id = id;
        this.optionId = pageId;
        this.text = text;
    }

    //endregion


    //region -- Getters and Setters --

    public int getId() {
        return id;
    }

    public int getOptionId() {
        return optionId;
    }

    public String getText() {
        return text;
    }

    //endregion


    @Override
    public String toString() {
        return "O " + id + " p=" + optionId +
                " t='" + text +"";
    }
}
