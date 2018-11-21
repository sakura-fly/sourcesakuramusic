package com.ss.ui;

import com.ss.listener.mouse.Move;
import com.ss.util.Contents;

import java.awt.*;

public class OrderListView extends BaseView {
    public OrderListView() {
        super(0,0,200,0,Contents.LEFT_LIST_BACKGROUND);
    }

    @Override
    public void init() {
        super.init();
        GridLayout g = new GridLayout(0, 1);
        // 竖间隔
        g.setVgap(3);
        setLayout(g);
        for (int i = 0; i < 10; i++){
            Label l = new Label("list" + i);
            l.addMouseListener(new Move());
            l.setPreferredSize(new Dimension(0,30));
            add(l);
        }
    }
}
