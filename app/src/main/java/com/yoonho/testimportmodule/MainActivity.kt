package com.yoonho.testimportmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.darsh.multipleimageselect.activities.AlbumSelectActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AlbumSelectActivity()
    }
}
