public class Students {
    private String id;
    private String name;
    private String faculty;

    public Students() {
    }

    public Students(String id, String name, String faculty) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Thông tin sinh viên: " + '\n' +
                "Mã số: " + id + '\n' +
                "Họ & tên: " + name + '\n' +
                "Sinh viên khoa: " + faculty + '\n';
    }
}
