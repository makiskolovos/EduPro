package main;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.sql.SQLException;



public class Controller {

    private String pass1,pass2,pass3;
    @FXML
    private TextField u_name;
    @FXML
    private PasswordField pswd;




    @FXML
    public void login() throws SQLException, IOException {

        String username = u_name.getText();
        String password = pswd.getText();

        Login1(username);
        Login2(username);
        Login3(username);

        if (password.equals(this.pass1) ) {

            Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("students/student_homepage.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(part, 1200, 674));
            stage.show();
        }
        else if(password.equals(this.pass2)) {

            Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("professor/professor_homepage.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(part, 1200, 674));
            stage.show();
        }
        else if(password.equals(this.pass3)) {

            Parent part = FXMLLoader.load(getClass().getClassLoader().getResource("admin/admin_homepage.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(part, 1200, 674));
            stage.show();
        }
        else if(username.isEmpty() && password.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText("Your credentials are missing.");
            alert.setContentText("You forgot your username and your password.");

            alert.showAndWait();

        }
        else if(!username.isEmpty() && password.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText("Something is missing...");
            alert.setContentText("You forgot your password.");

            alert.showAndWait();

        }

        else if (username.isEmpty() && !password.isEmpty())   {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText("Something is missing...");
            alert.setContentText("You forgot your username.");

            alert.showAndWait();
        }

        else {
            System.out.println("Login failed");
        }

    }


    public void Login1(String user_username) throws SQLException{
        Connection conn = new DbConnection().connect();
         Statement statement1 = conn.createStatement();
         ResultSet resultSet1 = statement1.executeQuery("select * from students where username = '"+user_username+"' ");
            while(resultSet1.next()){
                this.pass1 =resultSet1.getString(5);
            }

    }

public void Login2(String professor_username) throws SQLException{
        Connection conn = new DbConnection().connect();
        Statement statement2 = conn.createStatement();
        ResultSet resultSet2 = statement2.executeQuery("select * from professors where username = '"+professor_username+"' ");
        while(resultSet2.next()){
            this.pass2 =resultSet2.getString(4);
        }
    }

    public void Login3(String admin_username) throws SQLException{
        Connection conn = new DbConnection().connect();
        Statement statement3 = conn.createStatement();
        ResultSet resultSet3 = statement3.executeQuery("select * from admin where username = '"+admin_username+"' ");
        while(resultSet3.next()){
            this.pass3 =resultSet3.getString(2);
        }
    }

}

    
