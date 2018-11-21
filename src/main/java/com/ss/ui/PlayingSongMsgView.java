package com.ss.ui;

import com.ss.util.Contents;

import java.awt.*;

public class PlayingSongMsgView extends BaseView {
    public PlayingSongMsgView() {
        super(0,0,0,60,Contents.PYALING_MSG_BACKGROUND);
    }

    @Override
    public void init() {
        super.init();
        // 宽度
        setPreferredSize(new Dimension(width,hight));
    }
}
