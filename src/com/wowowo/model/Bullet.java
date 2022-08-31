package com.wowowo.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.wowowo.view.MyPanel;

public class Bullet {
	
	public MyPanel myPanel;
	
	public int width=8;
	
	public int height=8;
	
	public int x;
	
	public int y;
	
	public Image[] images=new Image[]{
			
			Toolkit.getDefaultToolkit().getImage("images/bullet01.png"),
			Toolkit.getDefaultToolkit().getImage("images/bullet02.png"),
			Toolkit.getDefaultToolkit().getImage("images/bullet03.png"),
			Toolkit.getDefaultToolkit().getImage("images/bullet04.png"),
			Toolkit.getDefaultToolkit().getImage("images/bullet05.png"),
			Toolkit.getDefaultToolkit().getImage("images/bullet06.png")			
	};
	
	public int imageindex=0;
	
	public  Bullet(MyPanel myPanel)
	{
		this.myPanel=myPanel;		
	}
	
	public void drawSelf(Graphics g)
	{
		  g.drawImage(images[imageindex], x, y,width, height, null);
		  
		  if(this.myPanel.timer%1==0)
		  {
			  imageindex++;			  
			  y--;
			  
			  if(imageindex==this.images.length)
				  imageindex=0;
			  
			  if(y<0)
				  this.myPanel.bullets.remove(this);  			  
		  }
		  
		  //判断是否击中敌人
		  for(int i=0;i<myPanel.enemies.size();i++)
		  {
			   Enemy e=myPanel.enemies.get(i);
			   
			   if(e.hp<0)
				   continue;
			   
			   if(this.x>=e.x-this.width && this.x<=e.x+e.width && this.y>=e.y-this.height && this.y<=e.y+e.height)
			   {
				    //击中了
				   myPanel.enemies.remove(this);
				   
				   e.underAttack();
			   }
		  }
		 
		
	}
	

	 

}
