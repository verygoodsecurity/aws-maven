/*
 * Copyright 2010-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.vgs.tools.aws.maven;

import com.amazonaws.auth.AWSCredentials;
import org.apache.maven.wagon.authentication.AuthenticationInfo;

final class AuthenticationInfoAWSCredentials implements AWSCredentials {

    private final AuthenticationInfo authenticationInfo;

    AuthenticationInfoAWSCredentials(AuthenticationInfo authenticationInfo) {
        this.authenticationInfo = authenticationInfo;
    }

    @Override
    public String getAWSAccessKeyId() {
        return this.authenticationInfo.getUserName();
    }

    @Override
    public String getAWSSecretKey() {
        return this.authenticationInfo.getPassword();
    }
}
