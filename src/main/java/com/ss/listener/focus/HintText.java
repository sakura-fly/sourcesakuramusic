package com.ss.listener.focus;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class HintText implements FocusListener {
    private String mHintText;
    private TextField mTextField;

    public HintText(String hintText, TextField textField) {
        this.mHintText = hintText;
        this.mTextField = textField;
        mTextField.setText(mHintText);
        textField.setForeground(Color.GRAY);
    }
    public void focusGained(FocusEvent e) {
        System.out.println(11111);
        String temp = mTextField.getText();
        if(temp.equals(mHintText)){
            mTextField.setText("");
            mTextField.setForeground(Color.BLACK);
        }
    }
    public void focusLost(FocusEvent e) {
        System.out.println(22222);
        String temp = mTextField.getText();
        if(temp.equals("")){
            mTextField.setForeground(Color.GRAY);
            mTextField.setText(mHintText);
        }
    }
}
