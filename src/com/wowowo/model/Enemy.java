package com.wowowo.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import com.wowowo.thread.BulletMusicThread;

import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Enemy {
	
	public MyPanel myPanel;
	
	public int width;
	
	public int height;
	
	public int x;
	
	public int y;
	
	public Image image;
	
	public int hp;
	
	public int speed;
	
	public Item[] items;
	
	public Image[] dieImages=new Image[]{
			
			Toolkit.getDefaultToolkit().getImage("images/die01.png"),
			Toolkit.getDefaultToolkit().getImage("images/die02.png"),
			Toolkit.getDefaultToolkit().getImage("images/die03.png"),
			Toolkit.getDefaultToolkit().getImage("images/die04.png")			
	};
	
	public int imageindex=0;
	
	public Enemy(MyPanel myPanel)
	{
		 this.myPanel=myPanel;
	}
	
	public void drawSelf(Graphics g)
	{
		  if(this.hp>0)
		  {
			   g.drawImage(image, x, y, width, height, null);
		  }
		  else
		  {	
			   g.drawImage(dieImages[imageindex], x, y, 45, 45, null);
			   
			   imageindex++;
			   
			   if(imageindex>=this.dieImages.length)
			   {
				  killed();	
				  new BulletMusicThread("video/boom.wav").start();
			   }	  
			  
		  }
		  
		  if(this.myPanel.timer%this.speed==0)
		  {
			   y++;
			   
			   if(y>=BaseFrame.frameHeight)
				     myPanel.enemies.remove(this);
		  }
		
	}
	
	public void killed()
	{
		 		 
		  myPanel.enemies.remove(this);
		  
		  //ÊÍ·ÅµÀ¾ß
		  if(this.items.length>0)
		  {			  
			  for(int i=0;i<items.length;i++)
			  {
			     Item item=this.items[i];
			     
			     item.y=this.y;
			     
			     item.x=this.x+20*i;
			     
			     myPanel.items.add(item);			     
			  }			  
		  }
		  
		  
	}
	
	public void underAttack()
	{
		if(hp>0)
		  this.hp--;
	}

}
