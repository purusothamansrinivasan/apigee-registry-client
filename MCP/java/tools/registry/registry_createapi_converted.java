/**
 * MCP Server function for CreateApi creates a specified API.
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

class Post_V1_Projects_Project_Locations_Location_ApisMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPost_V1_Projects_Project_Locations_Location_ApisHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("apiId")) {
            queryParams.add("apiId=" + args.get("apiId"));
        }
        if (args.containsKey("createTime")) {
            queryParams.add("createTime=" + args.get("createTime"));
        }
        if (args.containsKey("displayName")) {
            queryParams.add("displayName=" + args.get("displayName"));
        }
        if (args.containsKey("recommendedDeployment")) {
            queryParams.add("recommendedDeployment=" + args.get("recommendedDeployment"));
        }
        if (args.containsKey("updateTime")) {
            queryParams.add("updateTime=" + args.get("updateTime"));
        }
        if (args.containsKey("availability")) {
            queryParams.add("availability=" + args.get("availability"));
        }
        if (args.containsKey("description")) {
            queryParams.add("description=" + args.get("description"));
        }
        if (args.containsKey("recommendedVersion")) {
            queryParams.add("recommendedVersion=" + args.get("recommendedVersion"));
        }
        if (args.containsKey("name")) {
            queryParams.add("name=" + args.get("name"));
        }
        if (args.containsKey("annotations")) {
            queryParams.add("annotations=" + args.get("annotations"));
        }
        if (args.containsKey("labels")) {
            queryParams.add("labels=" + args.get("labels"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/post_v1_projects_project_locations_location_apis" + queryString;
                
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
    
    public static MCPServer.Tool createPost_V1_Projects_Project_Locations_Location_ApisTool(MCPServer.APIConfig config) {
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
        Map<String, Object> apiIdProperty = new HashMap<>();
        apiIdProperty.put("type", "string");
        apiIdProperty.put("required", false);
        apiIdProperty.put("description", "Required. The ID to use for the api, which will become the final component of the api's resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID.");
        properties.put("apiId", apiIdProperty);
        Map<String, Object> createTimeProperty = new HashMap<>();
        createTimeProperty.put("type", "string");
        createTimeProperty.put("required", false);
        createTimeProperty.put("description", "Input parameter: Output only. Creation timestamp.");
        properties.put("createTime", createTimeProperty);
        Map<String, Object> displayNameProperty = new HashMap<>();
        displayNameProperty.put("type", "string");
        displayNameProperty.put("required", false);
        displayNameProperty.put("description", "Input parameter: Human-meaningful name.");
        properties.put("displayName", displayNameProperty);
        Map<String, Object> recommendedDeploymentProperty = new HashMap<>();
        recommendedDeploymentProperty.put("type", "string");
        recommendedDeploymentProperty.put("required", false);
        recommendedDeploymentProperty.put("description", "Input parameter: The recommended deployment of the API. Format: apis/{api}/deployments/{deployment}");
        properties.put("recommendedDeployment", recommendedDeploymentProperty);
        Map<String, Object> updateTimeProperty = new HashMap<>();
        updateTimeProperty.put("type", "string");
        updateTimeProperty.put("required", false);
        updateTimeProperty.put("description", "Input parameter: Output only. Last update timestamp.");
        properties.put("updateTime", updateTimeProperty);
        Map<String, Object> availabilityProperty = new HashMap<>();
        availabilityProperty.put("type", "string");
        availabilityProperty.put("required", false);
        availabilityProperty.put("description", "Input parameter: A user-definable description of the availability of this service. Format: free-form, but we expect single words that describe availability, e.g. \"NONE\", \"TESTING\", \"PREVIEW\", \"GENERAL\", \"DEPRECATED\", \"SHUTDOWN\".");
        properties.put("availability", availabilityProperty);
        Map<String, Object> descriptionProperty = new HashMap<>();
        descriptionProperty.put("type", "string");
        descriptionProperty.put("required", false);
        descriptionProperty.put("description", "Input parameter: A detailed description.");
        properties.put("description", descriptionProperty);
        Map<String, Object> recommendedVersionProperty = new HashMap<>();
        recommendedVersionProperty.put("type", "string");
        recommendedVersionProperty.put("required", false);
        recommendedVersionProperty.put("description", "Input parameter: The recommended version of the API. Format: apis/{api}/versions/{version}");
        properties.put("recommendedVersion", recommendedVersionProperty);
        Map<String, Object> nameProperty = new HashMap<>();
        nameProperty.put("type", "string");
        nameProperty.put("required", false);
        nameProperty.put("description", "Input parameter: Resource name.");
        properties.put("name", nameProperty);
        Map<String, Object> annotationsProperty = new HashMap<>();
        annotationsProperty.put("type", "string");
        annotationsProperty.put("required", false);
        annotationsProperty.put("description", "Input parameter: Annotations attach non-identifying metadata to resources. Annotation keys and values are less restricted than those of labels, but should be generally used for small values of broad interest. Larger, topic- specific metadata should be stored in Artifacts.");
        properties.put("annotations", annotationsProperty);
        Map<String, Object> labelsProperty = new HashMap<>();
        labelsProperty.put("type", "string");
        labelsProperty.put("required", false);
        labelsProperty.put("description", "Input parameter: Labels attach identifying metadata to resources. Identifying metadata can be used to filter list operations. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. No more than 64 user labels can be associated with one resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys are prefixed with \"apigeeregistry.googleapis.com/\" and cannot be changed.");
        properties.put("labels", labelsProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "post_v1_projects_project_locations_location_apis",
            "CreateApi creates a specified API.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPost_V1_Projects_Project_Locations_Location_ApisHandler(config));
    }
    
}