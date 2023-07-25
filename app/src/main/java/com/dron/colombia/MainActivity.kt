package com.dron.colombia

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dron.colombia.ui.theme.dronTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        setContent {
            dronTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    IngresoaAplicacion()

                }
            }
        }
    }
}


@Composable
fun IngresoaAplicacion() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "pagina_dron", builder = {
        composable("pagina_acercade", content = { Acercade(navController = navController) })
        composable("pagina_dron", content = { dron(navController = navController) })
    })


}




