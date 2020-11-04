package homework1_Library_Catalog.library_main;

import homework1_Library_Catalog.book_type.*;
import homework1_Library_Catalog.support.ReadFromConsole;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CatalogMain {
    public static void main(String... args) {

        PaperQuality deni34 = new PaperQuality();
        ArtAlbum firstArtAlbum = new ArtAlbum("ModernArt", "ArtSociety", 20, deni34);
        Novel firstNovel = new Novel("Ciresarii", "Constantin Chiriță", 560, "adventure");
        Novel secondNovel = new Novel("Fundatia", "Isac Asimov", 480, "SF");
        Science firstSBook = new Science("Fizica povestita", "Cristian Presura", 1045, "Phizics");
        Science secondSBook = new Science("Chimie", "Artur Pottery", 345, "Chemistry");
        Science thirdSBook = new Science("Astrofizica", "Artur Pottery", 434, "astronomy");
        Book librarybooks = new Book();
        ArtAlbum secondArtAlbum = new ArtAlbum();


        List<Book> books = new CopyOnWriteArrayList<>();
        books.add(firstArtAlbum);
        books.add(firstNovel);
        books.add(secondNovel);
        books.add(firstSBook);
        books.add(secondSBook);
        books.add(thirdSBook);


        for (Book book : books) {
            System.out.println(book.getTitle() + "," + book.getAuthor() + "," + book.getNumberOfPages());
        }


        System.out.println("If you want to add a book press 1, if you want to erase a book press 2");
        Integer answer;
        String answerString;
        ReadFromConsole citeste = new ReadFromConsole();
        answer = citeste.citesteint();
        if (answer == 1) {
            System.out.println("for novels press 1, for album press 2, for science book press 3");
            answer = citeste.citesteint();
            switch (answer) {
                case (1):
                    Novel novel1 = new Novel();
                    System.out.println("title of the novel");
                    answerString = citeste.citesteString();
                    novel1.setTitle(answerString);
                    books.add(novel1);
                    break;
                case (2):
                    ArtAlbum artAlbum1 = new ArtAlbum();
                    System.out.println("title of the album");
                    answerString = citeste.citesteString();
                    artAlbum1.setTitle(answerString);
                    books.add(artAlbum1);
                    break;
                case (3):
                    Science sciencebook1 = new Science();
                    System.out.println("title of the science book");
                    answerString = citeste.citesteString();
                    sciencebook1.setTitle(answerString);
                    books.add(sciencebook1);
                    break;

            }

        } else {
            System.out.println("Please select the title of  the book you want to remove");
            answerString = citeste.citesteString();
            String title;
            for (Book book : books) {
                title = book.getTitle();
                if (answerString.equals(title)) {
                    books.remove(book);
                }
            }


        }

        for (Book book : books) {
            System.out.println(book.getTitle() + "," + book.getAuthor() + "," + book.getNumberOfPages());
        }


    }

}
