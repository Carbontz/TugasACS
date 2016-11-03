package reza.tugasacs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button btnBayar;
    EditText editText;
    ScrollView scrollView;
    TextView tvPembayaran;
    Data data;

    //firebase
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Pesan");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBayar = (Button) findViewById(R.id.btnBayar);
        editText = (EditText) findViewById(R.id.editText);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        tvPembayaran = (TextView) findViewById(R.id.tvPembayaran);
        data = new Data();

        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}
