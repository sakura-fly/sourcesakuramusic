package com.ss.ui;

import com.ss.util.Contents;

import java.awt.*;

public class PlayingSongMsgView extends BaseView {
    private PlayingSongMsgView() {
        super(0,0,0,60,Contents.PYALING_MSG_BACKGROUND);
    }
    private static class instance {
        private static PlayingSongMsgView instance = new PlayingSongMsgView();
    }

    public static PlayingSongMsgView getInstance() {
        return PlayingSongMsgView.instance.instance;
    }
    @Override
    public void init() {
        super.init();
        // 宽度
        setPreferredSize(new Dimension(width,hight));
    }
}
