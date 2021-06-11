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
