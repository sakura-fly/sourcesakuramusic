package com.ss.listener.mouse;

import com.ss.ui.HeadView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SearchClick implements MouseListener {



    public void mouseClicked(MouseEvent mouseEvent) {
        String keyWord = HeadView.getInstance().getSearchKeyword();
        System.out.println("keyWord=" + keyWord);
    }

    public void mousePressed(MouseEvent mouseEvent) {

    }

    public void mouseReleased(MouseEvent mouseEvent) {

    }

    public void mouseEntered(MouseEvent mouseEvent) {

    }

    public void mouseExited(MouseEvent mouseEvent) {

    }
}
