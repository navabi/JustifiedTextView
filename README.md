# JustifiedTextView for Android

This project proviede a view for you that implement justified text view that.

![Screenshot](https://raw.github.com/navabi/JustifiedTextView/master/raw/JustifiedTextView.png)

Android 2.0+ support

## Quick Setup

#### 1. Include library

**Manual:**
 * [Download JAR](https://github.com/navabi/JustifiedTextView/raw/master/raw/justifiedtextviewlibrary.jar)
 * Put the JAR in the **libs** subfolder of your Android project

#### 2. Application class
``` java
public class MainActivity extends Activity {

	private JustifiedTextView mJTv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mJTv=(JustifiedTextView) findViewById(R.id.activity_main_jtv_text);
		mJTv.setText(getResources().getString(R.string.test));
		mJTv.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
		mJTv.setLineSpace(15);
		mJTv.setBackgroundColor(Color.RED);
		mJTv.setAlignment(Align.LEFT);
		mJTv.setTypeFace(Typeface.createFromAsset(getAssets(), "fonts/naskh_bold.ttf"));

	}
	

}
```

## 3. Xml
``` xml
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:noghteh="http://noghteh.ir"
    android:id="@+id/activity_main_jsv"
    android:layout_width="match_parent"
    android:layout_height="match_parent" >

    <ir.noghteh.justifiedtextview.JustifiedTextView
        android:id="@+id/activity_main_jtv_text"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="right"
        android:padding="25dp"
        noghteh:text="@string/test" >
    </ir.noghteh.justifiedtextview.JustifiedTextView>

</ScrollView>


## License
please inform us if you use this library ( navabi70@gmail.com)

    Copyright 2013 Mohsen Navabi

