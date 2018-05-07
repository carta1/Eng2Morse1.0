package c.yayo.experiment

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.app_bar_about.*

class AboutActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setSupportActionBar(toolbar)



        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.about, menu)
        return true
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {R.id.home -> {

            val i = Intent(this, Eng2morseFActivity::class.java)
            startActivity(i)
            return true

        }
            R.id.morseAlphabet -> {

                val i = Intent(this, AlphabetActivity::class.java)
                startActivity(i)
                return true

            }

            R.id.instructions -> {

                val i = Intent(this, InstructionsActivity::class.java)
                startActivity(i)
                return true

            }
            R.id.map -> {

                val i = Intent(this, MapActivity::class.java)
                startActivity(i)
                return true

            }
            R.id.about -> {

                val i = Intent(this, AboutActivity::class.java)
                startActivity(i)
                return true

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
