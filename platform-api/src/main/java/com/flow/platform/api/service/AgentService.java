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

package com.flow.platform.api.service;

import com.flow.platform.api.domain.agent.AgentItem;
import com.flow.platform.domain.Agent;
import com.flow.platform.domain.AgentPath;
import com.flow.platform.domain.AgentSettings;
import java.util.List;

/**
 * @author yh@firim
 */
public interface AgentService {

    /**
     * Load agent list from control center
     */
    List<Agent> list();

    /**
     * List agent item which includes flow and sync data
     */
    List<AgentItem> listItems();

    /**
     * Handle agent status callback from cc
     */
    void onAgentStatusChange(Agent agent);
}
