/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restjavaclient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import io.restjava.core.RestJava;
/**
 *
 * @author devinceble
 */
public class RestJavaClientMainController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Initializing RestJava");
        RestJava test = new RestJava();
        test.init();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Running RestJava Client");
    }    
}
