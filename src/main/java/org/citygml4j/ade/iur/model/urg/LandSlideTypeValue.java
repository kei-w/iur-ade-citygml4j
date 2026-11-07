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

package org.citygml4j.ade.iur.model.urg;

public enum LandSlideTypeValue {
    土石流("土石流"),
    土石流_土砂流_("土石流（土砂流）"),
    土石流_山腹崩壊_土砂流_("土石流（山腹崩壊・土砂流）"),
    土石流_山腹崩壊_("土石流（山腹崩壊）"),
    土石流_山林火災_("土石流（山林火災）"),
    土石流_流木堆積_えん堤基礎部損傷_("土石流（流木堆積、えん堤基礎部損傷）"),
    土石流_噴火_("土石流（噴火）"),
    土石流_施設災害_("土石流（施設災害）"),
    土石流_その他_民地盛土河川流出_("土石流（その他（民地盛土河川流出）"),
    土石流_その他_洪水__("土石流（その他（洪水））"),
    土石流_その他_河道内堆積物の泥流化_("土石流（その他（河道内堆積物の泥流化）"),
    土石流_その他_("土石流（その他）"),
    がけ崩れ("がけ崩れ"),
    地すべり_("地すべり）"),
    雪崩_表層_("雪崩（表層）"),
    雪崩_全層傷_("雪崩（全層傷）"),
    雪崩("雪崩"),
    山林火災_計上なし_("山林火災（計上なし）");

    private final String value;

    LandSlideTypeValue(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static LandSlideTypeValue fromValue(String value) {
        for (LandSlideTypeValue v : LandSlideTypeValue.values()) {
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
