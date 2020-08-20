package com.example.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detail_user.*

class DetailUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)
        supportActionBar?.hide()

        val intent = intent.getParcelableExtra<User>(MainActivity.INTENT_PARCELABLE)

        img_detail_photo.setImageResource(intent.avatar)
        tv_detail_name.text = intent.name
        tv_detail_username.text = intent.username
        tv_detail_repository.text = intent.repository.toString()
        tv_detail_following.text = intent.following.toString()
        tv_detail_followers.text = intent.followers.toString()
        tv_user_company.text = intent.company
        tv_user_location.text = intent.location
    }
}
