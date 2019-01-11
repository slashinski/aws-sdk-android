/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for SetLoadBalancerListenerSSLCertificateRequest
 */
public class SetLoadBalancerListenerSSLCertificateRequestMarshaller
        implements
        Marshaller<Request<SetLoadBalancerListenerSSLCertificateRequest>, SetLoadBalancerListenerSSLCertificateRequest> {

    public Request<SetLoadBalancerListenerSSLCertificateRequest> marshall(
            SetLoadBalancerListenerSSLCertificateRequest setLoadBalancerListenerSSLCertificateRequest) {
        if (setLoadBalancerListenerSSLCertificateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetLoadBalancerListenerSSLCertificateRequest)");
        }

        Request<SetLoadBalancerListenerSSLCertificateRequest> request = new DefaultRequest<SetLoadBalancerListenerSSLCertificateRequest>(
                setLoadBalancerListenerSSLCertificateRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "SetLoadBalancerListenerSSLCertificate");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (setLoadBalancerListenerSSLCertificateRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = setLoadBalancerListenerSSLCertificateRequest
                    .getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (setLoadBalancerListenerSSLCertificateRequest.getLoadBalancerPort() != null) {
            prefix = "LoadBalancerPort";
            Integer loadBalancerPort = setLoadBalancerListenerSSLCertificateRequest
                    .getLoadBalancerPort();
            request.addParameter(prefix, StringUtils.fromInteger(loadBalancerPort));
        }
        if (setLoadBalancerListenerSSLCertificateRequest.getSSLCertificateId() != null) {
            prefix = "SSLCertificateId";
            String sSLCertificateId = setLoadBalancerListenerSSLCertificateRequest
                    .getSSLCertificateId();
            request.addParameter(prefix, StringUtils.fromString(sSLCertificateId));
        }

        return request;
    }
}
