package com.rizkynugraha_19104014.modul6;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.translationMatrix
import androidx.recyclerview.widget.RecyclerView
import coil.transform.CircleCropTransformation
import coil.load
import com.rizkynugraha_19104014.modul6.databinding.ActivityMainBinding
import com.rizkynugraha_19104014.modul6.databinding.ItemListBinding
import java.util.*

public class MainAdapter {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        binding = ItemListBinding.bind(view)
        return MainViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val data = listData[position]

        binding.apply {
            ivPariwisata.load(data.photo){
                transformations(CircleCropTransformation())
            }
            tvNamaPariwisata.text = data.name
            tvDeskripsiPariwisata.text = data.description
        }
    }

    override fun getItemCount(): Int = listData.size
}
