package homework1_Library_Catalog.book_type;

import homework1_Library_Catalog.support.ReadFromConsole;

public class Book {

    private String title;
    private String author;
    private Integer numberOfPages;


    public Book(String title, String author, Integer numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public void addbook() {
        Integer answer;
        String answerstring;
        ReadFromConsole citeste = new ReadFromConsole();
        System.out.println("for novels press 1, for album press 2, for science book press 3");

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

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer newNumberOfPages) {
        numberOfPages = newNumberOfPages;
    }

    public Book() {

    }

    public void erase() {


    }


}
