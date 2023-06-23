package aims.src.screen;

import aims.src.cart.Cart;
import aims.src.media.Media;
import aims.src.media.Playable;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.event.ChangeListener;
import javax.swing.table.TableColumn;
import java.awt.event.ActionEvent;

public class CartScreenController {
    private  Cart cart;

    @FXML private TableView<Media> tblMedia;
    @FXML private TableColumn<Media, String> colMediaTitle;
    @FXML private TableColumn<Media, String> colMediaCategory;
    @FXML private TableColumn<Media, Float> colMediaCost;

    public CartScreenController(Cart cart){
        super();
        this.cart = cart;
    }

    @FXML
    private void initialize() {
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCallValueFactory(
                new PropertyValueFactory<Media, Float>("cost"));
        tblMedia.setItems(this.cart.getItemsOrdered());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.setSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                        if (newValue != null) {
                            updateButtonBar(newValue);
                        }
                    }

                    void updateButtonBar(Media media) {
                        btnRemove.setVisible(true);
                        if (media instanceof Playable) {
                            btnPlay.setVisible(true);
                        }
                        else {
                            btnPlay.setVisible(false);
                        }
                    }
                }
        );
    }

    @FXML
    void btnRemovePressed(ActionEvent event){
        Media media = tblMedia.setSelectionModel().getSelectedItem();
        cart.removeMedia(media);
    }

}
