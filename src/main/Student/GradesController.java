package main.students;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import main.DbConnection;


import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GradesController {
    @FXML
    private Button logout;
    @FXML
    private Button home_id;
    @FXML
    private Button class_id;
    @FXML
    private Button grade_id;
    @FXML
    private Button messages_id;
    @FXML
    private Button notes_id;
    @FXML
    private Button announcements_id;
    @FXML
    private Button forum_id;
    @FXML
    private Button guide_id;
    @FXML
    private Button partner_id;
    @FXML
    private Button profile_id;
    @FXML
    private TableView <GradeTableController>tableGrades;
    @FXML
    private TableColumn <GradeTableController,String> subject_title_id;
    @FXML
    private TableColumn <GradeTableController,String> grades_id;
    @FXML
    private TableColumn <GradeTableController,String> student_name_grade;
    @FXML
    private TableColumn <GradeTableController,String> student_lname_grade;
    @FXML
    private TableColumn <GradeTableController,String> student_AM;

    ObservableList <GradeTableController> observableList = FXCollections.observableArrayList();

   public void setTableGrades(){
        try{
           Connection conn = new DbConnection().connect();
           ResultSet resultSet = conn.createStatement().executeQuery("select * from grades ");
           while(resultSet.next()){
               observableList.add(new GradeTableController(resultSet.getString("st_name"),resultSet.getString("st_lastname"),resultSet.getString("AM"),resultSet.getString("subject_title"),resultSet.getString("grade")));
           }
        }
        catch (SQLException e){
            Logger.getLogger(GradesController.class.getName()).log(Level.SEVERE, null,e);
        }

       student_name_grade.setCellValueFactory(new PropertyValueFactory<>("st_name"));
       student_lname_grade.setCellValueFactory(new PropertyValueFactory<>("st_lastname"));
       student_AM.setCellValueFactory(new PropertyValueFactory<>("AM"));
       subject_title_id.setCellValueFactory(new PropertyValueFactory<>("subject_title"));
       grades_id.setCellValueFactory(new PropertyValueFactory<>("grade"));

       tableGrades.setItems(observableList);

   }



    @FXML
    private void click_logout(ActionEvent actionEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/login.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Homepage");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

    @FXML
    private void click_home(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/under_student_homepage.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Homepage");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

    @FXML
    private void click_class(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/class.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Subjects");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

    @FXML
    private void click_grades(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/grades.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - My Grades");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
        setTableGrades();
    }

    @FXML
    private void click_messages(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/messages.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Messages");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

    @FXML
    private void click_notes(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/notes.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - My Notes");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

    @FXML
    private void click_announcements(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/announcements.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Announcements");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

    @FXML
    private void click_forum(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/forum.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Forum");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

    @FXML
    private void click_guide(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/student_guide.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Student Guide");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

    @FXML
    private void click_partner(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/find_partner.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Find Partner");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

    @FXML
    private void click_profile(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/under_student_profile.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - My Profile");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

}
