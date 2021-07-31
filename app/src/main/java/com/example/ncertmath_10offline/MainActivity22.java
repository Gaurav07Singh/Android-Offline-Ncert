package com.example.ncertmath_10offline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity22 extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        pdfView=findViewById(R.id.pdfView);

        int story_position = getIntent().getIntExtra("key_position",0);

        if(story_position ==0) {
            pdfView.fromAsset("Index.pdf").load();
        } else if(story_position == 1){
            pdfView.fromAsset("Ch-1.pdf").load();
        }else if(story_position == 2){
            pdfView.fromAsset("Ch-2.pdf").load();
        }else if(story_position == 3){
            pdfView.fromAsset("Ch-3.pdf").load();
        }else if(story_position == 4){
            pdfView.fromAsset("Ch-4.pdf").load();
        }else if(story_position == 5){
            pdfView.fromAsset("Ch-5.pdf").load();
        }else if(story_position == 6){
            pdfView.fromAsset("Ch-6.pdf").load();
        }else if(story_position == 7){
            pdfView.fromAsset("Ch-7.pdf").load();
        }else if(story_position == 8){
            pdfView.fromAsset("Ch-8.pdf").load();
        }else if(story_position == 9){
            pdfView.fromAsset("Ch-9.pdf").load();
        }else if(story_position == 10){
            pdfView.fromAsset("Ch-10.pdf").load();
        }else if(story_position == 11){
            pdfView.fromAsset("Ch-11.pdf").load();
        }else if(story_position == 12){
            pdfView.fromAsset("Ch-12.pdf").load();
        }else if(story_position == 13){
            pdfView.fromAsset("Ch-13.pdf").load();
        }else if(story_position== 14){
            pdfView.fromAsset("Ch-14.pdf").load();
        }else if(story_position== 15){
            pdfView.fromAsset("Ch-15.pdf").load();
        }else if(story_position == 16){
            pdfView.fromAsset("Answer.pdf").load();
        }

    }
}