package ud.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.lang.UCharacterEnums;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity
{
    private EditText Valor01, Valor02;
    private RadioButton Opersuma;
    private RadioButton Operesta;
    private RadioButton Opermult;
    private RadioButton Operdiv;
    private Button Boton01;
    private TextView Textsal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Valor01 = findViewById(R.id.editTextNumber3);
        Valor02 = findViewById(R.id.editTextNumber4);
        Opersuma = findViewById(R.id.radioButton1);
        Operesta = findViewById(R.id.radioButton2);
        Opermult = findViewById(R.id.radioButton3);
        Operdiv = findViewById(R.id.radioButton4);

        Boton01 = findViewById(R.id.button);
        Textsal = findViewById(R.id.textView4);
    }

    public void calcular(View v)
    {
        double resultado = 0;
       // if (Valor01.getText().length() == 0 && Valor02.getText().length()) resultado =0;
        if (Opersuma.isChecked()) {//realizar suma
            resultado = Double.parseDouble(Valor01.getText().toString()) +
                    Double.parseDouble(Valor02.getText().toString());
        }
        if (Operesta.isChecked()) {
            //realizar resta
            resultado = Double.parseDouble(Valor01.getText().toString()) -
                    Double.parseDouble(Valor02.getText().toString());
        }
        if (Opermult.isChecked()) {
            //realizar multiplicar
            resultado = Double.parseDouble(Valor01.getText().toString()) *
                    Double.parseDouble(Valor02.getText().toString());
        }
        if (Operdiv.isChecked()){
        //realizar division
            resultado = Double.parseDouble(Valor01.getText().toString()) /
                    Double.parseDouble(Valor02.getText().toString());
        }



        Textsal.setText(new DecimalFormat("#.##").format(resultado));
    }

}

