package com.islam.shoe.ui.shoelist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.islam.shoe.models.Shoe


class ShoeListViewModel : ViewModel() {

    private val _shoeLivedata = MutableLiveData<List<Shoe>>()
    val shoeLiveData: MutableLiveData<List<Shoe>>
        get() = _shoeLivedata
}