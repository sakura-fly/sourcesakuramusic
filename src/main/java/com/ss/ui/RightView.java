package com.ss.ui;

import com.ss.util.Contents;

public class RightView extends BaseView{


    private RightView() {
        super(0,0,80,80,Contents.RIGHT_VIEW_BACKGROUND);
    }


    private static class Instance{
        private static final RightView instance = new RightView();
    }

    public static RightView getInstance(){
        return Instance.instance;
    }

    @Override
    public void init() {
        super.init();
    }
}
