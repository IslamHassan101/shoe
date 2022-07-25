package com.islam.shoe.ui.instruction

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.islam.shoe.models.Shoe

class InstructionViewModel : ViewModel() {

    private val _shoeLivedata = MutableLiveData<List<Shoe>>()
    val shoeLiveData: MutableLiveData<List<Shoe>>
        get() = _shoeLivedata
}