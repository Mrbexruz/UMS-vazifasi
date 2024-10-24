package com.likobehruz.beeline.utils

import com.likobehruz.beeline.models.MYInfo

object MyData {
    val tariflist = listOf(
        MYInfo("ZOR 1", "Chidasa buladi", "*102*10#"),
        MYInfo("ZOR 2", "Yaxshi", "*102*11#"),
        MYInfo("ZOR 3 ", " ALO","*102*19#"),
        MYInfo("HAMSTER", " PERFECT", "*103*10")
    )
    val Internetlist = listOf(
        MYInfo("HMSTR 1", "1GB", "*302*10#"),
        MYInfo("TAP 2", "5GB", "*104*11#"),
        MYInfo("ZOP 3 ", " 15GB","*902*19#"),
        MYInfo("TER", "30GB", "*003*10")
    )
    val Daqiqalist = listOf(
        MYInfo("Z 1", "200 DAQIQA", "*103*10#"),
        MYInfo("ZO 2", "500 DAQIQA", "*104*11#"),
        MYInfo("R 3 ", "1000 DAQIQA ","*105*19#"),
        MYInfo("HAMSTER", "3000 DAQIQA", "*106*10")
    )
    val SMSlist = listOf(
        MYInfo("ZOR q1", "Chidasa buladi", "*102*60#"),
        MYInfo("ZOR a2", "Yaxshi", "*102*71#"),
        MYInfo("ZOR s3 ", " ALO","*102*89#"),
        MYInfo("HAMSTER", " PERFECT", "*106*10")
    )
}