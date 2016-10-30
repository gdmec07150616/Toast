package cn.gdmec.lyc07150616.toast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b1(View v)
    {
        Toast.makeText(this,"前面内容",Toast.LENGTH_SHORT).show();
    }
    public  void b2(View v)
    {
        /*LayoutInflater lf = getLayoutInflater();
        LayoutInflater lf = LayoutInflater.from(this);*/
        LayoutInflater lf = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vroot = lf.inflate(R.layout.loastroot,null);
        LinearLayout ll = (LinearLayout) vroot.findViewById(R.id.clayot);
        lf.inflate(R.layout.loastinfo,ll);
        Toast toast = new Toast(this);
        toast.setView(vroot);
        toast.show();
    }
    public  void b3(View v)
    {
        Toast toast = Toast.makeText(this,"我是小黄人，图文",Toast.LENGTH_SHORT);
        LinearLayout ll = new LinearLayout(this);
        ll .setOrientation(LinearLayout.VERTICAL);
        ImageView mImage = new ImageView(this);
        mImage.setImageResource(R.drawable.yellowman);
        View toastView = toast.getView();
        ll.addView(mImage);
        ll.addView(toastView);
        toast.setView(toastView);
        toast.setView(ll);
        toast.show();
    }
}
