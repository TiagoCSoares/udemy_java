package org.example.javafx1.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import org.example.javafx1.model.entities.Person;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PersonsController implements Initializable {

    @FXML
    private ComboBox<Person> comboBoxPerson;
    @FXML
    private Button btAll;

    //Tipo de lista que fica associado ao ComboBox

    private ObservableList<Person> obsListPersons;

    @FXML
    public void onComboBoxPersonAction() {
        Person person = comboBoxPerson.getSelectionModel().getSelectedItem();
        System.out.println(person);
    }

    @FXML
    public void onBtAllAction() {
        for (Person person : comboBoxPerson.getItems()) {
            System.out.println(person);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Maria", "maria@gmail.com"));
        list.add(new Person(2, "Alex", "alex@gmail.com"));
        list.add(new Person(3, "Bob", "bob@gmail.com"));

        // Instanciando a lista observável
        obsListPersons = FXCollections.observableArrayList(list);
        comboBoxPerson.setItems(obsListPersons);

        Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
            @Override
            protected void updateItem(Person item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty ? "" : item.getId() + "-" + item.getName());
            }
        };
        comboBoxPerson.setCellFactory(factory);
        comboBoxPerson.setButtonCell(factory.call(null));
    }
}
