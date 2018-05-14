/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.api.domain;

import com.google.gson.annotations.Expose;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author yh@firim
 */
@EqualsAndHashCode(of = {"smtpUrl"}, callSuper = false)
@ToString
public class EmailSettingContent extends SettingContent {

    @Expose
    @Getter
    private String smtpUrl;

    @Expose
    @Getter
    @Setter
    private Integer smtpPort;

    @Expose
    @Getter
    @Setter
    private String sender;

    @Expose
    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;

    @Expose
    @Getter
    @Setter
    private boolean isAuthenticated = true;

    public EmailSettingContent(String smtpUrl, Integer smtpPort, String sender) {
        super.setType(MessageType.EMAIl);
        this.smtpUrl = smtpUrl;
        this.smtpPort = smtpPort;
        this.sender = sender;
    }
}
