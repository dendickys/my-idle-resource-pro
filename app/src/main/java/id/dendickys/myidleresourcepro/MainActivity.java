package id.dendickys.myidleresourcepro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                delay1();
            }
        });
    }

    private void delay1() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText(getString(R.string.delay1));
            }
        }, 2000);
    }
}
