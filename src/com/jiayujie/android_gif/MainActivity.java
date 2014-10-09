package com.jiayujie.android_gif;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	
	private GifImageView gifImageView;
	private Button button1,button2,button3;
	private GifDrawable drawable;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gifImageView=(GifImageView)this.findViewById(R.id.gif_view);
		
		button1=(Button)this.findViewById(R.id.button1);
		button2=(Button)this.findViewById(R.id.button2);
		button3=(Button)this.findViewById(R.id.button3);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		
//		gifImageView.setImageResource(R.drawable.aaa);//设置图片资源ID
		
//		gifImageView.setImageBitmap(bm);//通过bitmap来加载gif文件，这个可以是从网上获取的文件转换成的。
		
//		gifImageView.setImageURI(uri);//通过资源网址路径的形式，设置动画图片。
		
		drawable = (GifDrawable) gifImageView.getDrawable();
		
		//*如何控制动画的播放
		//1.获取drawable，并且转换为gifdrawable，因为gifdrawable提供了控制播放暂停的方法。
		
		/**
		  drawable.start();//开始播放动画，如果之前没有播放，那么从开始播放；如果之前暂停过，那么该方法继续向后播放。
		 drawable.stop();//动画停止播放，调用这个方法时，如果没有播放，那么不做任何操作。
		 drawable.pause();//动画暂停到当前帧，可以用start()继续播放。
		 drawable.isPlaying();//判断动画是否正在播放
		 drawable.isRunning();//判断动画是否在运行中
		 */		
	}
	@Override
	public void onClick(View v) {
		// TODO 自动生成的方法存根
		switch (v.getId()) {
		case R.id.button1:
			drawable.start();
			break;
		case R.id.button2:
			drawable.pause();
			break;
		case R.id.button3:
			drawable.stop();
	break;
		
		}
	}
}
