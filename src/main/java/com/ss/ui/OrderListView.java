package com.ss.ui;

import com.ss.util.Contents;

import java.awt.*;

public class OrderListView extends BaseView {
    public OrderListView() {
        super(0,0,200,0,Contents.LEFT_LIST_BACKGROUD);
    }

    @Override
    public void init() {
        super.init();
        // Panel orderListPanel = new Panel();
        setLayout(new GridLayout(0,1));
        for (int i = 0; i < 300; i++){
            add(new Label(i + ""));
        }
        // add(orderListPanel);
        // setPreferredSize(new Dimension(width,hight));
        // setLayout();
    }
}