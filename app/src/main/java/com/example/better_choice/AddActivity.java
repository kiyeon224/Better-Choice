package com.example.better_choice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        /* 뒤로가기 버튼 */
        ImageButton btn_back = (ImageButton) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //AddActivity.class로 넘어가는 intent 실행
                startActivity(new Intent(AddActivity.this, MainActivity.class));
                overridePendingTransition(0, R.anim.anim_slide_out_bottom);
                finish();
            }
        });

        /* 다음 버튼 */
        Button btn_next = (Button)findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //AddActivity.class로 넘어가는 intent 실행
                startActivity(new Intent(AddActivity.this, AddActivity02.class));
                overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_left);
                finish();
            }
        });
    }

}
