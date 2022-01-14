package dad.geoFX.security;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geoFX.resources.Root;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SecurityController implements Initializable {

	@FXML
    private CheckBox crawlerDetectedCheckBox;

    @FXML
    private Label potentialThreatTypesLabel;

    @FXML
    private CheckBox proxyDetectedCheckBox;

    @FXML
    private Label securityMessageLabel;

    @FXML
    private Label threatLevelLabel;

    @FXML
    private CheckBox torDetectedCheckBox;

    @FXML
    private GridPane view;
	
    private static SecurityModel model;
    
	public SecurityController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SecurityView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		model = new SecurityModel();
		
		Bindings.bindBidirectional(crawlerDetectedCheckBox.selectedProperty(), model.crawlerDetectedProperty());
		Bindings.bindBidirectional(potentialThreatTypesLabel.textProperty(), model.potentialThreatTypesProperty());
		Bindings.bindBidirectional(proxyDetectedCheckBox.selectedProperty(), model.proxyDetectedProperty());
		Bindings.bindBidirectional(securityMessageLabel.textProperty(), model.securityMessageProperty());
		Bindings.bindBidirectional(torDetectedCheckBox.selectedProperty(), model.torDetectedProperty());
	}
	
	public static void changeSecurity(Root root) {
		model.setCrawlerDetected(root.getSecurity().isIs_crawler());
		model.setPotentialThreatTypes(root.getSecurity().getThreat_types()+"");
		model.setProxyDetected(root.getSecurity().isIs_proxy());
//		model.setSecurityMessage(root.getSecurity());
		model.setTorDetected(root.getSecurity().isIs_tor());
	}

	public CheckBox getCrawlerDetectedCheckBox() {
		return crawlerDetectedCheckBox;
	}

	public Label getPotentialThreatTypesLabel() {
		return potentialThreatTypesLabel;
	}

	public CheckBox getProxyDetectedCheckBox() {
		return proxyDetectedCheckBox;
	}

	public Label getSecurityMessageLabel() {
		return securityMessageLabel;
	}

	public Label getThreatLevelLabel() {
		return threatLevelLabel;
	}

	public CheckBox getTorDetectedCheckBox() {
		return torDetectedCheckBox;
	}

	public GridPane getView() {
		return view;
	}

	public SecurityModel getModel() {
		return model;
	}
}
