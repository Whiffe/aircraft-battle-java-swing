package com.wowowo.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.wowowo.listener.FrameMouseListener;
import com.wowowo.listener.FrameMouseMotionListener;
import com.wowowo.model.Enemy001;
import com.wowowo.model.Enemy002;
import com.wowowo.model.Enemy003;
import com.wowowo.model.Enemy004;
import com.wowowo.model.Enemy005;
import com.wowowo.model.Enemy006;
import com.wowowo.model.Enemy007;
import com.wowowo.model.Enemy008;
import com.wowowo.model.Enemy009;
import com.wowowo.model.Enemy010;

public class BaseFrame extends JFrame {
	
	public static int frameWidth=512;
	
	public static int frameHeight=768;
	
	public MyPanel panel;
	
	public FrameMouseListener frameMouseListener;
	
//	public FrameMouseMotionListener frameMouseMotionListener;
	
	public static boolean hasPlayer = false;
	public static boolean hasItem = false;
	public static boolean hasCount = false;
	public static boolean hasListener = false;
	
	public void setTouchListener()
	{
		   this.frameMouseListener=new FrameMouseListener();
		   this.frameMouseListener.baseFrame=this;
		   this.addMouseListener(this.frameMouseListener);
	}
	
//	public void setMouseMotionListener()
//	{
//		   this.frameMouseMotionListener=new FrameMouseMotionListener();
//		   this.frameMouseMotionListener.baseFrame=this;
//		   this.addMouseMotionListener(this.frameMouseMotionListener);
//	}
	
	 public void addEnemyType(Class c)
	 {
		   this.panel.enemiesType.add(c);
	 }
	 
	
	 public  void createPlayer(){
			hasPlayer = true;
	 }
	 
	 public  void setCount(){
			hasCount = true;
	 }
		
	 public  void setEnemyHasItem(){
			hasItem = true;
	 }
	 
	 public void setPlayerPowerLevel(int level){
			this.panel.player.attackMode = level;
	 }
	
	
	public BaseFrame()
	{
	 super("Aircraft Battle");
	 Dimension screenSize=	Toolkit.getDefaultToolkit().getScreenSize();
	 setBounds(((int)screenSize.getWidth()-frameWidth)/2, 0, frameWidth, frameHeight);
	 setLayout(null);	
	 
	 this.panel=new MyPanel(this);
	 
	 this.panel.setBounds(0, 0, frameWidth, frameHeight);
	 
	 this.add( this.panel);	 
	 
	 
	 setVisible(true);
	 
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
