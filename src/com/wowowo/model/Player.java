package com.wowowo.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.wowowo.model.Enemy;
import com.wowowo.thread.DrawableThread;
import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Player {
	
	 public MyPanel myPanel;
	 
	 public Image[] images=new Image[]{
			 Toolkit.getDefaultToolkit().getImage("images/player01.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player02.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player03.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player04.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player05.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player06.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player07.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player08.png"),
			 Toolkit.getDefaultToolkit().getImage("images/player09.png")
			 
	 };
	 
	 public int width=100;
	 
	 public int height=100;
	 
	 public int x;
	 
	 public int y;
	 
	 public int imageIndex=0;
	 
	 public int attackMode=1; //�����ȼ�
	 
	 public int count = 0; //��ŵ�����ҵķ���
	
	 public Player(MyPanel myPanel)
	 {
		  this.myPanel=myPanel;
		      
		  this.x=(BaseFrame.frameWidth-width)/2;
		  
		  this.y=BaseFrame.frameHeight-height*2;
				  
	 }
	 
	 public void drawSelf(Graphics g)
	 {
		   g.drawImage(this.images[imageIndex], x, y, width, height, null);
		   
		   if(this.myPanel.timer%50==0)
		   {
			   imageIndex++;
			   
			   if(imageIndex>=this.images.length)
				   imageIndex=0;
		   }
		   
		   //���ݻ��� ���û����ȼ�
		   if(this.count<500)			   
			   attackMode=1;
		   else if(this.count<2000)
			   attackMode=2;
		   else 
		        attackMode=3;
		   
		   //�ж��Ƿ�Ե�����
		   for(int i=0;i<this.myPanel.items.size();i++)
		   {
			     Item item=this.myPanel.items.get(i);
			     
			     if((this.x>=item.x-this.width && this.x<=item.x+item.width) && (this.y>=item.y-this.height && this.y<=item.y+item.height))
			    	  item.eated();
		   }
		   
		  // �жϷɻ��Ƿ������л�
			for( int i = 0 ; i <= this.myPanel.enemies.size() - 1; i++ )
			{
				Enemy e = this.myPanel.enemies.get(i);
				if( x > e.x - width+30 && x < e.x + e.width-30 && y > e.y - height+30 && y < e.y + e.height-30 ){
					//mypanel.bullets.remove(this);
					//�����߳�
					DrawableThread.isStop=true;
					return;

				}
			}
		   
		 
		  
	 }

}
