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
        add(LeftList.getInstance(),BorderLayout.WEST);
        add(HeadView.getInstance(),BorderLayout.NORTH);
        add(RightView.getInstance());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
