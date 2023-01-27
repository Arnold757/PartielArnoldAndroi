package fr.isen.dedji.partielarnoldandroid



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.isen.dedji.partielarnoldandroid.databinding.ActivityCategoryBinding
class Category : AppCompatActivity() {
    private lateinit var binding:ActivityCategoryBinding
    private lateinit var category: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        category = intent.getStringExtra("category") ?:""
    }
}