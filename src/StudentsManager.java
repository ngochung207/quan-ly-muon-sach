import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentsManager {
    private Map<String, Students> studentsList = new HashMap<>();

    public StudentsManager() {
    }
    public void addNewStudent(Students s){
        studentsList.put(s.getId(), s);
    }
    public Students getStudentByID(String id){
        return studentsList.get(id);
    }
    public String getNameStudentByID(String id){
        Students student = getStudentByID(id);
        return student.getName();
    }
    public Set listStudents(){
        return studentsList.keySet();
    }

}
