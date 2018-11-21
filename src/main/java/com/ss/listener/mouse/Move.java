package com.ss.listener.mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.ss.util.Contents.DEFAULT_BACKGROUND;
import static com.ss.util.Contents.MOUSE_ENTER_BACKGROUND;

public class Move implements MouseListener {
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        e.getComponent().setBackground(MOUSE_ENTER_BACKGROUND);
    }

    public void mouseExited(MouseEvent e) {
        e.getComponent().setBackground(DEFAULT_BACKGROUND);
    }
}
