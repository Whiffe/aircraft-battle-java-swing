package com.wowowo.thread;


import com.wowowo.view.Msg;
import com.wowowo.view.MyPanel;

public class DrawableThread extends Thread{

	public MyPanel mypanel;	
	
	public static boolean isStop=false;
	
	public DrawableThread(MyPanel mypanel){
		this.mypanel = mypanel;
	}
	
	//ÿ��һ�����һ�����
	public void run(){
		while(true){
			
            if (isStop == true) {			
				
				//������Ϸ������Ϣ��
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
