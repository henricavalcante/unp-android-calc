package solutions.rinus.henricavalcante.unp_dispositivosmveis_atividade03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button somar = (Button) findViewById(R.id.somar);
        somar.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText primeiroNumero = (EditText)findViewById(R.id.primeiroNumero);
                EditText segundoNumero = (EditText)findViewById(R.id.segundoNumero);
                EditText resultado = (EditText)findViewById(R.id.resultado);

                float primeiro = Float.parseFloat(primeiroNumero.getText().toString());
                float segundo = Float.parseFloat(segundoNumero.getText().toString());

                resultado.setText(String.valueOf(primeiro + segundo));
            }
        });

        Button subtrair = (Button) findViewById(R.id.subtrair);
        subtrair.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText primeiroNumero = (EditText)findViewById(R.id.primeiroNumero);
                EditText segundoNumero = (EditText)findViewById(R.id.segundoNumero);
                EditText resultado = (EditText)findViewById(R.id.resultado);

                float primeiro = Float.parseFloat(primeiroNumero.getText().toString());
                float segundo = Float.parseFloat(segundoNumero.getText().toString());

                resultado.setText(String.valueOf(primeiro - segundo));
            }
        });

        Button multiplicar = (Button) findViewById(R.id.multiplicar);
        multiplicar.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText primeiroNumero = (EditText)findViewById(R.id.primeiroNumero);
                EditText segundoNumero = (EditText)findViewById(R.id.segundoNumero);
                EditText resultado = (EditText)findViewById(R.id.resultado);

                float primeiro = Float.parseFloat(primeiroNumero.getText().toString());
                float segundo = Float.parseFloat(segundoNumero.getText().toString());

                resultado.setText(String.valueOf(primeiro * segundo));
            }
        });

        Button dividir = (Button) findViewById(R.id.dividir);
        dividir.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText primeiroNumero = (EditText)findViewById(R.id.primeiroNumero);
                EditText segundoNumero = (EditText)findViewById(R.id.segundoNumero);
                EditText resultado = (EditText)findViewById(R.id.resultado);

                float primeiro = Float.parseFloat(primeiroNumero.getText().toString());
                float segundo = Float.parseFloat(segundoNumero.getText().toString());

                resultado.setText(String.valueOf(primeiro / segundo));
            }
        });
    }


}
