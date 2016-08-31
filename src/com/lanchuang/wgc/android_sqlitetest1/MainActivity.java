package com.lanchuang.wgc.android_sqlitetest1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity
{

//	final int INF = 100;
//	Cursor model = null;// 用来存储查询的数据
	RestaurantHelper helper;

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		helper = new RestaurantHelper(this);// 参数是上下文

		// helper.insert("1" ,"1" , "1" , "1" , "1");

		// System.out.println(helper.getDatabaseName());
		// System.out.println(helper.getAll(null , null));
		// System.out.println(helper.toString());
//		int i;
//		String iToString;
//		for(i = 1 ; i < INF ; i ++ )
//		{
//			iToString = i + "";
//			helper.insert(iToString ,iToString ,iToString ,iToString ,iToString ,iToString);
//		}

		helper.update("1" ,"wgc" ,"wgcwgc" ,"w" ,"g" ,"c");
		
		System.out.println(helper.getPasswordByUsernameAndphoneNumber("11" ,"c"));
		System.out.println(helper.getPasswordByUsernameAndphoneNumber("1" ,"c"));
		
		System.out.println(helper.getUsernameByPhoneNumber("c"));
//		System.out.println(helper.getUsernameByPhoneNumber("c"));
		
		// System.out.println(helper.getDatabaseName());
		// System.out.println(helper.getAll(null , null));
		// System.out.println(helper.toString());
		// System.out.println(helper.getById("7"));
		// Cursor c = null;
		// System.out.println(helper.getName(c).toString());
		// System.out.println(helper.getPhone(c));
		String content = "运行成功！！！";
		System.out.println(content);
		Toast.makeText(this ,content ,Toast.LENGTH_LONG).show();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main ,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item )
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if(id == R.id.action_settings)
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
