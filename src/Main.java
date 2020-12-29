import java.util.*;

public class Main {
    static StudentsManager studentsManager = new StudentsManager();
    static BooksManager booksManager = new BooksManager();
    static CardManager cardManager = new CardManager();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer chose = 0;
        do {
            showMenu();
            chose = Integer.parseInt(sc.nextLine());
            switch (chose) {
                case 1:
                    // Khai báo sách trong thư viện.
                    addBooks();
                    break;
                case 2:
                    // Khai báo thông tin sinh viên.
                    addStudent();
                    break;
                case 3:
                    // Tạo mới lượt mượn sách.
                    createNewCard();
                    break;
                case 4:
                    // In ra sách được mượn.
                    showAllInfoBooks();
                    System.out.println();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (true);

    }

    public static void showMenu() {
        System.out.println("01. Khai báo sách trong thử viện");
        System.out.println("02. Khai báo thông tin sinh viên");
        System.out.println("03. Tạo mới lượt mượn sách");
        System.out.println("04. In ra toàn bộ danh sách Books");
        System.out.println("05. Exit");
    }

    public static void addBooks() {
        System.out.print("Nhập mã sách: ");
        String codeBook = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String nameBook = sc.nextLine();
        System.out.print("Nhập mô tả sách: ");
        String infoBook = sc.nextLine();
        Books newBook = new Books(codeBook, nameBook, infoBook);
        booksManager.addNewBook(newBook);
    }

    public static void addStudent() {
        System.out.print("Nhập mã sinh viên: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập khoa sinh viên: ");
        String faculty = sc.nextLine();
        Students newStudent = new Students(id, name, faculty);
        studentsManager.addNewStudent(newStudent);
    }

    public static void createNewCard() {
        // Tạo danh sách mượn sách. Chứa danh sách các sách mượn.
        List<Books> listBooks = new ArrayList<>();
        System.out.print("Nhập mã thẻ: ");
        String id = sc.nextLine();
        // Từ mã thẻ lấy ra thông tin sinh viên.
        Students stu = studentsManager.getStudentByID(id);
        System.out.println(stu.getName());
        System.out.print("Ngày mượn: ");
        String mDate = sc.nextLine();
        System.out.print("Ngày trả: ");
        String tDate = sc.nextLine();
        sc.nextLine();
        do {
            System.out.print("Nhập mã sách: ");
            String code = sc.nextLine();
            // Từ mã sách lấy ra thông tin sách.
            Books book = booksManager.getBookByID(code);
            System.out.println(book.getNameBook());
            // Thêm vào dánh sách mượn sách.
            listBooks.add(book);
            sc.nextLine();
            System.out.print("Có mượn thêm sách không ? (Y/N): ");
            if (sc.nextLine().equals("N")) break;
        } while (true);
        // Tạo đối tượng CardLibray.
        CardLibrary cardLibrary = new CardLibrary(id, mDate, tDate, stu, listBooks);
        // Đưa thông tin vào quản lý mượn sách.
        cardManager.addCardLibraryManager(cardLibrary);
    }

    public static void showInfoBookByID(String id) {
        CardLibrary cardLibrary = cardManager.getCardLibraryByID(id);
        String mDate = cardLibrary.getmDate();
        String tDate = cardLibrary.gettDate();
        List<Books> listBooks = cardLibrary.getBooks();
        for (Books book : listBooks) {
            String codeBook = book.getCodeBook();
            String nameBook = book.getNameBook();
            System.out.printf("\n%-10s%-25s%-15s%-15s",
                    codeBook,
                    nameBook,
                    mDate,
                    tDate);
        }
    }

    public static void showAllInfoBooks() {
        Boolean print = true;
        for (Object key : cardManager.listKeys()) {
            String id = (String) key;
            Students students = cardManager.getCardLibraryByID(id).getStudent();
            System.out.print("Mã sinh viên: " + students.getId() + " Tên sinh viên: " + students.getName());
            if (print){
                showTitleCard();
                print = false;
            }
            showInfoBookByID(id);
        }
    }

    public static void showTitleCard() {
        System.out.printf("\n%-10s%-25s%-15s%-15s"
                , "Mã sách"
                , "Tên sách"
                , "Ngày mượn"
                , "Ngày trả");
    }

}
