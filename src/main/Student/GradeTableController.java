package main.students;

public class GradeTableController {

    String st_name, st_lastname, st_AM, subject_title, grade;
    public  GradeTableController(String st_name, String st_lastname, String st_AM, String subject_title, String grade){
        this.st_name = st_name;
        this.st_lastname = st_lastname;
        this.st_AM = st_AM;
        this.subject_title = subject_title;
        this.grade = grade;
    }
public String getSt_name(){
        return st_name;
    }
    public void setSt_name(String st_name){
        this.st_name =  st_name;
    }
    public String getSt_lastname(){
        return st_lastname;
    }
    public void setSt_lastname(String st_lastname){
        this.st_lastname =  st_lastname;
    }
    public String getSt_AM(){
        return st_AM;
    }
    public void setSt_AM(String st_AM){
        this.st_AM = st_AM;
    }
    public String getSubject_title(){
        return subject_title;
    }
    public void setSt_subject_title(String subject_title){
        this.subject_title =  subject_title;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade (String grade){
        this.grade =  grade;
    }
}
