package com.wowowo.model;

import java.awt.Toolkit;

import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Enemy010 extends Enemy{

	public Enemy010(MyPanel mypanel) {
		super(mypanel);
		width = 130;
		height = 100;
		x = (int)(Math.random() * (BaseFrame.frameWidth - width) );
		y = 0 - height;
		image = Toolkit.getDefaultToolkit().getImage("images/enemy10.png");
		speed = 3;
		hp = 18;
		this.items = new Item[]{
				new Item05(mypanel),
				new Item02(mypanel),
				new Item02(mypanel),
				new Item02(mypanel),
				new Item02(mypanel)
		};
	}

}
