/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabismillah;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 * 
 *
 * @author Tyas
 */
public class HomeController implements Initializable{
    
    @FXML
    private TextField nama;

    @FXML
    private ComboBox judul;

    @FXML
    private DatePicker tanggal;

    @FXML
    private ComboBox jam;

    @FXML
    private TextField tempat;

    @FXML
    private TextField jumlah;

    @FXML
    private TextArea cetak;

    @FXML
    private Button btnOrder;

    @FXML
    private Button btnCancel;
    
    @FXML
    private Button btnShow;
    
     @FXML
    private Button btnFacilities;

    private void mouseclicked(ActionEvent event) {
        
        String daftar;
        String combo = judul.getValue().toString();
        String Date = tanggal.getValue().toString();
        String tayang = jam.getValue().toString();
        
        String duduk,tiket;
        duduk = tempat.getText();
        daftar = nama.getText();
        tiket = jumlah.getText();
        
        cetak.setText("Nama     \t: \t"+daftar+
                      "\nFilm     : \t"+combo+
                      "\nTanggal :\t"+Date+
                      "\nTempat duduk : \t"+duduk+
                      "\nBanyak tiket :\t"+tiket);
    }

    private void cancel(ActionEvent event) {
         try {
                    // Hide this current window (if this is what you want)
                    ((Node)(event.getSource())).getScene().getWindow().hide();

                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("login.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Joss");
                    stage.show();

                } catch (IOException e) {
                    System.out.println("Failed to create new Window." + e);
                }
    }
    @FXML
    private void Show(ActionEvent event) {
         try {
                    // Hide this current window (if this is what you want)
                    ((Node)(event.getSource())).getScene().getWindow().hide();

                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("tayang.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Joss");
                    stage.show();

                } catch (IOException e) {
                    System.out.println("Failed to create new Window." + e);
                }
    }
    
        @FXML
    void Facilities(ActionEvent event) {
             try {
                    // Hide this current window (if this is what you want)
                    ((Node)(event.getSource())).getScene().getWindow().hide();

                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("fasilitas.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());

                    // Create new stage (window), then set the new Scene
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Joss");
                    stage.show();

                } catch (IOException e) {
                    System.out.println("Failed to create new Window." + e);
                }
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        jam.getItems().addAll("pk = 15.30","pk = 18.45","pk = 20.00");
        judul.getItems().addAll("Maleficent","Maze Runner Scorch Trial","Beauty and the beast");
    }

    @FXML
    private void mouseClicked(ActionEvent event) {
    }
}
    

