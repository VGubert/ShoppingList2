package com.fiftyonepercent.shoppinglist2.ui.shoppinglist

import com.fiftyonepercent.shoppinglist2.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}