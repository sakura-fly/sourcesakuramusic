package com.ss.ui;

import com.ss.util.Contents;

import javax.swing.*;
import java.awt.*;

public class LeftList extends BaseView {

    private LeftList() {
        super(0, 0, 200, 0, Contents.LEFT_LIST_BACKGROUND);
    }


    private static class instance {
        private static LeftList instance = new LeftList();
    }

    public static LeftList getInstance() {
        return LeftList.instance.instance;
    }


    @Override
    public void init() {
        super.init();
        setLayout(new BorderLayout());
        // 宽度
        setPreferredSize(new Dimension(width, hight));
        JScrollPane jsp = new JScrollPane(OrderListView.getInstance());
        // 滚动条速度
        jsp.getVerticalScrollBar().setUnitIncrement(16);
        add(jsp);
        add(PlayingSongMsgView.getInstance(), BorderLayout.SOUTH);

        // setLayout();
    }
}
