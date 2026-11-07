/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2024 Virtual City Systems
 * https://vc.systems/
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
 */

package org.citygml4j.ade.iur.model.uro;

public enum BuildingLODType {
    _2_0("2.0"),
    _2_1("2.1"),
    _2_2("2.2"),
    _3_0("3.0"),
    _3_1("3.1"),
    _3_2("3.2"),
    _3_3("3.3"),
    _4_0("4.0"),
    _4_1("4.1"),
    _4_2("4.2");

    private final String value;

    BuildingLODType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static BuildingLODType fromValue(String value) {
        for (BuildingLODType v : BuildingLODType.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    @Override
    public String toString() {
        return value;
    }
}
