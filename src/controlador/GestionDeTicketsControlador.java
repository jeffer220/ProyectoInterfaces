/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gp
 */
public class GestionDeTicketsControlador implements Initializable {
    
    
    @FXML
    private Button buttonCrearTicket;
    @FXML
    private Button buttonColaDeAtencionTickets;
    @FXML
    private Button buttonActualizacionTickets;
    

    @FXML
    private void handleCrearTicket(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader(getClass().getResource("/vista/CrearNuevoTicketVista.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(GestionDeTicketsControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    @FXML
    private void handleColaDeAtencion(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader(getClass().getResource("/vista/ColaDeAtencionTicketsVista.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(GestionDeTicketsControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }    
 
    @FXML
    private void handleActualizacionTicket(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader(getClass().getResource("/vista/ActualizacionTicketVista.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(GestionDeTicketsControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }     
    
    @FXML
    private void handleBtnCancelar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/OpcionesVista.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EliminarFlujoDeTrabajoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
