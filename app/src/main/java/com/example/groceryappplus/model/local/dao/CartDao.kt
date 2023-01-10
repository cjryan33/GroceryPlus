package com.example.groceryappprojectcharles.model.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.groceryappprojectcharles.model.local.entity.Cart

@Dao
interface CartDao {

    @Insert(onConflict = REPLACE)
    fun addItemToCart(cart:Cart)

    @Delete
    fun deleteItemFromCart(cart:Cart)

    @Query("Delete from Cart")
    fun deleteAllCartItems()

    @Query("Select sum(totalPrice) from Cart")
    fun getCartTotal() : Float

    @Query("select * from Cart")
    fun getCartItems() : MutableList<Cart>
}