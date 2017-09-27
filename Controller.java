package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
	
	@FXML ListView<Song> SongList;
	
	private ObservableList<Song> SongObsList;
	
	@FXML Button add;
	@FXML Button delete;
	@FXML Button edit;
	@FXML TextField Name;
	@FXML TextField Artist;
	@FXML TextField Album;
	@FXML TextField Year;
	
	public void start() {
		//create an ObservableList
		SongObsList = FXCollections.observableArrayList();
		SongList.setItems(SongObsList);
	}
	
	public void addSong(ActionEvent e) {
		
		//First check if fields are full
		if(Name.getText() == null || Name.getText().trim().isEmpty()){
			PopUp.display("Error", "Must enter a field into Song Name");
			return;
		}
		
		String name = Name.getText().trim();

		//Check if fields are already in list
		for(int i = 0; i < SongObsList.size(); i++) {
			if(SongObsList.get(i).getName().equals(name)){
				PopUp.display("Error", "Song already exists in list");
				return;
			}
		}
		/*
		if(SongObsList.contains(Name.getText())){
			PopUp.display("Error", "Song already exists in list");
			return;
		}*/
		
		Song song = new Song(name, "", "", "");
		SongObsList.add(song);
		
	}

}
