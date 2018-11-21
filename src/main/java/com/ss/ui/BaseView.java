package com.ss.ui;

import javax.swing.*;
import java.awt.*;

public abstract class BaseView extends JPanel {

    protected int x;
    protected int y;
    protected int width;
    protected int hight;
    protected Color backgroud;

    public BaseView() {
        init();
    }

    /**
     * @param x         x
     * @param y         y
     * @param width     width
     * @param hight     hight
     * @param backgroud backgroud
     */
    public BaseView(int x, int y, int width, int hight, Color backgroud) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.hight = hight;
        this.backgroud = backgroud;
        init();
    }

    public void init() {
        setSize(width, hight);
        setBackground(backgroud);
    }

}
