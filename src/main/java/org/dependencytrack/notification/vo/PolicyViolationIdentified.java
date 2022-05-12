/*
 * This file is part of Dependency-Track.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) Steve Springett. All Rights Reserved.
 */
package org.dependencytrack.notification.vo;

import org.dependencytrack.model.Component;
import org.dependencytrack.model.PolicyViolation;
import org.dependencytrack.model.Project;

public class PolicyViolationIdentified {

    private final PolicyViolation policyViolation;
    private final Component component;
    private final Project project;

    public PolicyViolationIdentified(final PolicyViolation policyViolation, final Component component, final Project project) {
        this.policyViolation = policyViolation;
        this.component = component;
        this.project = project;
    }

    public PolicyViolation getPolicyViolation() {
        return policyViolation;
    }

    public Component getComponent() {
        return component;
    }

    public Project getProject() {
        return project;
    }
}
