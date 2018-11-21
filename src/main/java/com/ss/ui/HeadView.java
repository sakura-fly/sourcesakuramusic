package com.ss.ui;

import com.ss.util.Contents;

import java.awt.*;

public class HeadView extends BaseView {
    HeadView() {
        super(0,0,0,48,Contents.HEAD_VIEW_BACKGROUND);
    }

    @Override
    public void init() {
        super.init();
        setPreferredSize(new Dimension(width,hight));

    }
}
