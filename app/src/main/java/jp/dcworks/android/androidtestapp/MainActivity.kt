package jp.dcworks.android.androidtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import jp.dcworks.android.androidtestapp.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
        Log.d("test", "hogehogehogehoge")
        EmptyMethod2()
    }

    private fun emptyMethod() {
        // TODO
        Log.d("test", "hoge")
    }

    private fun EmptyMethod2(): String {
        // TODO
        Log.d("test", "hoge")
        return ""
    }
}
