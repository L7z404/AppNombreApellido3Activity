package castillo.leonel.EnviarDatos

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.EnviarDatos.R

class MainActivity2 : AppCompatActivity() {
    var mensajeRecibido = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val datoMostrar = findViewById<TextView>(R.id.datoMostrar)
        datoMostrar.text = ""
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        intent.extras?.let { bundle ->
            mensajeRecibido = bundle.getString("nombre", "")
//            datoMostrar.text = mensajeRecibido
        }

        btnRegresar.setOnClickListener{
            val i = Intent(this,MainActivity3::class.java)
            i.putExtra("apellido", datoMostrar.text.toString())
            i.putExtra("nombre", mensajeRecibido)
            startActivity(i)
            finish()
        }
    }
}