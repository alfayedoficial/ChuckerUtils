package com.alfayedoficial.chucker


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
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as HttpCall

        if (id != other.id) return false
        if (requestDate != other.requestDate) return false
        if (responseDate != other.responseDate) return false
        if (tookMs != other.tookMs) return false
        if (protocol != other.protocol) return false
        if (method != other.method) return false
        if (url != other.url) return false
        if (host != other.host) return false
        if (path != other.path) return false
        if (scheme != other.scheme) return false
        if (responseTlsVersion != other.responseTlsVersion) return false
        if (responseCipherSuite != other.responseCipherSuite) return false
        if (requestPayloadSize != other.requestPayloadSize) return false
        if (requestContentType != other.requestContentType) return false
        if (requestHeaders != other.requestHeaders) return false
        if (requestHeadersSize != other.requestHeadersSize) return false
        if (requestBody != other.requestBody) return false
        if (isRequestBodyEncoded != other.isRequestBodyEncoded) return false
        if (responseCode != other.responseCode) return false
        if (responseMessage != other.responseMessage) return false
        if (error != other.error) return false
        if (responsePayloadSize != other.responsePayloadSize) return false
        if (responseContentType != other.responseContentType) return false
        if (responseHeaders != other.responseHeaders) return false
        if (responseHeadersSize != other.responseHeadersSize) return false
        if (responseBody != other.responseBody) return false
        if (isResponseBodyEncoded != other.isResponseBodyEncoded) return false
        if (responseImageData != null) {
            if (other.responseImageData == null) return false
            if (!responseImageData.contentEquals(other.responseImageData)) return false
        } else if (other.responseImageData != null) return false
        if (graphQlDetected != other.graphQlDetected) return false
        if (graphQlOperationName != other.graphQlOperationName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + (requestDate?.hashCode() ?: 0)
        result = 31 * result + (responseDate?.hashCode() ?: 0)
        result = 31 * result + (tookMs?.hashCode() ?: 0)
        result = 31 * result + (protocol?.hashCode() ?: 0)
        result = 31 * result + (method?.hashCode() ?: 0)
        result = 31 * result + (url?.hashCode() ?: 0)
        result = 31 * result + (host?.hashCode() ?: 0)
        result = 31 * result + (path?.hashCode() ?: 0)
        result = 31 * result + (scheme?.hashCode() ?: 0)
        result = 31 * result + (responseTlsVersion?.hashCode() ?: 0)
        result = 31 * result + (responseCipherSuite?.hashCode() ?: 0)
        result = 31 * result + (requestPayloadSize?.hashCode() ?: 0)
        result = 31 * result + (requestContentType?.hashCode() ?: 0)
        result = 31 * result + (requestHeaders?.hashCode() ?: 0)
        result = 31 * result + (requestHeadersSize?.hashCode() ?: 0)
        result = 31 * result + (requestBody?.hashCode() ?: 0)
        result = 31 * result + isRequestBodyEncoded.hashCode()
        result = 31 * result + (responseCode ?: 0)
        result = 31 * result + (responseMessage?.hashCode() ?: 0)
        result = 31 * result + (error?.hashCode() ?: 0)
        result = 31 * result + (responsePayloadSize?.hashCode() ?: 0)
        result = 31 * result + (responseContentType?.hashCode() ?: 0)
        result = 31 * result + (responseHeaders?.hashCode() ?: 0)
        result = 31 * result + (responseHeadersSize?.hashCode() ?: 0)
        result = 31 * result + (responseBody?.hashCode() ?: 0)
        result = 31 * result + isResponseBodyEncoded.hashCode()
        result = 31 * result + (responseImageData?.contentHashCode() ?: 0)
        result = 31 * result + graphQlDetected.hashCode()
        result = 31 * result + (graphQlOperationName?.hashCode() ?: 0)
        return result
    }
}
