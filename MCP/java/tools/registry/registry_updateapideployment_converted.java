/**
 * MCP Server function for UpdateApiDeployment can be used to modify a specified deployment.
 */

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.function.Function;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

class Patch_V1_Projects_Project_Locations_Location_Apis_Api_Deployments_DeploymentMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPatch_V1_Projects_Project_Locations_Location_Apis_Api_Deployments_DeploymentHandler(MCPServer.APIConfig config) {
        return (request) -> {
            try {
                Map<String, Object> args = request.getArguments();
                if (args == null) {
                    return new MCPServer.MCPToolResult("Invalid arguments object", true);
                }
                
                List<String> queryParams = new ArrayList<>();
        if (args.containsKey("project")) {
            queryParams.add("project=" + args.get("project"));
        }
        if (args.containsKey("location")) {
            queryParams.add("location=" + args.get("location"));
        }
        if (args.containsKey("api")) {
            queryParams.add("api=" + args.get("api"));
        }
        if (args.containsKey("deployment")) {
            queryParams.add("deployment=" + args.get("deployment"));
        }
        if (args.containsKey("updateMask")) {
            queryParams.add("updateMask=" + args.get("updateMask"));
        }
        if (args.containsKey("externalChannelUri")) {
            queryParams.add("externalChannelUri=" + args.get("externalChannelUri"));
        }
        if (args.containsKey("revisionCreateTime")) {
            queryParams.add("revisionCreateTime=" + args.get("revisionCreateTime"));
        }
        if (args.containsKey("createTime")) {
            queryParams.add("createTime=" + args.get("createTime"));
        }
        if (args.containsKey("description")) {
            queryParams.add("description=" + args.get("description"));
        }
        if (args.containsKey("revisionId")) {
            queryParams.add("revisionId=" + args.get("revisionId"));
        }
        if (args.containsKey("revisionUpdateTime")) {
            queryParams.add("revisionUpdateTime=" + args.get("revisionUpdateTime"));
        }
        if (args.containsKey("accessGuidance")) {
            queryParams.add("accessGuidance=" + args.get("accessGuidance"));
        }
        if (args.containsKey("apiSpecRevision")) {
            queryParams.add("apiSpecRevision=" + args.get("apiSpecRevision"));
        }
        if (args.containsKey("displayName")) {
            queryParams.add("displayName=" + args.get("displayName"));
        }
        if (args.containsKey("endpointUri")) {
            queryParams.add("endpointUri=" + args.get("endpointUri"));
        }
        if (args.containsKey("intendedAudience")) {
            queryParams.add("intendedAudience=" + args.get("intendedAudience"));
        }
        if (args.containsKey("name")) {
            queryParams.add("name=" + args.get("name"));
        }
        if (args.containsKey("allowMissing")) {
            queryParams.add("allowMissing=" + args.get("allowMissing"));
        }
        if (args.containsKey("annotations")) {
            queryParams.add("annotations=" + args.get("annotations"));
        }
        if (args.containsKey("labels")) {
            queryParams.add("labels=" + args.get("labels"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/patch_v1_projects_project_locations_location_apis_api_deployments_deployment" + queryString;
                
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Authorization", "Bearer " + config.getApiKey())
                    .header("Accept", "application/json")
                    .GET()
                    .build();
                
                HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                
                if (response.statusCode() >= 400) {
                    return new MCPServer.MCPToolResult("API error: " + response.body(), true);
                }
                
                // Pretty print JSON
                ObjectMapper mapper = new ObjectMapper();
                JsonNode jsonNode = mapper.readTree(response.body());
                String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
                
                return new MCPServer.MCPToolResult(prettyJson);
                
            } catch (IOException | InterruptedException e) {
                return new MCPServer.MCPToolResult("Request failed: " + e.getMessage(), true);
            } catch (Exception e) {
                return new MCPServer.MCPToolResult("Unexpected error: " + e.getMessage(), true);
            }
        };
    }
    
    public static MCPServer.Tool createPatch_V1_Projects_Project_Locations_Location_Apis_Api_Deployments_DeploymentTool(MCPServer.APIConfig config) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("type", "object");
        Map<String, Object> properties = new HashMap<>();
        Map<String, Object> projectProperty = new HashMap<>();
        projectProperty.put("type", "string");
        projectProperty.put("required", true);
        projectProperty.put("description", "The project id.");
        properties.put("project", projectProperty);
        Map<String, Object> locationProperty = new HashMap<>();
        locationProperty.put("type", "string");
        locationProperty.put("required", true);
        locationProperty.put("description", "The location id.");
        properties.put("location", locationProperty);
        Map<String, Object> apiProperty = new HashMap<>();
        apiProperty.put("type", "string");
        apiProperty.put("required", true);
        apiProperty.put("description", "The api id.");
        properties.put("api", apiProperty);
        Map<String, Object> deploymentProperty = new HashMap<>();
        deploymentProperty.put("type", "string");
        deploymentProperty.put("required", true);
        deploymentProperty.put("description", "The deployment id.");
        properties.put("deployment", deploymentProperty);
        Map<String, Object> updateMaskProperty = new HashMap<>();
        updateMaskProperty.put("type", "string");
        updateMaskProperty.put("required", false);
        updateMaskProperty.put("description", "The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a \"*\" is specified, all fields are updated, including fields that are unspecified/default in the request.");
        properties.put("updateMask", updateMaskProperty);
        Map<String, Object> externalChannelUriProperty = new HashMap<>();
        externalChannelUriProperty.put("type", "string");
        externalChannelUriProperty.put("required", false);
        externalChannelUriProperty.put("description", "Input parameter: The address of the external channel of the API (e.g. the Developer Portal). Changes to this value will not affect the revision.");
        properties.put("externalChannelUri", externalChannelUriProperty);
        Map<String, Object> revisionCreateTimeProperty = new HashMap<>();
        revisionCreateTimeProperty.put("type", "string");
        revisionCreateTimeProperty.put("required", false);
        revisionCreateTimeProperty.put("description", "Input parameter: Output only. Revision creation timestamp; when the represented revision was created.");
        properties.put("revisionCreateTime", revisionCreateTimeProperty);
        Map<String, Object> createTimeProperty = new HashMap<>();
        createTimeProperty.put("type", "string");
        createTimeProperty.put("required", false);
        createTimeProperty.put("description", "Input parameter: Output only. Creation timestamp; when the deployment resource was created.");
        properties.put("createTime", createTimeProperty);
        Map<String, Object> descriptionProperty = new HashMap<>();
        descriptionProperty.put("type", "string");
        descriptionProperty.put("required", false);
        descriptionProperty.put("description", "Input parameter: A detailed description.");
        properties.put("description", descriptionProperty);
        Map<String, Object> revisionIdProperty = new HashMap<>();
        revisionIdProperty.put("type", "string");
        revisionIdProperty.put("required", false);
        revisionIdProperty.put("description", "Input parameter: Output only. Immutable. The revision ID of the deployment. A new revision is committed whenever the deployment contents are changed. The format is an 8-character hexadecimal string.");
        properties.put("revisionId", revisionIdProperty);
        Map<String, Object> revisionUpdateTimeProperty = new HashMap<>();
        revisionUpdateTimeProperty.put("type", "string");
        revisionUpdateTimeProperty.put("required", false);
        revisionUpdateTimeProperty.put("description", "Input parameter: Output only. Last update timestamp: when the represented revision was last modified.");
        properties.put("revisionUpdateTime", revisionUpdateTimeProperty);
        Map<String, Object> accessGuidanceProperty = new HashMap<>();
        accessGuidanceProperty.put("type", "string");
        accessGuidanceProperty.put("required", false);
        accessGuidanceProperty.put("description", "Input parameter: Text briefly describing how to access the endpoint. Changes to this value will not affect the revision.");
        properties.put("accessGuidance", accessGuidanceProperty);
        Map<String, Object> apiSpecRevisionProperty = new HashMap<>();
        apiSpecRevisionProperty.put("type", "string");
        apiSpecRevisionProperty.put("required", false);
        apiSpecRevisionProperty.put("description", "Input parameter: The full resource name (including revision id) of the spec of the API being served by the deployment. Changes to this value will update the revision. Format: apis/{api}/deployments/{deployment}");
        properties.put("apiSpecRevision", apiSpecRevisionProperty);
        Map<String, Object> displayNameProperty = new HashMap<>();
        displayNameProperty.put("type", "string");
        displayNameProperty.put("required", false);
        displayNameProperty.put("description", "Input parameter: Human-meaningful name.");
        properties.put("displayName", displayNameProperty);
        Map<String, Object> endpointUriProperty = new HashMap<>();
        endpointUriProperty.put("type", "string");
        endpointUriProperty.put("required", false);
        endpointUriProperty.put("description", "Input parameter: The address where the deployment is serving. Changes to this value will update the revision.");
        properties.put("endpointUri", endpointUriProperty);
        Map<String, Object> intendedAudienceProperty = new HashMap<>();
        intendedAudienceProperty.put("type", "string");
        intendedAudienceProperty.put("required", false);
        intendedAudienceProperty.put("description", "Input parameter: Text briefly identifying the intended audience of the API. Changes to this value will not affect the revision.");
        properties.put("intendedAudience", intendedAudienceProperty);
        Map<String, Object> nameProperty = new HashMap<>();
        nameProperty.put("type", "string");
        nameProperty.put("required", false);
        nameProperty.put("description", "Input parameter: Resource name.");
        properties.put("name", nameProperty);
        Map<String, Object> allowMissingProperty = new HashMap<>();
        allowMissingProperty.put("type", "string");
        allowMissingProperty.put("required", false);
        allowMissingProperty.put("description", "If set to true, and the deployment is not found, a new deployment will be created. In this situation, `update_mask` is ignored.");
        properties.put("allowMissing", allowMissingProperty);
        Map<String, Object> annotationsProperty = new HashMap<>();
        annotationsProperty.put("type", "string");
        annotationsProperty.put("required", false);
        annotationsProperty.put("description", "Input parameter: Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.");
        properties.put("annotations", annotationsProperty);
        Map<String, Object> labelsProperty = new HashMap<>();
        labelsProperty.put("type", "string");
        labelsProperty.put("required", false);
        labelsProperty.put("description", "Input parameter: Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with \"registry.googleapis.com/\" and cannot be changed.");
        properties.put("labels", labelsProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "patch_v1_projects_project_locations_location_apis_api_deployments_deployment",
            "UpdateApiDeployment can be used to modify a specified deployment.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPatch_V1_Projects_Project_Locations_Location_Apis_Api_Deployments_DeploymentHandler(config));
    }
    
}