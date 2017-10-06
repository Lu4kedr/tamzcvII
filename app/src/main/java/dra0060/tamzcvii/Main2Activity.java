package dra0060.tamzcvii;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class Main2Activity extends Activity {

    TextView tw;
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name =intent.getStringExtra("ZodiacName");


        //tw= (TextView) findViewById(R.id.textView3);
        wv=(WebView) findViewById(R.id.webView1);

        wv.loadUrl("https://www.horoskopy.cz/"+name.toLowerCase());
        //tw.setText(name);
    }
}
