package com.akirachix.myreaderapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myreaderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.rvBooks.layoutManager = LinearLayoutManager(this)
        display()

    }
    fun display(){
        val book1 = Author("Trevor Noah","Born A Crime","","","2-3-2004","Trevor Noah wrote the book born a crime a s aresult of" +
                " being encourage dto do so by the racial segregation" +
                " that was rampant within the South African region." +
                "He was torn between the blacks and the whites that existed during " +
                "the apartheid system as  he was neither black nor" +
                " white and so he colud not fir in any of the two groups.Trevor and his " +
                "mother coped with the challenges they were experiencing through humor,religion and love")
        val book2 = Author("Trevor Noah","Born A Crime","","","2-3-2004","Trevor Noah wrote the book born a crime a s aresult of" +
                " being encourage dto do so by the racial segregation" +
                " that was rampant within the South African region." +
                "He was torn between the blacks and the whites that existed during " +
                "the apartheid system as  he was neither black nor" +
                " white and so he colud not fir in any of the two groups.Trevor and his " +
                "mother coped with the challenges they were experiencing through humor,religion and love")
        val book3 = Author("Trevor Noah","Born A Crime","","","2-3-2004","Trevor Noah wrote the book born a crime a s aresult of" +
                " being encourage dto do so by the racial segregation" +
                " that was rampant within the South African region." +
                "He was torn between the blacks and the whites that existed during " +
                "the apartheid system as  he was neither black nor" +
                " white and so he colud not fir in any of the two groups.Trevor and his " +
                "mother coped with the challenges they were experiencing through humor,religion and love")
        val book4 = Author("Trevor Noah","Born A Crime","","","2-3-2004","Trevor Noah wrote the book born a crime a s aresult of" +
                " being encourage dto do so by the racial segregation" +
                " that was rampant within the South African region." +
                "He was torn between the blacks and the whites that existed during " +
                "the apartheid system as  he was neither black nor" +
                " white and so he colud not fir in any of the two groups.Trevor and his " +
                "mother coped with the challenges they were experiencing through humor,religion and love")
        val book5 = Author("Trevor Noah","Born A Crime","","","2-3-2004","Trevor Noah wrote the book born a crime a s aresult of" +
                " being encourage dto do so by the racial segregation" +
                " that was rampant within the South African region." +
                "He was torn between the blacks and the whites that existed during " +
                "the apartheid system as  he was neither black nor" +
                " white and so he colud not fir in any of the two groups.Trevor and his " +
                "mother coped with the challenges they were experiencing through humor,religion and love")
        val myBooks = listOf(book1,book2,book3,book4,book5)
        val booksAdapter = AuthorsAdapter(myBooks)
        binding.rvBooks.adapter = booksAdapter

    }


}