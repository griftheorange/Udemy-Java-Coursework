package com.griffinpoole.todolist;

import com.griffinpoole.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

    @FXML
    private ListView todoListView;

    @FXML
    private TextArea descriptionTextArea;

    public void initialize(){
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John", LocalDate.of(2020, Month.JULY, 15));
        TodoItem item2 = new TodoItem("Doctors Appointment", "See Dr. Smith at 123 Main Street. Bring paperwork", LocalDate.of(2020, Month.MAY, 23));
        TodoItem item3 = new TodoItem("Finish desing proposal for FZ", "Promised FZ I;d storyboard the game by Friday", LocalDate.of(2020, Month.APRIL, 30));
        TodoItem item4 = new TodoItem("Feed Willow and Maple", "Need to feed them vegetables, all the vegetables. Growing Guinea Pigs need a whole lot of vegetables", LocalDate.of(2020, Month.APRIL, 20));
        TodoItem item5 = new TodoItem("Clean room", "Dishes piling up again, need to bus them downstairs", LocalDate.of(2020, Month.DECEMBER, 15));

        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    public void handleClickListView(){
        TodoItem item = (TodoItem) todoListView.getSelectionModel().getSelectedItem();
        StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n\n");
        sb.append("Due: ");
        sb.append(item.getDeadLine().toString());
        descriptionTextArea.setText(sb.toString());
    }
}