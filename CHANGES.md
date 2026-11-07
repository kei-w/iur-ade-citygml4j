Change Log
==========

### 2.0.0 - 2026-11-07

##### Breaking changes
* Updated the Urban Object module (`uro`) to version 2.0 of the i-UR ADE
  (`https://www.geospatial.jp/iur/uro/2.0`). The building attributes are now modelled as the
  `BuildingAttribute` hierarchy (`BuildingIDAttribute`, `BuildingDetailAttribute`,
  `LargeCustomerFacilityAttribute`, `BuildingDisasterRiskAttribute` subtypes, `KeyValuePairAttribute`,
  `BuildingDataQualityAttribute`). The 1.4 `uro` model classes were removed.
* JAXB classes for `uro` are generated into `jp.geospatial.iur._2_0.uro`.

##### Changes (all uro attributes, 2026-11-07)
* Every `uro` generic application property of every CityGML feature type defined by the i-UR 2.0 XSD is now modelled and
  (un)marshalled: facility, DM, ifc and indoor attributes of buildings and the attributes of bridges, tunnels, land use,
  city furniture, relief, transportation, vegetation, water bodies, city object groups and building interiors.
* The `uro` model and binding classes are generated from the XSD by the `iur-ade-generator` repository.

##### Changes (ADE feature types, 2026-11-07)
* The i-UR 2.0 XSD defines no ADE feature types; regenerated with the generator that supports them (no code change).

##### Changes (Urban Function module, 2026-11-07)
* **Breaking:** the Urban Function module (`urf`) is updated to version 2.0 of the i-UR ADE
  (`https://www.geospatial.jp/iur/urf/2.0`): 119 feature types and 9 data types generated from the schema shipped
  with the PLATEAU datasets replace the hand-written 1.4 model, binding and walker classes; JAXB classes are
  generated into `jp.geospatial.iur._2_0.urf` (the `urt` classes refer to the `urf` feature classes and are regenerated with them).
* Every concrete `urf` feature is registered as a top-level feature (PLATEAU writes them all as city object members);
  references to other members (`urf:districtDevelopmentPlan`, `urf:promotionDistrict`, ...) and to city objects
  (`urf:target`) are feature properties that carry an xlink.
* `urf` feature types with an `id` or `location` element are bound under the properties `identifier` and
  `locationDescription`, and the `lod-N` geometries under `lodMinusN...` (`binding.xjb`); the model accessors are named
  alike. `uro` and `urf` classes of the same simple name (`Waterway`, `LandPrice`, `LandUseDiversion`) are referred to
  qualified where both are in scope.
* The top-level `Unmarshaller` dispatches JAXB objects by their JAXB package, so `urf` properties of `uro` types
  (`keyValuePairAttribute`, `dataQualityAttribute`, `urfDmAttribute`) are unmarshalled.

##### Changes (Statistical Grid and Public Transit modules, 2026-11-08)
* **Breaking:** the Statistical Grid module (`urg`) and the Public Transit module (`urt`) are updated to version 2.0
  of the i-UR ADE (`https://www.geospatial.jp/iur/urg/2.0`, `https://www.geospatial.jp/iur/urt/2.0`): 8 urg feature
  types and 6 urg data types, 14 urt feature types and 9 urt data types generated from the schemas published on
  geospatial.jp replace the hand-written 1.4 model, binding and walker classes; the JAXB classes are generated into
  `jp.geospatial.iur._2_0.urg` and `jp.geospatial.iur._2_0.urt` (the `jp.go.kantei.iur._1_4` packages are gone).
* Every concrete `urg` and `urt` feature is registered as a top-level feature (the grids are city object members, the
  public transit features are group members referring to each other by xlink); `urt:target` and the references
  between public transit features are feature properties that carry an xlink.
* `xs:time` elements (`urt:StopTime/arrivalTime`, ...) are modelled as `LocalTime`; the hyphenated `urg` geometries
  (`lod-1MultiSurface`, ...) are bound under `lodMinusN...` like the `urf` ones.
* The walkers now visit the feature references and geometries of derived feature types (`urt:Stop/parentStation`,
  `urt:Stop/point`, ...) and, in the GML walkers, those of the public transit data types held by
  `urt:dataType`; the generated `urf` walker methods of derived types gain the same visits.

##### Known limitations
* `uro:ControlPoint/uro:parameter` is not supported: the 2.0 XSD declares it with the type of `uro:ControlPoint` itself.
* `urg:StatisticalGrid/urg:value` (`xs:anyType`) is not supported.

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