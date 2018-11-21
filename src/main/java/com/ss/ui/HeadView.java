package com.ss.ui;

import com.ss.listener.keybord.Search;
import com.ss.listener.mouse.SearchClick;
import com.ss.util.Contents;

import javax.swing.*;
import java.awt.*;

import static com.ss.util.Contents.HEAD_VIEW_BACKGROUND;
import static com.ss.util.Contents.HEAD_VIEW_HIGH;

public class HeadView extends BaseView {

    TextField searchTf;
    private HeadView() {
        super(0,0,0, HEAD_VIEW_HIGH,Contents.HEAD_VIEW_BACKGROUND);
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
        // 左对齐,水平间距是20，垂直间距为0像素
        setLayout(new FlowLayout(FlowLayout.LEADING, 10, 0));
        // 搜索框
        searchTf = new TextField();
        searchTf.setColumns(30);
        searchTf.setBackground(HEAD_VIEW_BACKGROUND);
        searchTf.setPreferredSize(new Dimension(100, HEAD_VIEW_HIGH));
        searchTf.addKeyListener(new Search());
        // 提示内容
        // addFocusListener(new HintText("提示内容",searchTf));
        add(searchTf);
        // 搜索按钮
        JButton searchBtn = new JButton("搜索");
        searchBtn.setSize(HEAD_VIEW_HIGH,40);
        searchBtn.addMouseListener(new SearchClick());
        add(searchBtn);

    }

    public String getSearchKeyword(){
        return searchTf.getText();
    }

}

