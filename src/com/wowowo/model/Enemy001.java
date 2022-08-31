package com.wowowo.model;

import java.awt.Toolkit;

import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Enemy001 extends Enemy{
	
	  public Enemy001(MyPanel myPanel)
	  {
		  super(myPanel);
		  
		  this.width=60;
		  
		  this.height=40;
		  
		  this.x=(int)(Math.random()*(BaseFrame.frameWidth-this.width));
		  
		  this.y=0-this.height;
		  
		  this.hp=3;
		  
		  this.speed=3;
		  
		  this.image=Toolkit.getDefaultToolkit().getImage("images/enemy01.png");
		  
		  this.items=new Item[]{
				  new Item01(myPanel),
				  new Item01(myPanel),
				  new Item01(myPanel)
		  };		
		  
		  
	  }

}
