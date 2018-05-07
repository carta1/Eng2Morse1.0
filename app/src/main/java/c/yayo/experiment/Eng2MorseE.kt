package c.yayo.experiment

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.hardware.camera2.CameraManager
import android.os.Looper
import android.support.v4.app.ActivityCompat


import android.view.View
import android.widget.Toast
import com.google.android.gms.location.*
import android.content.Intent

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    lateinit var fusedLocationProvider: FusedLocationProviderClient
    lateinit var locationRequest: LocationRequest
    lateinit var locationCallback: LocationCallback

    val REQUEST_CODE = 1000
    //CTRL + O

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode)
        {

            REQUEST_CODE->{
                if(grantResults.size > 0)
                {

                    if(grantResults[0] == PackageManager.PERMISSION_GRANTED)
                        Toast.makeText(this,"Permission Granted",Toast.LENGTH_SHORT).show()
                    else
                        Toast.makeText(this,"Permission Denied",Toast.LENGTH_SHORT).show()

                }
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)



        //check the permissions

        if(ActivityCompat.shouldShowRequestPermissionRationale(this,android.Manifest.permission.ACCESS_FINE_LOCATION))
            ActivityCompat.requestPermissions(this,arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),REQUEST_CODE)
        else
        {
            buildLocationRequest()
            buildLocationCallBack()

            //creating fuse provider client
            fusedLocationProvider = LocationServices.getFusedLocationProviderClient(this)

            updates.setOnClickListener(View.OnClickListener {


                if(ActivityCompat.checkSelfPermission(this@MainActivity,android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(this@MainActivity,android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
                //possible error

                {

                    ActivityCompat.requestPermissions(this@MainActivity, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),REQUEST_CODE)

                    return@OnClickListener
                }

                fusedLocationProvider.requestLocationUpdates(locationRequest,locationCallback, Looper.myLooper())

                //change state of button

                updates.isEnabled = !updates.isEnabled
                stopupdate.isEnabled = !stopupdate.isEnabled



            })

            stopupdate.setOnClickListener(View.OnClickListener {

                if(ActivityCompat.checkSelfPermission(this@MainActivity,android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(this@MainActivity,android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)


                {

                    ActivityCompat.requestPermissions(this@MainActivity, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),REQUEST_CODE)

                    return@OnClickListener
                }

                fusedLocationProvider.removeLocationUpdates(locationCallback)

                //change state of button

                updates.isEnabled = !updates.isEnabled
                stopupdate.isEnabled = !stopupdate.isEnabled

            })

        }

        fun buildLocationRequest() {}

        fun buildLocationCallBack() {}

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        // Letters data --------------------------------------------------------------------------------

        val cameraManager = getSystemService(Context.CAMERA_SERVICE) as CameraManager
        val camaraId = cameraManager.cameraIdList[0]
        val on = true
        val off = false

        fun mdot(){

            cameraManager.setTorchMode(camaraId, on)
            Thread.sleep(200)
            cameraManager.setTorchMode(camaraId, off)
            Thread.sleep(200)

        }

        fun mline(){

            cameraManager.setTorchMode(camaraId, on)
            Thread.sleep(600)
            cameraManager.setTorchMode(camaraId, off)
            Thread.sleep(200)

        }

        fun space(){

            Thread.sleep(2000)

        }

        fun A(){

            mdot()
            mline()
            Thread.sleep(300)

        }

        fun B(){

            mline()
            mdot()
            mdot()
            mdot()
            Thread.sleep(300)

        }

        fun C(){

            mline()
            mdot()
            mline()
            mdot()
            Thread.sleep(300)

        }

        fun D(){

            mline()
            mdot()
            mdot()
            Thread.sleep(300)

        }

        fun E(){

            mdot()
            Thread.sleep(300)

        }

        fun F(){

            mdot()
            mdot()
            mline()
            mdot()
            Thread.sleep(300)

        }

        fun G(){

            mdot()
            mline()
            Thread.sleep(300)

        }

        fun H(){

            mdot()
            mdot()
            mdot()
            mdot()
            Thread.sleep(300)

        }

        fun I(){

            mdot()
            mdot()
            Thread.sleep(300)


        }

        fun J(){

            mdot()
            mline()
            mline()
            mline()
            Thread.sleep(300)

        }

        fun K(){

            mline()
            mdot()
            mline()
            Thread.sleep(300)

        }

        fun L(){

            mdot()
            mline()
            mdot()
            mdot()
            Thread.sleep(300)

        }

        fun M(){

            mline()
            mline()
            Thread.sleep(300)

        }

        fun N(){

            mline()
            mdot()
            Thread.sleep(300)

        }

        fun O(){

            mline()
            mline()
            mline()
            Thread.sleep(300)

        }

        fun P(){

            mdot()
            mline()
            mline()
            mdot()
            Thread.sleep(300)

        }

        fun Q(){

            mline()
            mline()
            mdot()
            mline()
            Thread.sleep(300)

        }

        fun R(){

            mdot()
            mline()
            mdot()
            Thread.sleep(300)

        }

        fun S(){

            mdot()
            mdot()
            mdot()
            Thread.sleep(300)

        }

        fun T(){

            mline()
            Thread.sleep(300)

        }

        fun U(){

            mdot()
            mdot()
            mline()
            Thread.sleep(300)
        }

        fun V(){

            mdot()
            mdot()
            mdot()
            mline()
            Thread.sleep(300)

        }

        fun W(){

            mdot()
            mline()
            mline()
            Thread.sleep(300)

        }

        fun X(){

            mline()
            mdot()
            mdot()
            mline()
            Thread.sleep(300)

        }

        fun Y(){

            mline()
            mdot()
            mline()
            mline()
            Thread.sleep(300)

        }

        fun Z(){

            mline()
            mline()
            mdot()
            mdot()
            Thread.sleep(300)

        }

        //Numbers data ---------------------------------------------------------------------------------

        fun Zero(){

            mline()
            mline()
            mline()
            mline()
            mline()
            Thread.sleep(300)

        }

        fun One(){

            mdot()
            mline()
            mline()
            mline()
            mline()
            Thread.sleep(300)

        }

        fun Two(){

            mdot()
            mdot()
            mline()
            mline()
            mline()
            Thread.sleep(300)

        }

        fun Three(){

            mdot()
            mdot()
            mdot()
            mline()
            mline()
            Thread.sleep(300)

        }

        fun Four(){

            mdot()
            mdot()
            mdot()
            mdot()
            mline()
            Thread.sleep(300)

        }

        fun Five(){

            mdot()
            mdot()
            mdot()
            mdot()
            mdot()
            Thread.sleep(300)

        }

        fun Six(){

            mline()
            mdot()
            mdot()
            mdot()
            mdot()
            Thread.sleep(300)

        }

        fun Seven(){

            mline()
            mline()
            mdot()
            mdot()
            mdot()
            Thread.sleep(300)

        }

        fun Eight(){

            mline()
            mline()
            mline()
            mdot()
            mdot()
            Thread.sleep(300)

        }

        fun Nine(){

            mline()
            mline()
            mline()
            mline()
            mdot()
            Thread.sleep(300)

        }

        fun slash(){

            mline()
            mdot()
            mdot()
            mline()
            mdot()
            Thread.sleep(300)

        }


        fun minus(){

            mline()
            mdot()
            mdot()
            mdot()
            mdot()
            mline()
            Thread.sleep(300)

        }

        fun period(){

            mdot()
            mline()
            mdot()
            mline()
            mdot()
            mline()

        }

        //Buttons functionality
        var usersText = englishInput1.text

        //this button translates english to morse code
        translateB.setOnClickListener(){

            for(i in usersText){

                when {

                    i.equals('A') or i.equals('a') ->A()
                    i.equals('B') or i.equals('b') ->B()
                    i.equals('C') or i.equals('c') ->C()
                    i.equals('D') or i.equals('d') ->D()
                    i.equals('E') or i.equals('e') ->E()
                    i.equals('F') or i.equals('f') ->F()
                    i.equals('G') or i.equals('g') ->G()
                    i.equals('H') or i.equals('h') ->H()
                    i.equals('I') or i.equals('i') ->I()
                    i.equals('J') or i.equals('j') ->J()
                    i.equals('K') or i.equals('k') ->K()
                    i.equals('L') or i.equals('l') ->L()
                    i.equals('M') or i.equals('m') ->M()
                    i.equals('N') or i.equals('n') ->N()
                    i.equals('O') or i.equals('o') ->O()
                    i.equals('P') or i.equals('p') ->P()
                    i.equals('Q') or i.equals('q') ->P()
                    i.equals('R') or i.equals('r') ->R()
                    i.equals('S') or i.equals('s') ->S()
                    i.equals('T') or i.equals('t') ->T()
                    i.equals('U') or i.equals('u') ->U()
                    i.equals('V') or i.equals('v') ->V()
                    i.equals('W') or i.equals('w') ->W()
                    i.equals('X') or i.equals('x') ->X()
                    i.equals('Y') or i.equals('y') ->Y()
                    i.equals('Z') or i.equals('z') ->Z()
                    i.equals(' ') or i.equals(' ') ->space()
                    i.equals('0') -> Zero()
                    i.equals('1') -> One()
                    i.equals('2') -> Two()
                    i.equals('3') -> Three()
                    i.equals('4') -> Four()
                    i.equals('5') -> Five()
                    i.equals('6') -> Six()
                    i.equals('7') -> Seven()
                    i.equals('8') -> Eight()
                    i.equals('9') -> Nine()
                    i.equals('/') -> slash()
                    i.equals('-') -> minus()

                }
            }
        }

        sendLatLong.setOnClickListener(){
            usersText.clear()
            var englishInput1 = coordinates.text
            var latlongTransation = englishInput1
            for(i in latlongTransation){

                when {
                    i.equals('0') -> Zero()
                    i.equals('1') -> One()
                    i.equals('2') -> Two()
                    i.equals('3') -> Three()
                    i.equals('4') -> Four()
                    i.equals('5') -> Five()
                    i.equals('6') -> Six()
                    i.equals('7') -> Seven()
                    i.equals('8') -> Eight()
                    i.equals('9') -> Nine()
                    i.equals('/') -> slash()
                    i.equals('-') -> minus()
                    i.equals('.') -> period()

                }
            }
        }

        // this button resets the text input
        resetB.setOnClickListener(){

            usersText.clear()

        }

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
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    private fun buildLocationCallBack(){

        locationCallback = object :LocationCallback(){

            //CTRL + O
            override fun onLocationResult(p0: LocationResult?) {

                var location = p0!!.locations.get(p0!!.locations.size-1) // get last location

                coordinates.text = location.latitude.toString().substring(0,2)+"/" + location.longitude.toString().substring(0,4)

            }
        }
    }

    @SuppressLint("RestrictedApi")
    private fun buildLocationRequest(){

        locationRequest = LocationRequest()
        locationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        locationRequest.interval = 5000
        locationRequest.fastestInterval = 3000
        locationRequest.smallestDisplacement = 10f

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
