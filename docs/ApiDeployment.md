

# ApiDeployment

An ApiDeployment describes a service running at particular address that provides a particular version of an API. ApiDeployments have revisions which correspond to different configurations of a single deployment in time. Revision identifiers should be updated whenever the served API spec or endpoint address changes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessGuidance** | **String** | Text briefly describing how to access the endpoint. Changes to this value will not affect the revision. |  [optional] |
|**annotations** | **Map&lt;String, String&gt;** | Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts. |  [optional] |
|**apiSpecRevision** | **String** | The full resource name (including revision id) of the spec of the API being served by the deployment. Changes to this value will update the revision. Format: apis/{api}/deployments/{deployment} |  [optional] |
|**createTime** | **OffsetDateTime** | Output only. Creation timestamp; when the deployment resource was created. |  [optional] [readonly] |
|**description** | **String** | A detailed description. |  [optional] |
|**displayName** | **String** | Human-meaningful name. |  [optional] |
|**endpointUri** | **String** | The address where the deployment is serving. Changes to this value will update the revision. |  [optional] |
|**externalChannelUri** | **String** | The address of the external channel of the API (e.g. the Developer Portal). Changes to this value will not affect the revision. |  [optional] |
|**intendedAudience** | **String** | Text briefly identifying the intended audience of the API. Changes to this value will not affect the revision. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with \&quot;registry.googleapis.com/\&quot; and cannot be changed. |  [optional] |
|**name** | **String** | Resource name. |  [optional] |
|**revisionCreateTime** | **OffsetDateTime** | Output only. Revision creation timestamp; when the represented revision was created. |  [optional] [readonly] |
|**revisionId** | **String** | Output only. Immutable. The revision ID of the deployment. A new revision is committed whenever the deployment contents are changed. The format is an 8-character hexadecimal string. |  [optional] [readonly] |
|**revisionUpdateTime** | **OffsetDateTime** | Output only. Last update timestamp: when the represented revision was last modified. |  [optional] [readonly] |



