package com.wowowo.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import com.wowowo.view.BaseFrame;

public class FrameMouseMotionListener implements MouseMotionListener{
	
	public BaseFrame baseFrame;
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		baseFrame.panel.player.x=e.getX()-baseFrame.panel.player.width/2;
		baseFrame.panel.player.y=e.getY()-baseFrame.panel.player.height/2;
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
