/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.oauth2.token.handler.clientauth.jwt.core.constant;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ErrorMessageTest {

    @Test()
    public void testErrorMessageAttributes() {

        ErrorMessage errorMessage = ErrorMessage.ERROR_CODE_INVALID_TENANT_DOMAIN;
        assertEquals(errorMessage.getCode(), "60004");
        assertEquals(errorMessage.getMessage(), "Invalid input.");
        assertEquals(errorMessage.getDescription(), "%s is not a valid tenant domain.");
        assertEquals(errorMessage.toString(), "60004:Invalid input.");
    }
}
