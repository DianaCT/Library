package LibraryMain;

import BookType.Album;
import BookType.Novel;
import BookType.PaperQuality;
import BookType.ScienceBook;
import Support.ReadFromConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CatalogMain {
    public static void main(String... args) {

        PaperQuality deni34 = new PaperQuality();
        Album firstAlbum = new Album("ModernArt", "ArtSociety", 20, deni34);
        Novel firstNovel = new Novel("Ciresarii", "Constantin Chiriță", 560, "adventure");
        Novel secondNovel = new Novel("Fundatia", "Isac Asimov", 480, "SF");
        ScienceBook firstSBook = new ScienceBook("Fizica povestita", "Cristian Presura", 1045, "Phizics");
        ScienceBook secondSBook = new ScienceBook("Chimie", "Artur Pottery", 345, "Chemistry");
        ScienceBook thirdSBook = new ScienceBook("Astrofizica", "Artur Pottery", 434, "astronomy");
        Books librarybooks = new Books();
        Album secondAlbum = new Album();



        List<Books> book = new CopyOnWriteArrayList<>();
        book.add(firstAlbum);
        book.add(firstNovel);
        book.add(secondNovel);
        book.add(firstSBook);
        book.add(secondSBook);
        book.add(thirdSBook);


        for (Books n : book){
            System.out.println(n.getTitle()+ "," + n.getAuthor() + "," + n.getNmberOfPages());
        }





        System.out.println("If you want to add a book press 1, if you want to erase a book press 2");
        Integer answer;
        String answerstring;
        ReadFromConsole citeste = new ReadFromConsole();
        answer = citeste.citesteint ( );
        if (answer == 1) {
            System.out.println("for novels press 1, for album press 2, for science book press 3");
            answer = citeste.citesteint();
             switch (answer){
             case (1): Novel novel1 = new Novel();
                        System.out.println("title of the novel");
                        answerstring = citeste.citesteString();
                        novel1.setTitle(answerstring);
                        book.add(novel1);
                        break;
                        case (2): Album album1 = new Album();
                                  System.out.println("title of the album");
                                  answerstring = citeste.citesteString();
                                  album1.setTitle(answerstring);
                                  book.add(album1);
                                  break;
                            case (3): ScienceBook sciencebook1 = new ScienceBook();
                                      System.out.println("title of the science book");
                                      answerstring = citeste.citesteString();
                                      sciencebook1.setTitle(answerstring);
                                      book.add(sciencebook1);
                                      break;

             }

        } else {
            System.out.println("Please select the title of  the book you want to remove");
            answerstring = citeste.citesteString();
            String title;
            for  (Books n : book) {
                title = n.getTitle();
                if (answerstring.equals(title)){
                    book.remove(n);
                }
            }


        }


        for (Books n : book){
            System.out.println(n.getTitle()+ "," + n.getAuthor() + "," + n.getNmberOfPages());
        }



    }

}
