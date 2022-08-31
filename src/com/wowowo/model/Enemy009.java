package com.wowowo.model;

import java.awt.Toolkit;

import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Enemy009 extends Enemy{

	public Enemy009(MyPanel mypanel) {
		super(mypanel);
		width = 124;
		height = 100;
		x = (int)(Math.random() * (BaseFrame.frameWidth - width) );
		y = 0 - height;
		image = Toolkit.getDefaultToolkit().getImage("images/enemy09.png");
		speed = 2;
		hp = 15;
		this.items = new Item[]{
				new Item05(mypanel),
				new Item04(mypanel),
				new Item03(mypanel),
				new Item01(mypanel),
				new Item02(mypanel)
		};
	}

}
