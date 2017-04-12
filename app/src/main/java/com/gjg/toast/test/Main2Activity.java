package com.gjg.toast.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gjg.toast.test.toast.ToastUitl;

public class Main2Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickToast(View view){
        showToastLong("22222");
    }
    public void toOther(View view){
        startActivity(new Intent(this,Main3Activity.class));
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
