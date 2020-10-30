package BookType;

import LibraryMain.Books;

public class ScienceBook extends Books {
    private String topic;
    public String getTopic() {
        return topic;
    }
    public void setTopic(String newTopic) {
        topic = newTopic;
    }
    public ScienceBook(){

    }
    public ScienceBook(String title,String author,Integer numberOfPages,String topic){
        super(title, author, numberOfPages);
        this.topic = topic;

    }

}
