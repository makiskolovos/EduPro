package main.professor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Professor_GradesController {
    @FXML
    private Button logout_p;
    @FXML
    private Button home_p;
    @FXML
    private Button class_p;
    @FXML
    private Button grade_p;
    @FXML
    private Button messages_p;
    @FXML
    private Button notes_p;
    @FXML
    private Button announcements_p;
    @FXML
    private Button forum_p;
    @FXML
    private Button profile_p;
    @FXML
    private Button students_id;
    @FXML
    private Button professor_id;



    @FXML
    private void professor_logout(ActionEvent actionEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/login.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Homepage");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_home_p(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/professor/professor_homepage.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Homepage");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_class_p(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/professor/professor_class.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Subjects");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_grades_p(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/professor/professor_grades.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Grades");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_messages_p(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/professor/professor_messages.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Messages");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

    @FXML
    private void click_notes_p(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/professor/professor_notes.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Notes");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_announcements_p(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/professor/professor_announcements.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Announcements");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_forum_p(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/professor/professor_forum.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Forum");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
    @FXML
    private void click_profile_p(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/professor/professor_profile.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - My Profile");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }
}
