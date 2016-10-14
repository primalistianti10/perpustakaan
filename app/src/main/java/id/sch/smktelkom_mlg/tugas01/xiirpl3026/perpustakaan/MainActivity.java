package id.sch.smktelkom_mlg.tugas01.xiirpl3026.perpustakaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    RadioGroup rgStatus;
    TextView tvHasil;
    Button bOk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.editTextNama);
        rgStatus = (RadioGroup) findViewById(R.id.radiogrupStatus);
        tvHasil=(TextView) findViewById(R.id.textViewHasil);
        bOk = (Button) findViewById(R.id.buttonHasil);
        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
            }
        });
    }

    private void doProcess() {
        if(isValid()){
            String nama =etNama.getText().toString();
            String hasil = null;
            if(rgStatus.getCheckedRadioButtonId()!=-1)
            {
                RadioButton rb = (RadioButton)
                        findViewById(rgStatus.getCheckedRadioButtonId());
                hasil = rb.getText().toString();
            }
            tvHasil.setText(" Nama : " + nama + hasil);
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();
        if(nama.isEmpty()){
            etNama.setError("Nama Belum Diisi");
            valid = false;
        }
        else if(nama.length()<3){
            etNama.setError("Nama minimal 3 karakte");
            valid = false;
        }
        else {
            etNama.setError(null);
        }
        return valid;
    }
}
