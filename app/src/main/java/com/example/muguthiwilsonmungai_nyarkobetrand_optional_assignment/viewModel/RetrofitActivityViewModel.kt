package com.example.muguthiwilsonmungai_nyarkobetrand_optional_assignment.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.muguthiwilsonmungai_nyarkobetrand_optional_assignment.model.ProductResponse
import com.example.muguthiwilsonmungai_nyarkobetrand_optional_assignment.network.ProductsService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RetrofitActivityViewModel: ViewModel()
{
    var firstProductLiveData: MutableLiveData<ProductResponse>? = null

    init
    {
        if (firstProductLiveData == null){
            firstProductLiveData = MutableLiveData()
        }
    }

    fun getFirstProduct ()
    {
        viewModelScope.launch(Dispatchers.IO)
        {
            val data = ProductsService.retrofit.getProductOne()
            firstProductLiveData?.postValue(data)
        }
    }
}