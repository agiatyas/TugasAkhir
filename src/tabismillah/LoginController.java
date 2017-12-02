/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabismillah;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author Tyas
 */
public class LoginController implements Initializable {

    @FXML
    private TextField InUser;
    @FXML
    private PasswordField InPass;
    @FXML
    private Button btnLogin;
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        conn = koneksi.koneksi.koneksi();
    }    

    @FXML
    private void masuk(ActionEvent event) {
        String username=InUser.getText();
        String password=InPass.getText();
        String sql = "select * from login where username = ? && password = ?";
       
       try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            while(rs.next()){
                
            JOptionPane.showMessageDialog(null, "Berhasil");
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
                   
                }       
            
                catch (IOException e) {
                    System.out.println("Failed to create new Window." + e);
                }
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
}
