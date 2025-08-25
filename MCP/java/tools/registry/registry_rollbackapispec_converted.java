/**
 * MCP Server function for RollbackApiSpec sets the current revision to a specified prior revision.
 Note that this creates a new revision with a new revision ID.
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

class Post_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_Spec_RollbackMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPost_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_Spec_RollbackHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("version")) {
            queryParams.add("version=" + args.get("version"));
        }
        if (args.containsKey("spec")) {
            queryParams.add("spec=" + args.get("spec"));
        }
        if (args.containsKey("name")) {
            queryParams.add("name=" + args.get("name"));
        }
        if (args.containsKey("revisionId")) {
            queryParams.add("revisionId=" + args.get("revisionId"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/post_v1_projects_project_locations_location_apis_api_versions_version_specs_spec_rollback" + queryString;
                
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
    
    public static MCPServer.Tool createPost_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_Spec_RollbackTool(MCPServer.APIConfig config) {
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
        Map<String, Object> versionProperty = new HashMap<>();
        versionProperty.put("type", "string");
        versionProperty.put("required", true);
        versionProperty.put("description", "The version id.");
        properties.put("version", versionProperty);
        Map<String, Object> specProperty = new HashMap<>();
        specProperty.put("type", "string");
        specProperty.put("required", true);
        specProperty.put("description", "The spec id.");
        properties.put("spec", specProperty);
        Map<String, Object> nameProperty = new HashMap<>();
        nameProperty.put("type", "string");
        nameProperty.put("required", true);
        nameProperty.put("description", "Input parameter: Required. The spec being rolled back.");
        properties.put("name", nameProperty);
        Map<String, Object> revisionIdProperty = new HashMap<>();
        revisionIdProperty.put("type", "string");
        revisionIdProperty.put("required", true);
        revisionIdProperty.put("description", "Input parameter: Required. The revision ID to roll back to. It must be a revision of the same spec. Example: c7cfa2a8");
        properties.put("revisionId", revisionIdProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "post_v1_projects_project_locations_location_apis_api_versions_version_specs_spec_rollback",
            "RollbackApiSpec sets the current revision to a specified prior revision.
 Note that this creates a new revision with a new revision ID.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPost_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_Spec_RollbackHandler(config));
    }
    
}