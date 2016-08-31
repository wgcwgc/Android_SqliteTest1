package com.lanchuang.wgc.android_sqlitetest1;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;

public class LunchList extends ListActivity
{
	Cursor model = null;// �����洢��ѯ������
	RestaurantHelper helper;

//	RestaurantAdapter adapter = null;// �����Զ�������ݿ������

	public void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		helper = new RestaurantHelper(this);// ������������

		initList();// ��ʼ��listview�б�,ʡ���˺ܶ�,����������ʹ�����ݿ����̾�����

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
//		{// ����в�ѯָ������ݲ�ѯ���ݴ����ݿ��ȡ��������������������
//			where = "name LIKE \"%" + getIntent().getStringExtra(SearchManager.QUERY) + "%\"";
//		}
//		Cursor prefs;
//		model = helper.getAll(where ,prefs.getString("sort_order" ,"name"));// ���ð������еķ�����ȡ����
//		startManagingCursor(model);
//		adapter = new RestaurantAdapter(model);// ����adapter
//		setListAdapter(adapter);// ���б�����ʾ����
	}
}
