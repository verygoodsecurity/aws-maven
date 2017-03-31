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

package io.vgs.tools.aws.maven.matchers;

import com.amazonaws.services.s3.model.ListObjectsRequest;
import org.apache.maven.wagon.events.SessionEvent;
import org.apache.maven.wagon.events.TransferEvent;

public final class Matchers {

    private Matchers() {
    }

    public static ListObjectsRequest eq(ListObjectsRequest listObjectsRequest) {
        return org.mockito.Matchers.argThat(new ListObjectsRequestMatcher(listObjectsRequest));
    }

    public static SessionEvent eq(SessionEvent sessionEvent) {
        return org.mockito.Matchers.argThat(new SessionEventMatcher(sessionEvent));
    }

    public static TransferEvent eq(TransferEvent transferEvent) {
        return org.mockito.Matchers.argThat(new TransferEventMatcher(transferEvent));
    }

}
