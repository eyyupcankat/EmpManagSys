package controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import routing.Routing;

public class girisController {
	@FXML
	private TextField usernameTextField;
	@FXML
	private TextField passwordTextField;
	@FXML
	private Button girisYapButon;
	
	
	
	@FXML
	public void girisYapButonKod() throws IOException {
		// anaSayfa.fxml aç
		Routing.sayfaAc("anaSayfa","MAAŞ TAKİP SİSTEMİ", true);
		// girisYapButon'un bulunduğu stage'i kapat
		Stage kapastage = (Stage) girisYapButon.getScene().getWindow(); // girisYapButon'un bulunduğu stage'i bir nesneye atama
		kapastage.close(); // alınan stage'i kapatma
		
	}
}
