/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.hostedNumbers;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;
import java.util.List;

public class HostedNumberOrderCreator extends Creator<HostedNumberOrder> {
    private final String addressSid;
    private final com.twilio.type.PhoneNumber phoneNumber;
    private final String isoCountry;
    private final Boolean smsCapability;
    private final String email;
    private String accountSid;
    private String friendlyName;
    private String uniqueName;
    private List<String> ccEmails;
    private URI smsUrl;
    private HttpMethod smsMethod;
    private URI smsFallbackUrl;
    private HttpMethod smsFallbackMethod;
    private URI statusCallbackUrl;
    private HttpMethod statusCallbackMethod;

    /**
     * Construct a new HostedNumberOrderCreator.
     * 
     * @param addressSid Address sid.
     * @param phoneNumber An E164 formatted phone number.
     * @param isoCountry ISO country code.
     * @param smsCapability Specify SMS capability to host.
     * @param email Email.
     */
    public HostedNumberOrderCreator(final String addressSid, 
                                    final com.twilio.type.PhoneNumber phoneNumber, 
                                    final String isoCountry, 
                                    final Boolean smsCapability, 
                                    final String email) {
        this.addressSid = addressSid;
        this.phoneNumber = phoneNumber;
        this.isoCountry = isoCountry;
        this.smsCapability = smsCapability;
        this.email = email;
    }

    /**
     * Optional. The unique SID identifier of the Account or Sub-Account to create
     * this HostedNumberOrder on..
     * 
     * @param accountSid Account Sid.
     * @return this
     */
    public HostedNumberOrderCreator setAccountSid(final String accountSid) {
        this.accountSid = accountSid;
        return this;
    }

    /**
     * Optional. A human readable description of this resource, up to 64
     * characters..
     * 
     * @param friendlyName A human readable description of this resource.
     * @return this
     */
    public HostedNumberOrderCreator setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Optional. Provides a unique and addressable name to be assigned to this
     * HostedNumberOrder, assigned by the developer, to be optionally used in
     * addition to SID..
     * 
     * @param uniqueName A unique, developer assigned name of this
     *                   HostedNumberOrder.
     * @return this
     */
    public HostedNumberOrderCreator setUniqueName(final String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * Optional. A list of emails that LOA document for this HostedNumberOrder will
     * be carbon copied to..
     * 
     * @param ccEmails A list of emails.
     * @return this
     */
    public HostedNumberOrderCreator setCcEmails(final List<String> ccEmails) {
        this.ccEmails = ccEmails;
        return this;
    }

    /**
     * Optional. A list of emails that LOA document for this HostedNumberOrder will
     * be carbon copied to..
     * 
     * @param ccEmails A list of emails.
     * @return this
     */
    public HostedNumberOrderCreator setCcEmails(final String ccEmails) {
        return setCcEmails(Promoter.listOfOne(ccEmails));
    }

    /**
     * Optional. The SMS URL attached to the IncomingPhoneNumber resource..
     * 
     * @param smsUrl SMS URL.
     * @return this
     */
    public HostedNumberOrderCreator setSmsUrl(final URI smsUrl) {
        this.smsUrl = smsUrl;
        return this;
    }

    /**
     * Optional. The SMS URL attached to the IncomingPhoneNumber resource..
     * 
     * @param smsUrl SMS URL.
     * @return this
     */
    public HostedNumberOrderCreator setSmsUrl(final String smsUrl) {
        return setSmsUrl(Promoter.uriFromString(smsUrl));
    }

    /**
     * Optional. The SMS Method attached to the IncomingPhoneNumber resource..
     * 
     * @param smsMethod SMS Method.
     * @return this
     */
    public HostedNumberOrderCreator setSmsMethod(final HttpMethod smsMethod) {
        this.smsMethod = smsMethod;
        return this;
    }

    /**
     * Optional. The SMS Fallback URL attached to the IncomingPhoneNumber resource..
     * 
     * @param smsFallbackUrl SMS Fallback URL.
     * @return this
     */
    public HostedNumberOrderCreator setSmsFallbackUrl(final URI smsFallbackUrl) {
        this.smsFallbackUrl = smsFallbackUrl;
        return this;
    }

    /**
     * Optional. The SMS Fallback URL attached to the IncomingPhoneNumber resource..
     * 
     * @param smsFallbackUrl SMS Fallback URL.
     * @return this
     */
    public HostedNumberOrderCreator setSmsFallbackUrl(final String smsFallbackUrl) {
        return setSmsFallbackUrl(Promoter.uriFromString(smsFallbackUrl));
    }

    /**
     * Optional. The SMS Fallback Method attached to the IncomingPhoneNumber
     * resource..
     * 
     * @param smsFallbackMethod SMS Fallback Method.
     * @return this
     */
    public HostedNumberOrderCreator setSmsFallbackMethod(final HttpMethod smsFallbackMethod) {
        this.smsFallbackMethod = smsFallbackMethod;
        return this;
    }

    /**
     * Optional. The Status Callback URL attached to the IncomingPhoneNumber
     * resource..
     * 
     * @param statusCallbackUrl Status Callback URL.
     * @return this
     */
    public HostedNumberOrderCreator setStatusCallbackUrl(final URI statusCallbackUrl) {
        this.statusCallbackUrl = statusCallbackUrl;
        return this;
    }

    /**
     * Optional. The Status Callback URL attached to the IncomingPhoneNumber
     * resource..
     * 
     * @param statusCallbackUrl Status Callback URL.
     * @return this
     */
    public HostedNumberOrderCreator setStatusCallbackUrl(final String statusCallbackUrl) {
        return setStatusCallbackUrl(Promoter.uriFromString(statusCallbackUrl));
    }

    /**
     * Optional. The Status Callback Method attached to the IncomingPhoneNumber
     * resource..
     * 
     * @param statusCallbackMethod Status Callback Method.
     * @return this
     */
    public HostedNumberOrderCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod) {
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Created HostedNumberOrder
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public HostedNumberOrder create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            "/HostedNumbers/HostedNumberOrders",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("HostedNumberOrder creation failed: Unable to connect to server");
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

        return HostedNumberOrder.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (addressSid != null) {
            request.addPostParam("AddressSid", addressSid);
        }

        if (phoneNumber != null) {
            request.addPostParam("PhoneNumber", phoneNumber.toString());
        }

        if (isoCountry != null) {
            request.addPostParam("IsoCountry", isoCountry);
        }

        if (smsCapability != null) {
            request.addPostParam("SmsCapability", smsCapability.toString());
        }

        if (email != null) {
            request.addPostParam("Email", email);
        }

        if (accountSid != null) {
            request.addPostParam("AccountSid", accountSid);
        }

        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
        }

        if (ccEmails != null) {
            for (String prop : ccEmails) {
                request.addPostParam("CcEmails", prop);
            }
        }

        if (smsUrl != null) {
            request.addPostParam("SmsUrl", smsUrl.toString());
        }

        if (smsMethod != null) {
            request.addPostParam("SmsMethod", smsMethod.toString());
        }

        if (smsFallbackUrl != null) {
            request.addPostParam("SmsFallbackUrl", smsFallbackUrl.toString());
        }

        if (smsFallbackMethod != null) {
            request.addPostParam("SmsFallbackMethod", smsFallbackMethod.toString());
        }

        if (statusCallbackUrl != null) {
            request.addPostParam("StatusCallbackUrl", statusCallbackUrl.toString());
        }

        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
        }
    }
}