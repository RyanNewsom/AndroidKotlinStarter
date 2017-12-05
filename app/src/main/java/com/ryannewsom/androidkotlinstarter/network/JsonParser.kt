package com.ryannewsom.androidkotlinstarter.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.util.*

/**
 * Created by Ryan on 12/4/17.
 */
object JsonParser {
    fun <T> convertJsonStringToObject(json: String, classOfT: Class<T>): T {
        val gson = Gson()

        return classOfT.cast(gson.fromJson(json, classOfT))
    }

    fun convertObjectToJson(`object`: Any): String {
        val gson = GsonBuilder().setPrettyPrinting().create()

        return gson.toJson(`object`)
    }

    fun convertCollectionToJson(objects: Collection<*>): String {
        val gson = Gson()

        return gson.toJson(objects)
    }

    fun <T> convertJsonStringToList(s: String, clazz: Class<Array<T>>): List<T> {
        val arr = Gson().fromJson(s, clazz)
        return Arrays.asList(*arr)
    }
}