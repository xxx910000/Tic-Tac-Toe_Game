package com.example.tic_tac_toegame;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class game extends AppCompatActivity {

    private boolean cf = true;
    private Button[] b = new Button[9];
    private int[] b_ = new int[9];
    private TextView Vcf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        for(int i =1;i<10;i++){
            String bid = "b"+i;
            int resid = getResources().getIdentifier(bid,"id",getPackageName());
            b[i-1]=findViewById(resid);}

        b_[0]=3;
        b_[1]=4;
        b_[2]=5;
        b_[3]=6;
        b_[4]=7;
        b_[5]=8;
        b_[6]=9;
        b_[7]=10;
        b_[8]=11;

        Vcf = (TextView)findViewById(R.id.Vcf);

    }

    //btn.setBackgroundResource(R.drawable.g_bg2);
    //btn.setBackgroundColor(Color.WHITE);

    public void click(View view) {
        if (cf){
            Vcf.setText(R.string.f);
        switch (view.getId()){
            case R.id.b1:
                b[0].setBackgroundResource(R.drawable.c);
                b[0].setEnabled(false);
                b_[0]=0;
                judge1();
                cf=false;
                break;
            case R.id.b2:
                b[1].setBackgroundResource(R.drawable.c);
                b[1].setEnabled(false);
                b_[1]=0;
                judge1();
                cf=false;
                break;
            case R.id.b3:
                b[2].setBackgroundResource(R.drawable.c);
                b[2].setEnabled(false);
                b_[2]=0;
                judge1();
                cf=false;
                break;
            case R.id.b4:

                b[3].setBackgroundResource(R.drawable.c);
                b[3].setEnabled(false);
                b_[3]=0;
                judge1();
                cf=false;
                break;
            case R.id.b5:
                b[4].setBackgroundResource(R.drawable.c);
                b[4].setEnabled(false);
                b_[4]=0;
                judge1();
                cf=false;
                break;
            case R.id.b6:
                b[5].setBackgroundResource(R.drawable.c);
                b[5].setEnabled(false);
                b_[5]=0;
                judge1();
                cf=false;
                break;
            case R.id.b7:
                b[6].setBackgroundResource(R.drawable.c);
                b[6].setEnabled(false);
                b_[6]=0;
                judge1();
                cf=false;
                break;
            case R.id.b8:
                b[7].setBackgroundResource(R.drawable.c);
                b[7].setEnabled(false);
                b_[7]=0;
                judge1();
                cf=false;
                break;
            case R.id.b9:
                b[8].setBackgroundResource(R.drawable.c);
                b[8].setEnabled(false);
                b_[8]=0;
                judge1();
                cf=false;
                break;
        }}
        else{
            Vcf.setText(R.string.c);
            switch (view.getId()){
                case R.id.b1:
                    b[0].setBackgroundResource(R.drawable.f2);
                    b[0].setEnabled(false);
                    b_[0]=1;
                    judge2();
                    cf=true;
                    break;
                case R.id.b2:
                    b[1].setBackgroundResource(R.drawable.f2);
                    b[1].setEnabled(false);
                    b_[1]=1;
                    judge2();
                    cf=true;
                    break;
                case R.id.b3:
                    b[2].setBackgroundResource(R.drawable.f2);
                    b[2].setEnabled(false);
                    b_[2]=1;
                    judge2();
                    cf=true;
                    break;
                case R.id.b4:

                    b[3].setBackgroundResource(R.drawable.f2);
                    b[3].setEnabled(false);
                    b_[3]=1;
                    judge2();
                    cf=true;
                    break;
                case R.id.b5:
                    b[4].setBackgroundResource(R.drawable.f2);
                    b[4].setEnabled(false);
                    b_[4]=1;
                    judge2();
                    cf=true;
                    break;
                case R.id.b6:
                    b[5].setBackgroundResource(R.drawable.f2);
                    b[5].setEnabled(false);
                    b_[5]=1;
                    judge2();
                    cf=true;
                    break;
                case R.id.b7:
                    b[6].setBackgroundResource(R.drawable.f2);
                    b[6].setEnabled(false);
                    b_[6]=1;
                    judge2();
                    cf=true;
                    break;
                case R.id.b8:
                    b[7].setBackgroundResource(R.drawable.f2);
                    b[7].setEnabled(false);
                    b_[7]=1;
                    judge2();
                    cf=true;
                    break;
                case R.id.b9:
                    b[8].setBackgroundResource(R.drawable.f2);
                    b[8].setEnabled(false);
                    b_[8]=1;
                    judge2();
                    cf=true;
                    break;
            }}

    }

    public void judge1(){
        if((b_[0]==b_[1]&&b_[1]==b_[2])||(b_[3]==b_[4]&&b_[4]==b_[5])||(b_[6]==b_[7]&&b_[7]==b_[8])||(b_[0]==b_[3]&&b_[3]==b_[6])||(b_[1]==b_[4]&&b_[4]==b_[7])||(b_[2]==b_[5]&&b_[5]==b_[8])||(b_[0]==b_[4]&&b_[4]==b_[8])||(b_[2]==b_[4]&&b_[4]==b_[6])){
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setTitle("Judge");
            dialog.setMessage("◯   Win！！");
            dialog.setPositiveButton("再來一局", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    b_[0]=3;b_[1]=4;b_[2]=5;b_[3]=6;b_[4]=7;b_[5]=8;b_[6]=9;b_[7]=10;b_[8]=11;
                    b[0].setBackgroundColor(Color.parseColor("#00000000"));b[1].setBackgroundColor(Color.parseColor("#00000000"));b[2].setBackgroundColor(Color.parseColor("#00000000"));b[3].setBackgroundColor(Color.parseColor("#00000000"));b[4].setBackgroundColor(Color.parseColor("#00000000"));b[5].setBackgroundColor(Color.parseColor("#00000000"));b[6].setBackgroundColor(Color.parseColor("#00000000"));b[7].setBackgroundColor(Color.parseColor("#00000000"));b[8].setBackgroundColor(Color.parseColor("#00000000"));
                    b[0].setEnabled(true);b[1].setEnabled(true);b[2].setEnabled(true);b[3].setEnabled(true);b[4].setEnabled(true);b[5].setEnabled(true);b[6].setEnabled(true);b[7].setEnabled(true);b[8].setEnabled(true);
                    cf=true;
                }
            });
            dialog.show();
        }
        if(b_[0]+b_[1]+b_[2]+b_[3]+b_[4]+b_[5]+b_[6]+b_[7]+b_[8]<5){
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setTitle("Judge");
            dialog.setMessage("T i e！！");
            dialog.setPositiveButton("再來一局", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    b_[0]=3;b_[1]=4;b_[2]=5;b_[3]=6;b_[4]=7;b_[5]=8;b_[6]=9;b_[7]=10;b_[8]=11;
                    b[0].setBackgroundColor(Color.parseColor("#00000000"));b[1].setBackgroundColor(Color.parseColor("#00000000"));b[2].setBackgroundColor(Color.parseColor("#00000000"));b[3].setBackgroundColor(Color.parseColor("#00000000"));b[4].setBackgroundColor(Color.parseColor("#00000000"));b[5].setBackgroundColor(Color.parseColor("#00000000"));b[6].setBackgroundColor(Color.parseColor("#00000000"));b[7].setBackgroundColor(Color.parseColor("#00000000"));b[8].setBackgroundColor(Color.parseColor("#00000000"));
                    b[0].setEnabled(true);b[1].setEnabled(true);b[2].setEnabled(true);b[3].setEnabled(true);b[4].setEnabled(true);b[5].setEnabled(true);b[6].setEnabled(true);b[7].setEnabled(true);b[8].setEnabled(true);

                    cf=true;
                }
            });
            dialog.show();
        }
    }

    public void judge2(){
        if((b_[0]==b_[1]&&b_[1]==b_[2])||(b_[3]==b_[4]&&b_[4]==b_[5])||(b_[6]==b_[7]&&b_[7]==b_[8])||(b_[0]==b_[3]&&b_[3]==b_[6])||(b_[1]==b_[4]&&b_[4]==b_[7])||(b_[2]==b_[5]&&b_[5]==b_[8])||(b_[0]==b_[4]&&b_[4]==b_[8])||(b_[2]==b_[4]&&b_[4]==b_[6])){
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setTitle("Judge");
            dialog.setMessage("✗   Win！！");
            dialog.setPositiveButton("再來一局", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    b_[0]=3;b_[1]=4;b_[2]=5;b_[3]=6;b_[4]=7;b_[5]=8;b_[6]=9;b_[7]=10;b_[8]=11;
                    b[0].setBackgroundColor(Color.parseColor("#00000000"));b[1].setBackgroundColor(Color.parseColor("#00000000"));b[2].setBackgroundColor(Color.parseColor("#00000000"));b[3].setBackgroundColor(Color.parseColor("#00000000"));b[4].setBackgroundColor(Color.parseColor("#00000000"));b[5].setBackgroundColor(Color.parseColor("#00000000"));b[6].setBackgroundColor(Color.parseColor("#00000000"));b[7].setBackgroundColor(Color.parseColor("#00000000"));b[8].setBackgroundColor(Color.parseColor("#00000000"));
                    b[0].setEnabled(true);b[1].setEnabled(true);b[2].setEnabled(true);b[3].setEnabled(true);b[4].setEnabled(true);b[5].setEnabled(true);b[6].setEnabled(true);b[7].setEnabled(true);b[8].setEnabled(true);
                    cf=true;
                }
            });
            dialog.show();
        }
    }

}
