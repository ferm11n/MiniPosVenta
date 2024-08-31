package com.ferm11n.ejfx;

import Modelo.Login;
import Modelo.LoginDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.PasswordAuthentication;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    private LoginDAO loginDAO = new LoginDAO();

    @FXML
    private void manejarLogin(ActionEvent event){
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (validateLogin(username, password)){
            openSistemaWindow(event);
        } else {
            showAlert("Login failed", "Invalid username or password.");
        }
    }

    private boolean validateLogin(String username, String password){
        // VALIDACION DEL LOGIN, IMPLEMENTAR LOGICA
        return "admin".equals(username) && "password".equals(password);
    }

    private void openSistemaWindow(ActionEvent event){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("src/main/java/Vista/Sistema.fxml"));
            Parent sistemaRoot = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(sistemaRoot);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


}
