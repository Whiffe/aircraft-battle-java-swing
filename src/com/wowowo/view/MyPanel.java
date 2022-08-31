package com.wowowo.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import javax.accessibility.AccessibleRelation;
import javax.swing.JPanel;

import com.wowowo.view.BaseFrame;
import com.wowowo.model.Bullet;
import com.wowowo.model.Enemy;
import com.wowowo.model.Item;
import com.wowowo.model.Player;
import com.wowowo.thread.BulletMusicThread;
import com.wowowo.thread.DrawableThread;

public class MyPanel extends JPanel {
	
		
	public Image bgImage;
	
	public int timer=0;
	
	public int top=0;
	
	public DrawableThread drawableThread;
	
	public Player player;
	
	public ArrayList<Bullet> bullets=new ArrayList<Bullet>();
	
	public ArrayList<Enemy> enemies=new ArrayList<Enemy>();
	  
	public ArrayList<Class> enemiesType=new ArrayList<Class>();
	  
	public ArrayList<Item> items=new ArrayList<Item>();
	
	//存放 主窗口
	public BaseFrame mainFrame;
	
	public MyPanel(BaseFrame mainFrame)
	{
		this.mainFrame=mainFrame;
		
		this.bgImage=Toolkit.getDefaultToolkit().getImage("images/bg01.jpg");
		
		this.player=new Player(this);		
		
		this.drawableThread=new DrawableThread(this);
		
		//启动窗口时 设置 线程可用
		this.drawableThread.isStop=false;
		
		this.drawableThread.start();
	}
	
	//注意这里是paintComponent 不是 paintComponents
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.drawImage(bgImage, 0, top-bgImage.getHeight(this), bgImage.getWidth(this), bgImage.getHeight(this), null);
		g.drawImage(bgImage, 0, top, bgImage.getWidth(this), bgImage.getHeight(this), null);
		
		timer++;
		if( timer >= 10000 ){
			timer = 0;
		}
		
		if( timer % 10 == 0 )
		{
			
			this.top+= 1;
			if( top > bgImage.getHeight(this) ){
				top = 0;
			}
		}
		
		this.player.drawSelf(g);
		
		 //创建子弹
		  if(this.timer%100==0)
		  {
			  if(this.player.attackMode==1)
			  {
				   Bullet bullet=new Bullet(this);
				   bullet.x=this.player.x+this.player.width/2-bullet.width/2;
				   bullet.y=this.player.y;
				   this.bullets.add(bullet);
				  
			  }
			  else if(this.player.attackMode==2)
			  {
				   Bullet bullet1=new Bullet(this);
				   bullet1.x=this.player.x+this.player.width/2-bullet1.width/2;
				   bullet1.y=this.player.y-15;
				   this.bullets.add(bullet1);
				   
				   Bullet bullet2=new Bullet(this);
				   bullet2.x=this.player.x+this.player.width/2-bullet2.width/2- bullet2.width - 5;
				   bullet2.y=this.player.y;
				   this.bullets.add(bullet2);
				   
				   
				   Bullet bullet3=new Bullet(this);
				   bullet3.x=this.player.x+this.player.width/2- bullet3.width/2 + bullet3.width + 5;
				   bullet3.y=this.player.y;
				   this.bullets.add(bullet3);
				   
				
				  
			  }
			  else if(this.player.attackMode==3)
			  {
				  Bullet bullet1 = new Bullet(this);
				  bullet1.x = player.x + player.width / 2 - bullet1.width/2;
				  bullet1.y = player.y - 30;
				  bullets.add(bullet1);
					
				  Bullet bullet2 = new Bullet(this);
				  bullet2.x = player.x + player.width / 2 - bullet2.width/2 - bullet2.width - 5;
				  bullet2.y = player.y - 15;
				  bullets.add(bullet2);
					
				  Bullet bullet3 = new Bullet(this);
				  bullet3.x = player.x + player.width / 2 - bullet3.width/2 + bullet3.width + 5;
				  bullet3.y = player.y - 15;
				  bullets.add(bullet3);
					
				  Bullet bullet4 = new Bullet(this);
				  bullet4.x = player.x + player.width / 2 - bullet4.width/2 - 2*bullet4.width - 10;
				  bullet4.y = player.y;
				  bullets.add(bullet4);
					
				  Bullet bullet5 = new Bullet(this);
				  bullet5.x = player.x + player.width / 2 - bullet5.width/2 + 2*bullet5.width +10;
				  bullet5.y = player.y;
				  bullets.add(bullet5);
				
			  }
			  new BulletMusicThread("video/bullet.wav").start();
		  }
		  
		 
		   //画出所有创建出来的子弹
		   for(int i=0;i<bullets.size();i++)
		   {
			  this.bullets.get(i).drawSelf(g);
		   }
		   
		   
		   
			  //创建敌人
			  if(this.timer%200==0)
			  {
				  if(this.enemiesType.size()>0)
				  {
					  int index=(int)(Math.random()*(this.enemiesType.size()));
					  
					  try {
						Enemy enemy=(Enemy)this.enemiesType.get(index).getConstructors()[0].newInstance(new Object[]{this});
					
						enemies.add(enemy);
					  
					  } catch (InstantiationException | IllegalAccessException
							| IllegalArgumentException | InvocationTargetException
							| SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  }
				  
			  }
			  
			  for(int i=0;i<enemies.size();i++)
			  {
				  enemies.get(i).drawSelf(g);
			  }
			  				  
			 
			   //画出道具
			   for(int i=0;i<items.size();i++)
			   {
				  items.get(i).drawSelf(g);
			   }
			   
			   //画分数		
				
				g.setColor(Color.WHITE);
				g.drawString(""+player.count, BaseFrame.frameWidth - 100, 15);
				
			 
			  
		 
		
		
	}
}
