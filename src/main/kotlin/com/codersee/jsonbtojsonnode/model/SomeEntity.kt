package com.codersee.jsonbtojsonnode.model

import com.codersee.jsonbtojsonnode.util.MyConverter
import com.fasterxml.jackson.databind.JsonNode
import jakarta.persistence.Convert
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "some_table")
data class SomeEntity(
    @Id
    val id: Long? = null,
    val stringColumn: String,
    val integerColumn: Int,
//    @Convert(converter = MyConverter::class)
    val jsonbColumn: JsonNode
)

