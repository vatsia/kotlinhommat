package fi.ovatsia.activityshit

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBtn.setOnClickListener{ view ->
            val webIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://ovatsia.fi"))
            startActivity(webIntent)
        }

        faggotBtn.setOnClickListener { view ->
            val fagIntent: Intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:112")
            }
            startActivity(fagIntent)
        }

        nerdBtn.setOnClickListener { view ->
            val fagIntent: Intent = Intent(this@MainActivity, Main2Activity::class.java)
            fagIntent.putExtra("isFaggot", "ON")
            startActivityForResult(fagIntent, 5)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 5) {
            if (data != null) {
                txtKek.text = data.extras?.get("kek").toString()
            }
        }
    }
}
