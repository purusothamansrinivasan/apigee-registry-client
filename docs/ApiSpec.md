

# ApiSpec

An ApiSpec describes a version of an API in a structured way. ApiSpecs provide formal descriptions that consumers can use to use a version. ApiSpec resources are intended to be fully-resolved descriptions of an ApiVersion. When specs consist of multiple files, these should be bundled together (e.g. in a zip archive) and stored as a unit. Multiple specs can exist to provide representations in different API description formats. Synchronization of these representations would be provided by tooling and background services.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotations** | **Map&lt;String, String&gt;** | Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts. |  [optional] |
|**contents** | **String** | Input only. The contents of the spec. Provided by API callers when specs are created or updated. To access the contents of a spec, use GetApiSpecContents. |  [optional] |
|**createTime** | **OffsetDateTime** | Output only. Creation timestamp; when the spec resource was created. |  [optional] [readonly] |
|**description** | **String** | A detailed description. |  [optional] |
|**filename** | **String** | A possibly-hierarchical name used to refer to the spec from other specs. |  [optional] |
|**hash** | **String** | Output only. A SHA-256 hash of the spec&#39;s contents. If the spec is gzipped, this is the hash of the uncompressed spec. |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with \&quot;apigeeregistry.googleapis.com/\&quot; and cannot be changed. |  [optional] |
|**mimeType** | **String** | A style (format) descriptor for this spec that is specified as a Media Type (https://en.wikipedia.org/wiki/Media_type). Possible values include \&quot;application/vnd.apigee.proto\&quot;, \&quot;application/vnd.apigee.openapi\&quot;, and \&quot;application/vnd.apigee.graphql\&quot;, with possible suffixes representing compression types. These hypothetical names are defined in the vendor tree defined in RFC6838 (https://tools.ietf.org/html/rfc6838) and are not final. Content types can specify compression. Currently only GZip compression is supported (indicated with \&quot;+gzip\&quot;). |  [optional] |
|**name** | **String** | Resource name. |  [optional] |
|**revisionCreateTime** | **OffsetDateTime** | Output only. Revision creation timestamp; when the represented revision was created. |  [optional] [readonly] |
|**revisionId** | **String** | Output only. Immutable. The revision ID of the spec. A new revision is committed whenever the spec contents are changed. The format is an 8-character hexadecimal string. |  [optional] [readonly] |
|**revisionUpdateTime** | **OffsetDateTime** | Output only. Last update timestamp: when the represented revision was last modified. |  [optional] [readonly] |
|**sizeBytes** | **Integer** | Output only. The size of the spec file in bytes. If the spec is gzipped, this is the size of the uncompressed spec. |  [optional] [readonly] |
|**sourceUri** | **String** | The original source URI of the spec (if one exists). This is an external location that can be used for reference purposes but which may not be authoritative since this external resource may change after the spec is retrieved. |  [optional] |



