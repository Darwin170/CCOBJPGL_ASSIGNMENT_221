import java.io.IOException;

import javax.swing.Action;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginController {
    @FXML   
    TextField myuserfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button loginbutton;

    @FXML
    Label mywarninglabel;
    public void login(ActionEvent event) throws IOException{
        String username = myuserfield.getText();
        String password = mypasswordfield.getText();

                if(username.equals("laki_ng_ano") && password.equals("jumbohotdog")){
            System.out.println("Login Successful");
            Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage ) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }
        else{
           mywarninglabel.setVisible(true); 
        }
       
    }

}
