package com.example.githubuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object { val INTENT_PARCELABLE = "intent_parcelable"}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listUser = listOf<User>(
            User(
                R.drawable.user1,
                "Jake Wharton",
                "JakeWharton",
                102,
                12,
                56995,
                "Google, Inc.",
                "Pittsburgh, PA, USA"
            ),
            User(
                R.drawable.user2,
                "Amit Shekhar",
                "amitshekhariitbhu",
                37,
                2,
                5153,
                "MindOrksOpenSource",
                "New Delhi, India"
            ),
            User(
                R.drawable.user3,
                "Romain Guy",
                "romainguy",
                9,
                0,
                7972,
                "Google",
                "California"
            ),
            User(
                R.drawable.user4,
                "Chris Banes",
                "chrisbanes",
                30,
                1,
                14725,
                "Google working on @android",
                "Sydney, Australia"
            ),
            User(
                R.drawable.user5,
                "David",
                "tipsy",
                56,
                0,
                788,
                "Working Group Two",
                "Trondheim, Norway"
            ),
            User(
                R.drawable.user6,
                "Ravi Tamada",
                "ravi8x",
                28,
                3,
                18628,
                "AndroidHive | Droid5",
                "India"
            ),
            User(
                R.drawable.user7,
                "Deny Prasetyo",
                "jasoet",
                28,
                39,
                277,
                "gojek-engineering",
                "Kotagede, Yogyakarta, Indonesia"
            ),
            User(
                R.drawable.user8,
                "Budi Oktaviyan",
                "budioktaviyan",
                110,
                23,
                178,
                "KotlinID",
                "Jakarta, Indonesia"
            ),
            User(
                R.drawable.user9,
                "Hendi Santika",
                "hendisantika",
                106,
                61,
                428,
                "JVMDeveloperID",
                "Bojongsoang - Bandung, Jawa Barat"
            ),
            User(
                R.drawable.user10,
                "Sidiq Permana",
                "sidiqpermana",
                65,
                10,
                465,
                "Nusantara Beta Studio",
                "Jakarta, Indonesia"
            )
        )

        recyclerView()
        recycler_view.adapter = UserAdapter(this,listUser){
            val intent = Intent(this,DetailUserActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
    private fun recyclerView(){
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
}
