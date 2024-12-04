package controller;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import routing.Routing;
import personel.Personel;

public class Controller {
	@FXML
	public static Button ekleButon;
	@FXML
	private TextField aramaTextField;
	@FXML
	public TableView<Personel> tableView;
	@FXML
	private TableColumn<Personel,Double> personelNoColumn;
	@FXML
	private TableColumn<Personel, String> isimColumn;
	@FXML
	private TableColumn<Personel, String> soyisimColumn;
	@FXML
	private TableColumn<Personel, String> pozisyonColumn;
	@FXML
	private TableColumn<Personel, Integer> yasColumn;
	@FXML
	public static ObservableList<Personel> personelList = FXCollections.observableArrayList();
	
	@FXML
	public void initialize() {
	personelNoColumn.setCellValueFactory(new PropertyValueFactory<Personel,Double>("personelNo"));
    isimColumn.setCellValueFactory(new PropertyValueFactory<Personel,String>("isim"));
    soyisimColumn.setCellValueFactory(new PropertyValueFactory<Personel,String>("soyisim"));
    pozisyonColumn.setCellValueFactory(new PropertyValueFactory<Personel,String>("pozisyon"));
    yasColumn.setCellValueFactory(new PropertyValueFactory<Personel,Integer>("yas"));
    if (personelList!=null){
    	tableView.setItems(personelList);
    	}
	}
	
	@FXML
	public  void ekleButonKod() throws IOException {
		Routing.sayfaAc("ekleSayfasi", "MAAŞ TAKİP SİSTEMİ", false);
	}


}
