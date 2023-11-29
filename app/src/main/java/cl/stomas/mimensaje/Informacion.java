package cl.stomas.mimensaje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Informacion extends AppCompatActivity {

    //DECLARACIÓN DE VARIABLES
    Button btnContinuarInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        btnContinuarInfo = (Button) findViewById(R.id.btnContinuarInfo);

        //BOTÓN PARA CONTINUAR A LA SIGUIENTE PANTALLA
        btnContinuarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Informacion.this, EnviarMensaje.class);
                startActivity(intent);
            }
        });
    }
}