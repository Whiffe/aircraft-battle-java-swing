package com.wowowo.model;

import java.awt.Toolkit;

import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Enemy006 extends Enemy {
	public Enemy006(MyPanel mypanel) {
		super(mypanel);
		width = 100;
		height = 65;
		x = (int)(Math.random() * (BaseFrame.frameWidth - width) );
		y = 0 - height;
		image = Toolkit.getDefaultToolkit().getImage("images/enemy06.png");
		speed = 3;
		hp = 8;
		
		this.items = new Item[]{
				new Item03(mypanel),
				new Item03(mypanel),
				new Item02(mypanel),
				new Item03(mypanel),
				new Item01(mypanel)
		};
	}
}
