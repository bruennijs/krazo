/*
 * Copyright (c) 2014-2015 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2018, 2019 Eclipse Krazo committers and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.eclipse.krazo.test.ext.jade;

import de.neuland.jade4j.filter.Filter;
import de.neuland.jade4j.parser.node.Attr;
import java.util.List;

import java.util.Map;

/**
 * Used to test if configuration works.
 *
 * @author Florian Hirsch
 */
public class DummyFilter implements Filter {

    @Override
    public String convert(String source, List<Attr> attributes, Map<String, Object> model) {
        String content = source.trim();
        return String.format("<p class='%s'>%s</p>", content, content);
    }
}
