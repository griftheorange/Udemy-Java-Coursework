package com.griffinpoole.todolist;

import com.griffinpoole.todolist.datamodel.TodoData;
import com.griffinpoole.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class Controller {
    private List<TodoItem> todoItems;

    @FXML
    private ListView todoListView;
    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private Label deadlineLabel;
    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private ContextMenu listContextMenu;

    public void initialize(){
//        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John", LocalDate.of(2020, Month.JULY, 15));
//        TodoItem item2 = new TodoItem("Doctors Appointment", "See Dr. Smith at 123 Main Street. Bring paperwork", LocalDate.of(2020, Month.MAY, 23));
//        TodoItem item3 = new TodoItem("Finish design proposal for FZ", "Promised FZ I'd storyboard the game by Friday", LocalDate.of(2020, Month.APRIL, 30));
//        TodoItem item4 = new TodoItem("Feed Willow and Maple", "Need to feed them vegetables, all the vegetables. Growing Guinea Pigs need a whole lot of vegetables", LocalDate.of(2020, Month.APRIL, 20));
//        TodoItem item5 = new TodoItem("Clean room", "Dishes piling up again, need to bus them downstairs", LocalDate.of(2020, Month.DECEMBER, 15));
//
//        todoItems = new ArrayList<>();
//        todoItems.add(item1);
//        todoItems.add(item2);
//        todoItems.add(item3);
//        todoItems.add(item4);
//        todoItems.add(item5);
//
//        TodoData.getInstance().setTodoItems(todoItems);
        listContextMenu = new ContextMenu();
        MenuItem deleteMenuItem = new MenuItem("Delete");
        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                TodoItem item = (TodoItem) todoListView.getSelectionModel().getSelectedItem();
                deleteItem(item);
            }
        });
        listContextMenu.getItems().addAll(deleteMenuItem);
        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observable, TodoItem oldValue, TodoItem newValue) {
                if(newValue != null){
                    TodoItem item = (TodoItem) todoListView.getSelectionModel().getSelectedItem();
                    descriptionTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadlineLabel.setText(df.format(item.getDeadLine()));
                }
            }
        });

        todoListView.setItems(TodoData.getInstance().getTodoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();

        todoListView.setCellFactory(new Callback<ListView<TodoItem>, ListCell<TodoItem>>() {
            @Override
            public ListCell<TodoItem> call(ListView<TodoItem> listView) {
                ListCell<TodoItem> cell = new ListCell<TodoItem>(){
                    @Override
                    protected void updateItem(TodoItem todoItem, boolean empty) {
                        super.updateItem(todoItem, empty);
                        if(empty){
                            setText(null);
                        } else {
                            setText(todoItem.getShortDescription());
                            if(todoItem.getDeadLine().isBefore(LocalDate.now().plusDays(1))){
                                setTextFill(Color.RED);
                            } else if(todoItem.getDeadLine().equals(LocalDate.now().plusDays(1))){
                                setTextFill(Color.BROWN);
                            }
                        }
                    }
                };

                cell.emptyProperty().addListener(
                        (obs, wasEmpty, isNowEmpty) -> {
                            if(isNowEmpty){
                                cell.setContextMenu(null);
                            } else {
                                cell.setContextMenu(listContextMenu);
                            }
                        }
                );

                return cell;
            }
        });
    }

    @FXML
    public void showNewItemDialog() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("A New Todo Item");
        dialog.setHeaderText("The Dialog's header text");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("todoItemDialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch(IOException e){
            System.out.println("Couldn't Load the Dialog");
            e.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK){
            DialogController controller = fxmlLoader.getController();
            TodoItem newItem = controller.processResults();
            todoListView.getSelectionModel().select(newItem);
        }

    }

    public void deleteItem(TodoItem item){
         Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
         alert.setTitle("Delete Todo Item");
         alert.setHeaderText("Delete item: " + item.getShortDescription());
         alert.setContentText("Are you sure? Press OK to confirm, or cancel to back out.");
         Optional<ButtonType> result = alert.showAndWait();
         if(result.isPresent() && result.get() == ButtonType.OK){
             TodoData.getInstance().deleteTodoItem(item);
         }
    }

}