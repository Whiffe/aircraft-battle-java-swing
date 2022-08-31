package com.wowowo.model;

import java.awt.Toolkit;

import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Enemy003 extends Enemy {
	public Enemy003(MyPanel mypanel) {
		super(mypanel);
		width = 50;
		height = 37;
		x = (int)(Math.random() * (BaseFrame.frameWidth - width) );
		y = 0 - height;
		image = Toolkit.getDefaultToolkit().getImage("images/enemy03.png");
		speed = 3;
		hp = 3;	
		this.items = new Item[]{
				new Item01(mypanel),
				new Item02(mypanel),
				new Item02(mypanel)
		};
	}
}
