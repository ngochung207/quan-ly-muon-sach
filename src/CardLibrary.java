import java.util.List;

public class CardLibrary {
    private String id;
    private String mDate;
    private String tDate;
    private Students student;
    private List<Books> books;

    public CardLibrary() {
    }

    public CardLibrary(String id, String mDate, String tDate, Students student, List<Books> books) {
        this.id = id;
        this.mDate = mDate;
        this.tDate = tDate;
        this.student = student;
        this.books = books;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String gettDate() {
        return tDate;
    }

    public void settDate(String tDate) {
        this.tDate = tDate;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}
