package homework1_Library_Catalog.book_type;

public class Science extends Book {
    private String topic;

    public Science() {

    }

    public Science(String title, String author, Integer numberOfPages, String topic) {
        super(title, author, numberOfPages);
        this.topic = topic;

    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String newTopic) {
        topic = newTopic;
    }

}
