package com.wise.commonadapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

public class Myadapter extends CommonAdapter<JavaBean> {

	public Myadapter(Context context, List<JavaBean> list, int layoutId) {
		super(context, list, layoutId);
	}

	@Override
	public void getView(CommonViewHolder holder,final JavaBean bean) {
		((TextView)holder.getView(R.id.tvTitle)).setText(bean.getTitle());
		((TextView)holder.getView(R.id.tvDesc)).setText(bean.getDecription());
		((TextView)holder.getView(R.id.tvTime)).setText(bean.getTime());
		((TextView)holder.getView(R.id.tvPhone)).setText(bean.getPhone());
		
		final CheckBox cb = (CheckBox)holder.getView(R.id.cbCheck);
		cb.setChecked(bean.isCheck());
		cb.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				bean.setCheck(cb.isChecked());
			}
		});
		
	}

}
