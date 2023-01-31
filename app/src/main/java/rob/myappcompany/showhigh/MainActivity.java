package rob.myappcompany.showhigh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button showButton;
    Button hideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        showButton = findViewById(R.id.showButton);
        hideButton = findViewById(R.id.hideButton);
    }

    public void clickedShow(View view) {
        textView.setVisibility(View.INVISIBLE);
    }

    public void clickedHide(View view) {
        textView.setVisibility(View.VISIBLE);
    }
}
