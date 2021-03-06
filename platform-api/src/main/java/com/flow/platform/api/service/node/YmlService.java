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

package com.flow.platform.api.service.node;

import com.flow.platform.api.domain.node.Node;
import com.flow.platform.api.domain.node.Yml;
import com.flow.platform.api.domain.request.ThreadConfigParam;
import java.util.function.Consumer;
import org.springframework.core.io.Resource;

/**
 * @author yang
 */
public interface YmlService {

    /**
     * Build yml and get root node
     *
     * @param root root node
     * @param yml yml content
     * @return Node from yml
     */
    Node build(Node root, String yml);

    /**
     * Parse root to yml content
     */
    String parse(Node root);

    /**
     * Save or update yml for root node
     */
    void saveOrUpdate(Node root, String yml);

    /**
     * Find raw yml file content by node from
     */
    Yml get(Node root);

    /**
     * {@see get(Node root)}
     *
     * @param path root path
     */
    Yml get(String path);

    /**
     * yml content to resource
     * @param root
     * @return
     */
    Resource getResource(Node root);

    /**
     * Delete yml for root node
     */
    void delete(Node root);

    /**
     * Load yml content from git repo in async and create tree from yml,
     * Then call "get" to get yml
     *
     * @param root root node
     * @param onSuccess method on yml loaded
     * @param onError method on
     * @return flow node instance
     */
    Node startLoad(Node root, Consumer<Yml> onSuccess, Consumer<Throwable> onError);

    /**
     * Stop yml content loading thread
     *
     * @param root root node
     */
    void stopLoad(Node root);

    /**
     * Config load yml thread pool
     *
     * @param threadConfigParam
     */
    void threadConfig(ThreadConfigParam threadConfigParam);

}
