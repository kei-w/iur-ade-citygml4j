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

package org.citygml4j.ade.iur.model.module;

import org.citygml4j.ade.iur.model.urt.Agency;
import org.citygml4j.ade.iur.model.urt.Attribution;
import org.citygml4j.ade.iur.model.urt.Calendar;
import org.citygml4j.ade.iur.model.urt.CalendarDate;
import org.citygml4j.ade.iur.model.urt.FareAttribute;
import org.citygml4j.ade.iur.model.urt.Level;
import org.citygml4j.ade.iur.model.urt.Office;
import org.citygml4j.ade.iur.model.urt.Pathway;
import org.citygml4j.ade.iur.model.urt.Route;
import org.citygml4j.ade.iur.model.urt.Shape;
import org.citygml4j.ade.iur.model.urt.Stop;
import org.citygml4j.ade.iur.model.urt.TranslationJP;
import org.citygml4j.ade.iur.model.urt.Trip;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;

public class PublicTransitModule extends ADEModule {
    public static final PublicTransitModule v3_1 = new PublicTransitModule();

    private final Map<String, Class<? extends AbstractFeature>> features;

    private PublicTransitModule() {
        super("https://www.geospatial.jp/iur/urt/3.1",
                "urt",
                "https://www.geospatial.jp/iur/schemas/urt/3.1/publicTransit.xsd",
                CityGMLVersion.v2_0_0);

        features = new HashMap<>();
        features.put("Route", Route.class);
        features.put("Agency", Agency.class);
        features.put("Stop", Stop.class);
        features.put("Level", Level.class);
        features.put("Trip", Trip.class);
        features.put("Shape", Shape.class);
        features.put("Office", Office.class);
        features.put("Calendar", Calendar.class);
        features.put("CalendarDate", CalendarDate.class);
        features.put("FareAttribute", FareAttribute.class);
        features.put("Pathway", Pathway.class);
        features.put("TranslationJP", TranslationJP.class);
        features.put("Attribution", Attribution.class);
    }

    @Override
    public URL getSchemaResource() {
        return PublicTransitModule.class.getResource("/org/citygml4j/ade/iur/schema/publicTransit.xsd");
    }

    @Override
    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("jp.geospatial.iur._3_1.urt");
    }

    public String getModelPackageName() {
        return "org.citygml4j.ade.iur.model.urt";
    }

    @Override
    public boolean hasFeatureProperty(String name) {
        return "agency".equals(name) || "calendar".equals(name) || "calendarDate".equals(name) || "from".equals(name) || "level".equals(name) || "office".equals(name) || "parentRoute".equals(name) || "parentStation".equals(name) || "route".equals(name) || "shape".equals(name) || "target".equals(name) || "to".equals(name) || "trip".equals(name);
    }

    @Override
    public boolean hasFeature(String name) {
        return features.containsKey(name);
    }

    @Override
    public Class<? extends AbstractFeature> getFeatureClass(String name) {
        return features.get(name);
    }

    @Override
    public QName getFeatureName(Class<? extends AbstractFeature> featureClass) {
        for (Map.Entry<String, Class<? extends AbstractFeature>> entry : features.entrySet()) {
            if (entry.getValue() == featureClass)
                return new QName(getNamespaceURI(), entry.getKey());
        }

        return null;
    }

    @Override
    public Map<String, Class<? extends AbstractFeature>> getFeatures() {
        return new HashMap<>(features);
    }

    @Override
    public boolean isTopLevelFeature(String name) {
        return "Agency".equals(name) || "Attribution".equals(name) || "Calendar".equals(name) || "CalendarDate".equals(name) || "FareAttribute".equals(name) || "Level".equals(name) || "Office".equals(name) || "Pathway".equals(name) || "Route".equals(name) || "Shape".equals(name) || "Stop".equals(name) || "TranslationJP".equals(name) || "Trip".equals(name);
    }
}
