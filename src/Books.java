public class Books {
    private String codeBook;
    private String nameBook;
    private String infoBook;

    public Books() {
    }

    public Books(String codeBook, String nameBook, String infoBook) {
        this.codeBook = codeBook;
        this.nameBook = nameBook;
        this.infoBook = infoBook;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getInfoBook() {
        return infoBook;
    }

    public void setInfoBook(String infoBook) {
        this.infoBook = infoBook;
    }

}
