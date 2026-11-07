Change Log
==========

### 3.2.0 - 2026-11-07

##### Breaking changes
* Updated the Urban Object module (`uro`) to version 3.2 of the i-UR ADE
  (`https://www.geospatial.jp/iur/uro/3.2`). The building attributes are the same as in 3.1;
  `RealEstateIDAttribute` is no longer a `BuildingAttribute` subtype.
* JAXB classes for `uro` are generated into `jp.geospatial.iur._3_2.uro`.

##### Changes (all uro attributes, 2026-11-07)
* Every `uro` generic application property of every CityGML feature type defined by the i-UR 3.2 XSD is now modelled and
  (un)marshalled: facility, DM, ifc and indoor attributes of buildings and the attributes of bridges, tunnels, land use,
  city furniture, relief, transportation, vegetation, water bodies, city object groups and building interiors.
* The `uro` model and binding classes are generated from the XSD (`poc/gen` in the PoC workspace).

##### Changes (ADE feature types, 2026-11-07)
* The ADE feature types of the i-UR 3.2 Urban Object module are modelled, (un)marshalled and walked:
  `OtherConstruction` with its boundary surfaces and `ConstructionInstallation`, `UndergroundBuilding`, `Waterway`,
  `PublicLand` and the utility network elements (`Pipe`, `SewerPipe`, `ThermalPipe`, `WaterPipe`, `OilGasChemicalsPipe`,
  `Duct`, `Cable`, `ElectricityCable`, `TelecommunicationsCable`, `Appurtenance`, `Manhole`, `Handhole`) and `PointCloud`.
  `UrbanObjectModule` registers them as features.
* The JAXB properties `AbstractConstructionType/boundedBy` and `PublicLandType/id` are renamed to `boundedBySurface` and
  `identifier` in `binding.xjb` (ade-xjc otherwise binds the whole content model as a generic list); the model accessors
  are named alike.

##### Known limitations
* The feature-typed hook `uro:pointCloud` (`core:_GenericApplicationPropertyOfCityObject`) is not supported;
  `uro:PointCloud` itself is modelled.
* `gml:pos` values (`uro:Elevation/elevationValue`, `uro:OffsetDepth/pos`) keep their coordinates only; `srsName` and
  `srsDimension` are not stored.
* `urf`, `urg` and `urt` remain at 1.4.

### 3.1.0 - 2026-11-07

##### Breaking changes
* Updated the Urban Object module (`uro`) to version 3.1 of the i-UR ADE
  (`https://www.geospatial.jp/iur/uro/3.1`, schema 3.1.2). The 2.0 `uro` model classes were replaced by the
  3.1 building attributes: `BuildingIDAttribute`, `BuildingDetailAttribute`, `LargeCustomerFacilityAttribute`,
  `RealEstateIDAttribute`, `BuildingUsecaseAttribute`, the shared `DisasterRiskAttribute` hierarchy,
  `KeyValuePairAttribute`, and `DataQualityAttribute` with `PublicSurveyDataQualityAttribute`.
* JAXB classes for `uro` are generated into `jp.geospatial.iur._3_1.uro`.

##### Changes
* Sources are compiled as UTF-8.

##### Known limitations
* The 3.1 building properties `bldgFacilityIdAttribute`, `bldgFacilityTypeAttribute`, `bldgFacilityAttribute`,
  `bldgDmAttribute`, `ifcBuildingAttribute` and `indoorBuildingAttribute` are not modelled yet, nor are the
  `uro` attributes of other feature types.
* The `urf`, `urg` and `urt` modules remain at i-UR 1.4.

### 2.0.0 - 2026-11-07

##### Breaking changes
* Updated the Urban Object module (`uro`) to version 2.0 of the i-UR ADE
  (`https://www.geospatial.jp/iur/uro/2.0`). The building attributes are now modelled as the
  `BuildingAttribute` hierarchy (`BuildingIDAttribute`, `BuildingDetailAttribute`,
  `LargeCustomerFacilityAttribute`, `BuildingDisasterRiskAttribute` subtypes, `KeyValuePairAttribute`,
  `BuildingDataQualityAttribute`). The 1.4 `uro` model classes were removed.
* JAXB classes for `uro` are generated into `jp.geospatial.iur._2_0.uro`.

##### Known limitations
* The `uro` 2.0 attributes of LandUse, Road, TrafficArea, CityFurniture, Vegetation and WaterBody are not
  modelled yet.
* The Urban Function (`urf`), Statistical Grid (`urg`) and Public Transit (`urt`) modules remain at i-UR 1.4.

### 1.5.0 - 2024-08-27

##### Changes
* **Breaking:** Java 11 is now the minimum required version for using iur-ade-citygml4j.
* Updated citygml4j to 2.13.0.

### 1.4.2 - 2021-09-25

##### Changes
* Updated citygml4j to 2.11.4.

### 1.4.1 - 2021-04-13

##### Changes
* Dropped usage of Bintray and JCenter.
* Updated citygml4j to 2.11.3.

### 1.4.0 - 2021-02-11

##### Breaking changes
* Updated to version 1.4 of the i-UR ADE.
* The previous version 1.3 is not supported anymore.

### 1.0.0 - 2020-08-07

This is the first release of the **i-Urban Revitalization (i-UR)** ADE module for citygml4j. This module adds support
for parsing and writing i-UR ADE enriched CityGML datasets to citygml4j. The "i-UR" is an information infrastructure
for urban revitalization and planning.

* This release supports **version 1.3 of the i-UR ADE**.
* Built against **version 2.11 of citygml4j**.