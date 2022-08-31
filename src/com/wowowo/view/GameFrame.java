package com.wowowo.view;

import com.wowowo.model.Enemy001;
import com.wowowo.model.Enemy002;
import com.wowowo.model.Enemy003;
import com.wowowo.model.Enemy004;
import com.wowowo.model.Enemy005;
import com.wowowo.model.Enemy006;
import com.wowowo.model.Enemy007;
import com.wowowo.model.Enemy008;
import com.wowowo.model.Enemy009;
import com.wowowo.model.Enemy010;

public class GameFrame extends BaseFrame{

public GameFrame(){
		
		// 3���������
		createPlayer();
		
		// 4�� �����������
		setTouchListener();
		
		// 5�� ������һ����ȼ�  (1,2,3)
		setPlayerPowerLevel(1);		
		
		// 6�� ��ӵ��˵�����				
		//��ӵл�
		 addEnemyType(Enemy001.class);
		 addEnemyType(Enemy002.class);
		 addEnemyType(Enemy003.class);
		 addEnemyType(Enemy004.class);
		 addEnemyType(Enemy005.class);
		 addEnemyType(Enemy006.class);
		 addEnemyType(Enemy007.class);
		 addEnemyType(Enemy008.class);
		 addEnemyType(Enemy009.class);
		 addEnemyType(Enemy010.class);
		
		// 7�����õ���Я������
		setEnemyHasItem();
		
		// 8��ͳ�Ƶ÷�
		setCount();
		
	
		
	}
}
