package com.islam.shoe.ui.shoedetail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.islam.shoe.models.Shoe

class ShoeDetailViewModel : ViewModel() {

  private val _shoeLiveData = MutableLiveData<MutableList<Shoe>>()
  val shoeLiveData: MutableLiveData<MutableList<Shoe>>
    get() = _shoeLiveData
}

var itemsOfShoe = Shoe("Starts", 45.0, "Convers", "this is my shoe")