package com.example.muguthiwilsonmungai_nyarkobetrand_optional_assignment.model

// Data model class
data class ProductResponse  (
    val id: Int,
    val title: String,
    val rating: Float,
    val brand: String,
    val description: String,
    val thumbnail: String
)
{
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as ProductResponse

//        if (!thumbnail.contentEquals(other.thumbnail)) return false
        return true

    }
//    override fun hashCode(): Int {
//        return thumbnail.contentHashCode()
//    }
}