package dra0060.tamzcvii;

import android.app.Activity;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DatePicker.OnDateChangedListener {

    DatePicker myDate;
    TextView myText;
    ImageView myImage;

    String Names[] ={"Kozoroh","Vodnar","Ryby","Beran","Byk","Blizenci","Rak","Lev","Panna","Vahy","Stir","Strelec"};
    int images[]={R.drawable.kozoroh01,R.drawable.vodnar02,R.drawable.ryby03,R.drawable.beran04,R.drawable.byk05,R.drawable.blizenci06,R.drawable.rak07,R.drawable.lev08,R.drawable.panna09,R.drawable.vahy10,R.drawable.stir11,R.drawable.strelec12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        myDate = (DatePicker) findViewById(R.id.datePicker);
        myText=(TextView) findViewById(R.id.textView2);
        myImage = (ImageView) findViewById(R.id.imageView);

        Calendar c= Calendar.getInstance();


        myDate.init(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH),this);

        myText.setText(Names[GetZodiac((myDate))]);
        myImage.setImageResource(images[GetZodiac((myDate))]);


    }
    @Override
    public void onDateChanged(DatePicker view,int year,int monthOfYear,int dayOfMonth)
    {
        Log.i("month"," " +monthOfYear);
        myText.setText(Names[GetZodiac((myDate))]);
        myImage.setImageResource(images[GetZodiac((myDate))]);
    }

    public void myImageClick(View v)
    {
        Toast.makeText(v.getContext(),"myImageClick", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Main2Activity.class);

        intent.putExtra("ZodiacName",Names[myDate.getMonth()]);
        startActivity(intent);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.menuAbout)
        {
            Toast.makeText(getApplicationContext(),"AboutMenu", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, Main3Activity.class);

            startActivity(intent);

        }
        if(id==R.id.menuSettings)
        {
            Toast.makeText(getApplicationContext(),"SettingsMenu", Toast.LENGTH_SHORT).show();
        }

        return true;

    }

    private int GetZodiac(DatePicker dp)
    {
        int Month=dp.getMonth();
        int Day=dp.getDayOfMonth();
        switch(Month)
        {
            case 0:
                if(Day<=20)
                    return 0;
                else
                    return 1;

            case 1:
                if(Day<=20)
                    return 1;
                else
                    return 2;
            case 2:
                if(Day<=20)
                    if(Day<=20)
                        return 2;
                    else
                        return 3;
            case 3:
                if(Day<=20)
                    return 3;
                else
                    return 4;
            case 4:
                if(Day<=21)
                    return 4;
                else
                    return 5;
            case 5:
                if(Day<=21)
                    return 5;
                else
                    return 6;
            case 6:
                if(Day<=22)
                    return 6;
                else
                    return 7;
            case 7:
                if(Day<=22)
                    return 7;
                else
                    return 8;
            case 8:
                if(Day<=22)
                    return 8;
                else
                    return 9;
            case 9:
                if(Day<=23)
                    return 9;
                else
                    return 10;

            case 10:
                if(Day<=22)
                    return 10;
                else
                    return 11;
            case 11:
                if(Day<=21)
                    return 11;
                else
                    return 0;
        }
        return -1;
    }


}
