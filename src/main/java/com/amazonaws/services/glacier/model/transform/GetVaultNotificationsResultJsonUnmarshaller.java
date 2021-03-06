/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.glacier.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;


/**
 * Get Vault Notifications Result JSON Unmarshaller
 */
public class GetVaultNotificationsResultJsonUnmarshaller implements Unmarshaller<GetVaultNotificationsResult, JsonUnmarshallerContext> {

    

    public GetVaultNotificationsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetVaultNotificationsResult getVaultNotificationsResult = new GetVaultNotificationsResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            getVaultNotificationsResult.setVaultNotificationConfig(VaultNotificationConfigJsonUnmarshaller.getInstance().unmarshall(context));
            

            token = context.nextToken();
        }
        
        return getVaultNotificationsResult;
    }

    private static GetVaultNotificationsResultJsonUnmarshaller instance;
    public static GetVaultNotificationsResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new GetVaultNotificationsResultJsonUnmarshaller();
        return instance;
    }
}
    