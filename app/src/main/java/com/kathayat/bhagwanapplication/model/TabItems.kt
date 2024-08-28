package com.kathayat.bhagwanapplication.model

data class TabItems(
    val title:String
) {
    companion object {
        fun loadTabItems():List<TabItems> {
            return listOf(
                TabItems("New"),
                TabItems("Old"),
                TabItems("Arti"),
            )
        }
    }
}
