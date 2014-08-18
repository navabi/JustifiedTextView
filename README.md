# JustifiedTextView for Android

This project provides a view for android apps that implements justified text view.

![Screenshot](https://raw.github.com/navabi/JustifiedTextView/master/raw/JustifiedTextView.png)

Android 2.0+ support

## Quick Setup

#### 1. Include library

**Manual:**
 * Downlaod the JustifiedTextView Library
 * Add it to your eclipse workspace
 * there is a sample project with the library that you can import as well
 * Go to your project properties and add JustifiedTextView as library

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
		mJTv.setLineSpacing(15);
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
    android:id="@+id/activity_main_jsv"
    android:layout_width="match_parent"
    android:layout_height="match_parent" >

    <ir.noghteh.JustifiedTextView
        android:id="@+id/activity_main_jtv_text"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="right"
        android:padding="25dp"
		xmlns:noghteh="http://noghteh.ir"
        noghteh:text="@string/hello_world"
        noghteh:textColor="@color/text"
        noghteh:textSize="18sp"
       >
    </ir.noghteh.JustifiedTextView>

</ScrollView>
```


## 4.License
please inform us if you use this library ( navabi70-at-gmail)

    Copyright 2013-2014 Mohsen Navabi

