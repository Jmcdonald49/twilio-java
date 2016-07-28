/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.fetcher.ipmessaging.v1.service;

import com.twilio.rest.exception.ApiConnectionException;
import com.twilio.rest.exception.ApiException;
import com.twilio.rest.fetcher.Fetcher;
import com.twilio.rest.http.HttpMethod;
import com.twilio.rest.http.Request;
import com.twilio.rest.http.Response;
import com.twilio.rest.http.TwilioRestClient;
import com.twilio.rest.resource.RestException;
import com.twilio.rest.resource.ipmessaging.v1.service.User;

public class UserFetcher extends Fetcher<User> {
    private final String serviceSid;
    private final String sid;

    /**
     * Construct a new UserFetcher.
     * 
     * @param serviceSid The service_sid
     * @param sid The sid
     */
    public UserFetcher(final String serviceSid, 
                       final String sid) {
        this.serviceSid = serviceSid;
        this.sid = sid;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Fetched User
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public User execute(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            TwilioRestClient.Domains.IPMESSAGING,
            "/v1/Services/" + this.serviceSid + "/Users/" + this.sid + "",
            client.getRegion()
        );
        
        Response response = client.request(request);
        
        if (response == null) {
            throw new ApiConnectionException("User fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
        
            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }
        
        return User.fromJson(response.getStream(), client.getObjectMapper());
    }
}