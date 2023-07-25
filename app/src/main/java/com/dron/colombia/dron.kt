package com.dron.colombia

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun dron(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(ScrollState(0)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.aerodronecolombia),
            contentDescription = "Exito",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Le damos una cordial bienvenida al fascinante universo de los drones, un lugar en el que encontrará una extensa variedad de servicios cuidadosamente diseñados para satisfacer sus necesidades y expectativas. Explore con confianza las posibilidades que ofrecemos, confiados en que cada detalle ha sido concebido para proporcionarle una experiencia única y sobresaliente. Estamos ansiosos por acompañarle en este emocionante viaje tecnológico y ser su socio confiable en el aprovechamiento pleno de las capacidades que los drones pueden brindarle. ¡Adelante, descubra un nuevo horizonte de oportunidades con nosotros!",
            style = MaterialTheme.typography.h5,
            color = Color.Black,
            fontSize = 15.sp,
            // justificar el texto
            textAlign = TextAlign.Justify
        )
        Spacer(modifier = Modifier.height(10.dp))
        // Agregar una imagen de un dron
        Image(
            painter = painterResource(id = R.drawable.dron),
            contentDescription = "Exito",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Servicios",
            style = MaterialTheme.typography.h5,
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(10.dp))
        LazyRow(content = {
            item {
                Image(
                    painter = painterResource(id = R.drawable.paisaje),
                    contentDescription = "Exito",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
            }
            item {
                Image(
                    painter = painterResource(id = R.drawable.urbano),
                    contentDescription = "Exito",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
            }
            item {
                Image(
                    painter = painterResource(id = R.drawable.planeacion),
                    contentDescription = "Exito",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
            }
            item {
                Image(
                    painter = painterResource(id = R.drawable.ciudad),
                    contentDescription = "Exito",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
            }
            item {
                Image(
                    painter = painterResource(id = R.drawable.agro),
                    contentDescription = "Exito",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                )
            }

        })

        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
                navController.navigate("pagina_acercade") {
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
                text = "Acerca de",
                fontSize = 15.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
            )
        }
        Spacer(modifier = Modifier.height(20.dp))




    }


}
