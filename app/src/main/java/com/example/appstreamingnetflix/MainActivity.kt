package com.example.appstreamingnetflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import com.example.appstreamingnetflix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    final lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener{
            val vistaLogin = Intent(this, LoginActivity::class.java)
            startActivity(vistaLogin)
        }

        binding.Spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (binding.Spinner.selectedItem.equals("¿Qué es Netflix?")){
                    binding.textView2.setText("Netflix es un servicio de streaming que ofrece una amplia variedad de series, películas, títulos de anime, documentales y otros contenidos premiados en miles de dispositivos conectados a internet.").toString()
                }
                else if (binding.Spinner.selectedItem.equals("¿Cuánto cuesta Netflix?")){
                    binding.textView2.setText("Disfruta de Netflix en tu smartphone, tableta, Smart TV, ordenador o dispositivo de streaming, todo por una tarifa mensual fija. Planes desde 5,49 € a 17,99 € al mes. Sin cargos adicionales ni contratos.").toString()
                }
                else if(binding.Spinner.selectedItem.equals("¿Dónde puedo ver Netflix?")){
                    binding.textView2.setText("Disfruta donde quieras y cuando quieras. Inicia sesión con tu cuenta de Netflix para disfrutar al instante de todo el contenido de netflix.com desde tu ordenador personal o en cualquier dispositivo conectado a internet que ofrezca la aplicación de Netflix.").toString()
                }
                else if (binding.Spinner.selectedItem.equals("¿Qué puedo ver en Netflix?")){
                    binding.textView2.setText("Netflix dispone de una amplia biblioteca de originales de Netflix galardonados, títulos de anime, series de TV, documentales, largometrajes y otros contenidos. Ve todo el contenido que quieras, cuando quieras.").toString()
                }
                else{
                    binding.textView2.setText("La experiencia infantil de Netflix se incluye en la suscripción para que los padres tengan el control mientras los niños disfrutan de series y películas familiares en su propio espacio.").toString()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }
}