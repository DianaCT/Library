package BookType;

import LibraryMain.Books;

public class Novel extends Books {
    private String category;
    public String getCategory() {
        return category;
    }
    public void setCategory(String newCategory) {
        category= newCategory;
    }
    public Novel(){

    }

    public Novel(String title,String author,Integer numberOfPages,String category){

    }

}
