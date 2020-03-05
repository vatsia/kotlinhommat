package fi.ovatsia.listahomma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista: ArrayList<Person> = arrayListOf(Person("Nerd", 12), Person("Jani", 1))

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(lista)

        recyclerView.adapter = viewAdapter
        recyclerView.layoutManager = viewManager

    }
}
