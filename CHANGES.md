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
* The `uro` model and binding classes are generated from the XSD (`poc/gen` in the PoC workspace).

##### Known limitations
* `uro:ControlPoint/uro:parameter` is not supported: the 2.0 XSD declares it with the type of `uro:ControlPoint` itself.
* ADE feature types (`uro:UndergroundBuilding`, `uro:OtherConstruction`, `uro:Waterway`, utility networks, ...) are not
  supported; `urf`, `urg` and `urt` remain at 1.4.

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