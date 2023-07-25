package com.dron.colombia

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.CameraPositionState
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState



@Composable
fun Acercade(navController: NavController) {

    Card(
        modifier = Modifier
            .fillMaxSize(),
        backgroundColor = Color(0xFFFFFFFF),
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Acerca de",
                style = MaterialTheme.typography.h5,
                color = Color.Black,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Nuestra empresa de Aerodrone Colombia se enfoca en brindar soluciones innovadoras en el ámbito de la aviación no tripulada. Nos especializamos en la creación de proyectos aéreos, incluyendo fotogrametría, mapeo de terrenos, inspecciones industriales, videografía aérea y servicios de entrega de paquetes. Además, ofrecemos asesoría especializada en el uso de drones y su integración en diversas industrias, permitiéndole maximizar su potencial y obtener resultados excepcionales. Contamos con un equipo altamente capacitado y tecnología de vanguardia, garantizando la calidad y eficiencia en cada servicio que brindamos. Confíe en DronesVision para llevar sus proyectos a nuevas alturas y alcanzar sus objetivos de manera efectiva y segura.",
                style = MaterialTheme.typography.h5,
                color = Color.Black,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Ubicación",
                style = MaterialTheme.typography.h5,
                color = Color.Black,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))

            Spacer(modifier = Modifier.height(10.dp))


            Text(
                text = "Los espacios utilizados en el mapa son para propositos ilustrativos y no reflejan una ubicación real de una empresa en concreto.",
                style = MaterialTheme.typography.h5,
                color = Color.Black,
                fontSize = 13.sp)
            Spacer(modifier = Modifier.height(10.dp))
            Mapita()
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Contacto",
                style = MaterialTheme.typography.h5,
                color = Color.Black,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Teléfono: 000000000000",
                style = MaterialTheme.typography.h5,
                color = Color.Black,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {
                    navController.navigate("pagina_dron") {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xA071D99),
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(corner = CornerSize(35.dp)),
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp),
            ) {
                Text(
                    text = "Regresar",
                    fontSize = 15.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))

        }
    }

}

@Composable
fun Mapita() {

    val sopo = LatLng(4.906375, -73.993801)
    val cameraPositionState: CameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(sopo, 14f)
    }


    GoogleMap(
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp),
        cameraPositionState = cameraPositionState
    )
    {
        Marker(
            position = LatLng(4.906375, -73.993801),
            title = "Oficinas de drones",
            snippet = "Visitanos para conocer nuestros servicios"
        )



    }

}
