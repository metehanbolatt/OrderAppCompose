package com.metehanbolat.orderappcompose.core.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.metehanbolat.orderappcompose.core.data.local.entities.ProductEntity

@Dao
interface ProductDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(productEntity: ProductEntity)

    @Query("SELECT * FROM ProductEntity WHERE belongsToDeliverer = :delivererId")
    suspend fun getProductsForDeliverer(delivererId: String): List<ProductEntity>
}