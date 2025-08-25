/**
 * MCP Server function for CreateArtifact creates a specified artifact.
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

class Post_V1_Projects_Project_Locations_Location_ArtifactsMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPost_V1_Projects_Project_Locations_Location_ArtifactsHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("artifactId")) {
            queryParams.add("artifactId=" + args.get("artifactId"));
        }
        if (args.containsKey("mimeType")) {
            queryParams.add("mimeType=" + args.get("mimeType"));
        }
        if (args.containsKey("name")) {
            queryParams.add("name=" + args.get("name"));
        }
        if (args.containsKey("updateTime")) {
            queryParams.add("updateTime=" + args.get("updateTime"));
        }
        if (args.containsKey("contents")) {
            queryParams.add("contents=" + args.get("contents"));
        }
        if (args.containsKey("createTime")) {
            queryParams.add("createTime=" + args.get("createTime"));
        }
        if (args.containsKey("hash")) {
            queryParams.add("hash=" + args.get("hash"));
        }
        if (args.containsKey("sizeBytes")) {
            queryParams.add("sizeBytes=" + args.get("sizeBytes"));
        }
                
                String queryString = queryParams.isEmpty() ? "" : "?" + String.join("&", queryParams);
                String url = config.getBaseUrl() + "/api/v2/post_v1_projects_project_locations_location_artifacts" + queryString;
                
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
    
    public static MCPServer.Tool createPost_V1_Projects_Project_Locations_Location_ArtifactsTool(MCPServer.APIConfig config) {
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
        Map<String, Object> artifactIdProperty = new HashMap<>();
        artifactIdProperty.put("type", "string");
        artifactIdProperty.put("required", false);
        artifactIdProperty.put("description", "Required. The ID to use for the artifact, which will become the final component of the artifact's resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. Following AIP-162, IDs must not have the form of a UUID.");
        properties.put("artifactId", artifactIdProperty);
        Map<String, Object> mimeTypeProperty = new HashMap<>();
        mimeTypeProperty.put("type", "string");
        mimeTypeProperty.put("required", false);
        mimeTypeProperty.put("description", "Input parameter: A content type specifier for the artifact. Content type specifiers are Media Types (https://en.wikipedia.org/wiki/Media_type) with a possible \"schema\" parameter that specifies a schema for the stored information. Content types can specify compression. Currently only GZip compression is supported (indicated with \"+gzip\\");
        properties.put("mimeType", mimeTypeProperty);
        Map<String, Object> nameProperty = new HashMap<>();
        nameProperty.put("type", "string");
        nameProperty.put("required", false);
        nameProperty.put("description", "Input parameter: Resource name.");
        properties.put("name", nameProperty);
        Map<String, Object> updateTimeProperty = new HashMap<>();
        updateTimeProperty.put("type", "string");
        updateTimeProperty.put("required", false);
        updateTimeProperty.put("description", "Input parameter: Output only. Last update timestamp.");
        properties.put("updateTime", updateTimeProperty);
        Map<String, Object> contentsProperty = new HashMap<>();
        contentsProperty.put("type", "string");
        contentsProperty.put("required", false);
        contentsProperty.put("description", "Input parameter: Input only. The contents of the artifact. Provided by API callers when artifacts are created or replaced. To access the contents of an artifact, use GetArtifactContents.");
        properties.put("contents", contentsProperty);
        Map<String, Object> createTimeProperty = new HashMap<>();
        createTimeProperty.put("type", "string");
        createTimeProperty.put("required", false);
        createTimeProperty.put("description", "Input parameter: Output only. Creation timestamp.");
        properties.put("createTime", createTimeProperty);
        Map<String, Object> hashProperty = new HashMap<>();
        hashProperty.put("type", "string");
        hashProperty.put("required", false);
        hashProperty.put("description", "Input parameter: Output only. A SHA-256 hash of the artifact's contents. If the artifact is gzipped, this is the hash of the uncompressed artifact.");
        properties.put("hash", hashProperty);
        Map<String, Object> sizeBytesProperty = new HashMap<>();
        sizeBytesProperty.put("type", "string");
        sizeBytesProperty.put("required", false);
        sizeBytesProperty.put("description", "Input parameter: Output only. The size of the artifact in bytes. If the artifact is gzipped, this is the size of the uncompressed artifact.");
        properties.put("sizeBytes", sizeBytesProperty);
        parameters.put("properties", properties);
        
        MCPServer.ToolDefinition definition = new MCPServer.ToolDefinition(
            "post_v1_projects_project_locations_location_artifacts",
            "CreateArtifact creates a specified artifact.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPost_V1_Projects_Project_Locations_Location_ArtifactsHandler(config));
    }
    
}