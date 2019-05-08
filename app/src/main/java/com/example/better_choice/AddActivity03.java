package com.example.better_choice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class AddActivity03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add03);

        /* 각각 점수의 속성 선택 */
        Spinner attributeSpinner1 = (Spinner) findViewById(R.id.attribute_spinner1);
        ArrayAdapter<CharSequence> attributeAdapter1 = ArrayAdapter.createFromResource(this, R.array.attribute_array, android.R.layout.simple_spinner_item);
        attributeAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        attributeSpinner1.setAdapter(attributeAdapter1);

        Spinner attributeSpinner2 = (Spinner) findViewById(R.id.attribute_spinner2);
        ArrayAdapter<CharSequence> attributeAdapter2 = ArrayAdapter.createFromResource(this, R.array.attribute_array, android.R.layout.simple_spinner_item);
        attributeAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        attributeSpinner2.setAdapter(attributeAdapter2);

        Spinner attributeSpinner3 = (Spinner) findViewById(R.id.attribute_spinner3);
        ArrayAdapter<CharSequence> attributeAdapter3 = ArrayAdapter.createFromResource(this, R.array.attribute_array, android.R.layout.simple_spinner_item);
        attributeAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        attributeSpinner3.setAdapter(attributeAdapter3);

        /* 다음 버튼 */
        Button btn_next = (Button)findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //AddActivity.class로 넘어가는 intent 실행
                startActivity(new Intent(AddActivity03.this, MainActivity.class));
                overridePendingTransition(0, R.anim.anim_slide_out_bottom);
            }
        });

        /* 뒤로가기 버튼 */
        ImageButton btn_back = (ImageButton)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //AddActivity.class로 넘어가는 intent 실행
                startActivity(new Intent(AddActivity03.this, AddActivity02.class));
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
                finish();
            }
        });
    }

}
