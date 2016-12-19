package com.example.tempcw.startapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.button);
        textView= (TextView) findViewById(R.id.text);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent intent = new Intent();
//                    intent.setAction(Intent.ACTION_VIEW);
//                    intent.setType("test/");
//                    startActivity(intent);
//                   // startActivityForResult(intent, 2);
//                }catch(Exception e){
//                    e.printStackTrace();
//                    Toast.makeText(MainActivity.this,"请安装吉林公安APP",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK) {
            switch (requestCode) {
                case 2:
                    button.setText("URL:"+data.getDataString().toLowerCase());
                    textView.setText(data.getDataString());
                    Log.i("jc",data.getDataString().toLowerCase());
                    break;
                default:
                    break;
            }

        }
    }
    public void startJiLinAPP(){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setType("test/");
        startActivity(intent);
    }
}
