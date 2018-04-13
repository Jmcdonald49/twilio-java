/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.studio.v1.flow.engagement;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EngagementContext extends Resource {
    private static final long serialVersionUID = 165571935124227L;

    /**
     * Create a EngagementContextFetcher to execute fetch.
     * 
     * @param pathFlowSid The flow_sid
     * @param pathEngagementSid The engagement_sid
     * @return EngagementContextFetcher capable of executing the fetch
     */
    public static EngagementContextFetcher fetcher(final String pathFlowSid, 
                                                   final String pathEngagementSid) {
        return new EngagementContextFetcher(pathFlowSid, pathEngagementSid);
    }

    /**
     * Converts a JSON String into a EngagementContext object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return EngagementContext object represented by the provided JSON
     */
    public static EngagementContext fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, EngagementContext.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a EngagementContext object using the
     * provided ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return EngagementContext object represented by the provided JSON
     */
    public static EngagementContext fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, EngagementContext.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final Map<String, Object> context;
    private final String engagementSid;
    private final String flowSid;
    private final URI url;

    @JsonCreator
    private EngagementContext(@JsonProperty("account_sid")
                              final String accountSid, 
                              @JsonProperty("context")
                              final Map<String, Object> context, 
                              @JsonProperty("engagement_sid")
                              final String engagementSid, 
                              @JsonProperty("flow_sid")
                              final String flowSid, 
                              @JsonProperty("url")
                              final URI url) {
        this.accountSid = accountSid;
        this.context = context;
        this.engagementSid = engagementSid;
        this.flowSid = flowSid;
        this.url = url;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The context.
     * 
     * @return The context
     */
    public final Map<String, Object> getContext() {
        return this.context;
    }

    /**
     * Returns The The engagement_sid.
     * 
     * @return The engagement_sid
     */
    public final String getEngagementSid() {
        return this.engagementSid;
    }

    /**
     * Returns The The flow_sid.
     * 
     * @return The flow_sid
     */
    public final String getFlowSid() {
        return this.flowSid;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EngagementContext other = (EngagementContext) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(context, other.context) && 
               Objects.equals(engagementSid, other.engagementSid) && 
               Objects.equals(flowSid, other.flowSid) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            context,
                            engagementSid,
                            flowSid,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("context", context)
                          .add("engagementSid", engagementSid)
                          .add("flowSid", flowSid)
                          .add("url", url)
                          .toString();
    }
}