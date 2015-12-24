package com.example2.we123;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class info extends Activity {

	private TextView username,email,lastlogintime,createtime,sex,birthday;
	private ImageView img;
	String imguri;
	

		  @Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.thirdlogin);
			img=(ImageView) findViewById(R.id.img);
			username=(TextView) findViewById(R.id.username);
			email=(TextView) findViewById(R.id.email);
			lastlogintime=(TextView) findViewById(R.id.lastlogintime);
		    createtime=(TextView) findViewById(R.id.createtime);
		   sex=(TextView) findViewById(R.id.sex);
//		   Handler handler=new Handler();
		   Intent intent1=getIntent();
		
			Bundle bundle=intent1.getExtras();
			username.setText("�û���:"+bundle.getString("username"));
			email.setText( "���䣺"+bundle.getString ("email"));
			lastlogintime.setText( "�ϴε�½ʱ�䣺"+bundle.getString ("lastlogintime"));
			createtime.setText( "�˻�����ʱ�䣺"+bundle.getString ("createtime"));
			sex.setText( "�Ա�"+bundle.getString ("sex"));
			String imguri=bundle.getString("image");
//		
			new ImageLoader().showImageByThread(img,imguri);
//		  
	}

}
