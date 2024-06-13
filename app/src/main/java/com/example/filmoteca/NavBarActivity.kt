package com.example.filmoteca

import android.os.Bundle
import android.os.PersistableBundle
import androidx.core.app.ComponentActivity

class NavBarActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent{
            BottomBarJCTheme
        }
    }
}
