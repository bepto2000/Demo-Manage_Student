package controller;

import java.util.List;
import model.Student;
import model.Subject;


public interface DataController {

    int SUBJECT = 1;
    int STUDENT = 2;
    int REGISTERING = 3;
    String SUBJECT_FILE = "SUBJECT.DAT";
    String STUDENT_FILE = "STUDENT.DAT";
    String REGISTERING_FILE = "STU_REGISTER.DAT";

    <T> void writeToFile(List<T> data, String fileName);

    <T> List<T> readDataFromFile(String fileName);
    
    void sortSubjectByNameASC(List<Subject> subjects);
    
    void sortSubjectByNameDESC(List<Subject> subjects);
    
    void sortSubjectByNumOfLessonASC(List<Subject> subjects);
    
    void sortSubjectByNumOfLessonDESC(List<Subject> subjects);
    
    List<Subject> searchSubjectByName(List<Subject> subjects, String key);
    
    List<Subject> searchSubjectByLessonRange(List<Subject> subjects, 
            int fromVal, int toVal);
    
    void sortStudentByNameASC(List<Student> students);
    
    void sortStudentByNameDESC(List<Student> students);
    
    void sortStudentByStudentIdASC(List<Student> students);
    
    List<Student> searchStudentByName(List<Student> students, String name);
    
    List<Student> searchStudentById(List<Student> students, String id);
    
    List<Student> searchStudentByMajor(List<Student> students, String major);
}
