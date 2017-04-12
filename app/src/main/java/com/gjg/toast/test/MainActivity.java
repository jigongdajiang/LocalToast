package com.gjg.toast.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.gjg.toast.test.toast.ToastUitl;

import java.util.Random;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickToast(View view){
        showToastLong("aaaa");
        final Handler handler = new Handler();
        final Random random = new Random();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                showToastLong(random.nextInt()+"");
                handler.postDelayed(this,2000);
            }
        };
        handler.post(runnable);
    }
    public void toOther(View view){
        startActivity(new Intent(this,Main2Activity.class));
    }

    @Override
    protected void onStop() {
        super.onStop();
        ToastUitl.onInvisible();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ToastUitl.onDestroy();
    }
}
