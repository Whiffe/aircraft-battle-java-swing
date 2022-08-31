package com.wowowo.model;

import java.awt.Toolkit;

import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Enemy007 extends Enemy{

	public Enemy007(MyPanel mypanel) {
		super(mypanel);
		width = 90;
		height = 60;
		x = (int)(Math.random() * (BaseFrame.frameWidth - width) );
		y = 0 - height;
		image = Toolkit.getDefaultToolkit().getImage("images/enemy07.png");
		speed = 2;
		hp = 6;
		this.items = new Item[]{
				new Item04(mypanel),
				new Item01(mypanel),
				new Item02(mypanel),
				new Item03(mypanel),
				new Item04(mypanel)
		};
	}

}
