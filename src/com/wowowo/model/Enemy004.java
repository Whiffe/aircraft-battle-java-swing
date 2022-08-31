package com.wowowo.model;

import java.awt.Toolkit;

import com.wowowo.view.BaseFrame;
import com.wowowo.view.MyPanel;

public class Enemy004 extends Enemy {
	public Enemy004(MyPanel mypanel) {
		super(mypanel);
		width = 50;
		height = 36;
		x = (int)(Math.random() * (BaseFrame.frameWidth - width) );
		y = 0 - height;
		image = Toolkit.getDefaultToolkit().getImage("images/enemy04.png");
		speed = 3;
		hp = 3;
		this.items = new Item[]{
				new Item02(mypanel),
				new Item02(mypanel),
				new Item03(mypanel)
		};
	}
}
