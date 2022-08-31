package com.wowowo.model;

import java.awt.Toolkit;

import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Enemy008 extends Enemy{

	public Enemy008(MyPanel mypanel) {
		super(mypanel);
		width = 60;
		height = 40;
		x = (int)(Math.random() * (BaseFrame.frameWidth - width) );
		y = 0 - height;
		image = Toolkit.getDefaultToolkit().getImage("images/enemy08.png");
		speed = 2;
		hp = 8;
		this.items = new Item[]{
				new Item04(mypanel),
				new Item02(mypanel),
				new Item02(mypanel)
		};
	}

}
