/*
 * PayMarkEFTPOSLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.paymark.apitest;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import nz.paymark.apitest.exceptions.ApiException;
import nz.paymark.apitest.models.OAuthToken;

/**
 * Interface for Client Credentials OAuth 2.
 */
public interface ClientCredentialsAuth {
    /**
     * String value for oAuthClientId.
     * @return oAuthClientId
     */
    String getOAuthClientId();

    /**
     * String value for oAuthClientSecret.
     * @return oAuthClientSecret
     */
    String getOAuthClientSecret();

    /**
     * OAuthToken value for oAuthToken.
     * @return oAuthToken
     */
    OAuthToken getOAuthToken();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param oAuthClientId String value for credentials.
     * @param oAuthClientSecret String value for credentials.
     * @param oAuthToken OAuthToken value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String oAuthClientId, String oAuthClientSecret, OAuthToken oAuthToken);

    /**
     * Fetch the OAuth token asynchronously.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    CompletableFuture<OAuthToken> fetchTokenAsync(final Map<String, Object> additionalParameters);

    /**
     * Fetch the OAuth token asynchronously.
     */
    CompletableFuture<OAuthToken> fetchTokenAsync();

    /**
     * Fetch the OAuth token.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    OAuthToken fetchToken(Map<String, Object> additionalParameters) throws ApiException, IOException;

    /**
     * Fetch the OAuth token.
     */
    OAuthToken fetchToken() throws ApiException, IOException;

     /**
     * Has the OAuth token expired?.
     * @return True if expired
     */
    boolean isTokenExpired();

}
