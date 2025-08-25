

# ApiVersion

An ApiVersion describes a particular version of an API. ApiVersions are what consumers actually use.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotations** | **Map&lt;String, String&gt;** | Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts. |  [optional] |
|**createTime** | **OffsetDateTime** | Output only. Creation timestamp. |  [optional] [readonly] |
|**description** | **String** | A detailed description. |  [optional] |
|**displayName** | **String** | Human-meaningful name. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with \&quot;apigeeregistry.googleapis.com/\&quot; and cannot be changed. |  [optional] |
|**name** | **String** | Resource name. |  [optional] |
|**state** | **String** | A user-definable description of the lifecycle phase of this API version. Format: free-form, but we expect single words that describe API maturity, e.g. \&quot;CONCEPT\&quot;, \&quot;DESIGN\&quot;, \&quot;DEVELOPMENT\&quot;, \&quot;STAGING\&quot;, \&quot;PRODUCTION\&quot;, \&quot;DEPRECATED\&quot;, \&quot;RETIRED\&quot;. |  [optional] |
|**updateTime** | **OffsetDateTime** | Output only. Last update timestamp. |  [optional] [readonly] |



