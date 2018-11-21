package com.ss.ui;

import com.ss.util.Contents;

import java.awt.*;

public class OrderListView extends BaseView {
    public OrderListView() {
        super(0,0,200,0,Contents.LEFT_LIST_BACKGROUND);
    }

    @Override
    public void init() {
        super.init();
        setLayout(new GridLayout(0,1));
        for (int i = 0; i < 10; i++){
            Label l = new Label("list" + i);
            String  c = "#66cc" + String.format("%02d",i * 10);
            l.setBackground(Color.decode(c));
            l.setPreferredSize(new Dimension(0,30));
            add(l);
        }
    }
}
