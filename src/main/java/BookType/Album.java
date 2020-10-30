package BookType;

import LibraryMain.Books;

public class Album extends Books {
    public Album(){

    }

    private PaperQuality paperQuality;
    public Album(String title,String author,Integer numberOfPages,PaperQuality paperQuality){

    super(title, author, numberOfPages);
    this.paperQuality = paperQuality;

    }



}
