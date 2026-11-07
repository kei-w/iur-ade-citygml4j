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

public enum IfcUnitEnum {
    ABSORBEDDOSEUNIT("ABSORBEDDOSEUNIT"),
    AMOUNTOFSUBSTANCEUNIT("AMOUNTOFSUBSTANCEUNIT"),
    AREAUNIT("AREAUNIT"),
    DOSEEQUIVALENTUNIT("DOSEEQUIVALENTUNIT"),
    ELECTRICCAPACITANCEUNIT("ELECTRICCAPACITANCEUNIT"),
    ELECTRICCHARGEUNIT("ELECTRICCHARGEUNIT"),
    ELECTRICCONDUCTANCEUNIT("ELECTRICCONDUCTANCEUNIT"),
    ELECTRICCURRENTUNIT("ELECTRICCURRENTUNIT"),
    ELECTRICRESISTANCEUNIT("ELECTRICRESISTANCEUNIT"),
    ELECTRICVOLTAGEUNIT("ELECTRICVOLTAGEUNIT"),
    ENERGYUNIT("ENERGYUNIT"),
    FORCEUNIT("FORCEUNIT"),
    FREQUENCYUNIT("FREQUENCYUNIT"),
    ILLUMINANCEUNIT("ILLUMINANCEUNIT"),
    INDUCTANCEUNIT("INDUCTANCEUNIT"),
    LENGTHUNIT("LENGTHUNIT"),
    LUMINOUSFLUXUNIT("LUMINOUSFLUXUNIT"),
    LUMINOUSINTENSITYUNIT("LUMINOUSINTENSITYUNIT"),
    MAGNETICFLUXDENSITYUNIT("MAGNETICFLUXDENSITYUNIT"),
    MAGNETICFLUXUNIT("MAGNETICFLUXUNIT"),
    MASSUNIT("MASSUNIT"),
    PLANEANGLEUNIT("PLANEANGLEUNIT"),
    POWERUNIT("POWERUNIT"),
    PRESSUREUNIT("PRESSUREUNIT"),
    RADIOACTIVITYUNIT("RADIOACTIVITYUNIT"),
    SOLIDANGLEUNIT("SOLIDANGLEUNIT"),
    THERMODYNAMICTEMPERATUREUNIT("THERMODYNAMICTEMPERATUREUNIT"),
    TIMEUNIT("TIMEUNIT"),
    VOLUMEUNIT("VOLUMEUNIT"),
    USERDEFINED("USERDEFINED");

    private final String value;

    IfcUnitEnum(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static IfcUnitEnum fromValue(String value) {
        for (IfcUnitEnum v : IfcUnitEnum.values()) {
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
