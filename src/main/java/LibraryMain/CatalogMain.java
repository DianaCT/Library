package LibraryMain;

import BookType.Album;
import BookType.Novel;
import BookType.PaperQuality;
import BookType.ScienceBook;
import Support.ReadFromConsole;

import java.util.ArrayList;
import java.util.List;

public class CatalogMain {
    public static void main(String... args) {

        PaperQuality deni34 = new PaperQuality();
        Album firstAlbum = new Album("ModernArt", "ArtSociety", 20, deni34);
        Novel firstNovel = new Novel("Ciresarii", "Constantin Chiriță", 560, "adventure");
        Novel secondNovel = new Novel("Fundatia", "Isac Asimov", 480, "SF");
        ScienceBook firstSBook = new ScienceBook("Fizica povestita", "Cristian Presura", 1045, "Phizics");
        ScienceBook secondSBook = new ScienceBook("Chimie", "Artur Pottery", 345, "Chemistry");
        ScienceBook thirdSBook = new ScienceBook("Astrofizica", "Artur Pottery", 434, "astronomy");
        Album secondAlbum = new Album();



        List<Books> book = new ArrayList<>();
        book.add(firstAlbum);
        book.add(firstNovel);
        book.add(secondNovel);
        book.add(firstSBook);
        book.add(secondSBook);
        book.add(thirdSBook);



        System.out.println(book);
        firstAlbum.erase();



        System.out.println("If you want to add a book press 1, if you want to erase a book press 2");
        Integer answer;
        ReadFromConsole citeste = new ReadFromConsole();
        answer = citeste.citesteint ( );
        if (answer == 1){
            book.add(1,secondAlbum);

        } else {
            book.remove(3);

        }


        System.out.println(book);



    }

}
