package dad.geoFX.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import dad.geoFX.connection.ConnectionController;
import dad.geoFX.location.LocationController;
import dad.geoFX.resources.Root;
import dad.geoFX.security.SecurityController;
import javafx.concurrent.Task;
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
    
    private ConnectionController connectionController;
    
    private SecurityController securityController;
    
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
		connectionController = new ConnectionController();
		securityController = new SecurityController();
		
		locationPane.setCenter(locationController.getView());
		connectionPane.setCenter(connectionController.getView());
		securityPane.setCenter(securityController.getView());
	}

	@FXML
    void onCheckIpAction(ActionEvent event) {
		Task<Root> getAPIDataTask = new Task<Root>() {

			@Override
			protected Root call() throws Exception {
				OkHttpClient client = new OkHttpClient();

				Request request = new Request.Builder()
					.url("https://ipapi.com/ip_api.php?ip=8.8.8.8")
					.get()
					.build();

				Response response = client.newCall(request).execute();
				
				String json = response.body().string();
				Gson gson = new GsonBuilder().create();
				
				Root root = gson.fromJson(json, Root.class);
				return root;
			}
			
		};
		
		getAPIDataTask.setOnSucceeded(e -> {
			try {
				LocationController.changeLocation(getAPIDataTask.get());
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			} catch (ExecutionException e1) {
				e1.printStackTrace();
			}
		});
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
