package com.griffinpoole.todolist;

import com.griffinpoole.todolist.datamodel.TodoData;
import com.griffinpoole.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    public void processResults(){
        String shortDesc = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadline = deadlinePicker.getValue();

        TodoData.getInstance().addTodoItem(new TodoItem(shortDesc, details, deadline));
    }

}
