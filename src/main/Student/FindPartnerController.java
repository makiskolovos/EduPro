package main.students;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import main.DbConnection;

import java.io.IOException;

public class FindPartnerController {
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
    private TableView<String> tableView;
    @FXML
    private TableColumn<DbConnection,String> property;
    @FXML
    private TableColumn <DbConnection,String> first_name;
    @FXML
    private TableColumn <DbConnection,String> last_name;
    @FXML
    private TableColumn <DbConnection,String> AM;
    @FXML
    private TableColumn <DbConnection,String> username;
    @FXML
    private TableColumn <DbConnection,String> email;

