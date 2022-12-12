package com.georgiancollegeguiassignment3.diyapatel_assignment3;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.Random;

public class ClassSeatArrangment {
    @FXML
    TextField Name;
    @FXML
    Label errormsg;
    @FXML
    ColorPicker Color;
    @FXML
    Rectangle ps7,ps1,ps2,ps3,ps4,ps5,ps6,ps8,ps9;
    @FXML
    Label n3,n7,n4,n2,n1,n5,n6,n8,n9;

    ArrayList<Object> Colorlist=new ArrayList<>();
    ArrayList<Integer> Studentlist=new ArrayList<>();
    @FXML
    protected void onButtonClick() {
        errormsg.setText("");

        if(Name.getText().isEmpty()){
            errormsg.setText("Name is empty");

        }
        else {
            checkSeats();
        }

    }

    private void checkSeats() {

        Random random=new Random();
        int rndint= random.nextInt(9);

        if(Studentlist.size()<9){
            if(Studentlist.contains(rndint)){
                checkSeats();
            } else{
                fillseats(rndint);
            }
        }
        else {
            errormsg.setText("no seats available");
        }
    }

    private void fillseats(int i) {
        if (Colorlist.contains(Color.getValue())){
            errormsg.setText("color is already present");
        }
        else {
            if(i==0){
                ps1.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n1.setText(Name.getText());
                Colorlist.add(Color.getValue());
                Studentlist.add(i);

            }
            if(i==1){
                ps2.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n2.setText(Name.getText());
                Colorlist.add(Color.getValue());
                Studentlist.add(i);
            }
            if(i==2){
                ps3.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n3.setText(Name.getText());
                Colorlist.add(Color.getValue());
                Studentlist.add(i);

            }
            if(i==3){
                ps4.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n4.setText(Name.getText());
                Colorlist.add(Color.getValue());
                Studentlist.add(i);

            }
            if(i==4){
                ps5.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n5.setText(Name.getText());
                Colorlist.add(Color.getValue());
                Studentlist.add(i);

            }
            if(i==5){
                ps6.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n6.setText(Name.getText());
                Colorlist.add(Color.getValue());
                Studentlist.add(i);

            }
            if(i==6){
                ps7.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n7.setText(Name.getText());
                Colorlist.add(Color.getValue());
                Studentlist.add(i);

            }
            if(i==7){
                ps8.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n8.setText(Name.getText());
                Colorlist.add(Color.getValue());
                Studentlist.add(i);

            }
            if(i==8){
                ps9.setFill(javafx.scene.paint.Color.web(String.valueOf(Color.getValue())));
                n9.setText(Name.getText());
                Colorlist.add(Color.getValue());
                Studentlist.add(i);

            }

        }
    }


}
