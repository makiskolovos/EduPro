package main.students;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;

public class PostMessages  {


    @FXML
    private Button home_post;
    @FXML
    private Button class_post;
    @FXML
    private Button grade_post;
    @FXML
    private Button messages_post;
    @FXML
    private Button notes_post;
    @FXML
    private Button announcements_post;
    @FXML
    private Button forum_post;
    @FXML
    private Button profile_post;
    @FXML
    private Button logout;


    @FXML
    private void click_home_post(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/post_student_homepage.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Homepage");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_class_post(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/post_student_class.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Subjects");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_grades_post(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/post_student_grades.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Grades");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_messages_post(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/post_student_messages.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Messages");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_notes_post(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/post_student_notes.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Notes");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_announcements_post(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/post_student_announcements.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Announcements");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_forum_post(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/post_student_forum.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Forum");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_profile_post(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/post_student_profile.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - My profile");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_logout(ActionEvent actionEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/login.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Homepage");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
}
