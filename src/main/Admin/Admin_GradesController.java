package main.admin;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;

public class Admin_GradesController  {
    @FXML
    private Button logout_a;
    @FXML
    private Button home_admin;
    @FXML
    private Button class_admin;
    @FXML
    private Button grades_admin;
    @FXML
    private Button messages_admin;
    @FXML
    private Button announcements_admin;
    @FXML
    private Button students_id;
    @FXML
    private Button professors_admin;






    @FXML
    private void admin_logout(ActionEvent actionEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/login.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Homepage");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_home_admin(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/admin/admin_homepage.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Homepage");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_class_admin(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/admin/admin_class.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Subjects");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_grade_admin(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/admin/admin_grades.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Grades");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_announcements_admin(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/admin/admin_announcements.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Announcements");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_students(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/admin/students.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Students");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_professors(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/admin/professors.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Professors");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }



}
