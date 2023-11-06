package com.example.alquiler_vehiculos.adapter

import android.media.RouteListingPreference.Item
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alquiler_vehiculos.Car
import com.example.alquiler_vehiculos.databinding.ItemVehiculoBinding

class CarViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemVehiculoBinding.bind(view)
    fun render(carModel: Car){
        binding.ModelName.text = carModel.modelo
        binding.NumberPlazas.text = carModel.nplazas
        binding.CapacityCar.text = carModel.capacidad.toString()
        // Falta acceder a la imagen del coche
        Glide.with(binding.CarPhoto.context).load(carModel.photo).into(binding.CarPhoto)

        // Evento de hacer clic sobre la imagen del coche
        binding.CarPhoto.setOnClickListener {
            Toast.makeText(binding.CarPhoto.context, carModel.nplazas,
                Toast.LENGTH_LONG).show()
        }

        // Evento de hacer clic sobre el coche:
        itemView.setOnClickListener {
            Toast.makeText(binding.CarPhoto.context, carModel.modelo,
                Toast.LENGTH_LONG).show()
        }
    }
}