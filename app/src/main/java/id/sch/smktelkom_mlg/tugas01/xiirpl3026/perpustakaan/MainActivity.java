package id.sch.smktelkom_mlg.tugas01.xiirpl3026.perpustakaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    RadioButton rb1, rb2;
    TextView tvHasil;
    Button Hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        Hasil = (Button) findViewById(R.id.buttonHasil);
        tvHasil= (TextView) findViewById(R.id.textView7);
        
        findViewById(R.id.buttonHasil).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }

            private void doClick() {
                String hasil = null;

                if(rb1.isChecked()){
                    hasil = rb1.getText().toString();
                }
                else if (rb2.isChecked()){
                    hasil = rb2.getText().toString();
                }
                if (hasil==null){
                    tvHasil.setText("Anda Belum Memilih Jenis Buku");
                }
                else {
                    tvHasil.setText("Jenis Buku : " + hasil);
                }
            }
        });
    }
}
