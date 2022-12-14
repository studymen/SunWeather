package com.sunnyweather.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class DailyResponse(val status:String,val result: Result) {
    data class Result(val daily:Daily)
    data class Daily(val temperature:List<Temoerature>,val skycon:List<Skycon>,@SerializedName("life_index") val life_Index:LifeIndex)
    data class Temoerature(val max:Float,val min:Float)
    data class Skycon(val value:String,val date:Date)
    data class LifeIndex(val coldRisk:List<LifeDescription>,val carWashing:List<LifeDescription>,val ultraviolet:List<LifeDescription>,val dressing:List<LifeDescription>)
    data class LifeDescription(val desc:String)
}