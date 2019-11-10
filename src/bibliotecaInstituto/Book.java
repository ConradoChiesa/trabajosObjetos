package bibliotecaInstituto;

public class Book {
    private String Title;
    private String state;

    public Book(String title, String state) {
        Title = title;
        this.state = state;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
