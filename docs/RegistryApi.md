# RegistryApi

All URIs are relative to *http://apigee.local*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**registryCreateApi**](RegistryApi.md#registryCreateApi) | **POST** /v1/projects/{project}/locations/{location}/apis |  |
| [**registryCreateApiDeployment**](RegistryApi.md#registryCreateApiDeployment) | **POST** /v1/projects/{project}/locations/{location}/apis/{api}/deployments |  |
| [**registryCreateApiSpec**](RegistryApi.md#registryCreateApiSpec) | **POST** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs |  |
| [**registryCreateApiVersion**](RegistryApi.md#registryCreateApiVersion) | **POST** /v1/projects/{project}/locations/{location}/apis/{api}/versions |  |
| [**registryCreateArtifact**](RegistryApi.md#registryCreateArtifact) | **POST** /v1/projects/{project}/locations/{location}/artifacts |  |
| [**registryDeleteApi**](RegistryApi.md#registryDeleteApi) | **DELETE** /v1/projects/{project}/locations/{location}/apis/{api} |  |
| [**registryDeleteApiDeployment**](RegistryApi.md#registryDeleteApiDeployment) | **DELETE** /v1/projects/{project}/locations/{location}/apis/{api}/deployments/{deployment} |  |
| [**registryDeleteApiDeploymentRevision**](RegistryApi.md#registryDeleteApiDeploymentRevision) | **DELETE** /v1/projects/{project}/locations/{location}/apis/{api}/deployments/{deployment}:deleteRevision |  |
| [**registryDeleteApiSpec**](RegistryApi.md#registryDeleteApiSpec) | **DELETE** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs/{spec} |  |
| [**registryDeleteApiSpecRevision**](RegistryApi.md#registryDeleteApiSpecRevision) | **DELETE** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs/{spec}:deleteRevision |  |
| [**registryDeleteApiVersion**](RegistryApi.md#registryDeleteApiVersion) | **DELETE** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version} |  |
| [**registryDeleteArtifact**](RegistryApi.md#registryDeleteArtifact) | **DELETE** /v1/projects/{project}/locations/{location}/artifacts/{artifact} |  |
| [**registryGetApi**](RegistryApi.md#registryGetApi) | **GET** /v1/projects/{project}/locations/{location}/apis/{api} |  |
| [**registryGetApiDeployment**](RegistryApi.md#registryGetApiDeployment) | **GET** /v1/projects/{project}/locations/{location}/apis/{api}/deployments/{deployment} |  |
| [**registryGetApiSpec**](RegistryApi.md#registryGetApiSpec) | **GET** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs/{spec} |  |
| [**registryGetApiSpecContents**](RegistryApi.md#registryGetApiSpecContents) | **GET** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs/{spec}:getContents |  |
| [**registryGetApiVersion**](RegistryApi.md#registryGetApiVersion) | **GET** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version} |  |
| [**registryGetArtifact**](RegistryApi.md#registryGetArtifact) | **GET** /v1/projects/{project}/locations/{location}/artifacts/{artifact} |  |
| [**registryGetArtifactContents**](RegistryApi.md#registryGetArtifactContents) | **GET** /v1/projects/{project}/locations/{location}/artifacts/{artifact}:getContents |  |
| [**registryListApiDeploymentRevisions**](RegistryApi.md#registryListApiDeploymentRevisions) | **GET** /v1/projects/{project}/locations/{location}/apis/{api}/deployments/{deployment}:listRevisions |  |
| [**registryListApiDeployments**](RegistryApi.md#registryListApiDeployments) | **GET** /v1/projects/{project}/locations/{location}/apis/{api}/deployments |  |
| [**registryListApiSpecRevisions**](RegistryApi.md#registryListApiSpecRevisions) | **GET** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs/{spec}:listRevisions |  |
| [**registryListApiSpecs**](RegistryApi.md#registryListApiSpecs) | **GET** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs |  |
| [**registryListApiVersions**](RegistryApi.md#registryListApiVersions) | **GET** /v1/projects/{project}/locations/{location}/apis/{api}/versions |  |
| [**registryListApis**](RegistryApi.md#registryListApis) | **GET** /v1/projects/{project}/locations/{location}/apis |  |
| [**registryListArtifacts**](RegistryApi.md#registryListArtifacts) | **GET** /v1/projects/{project}/locations/{location}/artifacts |  |
| [**registryReplaceArtifact**](RegistryApi.md#registryReplaceArtifact) | **PUT** /v1/projects/{project}/locations/{location}/artifacts/{artifact} |  |
| [**registryRollbackApiDeployment**](RegistryApi.md#registryRollbackApiDeployment) | **POST** /v1/projects/{project}/locations/{location}/apis/{api}/deployments/{deployment}:rollback |  |
| [**registryRollbackApiSpec**](RegistryApi.md#registryRollbackApiSpec) | **POST** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs/{spec}:rollback |  |
| [**registryTagApiDeploymentRevision**](RegistryApi.md#registryTagApiDeploymentRevision) | **POST** /v1/projects/{project}/locations/{location}/apis/{api}/deployments/{deployment}:tagRevision |  |
| [**registryTagApiSpecRevision**](RegistryApi.md#registryTagApiSpecRevision) | **POST** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs/{spec}:tagRevision |  |
| [**registryUpdateApi**](RegistryApi.md#registryUpdateApi) | **PATCH** /v1/projects/{project}/locations/{location}/apis/{api} |  |
| [**registryUpdateApiDeployment**](RegistryApi.md#registryUpdateApiDeployment) | **PATCH** /v1/projects/{project}/locations/{location}/apis/{api}/deployments/{deployment} |  |
| [**registryUpdateApiSpec**](RegistryApi.md#registryUpdateApiSpec) | **PATCH** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs/{spec} |  |
| [**registryUpdateApiVersion**](RegistryApi.md#registryUpdateApiVersion) | **PATCH** /v1/projects/{project}/locations/{location}/apis/{api}/versions/{version} |  |


<a id="registryCreateApi"></a>
# **registryCreateApi**
> Api registryCreateApi(project, location, api, apiId)



CreateApi creates a specified API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    Api api = new Api(); // Api | 
    String apiId = "apiId_example"; // String | Required. The ID to use for the api, which will become the final component of the api's resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID.
    try {
      Api result = apiInstance.registryCreateApi(project, location, api, apiId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryCreateApi");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | [**Api**](Api.md)|  | |
| **apiId** | **String**| Required. The ID to use for the api, which will become the final component of the api&#39;s resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID. | [optional] |

### Return type

[**Api**](Api.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryCreateApiDeployment"></a>
# **registryCreateApiDeployment**
> ApiDeployment registryCreateApiDeployment(project, location, api, apiDeployment, apiDeploymentId)



CreateApiDeployment creates a specified deployment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    ApiDeployment apiDeployment = new ApiDeployment(); // ApiDeployment | 
    String apiDeploymentId = "apiDeploymentId_example"; // String | Required. The ID to use for the deployment, which will become the final component of the deployment's resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID.
    try {
      ApiDeployment result = apiInstance.registryCreateApiDeployment(project, location, api, apiDeployment, apiDeploymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryCreateApiDeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **apiDeployment** | [**ApiDeployment**](ApiDeployment.md)|  | |
| **apiDeploymentId** | **String**| Required. The ID to use for the deployment, which will become the final component of the deployment&#39;s resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID. | [optional] |

### Return type

[**ApiDeployment**](ApiDeployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryCreateApiSpec"></a>
# **registryCreateApiSpec**
> ApiSpec registryCreateApiSpec(project, location, api, version, apiSpec, apiSpecId)



CreateApiSpec creates a specified spec.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    ApiSpec apiSpec = new ApiSpec(); // ApiSpec | 
    String apiSpecId = "apiSpecId_example"; // String | Required. The ID to use for the spec, which will become the final component of the spec's resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID.
    try {
      ApiSpec result = apiInstance.registryCreateApiSpec(project, location, api, version, apiSpec, apiSpecId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryCreateApiSpec");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **apiSpec** | [**ApiSpec**](ApiSpec.md)|  | |
| **apiSpecId** | **String**| Required. The ID to use for the spec, which will become the final component of the spec&#39;s resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID. | [optional] |

### Return type

[**ApiSpec**](ApiSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryCreateApiVersion"></a>
# **registryCreateApiVersion**
> ApiVersion registryCreateApiVersion(project, location, api, apiVersion, apiVersionId)



CreateApiVersion creates a specified version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    ApiVersion apiVersion = new ApiVersion(); // ApiVersion | 
    String apiVersionId = "apiVersionId_example"; // String | Required. The ID to use for the version, which will become the final component of the version's resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID.
    try {
      ApiVersion result = apiInstance.registryCreateApiVersion(project, location, api, apiVersion, apiVersionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryCreateApiVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **apiVersion** | [**ApiVersion**](ApiVersion.md)|  | |
| **apiVersionId** | **String**| Required. The ID to use for the version, which will become the final component of the version&#39;s resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID. | [optional] |

### Return type

[**ApiVersion**](ApiVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryCreateArtifact"></a>
# **registryCreateArtifact**
> Artifact registryCreateArtifact(project, location, artifact, artifactId)



CreateArtifact creates a specified artifact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    Artifact artifact = new Artifact(); // Artifact | 
    String artifactId = "artifactId_example"; // String | Required. The ID to use for the artifact, which will become the final component of the artifact's resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID.
    try {
      Artifact result = apiInstance.registryCreateArtifact(project, location, artifact, artifactId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryCreateArtifact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **artifact** | [**Artifact**](Artifact.md)|  | |
| **artifactId** | **String**| Required. The ID to use for the artifact, which will become the final component of the artifact&#39;s resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID. | [optional] |

### Return type

[**Artifact**](Artifact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryDeleteApi"></a>
# **registryDeleteApi**
> registryDeleteApi(project, location, api, force)



DeleteApi removes a specified API and all of the resources that it  owns.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    Boolean force = true; // Boolean | If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)
    try {
      apiInstance.registryDeleteApi(project, location, api, force);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryDeleteApi");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **force** | **Boolean**| If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.) | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryDeleteApiDeployment"></a>
# **registryDeleteApiDeployment**
> registryDeleteApiDeployment(project, location, api, deployment, force)



DeleteApiDeployment removes a specified deployment, all revisions, and all  child resources (e.g. artifacts).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String deployment = "deployment_example"; // String | The deployment id.
    Boolean force = true; // Boolean | If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)
    try {
      apiInstance.registryDeleteApiDeployment(project, location, api, deployment, force);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryDeleteApiDeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **deployment** | **String**| The deployment id. | |
| **force** | **Boolean**| If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.) | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryDeleteApiDeploymentRevision"></a>
# **registryDeleteApiDeploymentRevision**
> ApiDeployment registryDeleteApiDeploymentRevision(project, location, api, deployment)



DeleteApiDeploymentRevision deletes a revision of a deployment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String deployment = "deployment_example"; // String | The deployment id.
    try {
      ApiDeployment result = apiInstance.registryDeleteApiDeploymentRevision(project, location, api, deployment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryDeleteApiDeploymentRevision");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **deployment** | **String**| The deployment id. | |

### Return type

[**ApiDeployment**](ApiDeployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryDeleteApiSpec"></a>
# **registryDeleteApiSpec**
> registryDeleteApiSpec(project, location, api, version, spec, force)



DeleteApiSpec removes a specified spec, all revisions, and all child  resources (e.g. artifacts).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    String spec = "spec_example"; // String | The spec id.
    Boolean force = true; // Boolean | If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)
    try {
      apiInstance.registryDeleteApiSpec(project, location, api, version, spec, force);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryDeleteApiSpec");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **spec** | **String**| The spec id. | |
| **force** | **Boolean**| If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.) | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryDeleteApiSpecRevision"></a>
# **registryDeleteApiSpecRevision**
> ApiSpec registryDeleteApiSpecRevision(project, location, api, version, spec)



DeleteApiSpecRevision deletes a revision of a spec.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    String spec = "spec_example"; // String | The spec id.
    try {
      ApiSpec result = apiInstance.registryDeleteApiSpecRevision(project, location, api, version, spec);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryDeleteApiSpecRevision");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **spec** | **String**| The spec id. | |

### Return type

[**ApiSpec**](ApiSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryDeleteApiVersion"></a>
# **registryDeleteApiVersion**
> registryDeleteApiVersion(project, location, api, version, force)



DeleteApiVersion removes a specified version and all of the resources that  it owns.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    Boolean force = true; // Boolean | If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)
    try {
      apiInstance.registryDeleteApiVersion(project, location, api, version, force);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryDeleteApiVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **force** | **Boolean**| If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.) | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryDeleteArtifact"></a>
# **registryDeleteArtifact**
> registryDeleteArtifact(project, location, artifact)



DeleteArtifact removes a specified artifact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String artifact = "artifact_example"; // String | The artifact id.
    try {
      apiInstance.registryDeleteArtifact(project, location, artifact);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryDeleteArtifact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **artifact** | **String**| The artifact id. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryGetApi"></a>
# **registryGetApi**
> Api registryGetApi(project, location, api)



GetApi returns a specified API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    try {
      Api result = apiInstance.registryGetApi(project, location, api);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryGetApi");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |

### Return type

[**Api**](Api.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryGetApiDeployment"></a>
# **registryGetApiDeployment**
> ApiDeployment registryGetApiDeployment(project, location, api, deployment)



GetApiDeployment returns a specified deployment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String deployment = "deployment_example"; // String | The deployment id.
    try {
      ApiDeployment result = apiInstance.registryGetApiDeployment(project, location, api, deployment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryGetApiDeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **deployment** | **String**| The deployment id. | |

### Return type

[**ApiDeployment**](ApiDeployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryGetApiSpec"></a>
# **registryGetApiSpec**
> ApiSpec registryGetApiSpec(project, location, api, version, spec)



GetApiSpec returns a specified spec.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    String spec = "spec_example"; // String | The spec id.
    try {
      ApiSpec result = apiInstance.registryGetApiSpec(project, location, api, version, spec);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryGetApiSpec");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **spec** | **String**| The spec id. | |

### Return type

[**ApiSpec**](ApiSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryGetApiSpecContents"></a>
# **registryGetApiSpecContents**
> registryGetApiSpecContents(project, location, api, version, spec)



GetApiSpecContents returns the contents of a specified spec.  If specs are stored with GZip compression, the default behavior  is to return the spec uncompressed (the mime_type response field  indicates the exact format returned).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    String spec = "spec_example"; // String | The spec id.
    try {
      apiInstance.registryGetApiSpecContents(project, location, api, version, spec);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryGetApiSpecContents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **spec** | **String**| The spec id. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryGetApiVersion"></a>
# **registryGetApiVersion**
> ApiVersion registryGetApiVersion(project, location, api, version)



GetApiVersion returns a specified version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    try {
      ApiVersion result = apiInstance.registryGetApiVersion(project, location, api, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryGetApiVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |

### Return type

[**ApiVersion**](ApiVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryGetArtifact"></a>
# **registryGetArtifact**
> Artifact registryGetArtifact(project, location, artifact)



GetArtifact returns a specified artifact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String artifact = "artifact_example"; // String | The artifact id.
    try {
      Artifact result = apiInstance.registryGetArtifact(project, location, artifact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryGetArtifact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **artifact** | **String**| The artifact id. | |

### Return type

[**Artifact**](Artifact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryGetArtifactContents"></a>
# **registryGetArtifactContents**
> registryGetArtifactContents(project, location, artifact)



GetArtifactContents returns the contents of a specified artifact.  If artifacts are stored with GZip compression, the default behavior  is to return the artifact uncompressed (the mime_type response field  indicates the exact format returned).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String artifact = "artifact_example"; // String | The artifact id.
    try {
      apiInstance.registryGetArtifactContents(project, location, artifact);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryGetArtifactContents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **artifact** | **String**| The artifact id. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryListApiDeploymentRevisions"></a>
# **registryListApiDeploymentRevisions**
> ListApiDeploymentRevisionsResponse registryListApiDeploymentRevisions(project, location, api, deployment, pageSize, pageToken)



ListApiDeploymentRevisions lists all revisions of a deployment.  Revisions are returned in descending order of revision creation time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String deployment = "deployment_example"; // String | The deployment id.
    Integer pageSize = 56; // Integer | The maximum number of revisions to return per page.
    String pageToken = "pageToken_example"; // String | The page token, received from a previous ListApiDeploymentRevisions call. Provide this to retrieve the subsequent page.
    try {
      ListApiDeploymentRevisionsResponse result = apiInstance.registryListApiDeploymentRevisions(project, location, api, deployment, pageSize, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryListApiDeploymentRevisions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **deployment** | **String**| The deployment id. | |
| **pageSize** | **Integer**| The maximum number of revisions to return per page. | [optional] |
| **pageToken** | **String**| The page token, received from a previous ListApiDeploymentRevisions call. Provide this to retrieve the subsequent page. | [optional] |

### Return type

[**ListApiDeploymentRevisionsResponse**](ListApiDeploymentRevisionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryListApiDeployments"></a>
# **registryListApiDeployments**
> ListApiDeploymentsResponse registryListApiDeployments(project, location, api, pageSize, pageToken, filter)



ListApiDeployments returns matching deployments.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    Integer pageSize = 56; // Integer | The maximum number of deployments to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
    String pageToken = "pageToken_example"; // String | A page token, received from a previous `ListApiDeployments` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListApiDeployments` must match the call that provided the page token.
    String filter = "filter_example"; // String | An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields.
    try {
      ListApiDeploymentsResponse result = apiInstance.registryListApiDeployments(project, location, api, pageSize, pageToken, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryListApiDeployments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **pageSize** | **Integer**| The maximum number of deployments to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000. | [optional] |
| **pageToken** | **String**| A page token, received from a previous &#x60;ListApiDeployments&#x60; call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to &#x60;ListApiDeployments&#x60; must match the call that provided the page token. | [optional] |
| **filter** | **String**| An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields. | [optional] |

### Return type

[**ListApiDeploymentsResponse**](ListApiDeploymentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryListApiSpecRevisions"></a>
# **registryListApiSpecRevisions**
> ListApiSpecRevisionsResponse registryListApiSpecRevisions(project, location, api, version, spec, pageSize, pageToken)



ListApiSpecRevisions lists all revisions of a spec.  Revisions are returned in descending order of revision creation time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    String spec = "spec_example"; // String | The spec id.
    Integer pageSize = 56; // Integer | The maximum number of revisions to return per page.
    String pageToken = "pageToken_example"; // String | The page token, received from a previous ListApiSpecRevisions call. Provide this to retrieve the subsequent page.
    try {
      ListApiSpecRevisionsResponse result = apiInstance.registryListApiSpecRevisions(project, location, api, version, spec, pageSize, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryListApiSpecRevisions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **spec** | **String**| The spec id. | |
| **pageSize** | **Integer**| The maximum number of revisions to return per page. | [optional] |
| **pageToken** | **String**| The page token, received from a previous ListApiSpecRevisions call. Provide this to retrieve the subsequent page. | [optional] |

### Return type

[**ListApiSpecRevisionsResponse**](ListApiSpecRevisionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryListApiSpecs"></a>
# **registryListApiSpecs**
> ListApiSpecsResponse registryListApiSpecs(project, location, api, version, pageSize, pageToken, filter)



ListApiSpecs returns matching specs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    Integer pageSize = 56; // Integer | The maximum number of specs to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
    String pageToken = "pageToken_example"; // String | A page token, received from a previous `ListApiSpecs` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListApiSpecs` must match the call that provided the page token.
    String filter = "filter_example"; // String | An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents.
    try {
      ListApiSpecsResponse result = apiInstance.registryListApiSpecs(project, location, api, version, pageSize, pageToken, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryListApiSpecs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **pageSize** | **Integer**| The maximum number of specs to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000. | [optional] |
| **pageToken** | **String**| A page token, received from a previous &#x60;ListApiSpecs&#x60; call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to &#x60;ListApiSpecs&#x60; must match the call that provided the page token. | [optional] |
| **filter** | **String**| An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents. | [optional] |

### Return type

[**ListApiSpecsResponse**](ListApiSpecsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryListApiVersions"></a>
# **registryListApiVersions**
> ListApiVersionsResponse registryListApiVersions(project, location, api, pageSize, pageToken, filter)



ListApiVersions returns matching versions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    Integer pageSize = 56; // Integer | The maximum number of versions to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
    String pageToken = "pageToken_example"; // String | A page token, received from a previous `ListApiVersions` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListApiVersions` must match the call that provided the page token.
    String filter = "filter_example"; // String | An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields.
    try {
      ListApiVersionsResponse result = apiInstance.registryListApiVersions(project, location, api, pageSize, pageToken, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryListApiVersions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **pageSize** | **Integer**| The maximum number of versions to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000. | [optional] |
| **pageToken** | **String**| A page token, received from a previous &#x60;ListApiVersions&#x60; call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to &#x60;ListApiVersions&#x60; must match the call that provided the page token. | [optional] |
| **filter** | **String**| An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields. | [optional] |

### Return type

[**ListApiVersionsResponse**](ListApiVersionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryListApis"></a>
# **registryListApis**
> ListApisResponse registryListApis(project, location, pageSize, pageToken, filter)



ListApis returns matching APIs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    Integer pageSize = 56; // Integer | The maximum number of APIs to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
    String pageToken = "pageToken_example"; // String | A page token, received from a previous `ListApis` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListApis` must match the call that provided the page token.
    String filter = "filter_example"; // String | An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields.
    try {
      ListApisResponse result = apiInstance.registryListApis(project, location, pageSize, pageToken, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryListApis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **pageSize** | **Integer**| The maximum number of APIs to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000. | [optional] |
| **pageToken** | **String**| A page token, received from a previous &#x60;ListApis&#x60; call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to &#x60;ListApis&#x60; must match the call that provided the page token. | [optional] |
| **filter** | **String**| An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields. | [optional] |

### Return type

[**ListApisResponse**](ListApisResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryListArtifacts"></a>
# **registryListArtifacts**
> ListArtifactsResponse registryListArtifacts(project, location, pageSize, pageToken, filter)



ListArtifacts returns matching artifacts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    Integer pageSize = 56; // Integer | The maximum number of artifacts to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
    String pageToken = "pageToken_example"; // String | A page token, received from a previous `ListArtifacts` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListArtifacts` must match the call that provided the page token.
    String filter = "filter_example"; // String | An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents.
    try {
      ListArtifactsResponse result = apiInstance.registryListArtifacts(project, location, pageSize, pageToken, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryListArtifacts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **pageSize** | **Integer**| The maximum number of artifacts to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000. | [optional] |
| **pageToken** | **String**| A page token, received from a previous &#x60;ListArtifacts&#x60; call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to &#x60;ListArtifacts&#x60; must match the call that provided the page token. | [optional] |
| **filter** | **String**| An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents. | [optional] |

### Return type

[**ListArtifactsResponse**](ListArtifactsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryReplaceArtifact"></a>
# **registryReplaceArtifact**
> Artifact registryReplaceArtifact(project, location, artifact, artifact2)



ReplaceArtifact can be used to replace a specified artifact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String artifact = "artifact_example"; // String | The artifact id.
    Artifact artifact2 = new Artifact(); // Artifact | 
    try {
      Artifact result = apiInstance.registryReplaceArtifact(project, location, artifact, artifact2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryReplaceArtifact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **artifact** | **String**| The artifact id. | |
| **artifact2** | [**Artifact**](Artifact.md)|  | |

### Return type

[**Artifact**](Artifact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryRollbackApiDeployment"></a>
# **registryRollbackApiDeployment**
> ApiDeployment registryRollbackApiDeployment(project, location, api, deployment, rollbackApiDeploymentRequest)



RollbackApiDeployment sets the current revision to a specified prior  revision. Note that this creates a new revision with a new revision ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String deployment = "deployment_example"; // String | The deployment id.
    RollbackApiDeploymentRequest rollbackApiDeploymentRequest = new RollbackApiDeploymentRequest(); // RollbackApiDeploymentRequest | 
    try {
      ApiDeployment result = apiInstance.registryRollbackApiDeployment(project, location, api, deployment, rollbackApiDeploymentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryRollbackApiDeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **deployment** | **String**| The deployment id. | |
| **rollbackApiDeploymentRequest** | [**RollbackApiDeploymentRequest**](RollbackApiDeploymentRequest.md)|  | |

### Return type

[**ApiDeployment**](ApiDeployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryRollbackApiSpec"></a>
# **registryRollbackApiSpec**
> ApiSpec registryRollbackApiSpec(project, location, api, version, spec, rollbackApiSpecRequest)



RollbackApiSpec sets the current revision to a specified prior revision.  Note that this creates a new revision with a new revision ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    String spec = "spec_example"; // String | The spec id.
    RollbackApiSpecRequest rollbackApiSpecRequest = new RollbackApiSpecRequest(); // RollbackApiSpecRequest | 
    try {
      ApiSpec result = apiInstance.registryRollbackApiSpec(project, location, api, version, spec, rollbackApiSpecRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryRollbackApiSpec");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **spec** | **String**| The spec id. | |
| **rollbackApiSpecRequest** | [**RollbackApiSpecRequest**](RollbackApiSpecRequest.md)|  | |

### Return type

[**ApiSpec**](ApiSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryTagApiDeploymentRevision"></a>
# **registryTagApiDeploymentRevision**
> ApiDeployment registryTagApiDeploymentRevision(project, location, api, deployment, tagApiDeploymentRevisionRequest)



TagApiDeploymentRevision adds a tag to a specified revision of a  deployment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String deployment = "deployment_example"; // String | The deployment id.
    TagApiDeploymentRevisionRequest tagApiDeploymentRevisionRequest = new TagApiDeploymentRevisionRequest(); // TagApiDeploymentRevisionRequest | 
    try {
      ApiDeployment result = apiInstance.registryTagApiDeploymentRevision(project, location, api, deployment, tagApiDeploymentRevisionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryTagApiDeploymentRevision");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **deployment** | **String**| The deployment id. | |
| **tagApiDeploymentRevisionRequest** | [**TagApiDeploymentRevisionRequest**](TagApiDeploymentRevisionRequest.md)|  | |

### Return type

[**ApiDeployment**](ApiDeployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryTagApiSpecRevision"></a>
# **registryTagApiSpecRevision**
> ApiSpec registryTagApiSpecRevision(project, location, api, version, spec, tagApiSpecRevisionRequest)



TagApiSpecRevision adds a tag to a specified revision of a spec.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    String spec = "spec_example"; // String | The spec id.
    TagApiSpecRevisionRequest tagApiSpecRevisionRequest = new TagApiSpecRevisionRequest(); // TagApiSpecRevisionRequest | 
    try {
      ApiSpec result = apiInstance.registryTagApiSpecRevision(project, location, api, version, spec, tagApiSpecRevisionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryTagApiSpecRevision");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **spec** | **String**| The spec id. | |
| **tagApiSpecRevisionRequest** | [**TagApiSpecRevisionRequest**](TagApiSpecRevisionRequest.md)|  | |

### Return type

[**ApiSpec**](ApiSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryUpdateApi"></a>
# **registryUpdateApi**
> Api registryUpdateApi(project, location, api, api2, updateMask, allowMissing)



UpdateApi can be used to modify a specified API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    Api api2 = new Api(); // Api | 
    String updateMask = "updateMask_example"; // String | The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a \"*\" is specified, all fields are updated, including fields that are unspecified/default in the request.
    Boolean allowMissing = true; // Boolean | If set to true, and the api is not found, a new api_versions will be created. In this situation, `update_mask` is ignored.
    try {
      Api result = apiInstance.registryUpdateApi(project, location, api, api2, updateMask, allowMissing);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryUpdateApi");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **api2** | [**Api**](Api.md)|  | |
| **updateMask** | **String**| The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a \&quot;*\&quot; is specified, all fields are updated, including fields that are unspecified/default in the request. | [optional] |
| **allowMissing** | **Boolean**| If set to true, and the api is not found, a new api_versions will be created. In this situation, &#x60;update_mask&#x60; is ignored. | [optional] |

### Return type

[**Api**](Api.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryUpdateApiDeployment"></a>
# **registryUpdateApiDeployment**
> ApiDeployment registryUpdateApiDeployment(project, location, api, deployment, apiDeployment, updateMask, allowMissing)



UpdateApiDeployment can be used to modify a specified deployment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String deployment = "deployment_example"; // String | The deployment id.
    ApiDeployment apiDeployment = new ApiDeployment(); // ApiDeployment | 
    String updateMask = "updateMask_example"; // String | The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a \"*\" is specified, all fields are updated, including fields that are unspecified/default in the request.
    Boolean allowMissing = true; // Boolean | If set to true, and the deployment is not found, a new deployment will be created. In this situation, `update_mask` is ignored.
    try {
      ApiDeployment result = apiInstance.registryUpdateApiDeployment(project, location, api, deployment, apiDeployment, updateMask, allowMissing);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryUpdateApiDeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **deployment** | **String**| The deployment id. | |
| **apiDeployment** | [**ApiDeployment**](ApiDeployment.md)|  | |
| **updateMask** | **String**| The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a \&quot;*\&quot; is specified, all fields are updated, including fields that are unspecified/default in the request. | [optional] |
| **allowMissing** | **Boolean**| If set to true, and the deployment is not found, a new deployment will be created. In this situation, &#x60;update_mask&#x60; is ignored. | [optional] |

### Return type

[**ApiDeployment**](ApiDeployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryUpdateApiSpec"></a>
# **registryUpdateApiSpec**
> ApiSpec registryUpdateApiSpec(project, location, api, version, spec, apiSpec, updateMask, allowMissing)



UpdateApiSpec can be used to modify a specified spec.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    String spec = "spec_example"; // String | The spec id.
    ApiSpec apiSpec = new ApiSpec(); // ApiSpec | 
    String updateMask = "updateMask_example"; // String | The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a \"*\" is specified, all fields are updated, including fields that are unspecified/default in the request.
    Boolean allowMissing = true; // Boolean | If set to true, and the spec is not found, a new spec will be created. In this situation, `update_mask` is ignored.
    try {
      ApiSpec result = apiInstance.registryUpdateApiSpec(project, location, api, version, spec, apiSpec, updateMask, allowMissing);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryUpdateApiSpec");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **spec** | **String**| The spec id. | |
| **apiSpec** | [**ApiSpec**](ApiSpec.md)|  | |
| **updateMask** | **String**| The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a \&quot;*\&quot; is specified, all fields are updated, including fields that are unspecified/default in the request. | [optional] |
| **allowMissing** | **Boolean**| If set to true, and the spec is not found, a new spec will be created. In this situation, &#x60;update_mask&#x60; is ignored. | [optional] |

### Return type

[**ApiSpec**](ApiSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a id="registryUpdateApiVersion"></a>
# **registryUpdateApiVersion**
> ApiVersion registryUpdateApiVersion(project, location, api, version, apiVersion, updateMask, allowMissing)



UpdateApiVersion can be used to modify a specified version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://apigee.local");

    RegistryApi apiInstance = new RegistryApi(defaultClient);
    String project = "project_example"; // String | The project id.
    String location = "location_example"; // String | The location id.
    String api = "api_example"; // String | The api id.
    String version = "version_example"; // String | The version id.
    ApiVersion apiVersion = new ApiVersion(); // ApiVersion | 
    String updateMask = "updateMask_example"; // String | The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a \"*\" is specified, all fields are updated, including fields that are unspecified/default in the request.
    Boolean allowMissing = true; // Boolean | If set to true, and the version is not found, a new version will be created. In this situation, `update_mask` is ignored.
    try {
      ApiVersion result = apiInstance.registryUpdateApiVersion(project, location, api, version, apiVersion, updateMask, allowMissing);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistryApi#registryUpdateApiVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | **String**| The project id. | |
| **location** | **String**| The location id. | |
| **api** | **String**| The api id. | |
| **version** | **String**| The version id. | |
| **apiVersion** | [**ApiVersion**](ApiVersion.md)|  | |
| **updateMask** | **String**| The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a \&quot;*\&quot; is specified, all fields are updated, including fields that are unspecified/default in the request. | [optional] |
| **allowMissing** | **Boolean**| If set to true, and the version is not found, a new version will be created. In this situation, &#x60;update_mask&#x60; is ignored. | [optional] |

### Return type

[**ApiVersion**](ApiVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

