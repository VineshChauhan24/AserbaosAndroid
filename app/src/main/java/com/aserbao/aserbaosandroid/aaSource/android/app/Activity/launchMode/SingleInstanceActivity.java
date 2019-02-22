package com.aserbao.aserbaosandroid.aaSource.android.app.Activity.launchMode;

public class SingleInstanceActivity extends BaseLaunchModeActivity {


    @Override
    public void setTextViewContent() {
        mLaunchModeTv.setText(String.valueOf(getTaskId()) +"\n SingleInstanceActivity \n SingleInstance");
        mActivityName = "SingleInstanceActivity ==";
    }

    @Override
    public void onBackPressed() {
        sBackList.add("B");
        super.onBackPressed();
    }
}
