/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.deployedDevices.fleet;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class CertificateUpdater extends Updater<Certificate> {
    private final String pathFleetSid;
    private final String pathSid;
    private String friendlyName;
    private String deviceSid;

    /**
     * Construct a new CertificateUpdater.
     * 
     * @param pathFleetSid The fleet_sid
     * @param pathSid A string that uniquely identifies the Certificate.
     */
    public CertificateUpdater(final String pathFleetSid, 
                              final String pathSid) {
        this.pathFleetSid = pathFleetSid;
        this.pathSid = pathSid;
    }

    /**
     * Provides a human readable descriptive text for this Certificate credential,
     * up to 256 characters long..
     * 
     * @param friendlyName The human readable description for this Certificate.
     * @return this
     */
    public CertificateUpdater setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Provides the unique string identifier of an existing Device to become
     * authenticated with this Certificate credential..
     * 
     * @param deviceSid The unique identifier of a Device to be authenticated.
     * @return this
     */
    public CertificateUpdater setDeviceSid(final String deviceSid) {
        this.deviceSid = deviceSid;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Updated Certificate
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Certificate update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            "/DeployedDevices/Fleets/" + this.pathFleetSid + "/Certificates/" + this.pathSid + "",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Certificate update failed: Unable to connect to server");
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

        return Certificate.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (deviceSid != null) {
            request.addPostParam("DeviceSid", deviceSid);
        }
    }
}