package reza.tugasacs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button btnBayar;
    int order=1;
    ScrollView scrollView;
    TextView tvPembayaran;
    Data data;
    Spinner spNG,spMG,spMR,spK;
    Integer temp;

    //firebase
    DatabaseReference myDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBayar = (Button) findViewById(R.id.btnBayar);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        tvPembayaran = (TextView) findViewById(R.id.tvPembayaran);

        spNG = (Spinner) findViewById(R.id.spNG);
        spMG = (Spinner) findViewById(R.id.spMG);
        spMR = (Spinner) findViewById(R.id.spMR);
        spK = (Spinner) findViewById(R.id.spK);
        data = new Data();

        myDatabase = FirebaseDatabase.getInstance().getReference();

        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //masukkan nilai
                temp = Integer.valueOf(spNG.getSelectedItem().toString());
                data.setJumlahNG(temp);
                temp = Integer.valueOf(spMG.getSelectedItem().toString());
                data.setJumlahMG(temp);
                temp = Integer.valueOf(spMR.getSelectedItem().toString());
                data.setJumlahMR(temp);
                temp = Integer.valueOf(spK.getSelectedItem().toString());
                data.setJumlahK(temp);
                data.setTotalBayar();

                //tampilkan nilai
                tvPembayaran.setText("Rp "+data.getTeksTotalBayar()+",-");
                myDatabase.child("Pembeli").child(String.valueOf(order)).child("Nasi Goreng").setValue(data.getJumlahNG());
                myDatabase.child("Pembeli").child(String.valueOf(order)).child("Mie Goreng").setValue(data.getJumlahMG());
                myDatabase.child("Pembeli").child(String.valueOf(order)).child("Mie Rebus").setValue(data.getJumlahMR());
                myDatabase.child("Pembeli").child(String.valueOf(order)).child("Kwetiaw").setValue(data.getJumlahK());
                myDatabase.child("Pembeli").child(String.valueOf(order)).child("Total Bayar :").setValue(data.getTotalBayar());
                order = order + 1;
            }
        });
    }


}
