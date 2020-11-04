package homework1_Library_Catalog.book_type;

public class Novel extends Book {
    private String type;

    public Novel() {

    }

    public Novel(String title, String author, Integer numberOfPages, String type) {
        super(title, author, numberOfPages);
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    }

}
