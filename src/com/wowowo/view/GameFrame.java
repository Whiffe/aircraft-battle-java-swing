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
		
		// 3：创建玩家
		createPlayer();
		
		// 4： 监听玩家手势
		setTouchListener();
		
		// 5： 设置玩家火力等级  (1,2,3)
		setPlayerPowerLevel(1);		
		
		// 6： 添加敌人的类型				
		//添加敌机
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
		
		// 7：设置敌人携带道具
		setEnemyHasItem();
		
		// 8：统计得分
		setCount();
		
	
		
	}
}
