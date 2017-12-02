package tabismillah;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FasilitasController {

    @FXML
    private Button btnBack;
 
    @FXML
    void Back(ActionEvent event) {
 try {
                    // Hide this current window (if this is what you want)
                    ((Node)(event.getSource())).getScene().getWindow().hide();

                    // Load the new fxml
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("home.fxml"));
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

}
