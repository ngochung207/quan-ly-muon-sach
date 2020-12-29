import java.util.HashMap;
import java.util.Map;

public class BooksManager {
    private Map<String, Books> booksList = new HashMap<>();

    public BooksManager() {
    }
    public void addNewBook(Books b){
        booksList.put(b.getCodeBook(),b);
    }
    public Books getBookByID(String id){
        return booksList.get(id);
    }
    public String getNameBookByID(String id){
        Books book = getBookByID(id);
        return book.getNameBook();
    }

}
