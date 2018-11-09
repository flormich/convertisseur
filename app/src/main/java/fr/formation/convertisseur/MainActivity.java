package fr.formation.convertisseur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button calcul;
    TextView textEuros;
    TextView textFrancs;
    final Double TAUX = 6.55957;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcul = findViewById(R.id.calcul);
        textEuros = findViewById(R.id.textEuros);
        textFrancs = findViewById(R.id.textFrancs);
    }

    public void Calcul(View view) {
        double ancienEuros = Double.parseDouble(textEuros.getText().toString());
        double calcul = ancienEuros * TAUX;
        //textFrancs.setText(String.valueOf(calcul));
        textFrancs.setText(String.format("%.2f",calcul));
    }

    public void RaZ(View view) {
        textEuros.setText("");
        textFrancs.setText("");
    }
}
