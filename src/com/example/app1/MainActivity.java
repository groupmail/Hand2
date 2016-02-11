package com.example.app1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	int x1=0;
	int x2=0;
	int x3=0;
	int x4=0;
	int x5=0;
	int x6=0;
	int x7=0;
	int x8=0;
	int x9=0;
	int x10=0;
	int x11=0;
	int x22=0;
	int x33=0;
	int x44=0;
	int x55=0;
	int x66=0;
	int x77=0;
	int x88=0;
	int x99=0;
	int x100=0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		
		setContentView(R.layout.layout_app1);
		final Button bnt1=(Button) findViewById(R.id.button1);
		final Button bnt2=(Button) findViewById(R.id.button2);
		final Button bnt3=(Button) findViewById(R.id.button3);
		final Button bnt4=(Button) findViewById(R.id.button4);
		final Button bnt5=(Button) findViewById(R.id.button5);
		final Button bnt6=(Button) findViewById(R.id.button6);
		final Button bnt7=(Button) findViewById(R.id.button7);
		final Button bnt8=(Button) findViewById(R.id.button8);
		final Button bnt9=(Button) findViewById(R.id.button9);
		final Button bnt10=(Button) findViewById(R.id.button10);
		final Button bnt11=(Button) findViewById(R.id.button11);
		final Button bnt22=(Button) findViewById(R.id.button22);
		final Button bnt33=(Button) findViewById(R.id.button33);
		final Button bnt44=(Button) findViewById(R.id.button44);
		final Button bnt55=(Button) findViewById(R.id.button55);
		final Button bnt66=(Button) findViewById(R.id.button66);
		final Button bnt77=(Button) findViewById(R.id.button77);
		final Button bnt88=(Button) findViewById(R.id.button88);
		final Button bnt99=(Button) findViewById(R.id.button99);
		final Button bnt100=(Button) findViewById(R.id.button100);
		
		bnt1.getBackground().setLevel(0);
		bnt2.getBackground().setLevel(0);
		bnt3.getBackground().setLevel(0);
		bnt4.getBackground().setLevel(0);
		bnt5.getBackground().setLevel(0);
		bnt6.getBackground().setLevel(0);
		bnt7.getBackground().setLevel(0);
		bnt8.getBackground().setLevel(0);
		bnt9.getBackground().setLevel(0);
		bnt10.getBackground().setLevel(0);
		bnt11.getBackground().setLevel(0);
		bnt22.getBackground().setLevel(0);
		bnt33.getBackground().setLevel(0);
		bnt44.getBackground().setLevel(0);
		bnt55.getBackground().setLevel(0);
		bnt66.getBackground().setLevel(0);
		bnt77.getBackground().setLevel(0);
		bnt88.getBackground().setLevel(0);
		bnt99.getBackground().setLevel(0);
		bnt100.getBackground().setLevel(0);
		
	
		
		
		bnt1.setOnClickListener(new OnClickListener() {
	@Override
			public void onClick(View arg0) {
				if (x1 == 0) {
					x1 = 1;
					bnt1.getBackground().setLevel(1);} 
				else if (x1 == 1) {
					x1 = 0;
					bnt1.getBackground().setLevel(0);
				}}});

		bnt2.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x2 == 0) {
							x2 = 1;
							bnt2.getBackground().setLevel(1);} 
						else if (x2 == 1) {
							x2= 0;
							bnt2.getBackground().setLevel(0);
						}}});
		bnt3.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x3 == 0) {
							x3 = 1;
							bnt3.getBackground().setLevel(1);} 
						else if (x3 == 1) {
							x3 = 0;
							bnt3.getBackground().setLevel(0);
						}}});
		bnt4.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x4 == 0) {
							x4 = 1;
							bnt4.getBackground().setLevel(1);} 
						else if (x4 == 1) {
							x4 = 0;
							bnt4.getBackground().setLevel(0);
						}}});
		bnt5.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x5 == 0) {
							x5 = 1;
							bnt5.getBackground().setLevel(1);} 
						else if (x5 == 1) {
							x5 = 0;
							bnt5.getBackground().setLevel(0);
						}}});
		bnt6.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x6 == 0) {
							x6 = 1;
							bnt6.getBackground().setLevel(1);} 
						else if (x6 == 1) {
							x6 = 0;
							bnt6.getBackground().setLevel(0);
						}}});
		bnt7.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x7 == 0) {
							x7 = 1;
							bnt7.getBackground().setLevel(1);} 
						else if (x7 == 1) {
							x7 = 0;
							bnt7.getBackground().setLevel(0);
						}}});
		bnt8.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x8 == 0) {
							x8 = 1;
							bnt8.getBackground().setLevel(1);} 
						else if (x8 == 1) {
							x8 = 0;
							bnt8.getBackground().setLevel(0);
						}}});
		bnt9.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x9 == 0) {
							x9 = 1;
							bnt9.getBackground().setLevel(1);} 
						else if (x9 == 1) {
							x9 = 0;
							bnt9.getBackground().setLevel(0);
						}}});
		bnt10.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x10 == 0) {
							x10 = 1;
							bnt10.getBackground().setLevel(1);} 
						else if (x10 == 1) {
							x10 = 0;
							bnt10.getBackground().setLevel(0);
						}}});
		bnt11.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x11 == 0) {
							x11 = 1;
							bnt11.getBackground().setLevel(1);} 
						else if (x11 == 1) {
							x11 = 0;
							bnt11.getBackground().setLevel(0);
						}}});
		bnt22.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x22 == 0) {
							x22 = 1;
							bnt22.getBackground().setLevel(1);} 
						else if (x22 == 1) {
							x22 = 0;
							bnt22.getBackground().setLevel(0);
						}}});
		bnt33.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x33 == 0) {
							x33 = 1;
							bnt33.getBackground().setLevel(1);} 
						else if (x33 == 1) {
							x33 = 0;
							bnt33.getBackground().setLevel(0);
						}}});
		bnt44.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x44 == 0) {
							x44 = 1;
							bnt44.getBackground().setLevel(1);} 
						else if (x44 == 1) {
							x44 = 0;
							bnt44.getBackground().setLevel(0);
						}}});
		bnt55.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x55 == 0) {
							x55 = 1;
							bnt55.getBackground().setLevel(1);} 
						else if (x55 == 1) {
							x55 = 0;
							bnt55.getBackground().setLevel(0);
						}}});
		bnt66.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x66 == 0) {
							x66 = 1;
							bnt66.getBackground().setLevel(1);} 
						else if (x66 == 1) {
							x66 = 0;
							bnt66.getBackground().setLevel(0);
						}}});
		bnt77.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x77 == 0) {
							x77 = 1;
							bnt77.getBackground().setLevel(1);} 
						else if (x77 == 1) {
							x77 = 0;
							bnt77.getBackground().setLevel(0);
						}}});
		bnt88.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x88 == 0) {
							x88 = 1;
							bnt88.getBackground().setLevel(1);} 
						else if (x88 == 1) {
							x88 = 0;
							bnt88.getBackground().setLevel(0);
						}}});
		bnt99.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x99 == 0) {
							x99 = 1;
							bnt99.getBackground().setLevel(1);} 
						else if (x99 == 1) {
							x99 = 0;
							bnt99.getBackground().setLevel(0);
						}}});
		bnt100.setOnClickListener(new OnClickListener() {
			@Override
					public void onClick(View arg0) {
						if (x100 == 0) {
							x100 = 1;
							bnt100.getBackground().setLevel(1);} 
						else if (x100 == 1) {
							x100 = 0;
							bnt100.getBackground().setLevel(0);
						}}});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

			






		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		}

		
			

}






































































