package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Objects;

public class Controller {
    private BooleanFunction booleanFunction;
    private Boolean resultOfFunction ;

    @FXML
    private ToggleButton btn0;

    @FXML
    private ToggleGroup function;

    @FXML
    private ToggleButton btn1;

    @FXML
    private ToggleButton btn4;

    @FXML
    private ToggleButton btn8;

    @FXML
    private ToggleButton btn12;

    @FXML
    private ToggleButton btn13;

    @FXML
    private ToggleButton btn9;

    @FXML
    private ToggleButton btn14;

    @FXML
    private ToggleButton btn15;

    @FXML
    private ToggleButton btn11;

    @FXML
    private ToggleButton btn10;

    @FXML
    private ToggleButton btn5;

    @FXML
    private ToggleButton btn6;

    @FXML
    private ToggleButton btn7;

    @FXML
    private ToggleButton btn2;

    @FXML
    private ToggleButton btn3;

    @FXML
    private ChoiceBox<String> firstOperand;

    @FXML
    private ChoiceBox<String> secondOperand;

    @FXML
    private Button Apply;

    @FXML
    private Label result;

    @FXML
    private void initialize() {
        firstOperand.setItems(FXCollections.observableArrayList("0", "1", "null"));
        secondOperand.setItems(FXCollections.observableArrayList("0", "1", "null"));
        btn0.setSelected(true);
        booleanFunction = new BooleanFunction();
        resultOfFunction = new Boolean(false);
        btn0.setOnAction(e->{
            if (btn0.isSelected())
            btn0.getStyleClass().add("toggle-button:selected");
        });


    }


    public void getResult(ActionEvent actionEvent) {

        if (firstOperand.getValue().equals("0")) booleanFunction.setFirstOperand(false);
        else if (firstOperand.getValue().equals("1")) booleanFunction.setFirstOperand(true);
        else booleanFunction.setFirstOperand(null);

        if (secondOperand.getValue().equals("0")) booleanFunction.setSecondOperand(false);
        else if (secondOperand.getValue().equals("1")) booleanFunction.setSecondOperand(true);
        else booleanFunction.setSecondOperand(null);


        String temp = String.valueOf(function.getSelectedToggle());

        System.out.println(temp);
        switch (temp) {
            case "ToggleButton[id=btn0, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction != null ? booleanFunction.falseFunction() : null;
                break;

            case "ToggleButton[id=btn1, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.and();
                break;

            case "ToggleButton[id=btn2, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.xAndNotY();
                break;

            case "ToggleButton[id=btn3, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.x();
                break;

            case "ToggleButton[id=btn4, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.notXAndY();
                break;

            case "ToggleButton[id=btn5, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.y();
                break;

            case "ToggleButton[id=btn6, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.xor();
                break;

            case "ToggleButton[id=btn7, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.or();
                break;

            case "ToggleButton[id=btn8, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.nor();
                break;

            case "ToggleButton[id=btn9, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.xnor();
                break;

            case "ToggleButton[id=btn10, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.notY();
                break;

            case "ToggleButton[id=btn11, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.xOrNotY();
                break;

            case "ToggleButton[id=btn12, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.notX();
                break;

            case "ToggleButton[id=btn13, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.notXorY();
                break;
            case "ToggleButton[id=btn14, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.nand();
                break;

            case "ToggleButton[id=btn15, styleClass=toggle-button]''":
                resultOfFunction = booleanFunction.trueFunction();
                break;
        }
        if( resultOfFunction == null) result.setText("null");
        else result.setText(String.valueOf(resultOfFunction));





    }
}

