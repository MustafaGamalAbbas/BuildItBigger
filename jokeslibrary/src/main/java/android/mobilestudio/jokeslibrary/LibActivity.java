package android.mobilestudio.jokeslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
        if(getIntent()!=null){
            String currentJoke  = getIntent().getStringExtra("joke");
            TextView joke = (TextView) findViewById(R.id.tv_jokeContent);
            joke.setText(currentJoke);
            Toast.makeText(this, currentJoke, Toast.LENGTH_SHORT).show();

        }
    }
}
