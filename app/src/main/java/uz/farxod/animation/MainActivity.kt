package uz.farxod.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.farxod.animation.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.add(R.id.fragment_container, MainFragment()).commit()
    }
}