package com.ifs21001.dinopedia

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ifs21001.dinopedia.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    companion object{
        const val EXTRA_FAMILI = "extra_famili"
    }

    private lateinit var binding: ActivityMain2Binding
    private val dataDinos = ArrayList<Dino>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvDinos.setHasFixedSize(false)
        dataDinos.addAll(getListDinos())
        showRecyclerList()
    }
    @SuppressLint("Recycle")
    private fun getListDinos(): ArrayList<Dino> {
        val dataNama =
            resources.getStringArray(R.array.dino_nama)
        val dataPhoto =
            resources.obtainTypedArray(R.array.dino_photo)
        val dataDescription =
            resources.getStringArray(R.array.dino_deskripsi)
        val dataCharacteristic =
            resources.getStringArray(R.array.dino_karaktersitik)
        val dataKelompok =
            resources.getStringArray(R.array.dino_kelompok)
        val dataHabitat =
            resources.getStringArray(R.array.dino_habitat)
        val dataMakanan =
            resources.getStringArray(R.array.dino_makanan)
        val dataPanjang =
            resources.getStringArray(R.array.dino_panjang)
        val dataTinggi =
            resources.getStringArray(R.array.dino_tinggi)
        val dataBobot =
            resources.getStringArray(R.array.dino_bobot)
        val dataKelemahan =
            resources.getStringArray(R.array.dino_kelemahan)
        val listDino = ArrayList<Dino>()
        when (intent.getStringExtra(EXTRA_FAMILI)){
            "Saurischia" -> {
                for (i in dataNama.indices) {
                    if (i != 2){
                        val dino = Dino(dataNama[i],
                            dataPhoto.getResourceId(i, -1), dataDescription[i],
                            dataCharacteristic[i], dataKelompok[i], dataHabitat[i], dataMakanan[i], dataPanjang[i],dataTinggi[i],dataBobot[i],
                            dataKelemahan[i])
                        listDino.add(dino)
                    }
                    else
                        break
                }
            }

            "Ornithischia" -> {
                for (i in dataNama.indices) {
                    if (i != 4){
                        if (i <= 1){
                            continue
                        } else{
                            val dino = Dino(dataNama[i],
                                dataPhoto.getResourceId(i, -1), dataDescription[i],
                                dataCharacteristic[i], dataKelompok[i], dataHabitat[i], dataMakanan[i], dataPanjang[i],dataTinggi[i],dataBobot[i],
                                dataKelemahan[i])
                            listDino.add(dino)
                        }
                    }
                    else
                        break
                }
            }

            "Theropoda" -> {
                for (i in dataNama.indices) {
                    if (i != 6){
                        if (i <= 3){
                            continue
                        } else{
                            val dino = Dino(dataNama[i],
                                dataPhoto.getResourceId(i, -1), dataDescription[i],
                                dataCharacteristic[i], dataKelompok[i], dataHabitat[i], dataMakanan[i], dataPanjang[i],dataTinggi[i],dataBobot[i],
                                dataKelemahan[i])
                            listDino.add(dino)
                        }
                    }
                    else
                        break
                }
            }

            "Sauropodomorpha" -> {
                for (i in dataNama.indices) {
                    if (i != 8){
                        if (i <= 5){
                            continue
                        } else{
                            val dino = Dino(dataNama[i],
                                dataPhoto.getResourceId(i, -1), dataDescription[i],
                                dataCharacteristic[i], dataKelompok[i], dataHabitat[i], dataMakanan[i], dataPanjang[i],dataTinggi[i],dataBobot[i],
                                dataKelemahan[i])
                            listDino.add(dino)
                        }
                    }
                    else
                        break
                }
            }

            "Ceratopsia" -> {
                for (i in dataNama.indices) {
                    if (i != 10){
                        if (i <= 7){
                            continue
                        } else{
                            val dino = Dino(dataNama[i],
                                dataPhoto.getResourceId(i, -1), dataDescription[i],
                                dataCharacteristic[i], dataKelompok[i], dataHabitat[i], dataMakanan[i], dataPanjang[i],dataTinggi[i],dataBobot[i],
                                dataKelemahan[i])
                            listDino.add(dino)
                        }
                    }
                    else
                        break
                }
            }

            "Stegosauria" -> {
                for (i in dataNama.indices) {
                    if (i != 12){
                        if (i <= 9){
                            continue
                        } else{
                            val dino = Dino(dataNama[i],
                                dataPhoto.getResourceId(i, -1), dataDescription[i],
                                dataCharacteristic[i], dataKelompok[i], dataHabitat[i], dataMakanan[i], dataPanjang[i],dataTinggi[i],dataBobot[i],
                                dataKelemahan[i])
                            listDino.add(dino)
                        }
                    }
                    else
                        break
                }
            }

            "Ankylosauria" -> {
                for (i in dataNama.indices) {
                    if (i != 14){
                        if (i <= 11){
                            continue
                        } else{
                            val dino = Dino(dataNama[i],
                                dataPhoto.getResourceId(i, -1), dataDescription[i],
                                dataCharacteristic[i], dataKelompok[i], dataHabitat[i], dataMakanan[i], dataPanjang[i],dataTinggi[i],dataBobot[i],
                                dataKelemahan[i])
                            listDino.add(dino)
                        }
                    }
                    else
                        break
                }
            }

            "Pterosauria" -> {
                for (i in dataNama.indices) {
                    if (i != 16){
                        if (i <= 13){
                            continue
                        } else{
                            val dino = Dino(dataNama[i],
                                dataPhoto.getResourceId(i, -1), dataDescription[i],
                                dataCharacteristic[i], dataKelompok[i], dataHabitat[i], dataMakanan[i], dataPanjang[i],dataTinggi[i],dataBobot[i],
                                dataKelemahan[i])
                            listDino.add(dino)
                        }
                    }
                    else
                        break
                }
            }



        }
        return listDino
    }
    private fun showRecyclerList() {
        if (resources.configuration.orientation ==
            Configuration.ORIENTATION_LANDSCAPE) {
            binding.rvDinos.layoutManager =
                GridLayoutManager(this, 2)
        } else {
            binding.rvDinos.layoutManager =
                LinearLayoutManager(this)
        }
        val listDinoAdapter = ListDinoAdapter(dataDinos)
        binding.rvDinos.adapter = listDinoAdapter
        listDinoAdapter.setOnItemClickCallback(object :
            ListDinoAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Dino) {
                showSelectedDino(data)
            }
        })
    }
    private fun showSelectedDino(dino: Dino) {
        val intentWithData = Intent(this@MainActivity2,
            DetailActivity2::class.java)
        intentWithData.putExtra(DetailActivity2.EXTRA_DINO, dino)
        startActivity(intentWithData)
    }
}
