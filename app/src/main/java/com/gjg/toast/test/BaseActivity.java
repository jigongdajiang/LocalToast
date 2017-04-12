package com.gjg.toast.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gjg.toast.test.toast.ToastUitl;

/**
 * @author gaojigong
 * @version V1.0
 * @Description:
 * @date 17/4/12
 */
public class BaseActivity extends AppCompatActivity {
    protected boolean isResume;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        isResume = true;
        super.onResume();
    }

    @Override
    protected void onStop() {
        isResume = false;
        super.onStop();
    }
    protected void showToastLong(String msg){
        ToastUitl.showLong(this,msg,isResume);
    }
}
