package com.example.better_choice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class AddActivity02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add02);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_afafaf_24dp);  //뒤로가기 icon을 ic_back_afafaf_24dp로 바꿔줌

        /* 뒤로가기 버튼 */
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setHomeButtonEnabled(true);


        /* 다음 버튼 */
        Button btn_next = findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //AddActivity.class로 넘어가는 intent 실행
                //startActivity(new Intent(AddActivity01.this, AddActivity02.class));
            }
        });
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
//                finish();   //끝내기
//                return true;
//            }
//        }
//        return super.onOptionsItemSelected(item);
//    }


}
