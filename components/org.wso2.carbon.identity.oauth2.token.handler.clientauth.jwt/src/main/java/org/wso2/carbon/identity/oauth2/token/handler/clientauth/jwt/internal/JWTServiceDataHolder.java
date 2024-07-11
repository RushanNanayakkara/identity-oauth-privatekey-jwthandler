/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
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
 * under the License
 */

package org.wso2.carbon.identity.oauth2.token.handler.clientauth.jwt.internal;

import org.wso2.carbon.identity.configuration.mgt.core.ConfigurationManager;
import org.wso2.carbon.identity.oauth2.token.handler.clientauth.jwt.core.dao.JWTAuthenticationConfigurationDAO;
import org.wso2.carbon.identity.oauth2.token.handler.clientauth.jwt.core.dao.impl.CacheBackedJWTConfigurationDAOImpl;
import org.wso2.carbon.identity.oauth2.token.handler.clientauth.jwt.core.dao.impl.JWTAuthenticationConfigurationDAOImpl;
import org.wso2.carbon.user.core.service.RealmService;

/**
 * JWTServiceDataHolder data holder Class.
 */
public class JWTServiceDataHolder {

    private RealmService realmService = null;
    public static JWTServiceDataHolder instance = new JWTServiceDataHolder();

    public boolean preventTokenReuse = true;
    private ConfigurationManager configurationManager;

    private JWTAuthenticationConfigurationDAO jwtAuthenticationConfigurationDAO =
            new CacheBackedJWTConfigurationDAOImpl(new JWTAuthenticationConfigurationDAOImpl());

    public ConfigurationManager getConfigurationManager() {

        return configurationManager;
    }

    public void setConfigurationManager(ConfigurationManager configurationManager) {

        this.configurationManager = configurationManager;
    }

    public boolean isPreventTokenReuse() {

        return preventTokenReuse;
    }

    public void setPreventTokenReuse(boolean preventTokenReuse) {

        this.preventTokenReuse = preventTokenReuse;
    }

    public static JWTServiceDataHolder getInstance() {

        return instance;
    }

    public RealmService getRealmService() {

        return realmService;
    }

    public void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

    public JWTAuthenticationConfigurationDAO getPrivateKeyJWTAuthenticationConfigurationDAO() {

        return jwtAuthenticationConfigurationDAO;
    }

    public void setJwtAuthenticationConfigurationDAO
            (JWTAuthenticationConfigurationDAO jwtAuthenticationConfigurationDAO) {

        this.jwtAuthenticationConfigurationDAO = jwtAuthenticationConfigurationDAO;
    }

}
