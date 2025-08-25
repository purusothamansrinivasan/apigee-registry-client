/**
 * MCP Server function for UpdateApiSpec can be used to modify a specified spec.
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

class Patch_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_SpecMCPTool {
    
    public static Function<MCPServer.MCPRequest, MCPServer.MCPToolResult> getPatch_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_SpecHandler(MCPServer.APIConfig config) {
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
        if (args.containsKey("updateMask")) {
            queryParams.add("updateMask=" + args.get("updateMask"));
        }
        if (args.containsKey("hash")) {
            queryParams.add("hash=" + args.get("hash"));
        }
        if (args.containsKey("mimeType")) {
            queryParams.add("mimeType=" + args.get("mimeType"));
        }
        if (args.containsKey("revisionCreateTime")) {
            queryParams.add("revisionCreateTime=" + args.get("revisionCreateTime"));
        }
        if (args.containsKey("revisionUpdateTime")) {
            queryParams.add("revisionUpdateTime=" + args.get("revisionUpdateTime"));
        }
        if (args.containsKey("sourceUri")) {
            queryParams.add("sourceUri=" + args.get("sourceUri"));
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
        if (args.containsKey("contents")) {
            queryParams.add("contents=" + args.get("contents"));
        }
        if (args.containsKey("name")) {
            queryParams.add("name=" + args.get("name"));
        }
        if (args.containsKey("filename")) {
            queryParams.add("filename=" + args.get("filename"));
        }
        if (args.containsKey("sizeBytes")) {
            queryParams.add("sizeBytes=" + args.get("sizeBytes"));
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
                String url = config.getBaseUrl() + "/api/v2/patch_v1_projects_project_locations_location_apis_api_versions_version_specs_spec" + queryString;
                
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
    
    public static MCPServer.Tool createPatch_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_SpecTool(MCPServer.APIConfig config) {
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
        Map<String, Object> updateMaskProperty = new HashMap<>();
        updateMaskProperty.put("type", "string");
        updateMaskProperty.put("required", false);
        updateMaskProperty.put("description", "The list of fields to be updated. If omitted, all fields are updated that are set in the request message (fields set to default values are ignored). If a \"*\" is specified, all fields are updated, including fields that are unspecified/default in the request.");
        properties.put("updateMask", updateMaskProperty);
        Map<String, Object> hashProperty = new HashMap<>();
        hashProperty.put("type", "string");
        hashProperty.put("required", false);
        hashProperty.put("description", "Input parameter: Output only. A SHA-256 hash of the spec's contents. If the spec is gzipped, this is the hash of the uncompressed spec.");
        properties.put("hash", hashProperty);
        Map<String, Object> mimeTypeProperty = new HashMap<>();
        mimeTypeProperty.put("type", "string");
        mimeTypeProperty.put("required", false);
        mimeTypeProperty.put("description", "Input parameter: A style (format) descriptor for this spec that is specified as a Media Type (https://en.wikipedia.org/wiki/Media_type). Possible values include \"application/vnd.apigee.proto\", \"application/vnd.apigee.openapi\", and \"application/vnd.apigee.graphql\", with possible suffixes representing compression types. These hypothetical names are defined in the vendor tree defined in RFC6838 (https://tools.ietf.org/html/rfc6838) and are not final. Content types can specify compression. Currently only GZip compression is supported (indicated with \"+gzip\\");
        properties.put("mimeType", mimeTypeProperty);
        Map<String, Object> revisionCreateTimeProperty = new HashMap<>();
        revisionCreateTimeProperty.put("type", "string");
        revisionCreateTimeProperty.put("required", false);
        revisionCreateTimeProperty.put("description", "Input parameter: Output only. Revision creation timestamp; when the represented revision was created.");
        properties.put("revisionCreateTime", revisionCreateTimeProperty);
        Map<String, Object> revisionUpdateTimeProperty = new HashMap<>();
        revisionUpdateTimeProperty.put("type", "string");
        revisionUpdateTimeProperty.put("required", false);
        revisionUpdateTimeProperty.put("description", "Input parameter: Output only. Last update timestamp: when the represented revision was last modified.");
        properties.put("revisionUpdateTime", revisionUpdateTimeProperty);
        Map<String, Object> sourceUriProperty = new HashMap<>();
        sourceUriProperty.put("type", "string");
        sourceUriProperty.put("required", false);
        sourceUriProperty.put("description", "Input parameter: The original source URI of the spec (if one exists). This is an external location that can be used for reference purposes but which may not be authoritative since this external resource may change after the spec is retrieved.");
        properties.put("sourceUri", sourceUriProperty);
        Map<String, Object> createTimeProperty = new HashMap<>();
        createTimeProperty.put("type", "string");
        createTimeProperty.put("required", false);
        createTimeProperty.put("description", "Input parameter: Output only. Creation timestamp; when the spec resource was created.");
        properties.put("createTime", createTimeProperty);
        Map<String, Object> descriptionProperty = new HashMap<>();
        descriptionProperty.put("type", "string");
        descriptionProperty.put("required", false);
        descriptionProperty.put("description", "Input parameter: A detailed description.");
        properties.put("description", descriptionProperty);
        Map<String, Object> revisionIdProperty = new HashMap<>();
        revisionIdProperty.put("type", "string");
        revisionIdProperty.put("required", false);
        revisionIdProperty.put("description", "Input parameter: Output only. Immutable. The revision ID of the spec. A new revision is committed whenever the spec contents are changed. The format is an 8-character hexadecimal string.");
        properties.put("revisionId", revisionIdProperty);
        Map<String, Object> contentsProperty = new HashMap<>();
        contentsProperty.put("type", "string");
        contentsProperty.put("required", false);
        contentsProperty.put("description", "Input parameter: Input only. The contents of the spec. Provided by API callers when specs are created or updated. To access the contents of a spec, use GetApiSpecContents.");
        properties.put("contents", contentsProperty);
        Map<String, Object> nameProperty = new HashMap<>();
        nameProperty.put("type", "string");
        nameProperty.put("required", false);
        nameProperty.put("description", "Input parameter: Resource name.");
        properties.put("name", nameProperty);
        Map<String, Object> filenameProperty = new HashMap<>();
        filenameProperty.put("type", "string");
        filenameProperty.put("required", false);
        filenameProperty.put("description", "Input parameter: A possibly-hierarchical name used to refer to the spec from other specs.");
        properties.put("filename", filenameProperty);
        Map<String, Object> sizeBytesProperty = new HashMap<>();
        sizeBytesProperty.put("type", "string");
        sizeBytesProperty.put("required", false);
        sizeBytesProperty.put("description", "Input parameter: Output only. The size of the spec file in bytes. If the spec is gzipped, this is the size of the uncompressed spec.");
        properties.put("sizeBytes", sizeBytesProperty);
        Map<String, Object> allowMissingProperty = new HashMap<>();
        allowMissingProperty.put("type", "string");
        allowMissingProperty.put("required", false);
        allowMissingProperty.put("description", "If set to true, and the spec is not found, a new spec will be created. In this situation, `update_mask` is ignored.");
        properties.put("allowMissing", allowMissingProperty);
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
            "patch_v1_projects_project_locations_location_apis_api_versions_version_specs_spec",
            "UpdateApiSpec can be used to modify a specified spec.",
            parameters
        );
        
        return new MCPServer.Tool(definition, getPatch_V1_Projects_Project_Locations_Location_Apis_Api_Versions_Version_Specs_SpecHandler(config));
    }
    
}