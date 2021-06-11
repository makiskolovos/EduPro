package main.students;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;

public class ForumController {
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

    public TextArea main_body_id;
    public TextField forum_subject_id;
    @FXML
    private Button forum_post_id;
    
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
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/admin_class.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - Subjects");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
    }

    @FXML
    private void click_grades(MouseEvent mouseEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/admin_grades.fxml"));
        Stage stage = new Stage();
        stage.setTitle("EDU PRO - My Grades");
        stage.setScene(new Scene(part, 1200, 674));
        stage.show();
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
        Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("main/students/admin_announcements.fxml"));
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

