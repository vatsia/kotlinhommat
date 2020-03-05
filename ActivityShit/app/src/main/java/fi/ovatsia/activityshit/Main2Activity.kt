package fi.ovatsia.activityshit

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val extras: Bundle? = getIntent().getExtras()
        if(extras == null) {
            return
        }
        txtIsFaggot.text = extras.getString("isFaggot")

        doneBtn.setOnClickListener{ view ->
            val data: Intent = Intent()
            data.putExtra("kek", fagTxt.text)
            setResult(Activity.RESULT_OK, data)
            super.finish()
        }
    }
}
