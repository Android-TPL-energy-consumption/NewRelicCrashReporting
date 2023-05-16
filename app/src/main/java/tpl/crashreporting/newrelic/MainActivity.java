package tpl.crashreporting.newrelic;

import androidx.appcompat.app.AppCompatActivity;
import com.newrelic.agent.android.NewRelic;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NewRelic.withApplicationToken(
                "eu01xx09c8d719d87565a3f0e99f6d9009db6a5add-NRMA"
        ).start(this.getApplicationContext());
    }

    public void onButtonClick(android.view.View view) {
        throw new RuntimeException("Test crash");
    }
}