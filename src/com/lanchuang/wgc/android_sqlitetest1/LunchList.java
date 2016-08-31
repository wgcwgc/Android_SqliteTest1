package com.lanchuang.wgc.android_sqlitetest1;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;

public class LunchList extends ListActivity
{
	Cursor model = null;// 用来存储查询的数据
	RestaurantHelper helper;

//	RestaurantAdapter adapter = null;// 上面自定义的数据库帮助类

	public void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		helper = new RestaurantHelper(this);// 参数是上下文

		initList();// 初始化listview列表,省略了很多,大体能明白使用数据库流程就行啦

		Init();
		
		helper.insert("wgc" ,"wgc" ,"lanchuang" , "String" , "lue" , "123456789");
		System.out.println(helper.getDatabaseName());
		System.out.println(helper.getAll(null , null));
		System.out.println(helper.toString());
		
		helper.update("wgcwgc" ,"wgcwgc" ,"lanchuanglanchuang" , "String" , "luelue" , "1234567891234567");
		System.out.println(helper.getDatabaseName());
		System.out.println(helper.getAll(null , null));
		System.out.println(helper.toString());
		System.out.println(helper.getUsernameByPhoneNumber("7"));
		
		
	}

	private void Init()
    {
	    
    }

	private void initList()
	{
//		if(model != null)
//		{
//			stopManagingCursor(model);
//			model.close();
//		}
//
//		@SuppressWarnings("unused")
//		String where = null;
//
//		if(Intent.ACTION_SEARCH.equals(getIntent().getAction()))
//		{// 如果有查询指令则根据查询内容从数据库获取表中所有满足条件数据
//			where = "name LIKE \"%" + getIntent().getStringExtra(SearchManager.QUERY) + "%\"";
//		}
//		Cursor prefs;
//		model = helper.getAll(where ,prefs.getString("sort_order" ,"name"));// 调用帮助类中的方法获取数据
//		startManagingCursor(model);
//		adapter = new RestaurantAdapter(model);// 设置adapter
//		setListAdapter(adapter);// 在列表中显示出来
	}
}
