package com.wise.commonadapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private ListView lvMain; 
	private List<JavaBean> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		list = new ArrayList<JavaBean>();
		list.add(new JavaBean("标题1", "描述内容1", "2005/4/18", "10086", false));
		list.add(new JavaBean("标题2", "描述内容2", "2005/4/18", "10086", false));
		list.add(new JavaBean("标题3", "描述内容3", "2005/4/18", "10086", false));
		list.add(new JavaBean("标题4", "描述内容4", "2005/4/18", "10086", false));
		list.add(new JavaBean("标题5", "描述内容5", "2005/4/18", "10086", false));
		list.add(new JavaBean("标题6", "描述内容6", "2005/4/18", "10086", false));
		list.add(new JavaBean("标题7", "描述内容7", "2005/4/18", "10086", false));
		list.add(new JavaBean("标题8", "描述内容8", "2005/4/18", "10086", false));
		list.add(new JavaBean("标题9", "描述内容9", "2005/4/18", "10086", false));
		list.add(new JavaBean("标题10", "描述内容10", "2005/4/18", "10086", false));
		list.add(new JavaBean("标题11", "描述内容11", "2005/4/18", "10086", false));
		
		Myadapter myadapter = new Myadapter(this, list, R.layout.item);
		
		lvMain = (ListView) findViewById(R.id.lvMain);
		lvMain.setAdapter(myadapter);

		
	}



}
