package com.ss.ui;

import com.ss.util.Contents;

import javax.swing.*;
import java.awt.*;

public class LeftList extends BaseView {

    public LeftList() {
        super(0,0,200,0,Contents.LEFT_LIST_BACKGROUD);
    }

    @Override
    public void init() {
        super.init();
        setLayout(new GridLayout());
        setPreferredSize(new Dimension(width,hight));
        add(new JScrollPane(new OrderListView()));

        // setLayout();
    }
}
