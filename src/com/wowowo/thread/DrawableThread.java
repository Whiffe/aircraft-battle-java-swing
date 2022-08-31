package com.wowowo.thread;


import com.wowowo.view.Msg;
import com.wowowo.view.MyPanel;

public class DrawableThread extends Thread{

	public MyPanel mypanel;	
	
	public static boolean isStop=false;
	
	public DrawableThread(MyPanel mypanel){
		this.mypanel = mypanel;
	}
	
	//每隔一秒绘制一下面板
	public void run(){
		while(true){
			
            if (isStop == true) {			
				
				//弹出游戏结束消息框
				Msg msg=new Msg(mypanel.mainFrame);

				break;
				
			}
			
			mypanel.repaint();

			try {
				Thread.currentThread().sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
