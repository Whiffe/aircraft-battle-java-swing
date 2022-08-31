package com.wowowo.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.wowowo.view.BaseFrame;

public class FrameMouseListener implements MouseListener {
	
	public BaseFrame baseFrame;

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		baseFrame.panel.player.x=e.getX()-baseFrame.panel.player.width/2;
		baseFrame.panel.player.y=e.getY()-baseFrame.panel.player.height/2;
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	    

}
