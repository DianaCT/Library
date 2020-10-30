package LibraryMain;

import BookType.PaperQuality;

public class Books {

    private String title;
    private String author;
    private Integer numberOfPages;

    public Books (){

    }

    public void erase() {


    }

    public void addbook() {

    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public Integer getNmberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(Integer newNumberOfPages) {
        numberOfPages = newNumberOfPages;
    }

    public Books (String title, String author, Integer numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }


}
