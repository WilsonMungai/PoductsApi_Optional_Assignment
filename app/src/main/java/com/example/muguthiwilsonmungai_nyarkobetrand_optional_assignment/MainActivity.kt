package com.example.muguthiwilsonmungai_nyarkobetrand_optional_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.muguthiwilsonmungai_nyarkobetrand_optional_assignment.databinding.ActivityMainBinding
import com.example.muguthiwilsonmungai_nyarkobetrand_optional_assignment.viewModel.RetrofitActivityViewModel

class MainActivity : AppCompatActivity()
{
    lateinit var binding : ActivityMainBinding
    lateinit var viewModel: RetrofitActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        companion object
//    {
//        private const val TAG = "RetrofitActivity"
//    }
        viewModel = ViewModelProvider(this)[RetrofitActivityViewModel::class.java]

        viewModel.getFirstProduct()
        Log.i("test", viewModel.getFirstProduct().toString())

        viewModel.firstProductLiveData?.observe(this){ firstProduct ->
            binding.productTitle.text = resources.getString(R.string.product_title, firstProduct.title)
                binding.productBrand.text = resources.getString(R.string.product_brand, firstProduct.brand)
                binding.productRating.text = resources.getString(R.string.product_rating, firstProduct.toString())
                binding.productDescription.text = resources.getString(R.string.product_description, firstProduct.description)

//            Picasso.with(this)
        }
    }
}