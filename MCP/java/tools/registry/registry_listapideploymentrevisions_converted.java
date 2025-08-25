/**
 * MCP Server function for ListApiDeploymentRevisions lists all revisions of a deployment.
 Revisions are returned in descending order of revision creation time.
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

class Get_V1_Projects_Project_Locations_Location_Apis_Api_Deployments_Deployment_List_RevisionsMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getGet_V1_Projects_Project_Locations_Location_Apis_Api_Deployments_Deployment_List_RevisionsHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("pageToken")) {
            queryParams.add("pageToken=" + args.get("pageToken"));
        }
        if (args.containsKey("pageSize")) {
            queryParams.add("pageSize=" + args.get("pageSize"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/get_v1_projects_project_locations_location_apis_api_deployments_deployment_list_revisions" + queryString;
                
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
    
    public static MCPServer.Tool createGet_V1_Projects_Project_Locations_Location_Apis_Api_Deployments_Deployment_List_RevisionsTool(MCPServer.APIConfig config) {
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
        Map<String, Object> pageTokenProperty = new HashMap<>();
        pageTokenProperty.put("type", "string");
        pageTokenProperty.put("required", false);
        pageTokenProperty.put("description", "The page token, received from a previous ListApiDeploymentRevisions call. Provide this to retrieve the subsequent page.");
        properties.put("pageToken", pageTokenProperty);
        Map<String, Object> pageSizeProperty = new HashMap<>();
        pageSizeProperty.put("type", "string");
        pageSizeProperty.put("required", false);
        pageSizeProperty.put("description", "The maximum number of revisions to return per page.");
        properties.put("pageSize", pageSizeProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "get_v1_projects_project_locations_location_apis_api_deployments_deployment_list_revisions",
            "ListApiDeploymentRevisions lists all revisions of a deployment.
 Revisions are returned in descending order of revision creation time.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getGet_V1_Projects_Project_Locations_Location_Apis_Api_Deployments_Deployment_List_RevisionsHandler(config));
    }
    
}