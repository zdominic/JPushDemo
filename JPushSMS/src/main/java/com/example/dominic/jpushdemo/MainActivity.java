package com.example.dominic.jpushdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.jpush.sms.SMSSDK;

public class MainActivity extends Activity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        SMSSDK.getInstance().initSdk(this);
        SMSSDK.getInstance().setIntervalTime(30*1000);
        findViewById(R.id.sms_btn).setOnClickListener(this);
        findViewById(R.id.voice_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sms_btn:
                startActivity(new Intent(this,MainSmsActivity.class));
                break;
            case R.id.voice_btn:
//                Toast.makeText(this,"暂不支持",Toast.LENGTH_SHORT).show();

                startActivity(new Intent(this,MainVoiceActivity.class));
                break;
        }
    }
}
