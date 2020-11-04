package homework1_Library_Catalog.book_type;

public class ArtAlbum extends Book {
    public ArtAlbum() {

    }

    private PaperQuality paperQuality;

    public ArtAlbum(String title, String author, Integer numberOfPages, PaperQuality paperQuality) {

        super(title, author, numberOfPages);
        this.paperQuality = paperQuality;

    }


}
