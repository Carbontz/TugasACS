package reza.tugasacs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBayar = (Button) findViewById(R.id.btnBayar);
        EditText editText = (EditText) findViewById(R.id.editText);
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);
        TextView tvPembayaran = (TextView) findViewById(R.id.tvPembayaran);
        Data data = new Data();

        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
