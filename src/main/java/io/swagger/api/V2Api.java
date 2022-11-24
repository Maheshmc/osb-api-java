/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AsyncOperation;
import io.swagger.model.Catalog;
import io.swagger.model.Error;
import io.swagger.model.LastOperationResource;
import io.swagger.model.ServiceBindingRequest;
import io.swagger.model.ServiceBindingResource;
import io.swagger.model.ServiceBindingResponse;
import io.swagger.model.ServiceInstanceAsyncOperation;
import io.swagger.model.ServiceInstanceProvisionRequestBody;
import io.swagger.model.ServiceInstanceProvisionResponse;
import io.swagger.model.ServiceInstanceResource;
import io.swagger.model.ServiceInstanceUpdateRequestBody;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T08:23:13.017778+05:30[Asia/Kolkata]")
@Validated
public interface V2Api {

    @Operation(summary = "get the catalog of services that the service broker offers", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "Catalog" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "catalog response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Catalog.class))) })
    @RequestMapping(value = "/v2/catalog",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Catalog> catalogGet(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion);


    @Operation(summary = "generate a service binding", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "ServiceBindings" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceBindingResponse.class))),
        
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceBindingResponse.class))),
        
        @ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AsyncOperation.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}/service_bindings/{binding_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<ServiceBindingResponse> serviceBindingBinding(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion, @Parameter(in = ParameterIn.PATH, description = "instance id of instance to create a binding on", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId, @Parameter(in = ParameterIn.PATH, description = "binding id of binding to create", required=true, schema=@Schema()) @PathVariable("binding_id") String bindingId, @Parameter(in = ParameterIn.DEFAULT, description = "parameters for the requested service binding", required=true, schema=@Schema()) @Valid @RequestBody ServiceBindingRequest body, @Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity, @Parameter(in = ParameterIn.QUERY, description = "asynchronous operations supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete);


    @Operation(summary = "get a service binding", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "ServiceBindings" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceBindingResource.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}/service_bindings/{binding_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ServiceBindingResource> serviceBindingGet(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion, @Parameter(in = ParameterIn.PATH, description = "instance id of instance associated with the binding", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId, @Parameter(in = ParameterIn.PATH, description = "binding id of binding to fetch", required=true, schema=@Schema()) @PathVariable("binding_id") String bindingId, @Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity, @Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = false) String serviceId, @Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = false) String planId);


    @Operation(summary = "get the last requested operation state for service binding", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "ServiceBindings" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LastOperationResource.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "410", description = "Gone", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}/service_bindings/{binding_id}/last_operation",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LastOperationResource> serviceBindingLastOperationGet(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion, @Parameter(in = ParameterIn.PATH, description = "instance id of instance to find last operation applied to it", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId, @Parameter(in = ParameterIn.PATH, description = "binding id of service binding to find last operation applied to it", required=true, schema=@Schema()) @PathVariable("binding_id") String bindingId, @Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = false) String serviceId, @Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = false) String planId, @Parameter(in = ParameterIn.QUERY, description = "a provided identifier for the operation" ,schema=@Schema()) @Valid @RequestParam(value = "operation", required = false) String operation);


    @Operation(summary = "deprovision a service binding", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "ServiceBindings" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))),
        
        @ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AsyncOperation.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "410", description = "Gone", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}/service_bindings/{binding_id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Object> serviceBindingUnbinding(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion, @Parameter(in = ParameterIn.PATH, description = "id of the instance associated with the binding being deleted", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId, @Parameter(in = ParameterIn.PATH, description = "id of the binding being deleted", required=true, schema=@Schema()) @PathVariable("binding_id") String bindingId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance for which a binding is being deleted" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = true) String serviceId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance for which a binding is being deleted" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = true) String planId, @Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity, @Parameter(in = ParameterIn.QUERY, description = "asynchronous operations supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete);


    @Operation(summary = "deprovision a service instance", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "ServiceInstances" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))),
        
        @ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AsyncOperation.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "410", description = "Gone", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Object> serviceInstanceDeprovision(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion, @Parameter(in = ParameterIn.PATH, description = "id of instance being deleted", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance being deleted" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = true) String serviceId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance being deleted" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = true) String planId, @Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity, @Parameter(in = ParameterIn.QUERY, description = "asynchronous deprovision supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete);


    @Operation(summary = "get a service instance", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "ServiceInstances" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceInstanceResource.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ServiceInstanceResource> serviceInstanceGet(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion, @Parameter(in = ParameterIn.PATH, description = "instance id of instance to fetch", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId, @Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity, @Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = false) String serviceId, @Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = false) String planId);


    @Operation(summary = "get the last requested operation state for service instance", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "ServiceInstances" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LastOperationResource.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "410", description = "Gone", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}/last_operation",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LastOperationResource> serviceInstanceLastOperationGet(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion, @Parameter(in = ParameterIn.PATH, description = "instance id of instance to find last operation applied to it", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId, @Parameter(in = ParameterIn.QUERY, description = "id of the service associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "service_id", required = false) String serviceId, @Parameter(in = ParameterIn.QUERY, description = "id of the plan associated with the instance" ,schema=@Schema()) @Valid @RequestParam(value = "plan_id", required = false) String planId, @Parameter(in = ParameterIn.QUERY, description = "a provided identifier for the operation" ,schema=@Schema()) @Valid @RequestParam(value = "operation", required = false) String operation);


    @Operation(summary = "provision a service instance", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "ServiceInstances" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceInstanceProvisionResponse.class))),
        
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceInstanceProvisionResponse.class))),
        
        @ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceInstanceAsyncOperation.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<ServiceInstanceProvisionResponse> serviceInstanceProvision(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion, @Parameter(in = ParameterIn.PATH, description = "instance id of instance to provision", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId, @Parameter(in = ParameterIn.DEFAULT, description = "parameters for the requested service instance provision", required=true, schema=@Schema()) @Valid @RequestBody ServiceInstanceProvisionRequestBody body, @Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity, @Parameter(in = ParameterIn.QUERY, description = "asynchronous operations supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete);


    @Operation(summary = "update a service instance", description = "", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "ServiceInstances" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))),
        
        @ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceInstanceAsyncOperation.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "422", description = "Unprocessable entity", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Object> serviceInstanceUpdate(@Parameter(in = ParameterIn.HEADER, description = "version number of the Service Broker API that the Platform will use" ,required=true,schema=@Schema( defaultValue="2.13")) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion, @Parameter(in = ParameterIn.PATH, description = "instance id of instance to update", required=true, schema=@Schema()) @PathVariable("instance_id") String instanceId, @Parameter(in = ParameterIn.DEFAULT, description = "parameters for the requested service instance update", required=true, schema=@Schema()) @Valid @RequestBody ServiceInstanceUpdateRequestBody body, @Parameter(in = ParameterIn.HEADER, description = "identity of the user that initiated the request from the Platform" ,schema=@Schema()) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity, @Parameter(in = ParameterIn.QUERY, description = "asynchronous operations supported" ,schema=@Schema()) @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete);

}

