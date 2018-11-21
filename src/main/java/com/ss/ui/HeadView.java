package com.ss.ui;

import com.ss.listener.focus.HintText;
import com.ss.util.Contents;
import sun.security.jca.GetInstance;

import javax.swing.*;
import java.awt.*;

public class HeadView extends BaseView {
    private HeadView() {
        super(0,0,0,48,Contents.HEAD_VIEW_BACKGROUND);
    }

    private static class instance{
        private static HeadView instance = new HeadView();
    }

    public static HeadView getInstance(){
        return instance.instance;
    }

    @Override
    public void init() {
        super.init();
        setPreferredSize(new Dimension(width,hight));
        setLayout(new GridLayout(1,0));
        // 搜索框
        TextField searchTf = new TextField();
        // 提示内容
        // addFocusListener(new HintText("提示内容",searchTf));
        add(searchTf);
        // 搜索按钮
        JButton searchBtn = new JButton("搜索");
        add(searchBtn);

    }
}

