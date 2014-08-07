package ir.mohsennavabi.justifiedtextviewtest;

import ir.noghteh.JustifiedTextView;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Paint.Align;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener,
		OnSeekBarChangeListener {

	private JustifiedTextView mJTv;
	private TextView mTv;
	private SeekBar mSbSize;
	private LinearLayout mLlGreen, mLlRed;
	private TextView mTvEng, mTvFa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initViews();
	}

	private void initViews() {
		mJTv = (JustifiedTextView) findViewById(R.id.activity_main_jtv);
		mTv = (TextView) findViewById(R.id.activity_main_tv);
		mLlGreen = (LinearLayout) findViewById(R.id.activity_main_ll_green);
		mLlRed = (LinearLayout) findViewById(R.id.activity_main_ll_red);
		mTvEng = (TextView) findViewById(R.id.activity_main_tv_eng);
		mTvFa = (TextView) findViewById(R.id.activity_main_tv_fa);

		mSbSize = (SeekBar) findViewById(R.id.activity_main_sb_size);
		mSbSize.setMax(20);
		mSbSize.setProgress(10);

		mSbSize.setOnSeekBarChangeListener(this);

		mLlGreen.setOnClickListener(this);
		mLlRed.setOnClickListener(this);
		mTvEng.setOnClickListener(this);
		mTvFa.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		switch (arg0.getId()) {
		case R.id.activity_main_ll_red:
			mJTv.setTextColor(getResources().getColor(R.color.red));
			mTv.setTextColor(getResources().getColor(R.color.red));
			break;
		case R.id.activity_main_ll_green:
			mJTv.setTextColor(getResources().getColor(R.color.green));
			mTv.setTextColor(getResources().getColor(R.color.green));
			break;
		case R.id.activity_main_tv_eng:
			mJTv.setAlignment(Align.LEFT);
			mJTv.setText(R.string.text_eng);
			mTv.setText(R.string.text_eng);
			break;
		case R.id.activity_main_tv_fa:
			mJTv.setAlignment(Align.RIGHT);
			mJTv.setText(R.string.text_fa);
			mTv.setText(R.string.text_fa);
			break;
		default:
			break;
		}
	}

	@Override
	public void onProgressChanged(SeekBar arg0, int pos, boolean arg2) {

		int size = 10;
		mTv.setTextSize(TypedValue.COMPLEX_UNIT_SP, pos + size);
		mJTv.setTextSize(TypedValue.COMPLEX_UNIT_SP, pos + size);
		mJTv.setLineSpacing(pos - size);
		mTv.setLineSpacing(pos - size, 1);
	}

	@Override
	public void onStartTrackingTouch(SeekBar arg0) {

	}

	@Override
	public void onStopTrackingTouch(SeekBar arg0) {

	}

}
