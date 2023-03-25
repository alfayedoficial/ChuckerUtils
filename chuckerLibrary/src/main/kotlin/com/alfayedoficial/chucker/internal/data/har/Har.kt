package com.alfayedoficial.chucker.internal.data.har

import com.alfayedoficial.chucker.internal.data.entity.HttpTransaction
import com.alfayedoficial.chucker.internal.data.har.log.Creator
import com.google.gson.annotations.SerializedName

internal data class Har(
    @SerializedName("log") val log: Log
) {
    constructor(transactions: List<HttpTransaction>, creator: Creator) : this(
        log = Log(transactions, creator)
    )
}
