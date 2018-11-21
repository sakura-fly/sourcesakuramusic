package com.ss.ui;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    public MainView() throws HeadlessException {
        super("music");
        inti();
    }

    private void inti() {
        setSize(1100, 700);
        add(new LeftList(),BorderLayout.WEST);
        add(new HeadView(),BorderLayout.NORTH);
        add(new RightView());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
