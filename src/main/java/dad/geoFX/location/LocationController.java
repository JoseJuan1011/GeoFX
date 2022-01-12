package dad.geoFX.location;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {

	@FXML
    private Label asnLabel;

    @FXML
    private Label hostnameLabel;

    @FXML
    private Label ipLabel;

    @FXML
    private Label registeredIspLabel;

    @FXML
    private Label typeLabel;

    @FXML
    private GridPane view;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public Label getAsnLabel() {
		return asnLabel;
	}

	public Label getHostnameLabel() {
		return hostnameLabel;
	}

	public Label getIpLabel() {
		return ipLabel;
	}

	public Label getRegisteredIspLabel() {
		return registeredIspLabel;
	}

	public Label getTypeLabel() {
		return typeLabel;
	}

	public GridPane getView() {
		return view;
	}
}
