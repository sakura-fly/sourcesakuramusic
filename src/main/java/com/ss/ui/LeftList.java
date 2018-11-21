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
        // 宽度
        setPreferredSize(new Dimension(width,hight));
        JScrollPane jsp = new JScrollPane(new OrderListView());
        // 滚动条速度
        jsp.getVerticalScrollBar().setUnitIncrement(16);
        add(jsp);

        // setLayout();
    }
}
