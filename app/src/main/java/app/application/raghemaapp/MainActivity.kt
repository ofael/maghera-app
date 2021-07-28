package app.application.raghemaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCriarConta = findViewById<Button?>(R.id.btn_criar_conta)

        btnCriarConta.setOnClickListener {
            val intent = Intent(this,ActivityCriarConta::class.java)
            startActivity(intent)
        }
    }
}