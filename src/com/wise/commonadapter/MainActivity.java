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
		list.add(new JavaBean("����1", "��������1", "2005/4/18", "10086", false));
		list.add(new JavaBean("����2", "��������2", "2005/4/18", "10086", false));
		list.add(new JavaBean("����3", "��������3", "2005/4/18", "10086", false));
		list.add(new JavaBean("����4", "��������4", "2005/4/18", "10086", false));
		list.add(new JavaBean("����5", "��������5", "2005/4/18", "10086", false));
		list.add(new JavaBean("����6", "��������6", "2005/4/18", "10086", false));
		list.add(new JavaBean("����7", "��������7", "2005/4/18", "10086", false));
		list.add(new JavaBean("����8", "��������8", "2005/4/18", "10086", false));
		list.add(new JavaBean("����9", "��������9", "2005/4/18", "10086", false));
		list.add(new JavaBean("����10", "��������10", "2005/4/18", "10086", false));
		list.add(new JavaBean("����11", "��������11", "2005/4/18", "10086", false));
		
		Myadapter myadapter = new Myadapter(this, list, R.layout.item);
		
		lvMain = (ListView) findViewById(R.id.lvMain);
		lvMain.setAdapter(myadapter);

		
	}



}
