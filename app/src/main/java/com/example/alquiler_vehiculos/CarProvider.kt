package com.example.alquiler_vehiculos

class CarProvider {
    companion object{
        // Aquí iran los distintos modelos que hay en la aplicación de vehiculos.
        val carList = listOf<Car>(
            Car (
                modelo = "Carrozado con trampilla",
                nplazas = "3 plazas",
                capacidad = "20M3",
                photo = "https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg"

            ),

            Car(
                modelo = "Carrozado sin trampilla",
                nplazas = "3 plazas",
                capacidad = "20M3",
                photo = "https://blanauto.com/sites/default/files/inline-images/mercedes-sprinter.png.jpg"
            ),

            Car(
                modelo = "Furgoneta grande",
                nplazas = "3 plazas",
                capacidad = "15M3",
                photo = "https://blanauto.com/sites/default/files/inline-images/1539849303199.jpg"
            ),

            Car(
                modelo = "Furgoneta mediana",
                nplazas = "3 plazas",
                capacidad = "8M3",
                photo = "https://blanauto.com/sites/default/files/inline-images/mercedes_benz_citan_long_diesel_109cdi_van_2013_front_three_quarter.jpeg"
            ),

            Car(
                modelo = "Furgoneta pequeña",
                nplazas = "2 plazas",
                capacidad = "4M3",
                photo = "https://blanauto.com/sites/default/files/inline-images/mercedes_benz_citan_long_diesel_109cdi_van_2013_front_three_quarter.jpeg"
            ),
        )
    }
}