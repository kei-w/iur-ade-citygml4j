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

import org.citygml4j.ade.iur.model.uro.AbstractConstruction;
import org.citygml4j.ade.iur.model.uro.Appurtenance;
import org.citygml4j.ade.iur.model.uro.Cable;
import org.citygml4j.ade.iur.model.uro.ClosureSurface;
import org.citygml4j.ade.iur.model.uro.ConstructionInstallation;
import org.citygml4j.ade.iur.model.uro.Duct;
import org.citygml4j.ade.iur.model.uro.ElectricityCable;
import org.citygml4j.ade.iur.model.uro.GroundSurface;
import org.citygml4j.ade.iur.model.uro.Handhole;
import org.citygml4j.ade.iur.model.uro.Manhole;
import org.citygml4j.ade.iur.model.uro.OilGasChemicalsPipe;
import org.citygml4j.ade.iur.model.uro.OtherConstruction;
import org.citygml4j.ade.iur.model.uro.OuterCeilingSurface;
import org.citygml4j.ade.iur.model.uro.OuterFloorSurface;
import org.citygml4j.ade.iur.model.uro.Pipe;
import org.citygml4j.ade.iur.model.uro.PublicLand;
import org.citygml4j.ade.iur.model.uro.RoofSurface;
import org.citygml4j.ade.iur.model.uro.SewerPipe;
import org.citygml4j.ade.iur.model.uro.TelecommunicationsCable;
import org.citygml4j.ade.iur.model.uro.ThermalPipe;
import org.citygml4j.ade.iur.model.uro.UndergroundBuilding;
import org.citygml4j.ade.iur.model.uro.WallSurface;
import org.citygml4j.ade.iur.model.uro.WaterPipe;
import org.citygml4j.ade.iur.model.uro.Waterway;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;

public class UrbanObjectModule extends ADEModule {
    public static final UrbanObjectModule v3_0 = new UrbanObjectModule();

    private final Map<String, Class<? extends AbstractFeature>> features;

    private UrbanObjectModule() {
        super("https://www.geospatial.jp/iur/uro/3.0",
                "uro",
                "https://www.geospatial.jp/iur/schemas/uro/3.0/urbanObject.xsd",
                CityGMLVersion.v2_0_0);

        features = new HashMap<>();
        features.put("Waterway", Waterway.class);
        features.put("AbstractConstruction", AbstractConstruction.class);
        features.put("OtherConstruction", OtherConstruction.class);
        features.put("RoofSurface", RoofSurface.class);
        features.put("WallSurface", WallSurface.class);
        features.put("GroundSurface", GroundSurface.class);
        features.put("OuterCeilingSurface", OuterCeilingSurface.class);
        features.put("OuterFloorSurface", OuterFloorSurface.class);
        features.put("ClosureSurface", ClosureSurface.class);
        features.put("ConstructionInstallation", ConstructionInstallation.class);
        features.put("UndergroundBuilding", UndergroundBuilding.class);
        features.put("Appurtenance", Appurtenance.class);
        features.put("Manhole", Manhole.class);
        features.put("Handhole", Handhole.class);
        features.put("Pipe", Pipe.class);
        features.put("SewerPipe", SewerPipe.class);
        features.put("ThermalPipe", ThermalPipe.class);
        features.put("WaterPipe", WaterPipe.class);
        features.put("OilGasChemicalsPipe", OilGasChemicalsPipe.class);
        features.put("Duct", Duct.class);
        features.put("Cable", Cable.class);
        features.put("ElectricityCable", ElectricityCable.class);
        features.put("TelecommunicationsCable", TelecommunicationsCable.class);
        features.put("PublicLand", PublicLand.class);
    }

    @Override
    public URL getSchemaResource() {
        return UrbanObjectModule.class.getResource("/org/citygml4j/ade/iur/schema/urbanObject.xsd");
    }

    @Override
    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("jp.geospatial.iur._3_0.uro");
    }

    public String getModelPackageName() {
        return "org.citygml4j.ade.iur.model.uro";
    }

    @Override
    public boolean hasFeatureProperty(String name) {
        return "boundedBy".equals(name) || "constructionInstallation".equals(name);
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
        return "AbstractConstruction".equals(name) || "Appurtenance".equals(name) || "Cable".equals(name) || "Duct".equals(name) || "ElectricityCable".equals(name) || "Handhole".equals(name) || "Manhole".equals(name) || "OilGasChemicalsPipe".equals(name) || "OtherConstruction".equals(name) || "Pipe".equals(name) || "PublicLand".equals(name) || "SewerPipe".equals(name) || "TelecommunicationsCable".equals(name) || "ThermalPipe".equals(name) || "UndergroundBuilding".equals(name) || "WaterPipe".equals(name) || "Waterway".equals(name);
    }
}
