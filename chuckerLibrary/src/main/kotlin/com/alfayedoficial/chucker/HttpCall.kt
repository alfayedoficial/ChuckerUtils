package com.alfayedoficial.chucker

import com.alfayedoficial.chucker.internal.data.entity.HttpTransaction


public data class HttpCall(
    var id: Long = 0,
    var requestDate: Long? = null,
    var responseDate: Long?= null,
    var tookMs: Long?= null,
    var protocol: String?= null,
    var method: String?= null,
    var url: String?= null,
    var host: String?= null,
    var path: String?= null,
    var scheme: String?= null,
    var responseTlsVersion: String?= null,
    var responseCipherSuite: String?= null,
    var requestPayloadSize: Long?= null,
    var requestContentType: String?= null,
    var requestHeaders: String?= null,
    var requestHeadersSize: Long?= null,
    var requestBody: String?= null,
    var isRequestBodyEncoded: Boolean = false,
    var responseCode: Int?= null,
    var responseMessage: String?= null,
    var error: String?= null,
    var responsePayloadSize: Long?= null,
    var responseContentType: String?= null,
    var responseHeaders: String?= null,
    var responseHeadersSize: Long?= null,
    var responseBody: String?= null,
    var isResponseBodyEncoded: Boolean = false,
    var responseImageData: ByteArray?= null,
    var graphQlDetected: Boolean = false,
    var graphQlOperationName: String?= null,
)

