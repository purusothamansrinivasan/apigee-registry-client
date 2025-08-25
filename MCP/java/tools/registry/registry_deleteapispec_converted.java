/**
 * MCP Server function for DeleteApiSpec removes a specified spec, all revisions, and all child
 resources (e.g. artifacts).
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

class Delete_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_SpecMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getDelete_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_SpecHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("force")) {
            queryParams.add("force=" + args.get("force"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/delete_v1_projects_project_locations_location_apis_api_versions_version_specs_spec" + queryString;
                
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
    
    public static MCPServer.Tool createDelete_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_SpecTool(MCPServer.APIConfig config) {
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
        Map<String, Object> forceProperty = new HashMap<>();
        forceProperty.put("type", "string");
        forceProperty.put("required", false);
        forceProperty.put("description", "If set to true, any child resources will also be deleted. (Otherwise, the request will only work if there are no child resources.)");
        properties.put("force", forceProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "delete_v1_projects_project_locations_location_apis_api_versions_version_specs_spec",
            "DeleteApiSpec removes a specified spec, all revisions, and all child
 resources (e.g. artifacts).",
            parameters
        );
        
        return new MCPServer.Tool(definition, getDelete_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_SpecHandler(config));
    }
    
}