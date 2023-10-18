package cloud.wig.android.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cloud.wig.android.MainScanner
import cloud.wig.android.R
import cloud.wig.android.databinding.ServerSetupBinding

class ServerSetup : AppCompatActivity() {
    private lateinit var binding: ServerSetupBinding

    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LoginPage", "onCreate method is executing")
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT // Portrait lock

        binding = ServerSetupBinding.inflate(layoutInflater) // set bindings to login_page layout id's
        val view = binding.root
        setContentView(view) // Open login_page view

        binding.connectButton.setOnClickListener {
            val hostname = binding.hostname.text.toString()
            val portNumber = binding.portNumber.text.toString()
            if(hostname == "server" || portNumber == "80") {
                val intent = Intent(this, MainScanner::class.java)
                startActivity(intent)
                finish()
            } else {
                binding.error.text = getString(R.string.required_fields)
            }
        }

        binding.icExit.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }

    }
}