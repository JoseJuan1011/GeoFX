package dad.geoFX.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geoFX.location.LocationController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainController implements Initializable {

	@FXML
    private Button checkIpButton;

    @FXML
    private BorderPane connectionPane;

    @FXML
    private TextField ip_TextField;

    @FXML
    private BorderPane locationPane;

    @FXML
    private BorderPane securityPane;

    @FXML
    private VBox view;
	
    private LocationController locationController;
    
	public MainController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		locationController = new LocationController();
		
		locationPane.setCenter(locationController.getView());
	}

	@FXML
    void onCheckIpAction(ActionEvent event) {
		
    }

	public Button getCheckIpButton() {
		return checkIpButton;
	}

	public BorderPane getConnectionPane() {
		return connectionPane;
	}

	public TextField getIp_TextField() {
		return ip_TextField;
	}

	public BorderPane getLocationPane() {
		return locationPane;
	}

	public BorderPane getSecurityPane() {
		return securityPane;
	}

	public VBox getView() {
		return view;
	}
}
