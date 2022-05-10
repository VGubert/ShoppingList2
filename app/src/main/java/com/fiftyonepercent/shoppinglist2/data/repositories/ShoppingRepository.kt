package com.fiftyonepercent.shoppinglist2.data.repositories

import com.fiftyonepercent.shoppinglist2.data.db.ShoppingDatabase
import com.fiftyonepercent.shoppinglist2.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}