package com.example.storesapp.ViewModel

import androidx.lifecycle.LiveData
import com.example.storesapp.Domain.BannerModel
import com.example.storesapp.Domain.CategoryModel

class DashboardViewModel {
    private val repository = DashboardViewModel()

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }

    fun loadBanners(): LiveData<MutableList<BannerModel>> {
        return repository.loadBanners()
    }
}