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

package org.citygml4j.ade.iur.bind.urg;

import jp.geospatial.iur._3_1.urg.*;
import org.citygml4j.ade.iur.bind.Marshaller;
import org.citygml4j.ade.iur.model.urg.*;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.util.mapper.TypeMapper;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;

public class StatisticalGridMarshaller implements ADEMarshaller {
    private final Marshaller marshaller;
    private final ObjectFactory factory = new ObjectFactory();
    private ADEMarshallerHelper helper;
    private TypeMapper<JAXBElement<?>> elementMapper;
    private TypeMapper<Object> typeMapper;

    public StatisticalGridMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    private synchronized TypeMapper<JAXBElement<?>> getElementMapper() {
        if (elementMapper == null) {
            elementMapper = TypeMapper.<JAXBElement<?>>create()
                    .with(Population.class, this::createPopulation)
                    .with(PopulationByAgeAndSex.class, this::createPopulationByAgeAndSex)
                    .with(PublicTransitAccessibility.class, this::createPublicTransitAccessibility)
                    .with(LandPrice.class, this::createLandPrice)
                    .with(LandPricePerLandUse.class, this::createLandPricePerLandUse)
                    .with(LandUseDiversion.class, this::createLandUseDiversion)
                    .with(NumberOfAnnualDiversions.class, this::createNumberOfAnnualDiversions)
                    .with(AreaOfAnnualDiversions.class, this::createAreaOfAnnualDiversions)
                    .with(Households.class, this::createHouseholds)
                    .with(NumberOfHouseholds.class, this::createNumberOfHouseholds)
                    .with(OfficesAndEmployees.class, this::createOfficesAndEmployees)
                    .with(GenericGridCell.class, this::createGenericGridCell)
                    .with(KeyValuePair.class, this::createKeyValuePair)
                    .with(StatusOfSightseeing.class, this::createStatusOfSightseeing)
                    .with(LandslideDisaster.class, this::createLandslideDisaster)
                    .with(FiscalYearOfPublicationProperty.class, this::createFiscalYearOfPublicationProperty)
                    .with(LanguageProperty.class, this::createLanguageProperty);
        }

        return elementMapper;
    }

    private synchronized TypeMapper<Object> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = TypeMapper.create()
                    .with(Population.class, this::marshalPopulation)
                    .with(PopulationByAgeAndSex.class, this::marshalPopulationByAgeAndSex)
                    .with(PopulationByAgeAndSexProperty.class, this::marshalPopulationByAgeAndSexProperty)
                    .with(PublicTransitAccessibility.class, this::marshalPublicTransitAccessibility)
                    .with(LandPrice.class, this::marshalLandPrice)
                    .with(LandPricePerLandUse.class, this::marshalLandPricePerLandUse)
                    .with(LandPricePerLandUseProperty.class, this::marshalLandPricePerLandUseProperty)
                    .with(LandUseDiversion.class, this::marshalLandUseDiversion)
                    .with(NumberOfAnnualDiversions.class, this::marshalNumberOfAnnualDiversions)
                    .with(NumberOfAnnualDiversionsProperty.class, this::marshalNumberOfAnnualDiversionsProperty)
                    .with(AreaOfAnnualDiversions.class, this::marshalAreaOfAnnualDiversions)
                    .with(AreaOfAnnualDiversionsProperty.class, this::marshalAreaOfAnnualDiversionsProperty)
                    .with(Households.class, this::marshalHouseholds)
                    .with(NumberOfHouseholds.class, this::marshalNumberOfHouseholds)
                    .with(NumberOfHouseholdsProperty.class, this::marshalNumberOfHouseholdsProperty)
                    .with(OfficesAndEmployees.class, this::marshalOfficesAndEmployees)
                    .with(GenericGridCell.class, this::marshalGenericGridCell)
                    .with(KeyValuePair.class, this::marshalKeyValuePair)
                    .with(KeyValuePairProperty.class, this::marshalKeyValuePairProperty)
                    .with(StatusOfSightseeing.class, this::marshalStatusOfSightseeing)
                    .with(LandslideDisaster.class, this::marshalLandslideDisaster);
        }

        return typeMapper;
    }

    @Override
    public void setADEMarshallerHelper(ADEMarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public JAXBElement<?> marshalJAXBElement(ADEModelObject src) {
        TypeMapper<JAXBElement<?>> elementMapper = getElementMapper();
        return elementMapper != null ? elementMapper.apply(src) : null;
    }

    @Override
    public Object marshal(ADEModelObject src) {
        TypeMapper<Object> typeMapper = getTypeMapper();
        return typeMapper != null ? typeMapper.apply(src) : null;
    }

    private void marshalStatisticalGrid(StatisticalGrid src, StatisticalGridType dest) {
        helper.getCore200Marshaller().marshalAbstractCityObject(src, dest);

        if (src.getClassifier() != null)
            dest.setClazz(helper.getGMLMarshaller().marshalCode(src.getClassifier()));

        if (src.getUrbanPlanType() != null)
            dest.setUrbanPlanType(helper.getGMLMarshaller().marshalCode(src.getUrbanPlanType()));

        if (src.getAreaClassificationType() != null)
            dest.setAreaClassificationType(helper.getGMLMarshaller().marshalCode(src.getAreaClassificationType()));

        if (src.getPrefecture() != null)
            dest.setPrefecture(helper.getGMLMarshaller().marshalCode(src.getPrefecture()));

        if (src.getCity() != null)
            dest.setCity(helper.getGMLMarshaller().marshalCode(src.getCity()));

        if (src.getSurveyYear() != null)
            dest.setSurveyYear(marshaller.toCalendar(src.getSurveyYear()));

        if (src.getReferenceDate() != null)
            dest.setReferenceDate(marshaller.toCalendar(src.getReferenceDate()));

        if (src.getLodMinus1MultiSurface() != null)
            dest.setLodMinus1MultiSurface(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getLodMinus1MultiSurface()));

        if (src.getLodMinus2MultiSurface() != null)
            dest.setLodMinus2MultiSurface(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getLodMinus2MultiSurface()));
    }

    private PopulationType marshalPopulation(Population src) {
        PopulationType dest = factory.createPopulationType();
        marshalStatisticalGrid(src, dest);

        if (src.getTotal() != null)
            dest.setTotal(BigInteger.valueOf(src.getTotal()));

        if (src.getDaytimePopulation() != null)
            dest.setDaytimePopulation(BigInteger.valueOf(src.getDaytimePopulation()));

        dest.setDaytimePopulationDensity(src.getDaytimePopulationDensity());

        if (src.getDaytimeOfficeCommuter() != null)
            dest.setDaytimeOfficeCommuter(BigInteger.valueOf(src.getDaytimeOfficeCommuter()));

        if (src.getDaytimeSchoolCommuter() != null)
            dest.setDaytimeSchoolCommuter(BigInteger.valueOf(src.getDaytimeSchoolCommuter()));

        if (src.getDaytimeUnder15() != null)
            dest.setDaytimeUnder15(BigInteger.valueOf(src.getDaytimeUnder15()));

        if (src.getDaytimeOver15() != null)
            dest.setDaytimeOver15(BigInteger.valueOf(src.getDaytimeOver15()));

        if (src.getAgriculturalWorker() != null)
            dest.setAgriculturalWorker(BigInteger.valueOf(src.getAgriculturalWorker()));

        if (src.getNonCommuter() != null)
            dest.setNonCommuter(BigInteger.valueOf(src.getNonCommuter()));

        if (src.getNaturalIncrease() != null)
            dest.setNaturalIncrease(BigInteger.valueOf(src.getNaturalIncrease()));

        if (src.getBirths() != null)
            dest.setBirths(BigInteger.valueOf(src.getBirths()));

        if (src.getDeaths() != null)
            dest.setDeaths(BigInteger.valueOf(src.getDeaths()));

        if (src.getSocialIncrease() != null)
            dest.setSocialIncrease(BigInteger.valueOf(src.getSocialIncrease()));

        if (src.getMoveFrom() != null)
            dest.setMoveFrom(BigInteger.valueOf(src.getMoveFrom()));

        if (src.getMoveTo() != null)
            dest.setMoveTo(BigInteger.valueOf(src.getMoveTo()));

        if (src.getIncreasement() != null)
            dest.setIncreasement(BigInteger.valueOf(src.getIncreasement()));

        if (src.getMalePopulation() != null)
            dest.setMalePopulation(BigInteger.valueOf(src.getMalePopulation()));

        if (src.getFemalePopulation() != null)
            dest.setFemalePopulation(BigInteger.valueOf(src.getFemalePopulation()));

        for (PopulationByAgeAndSexProperty populationByAgeAndSex : src.getPopulationByAgeAndSex())
            dest.getPopulationByAgeAndSex().add(marshalPopulationByAgeAndSexProperty(populationByAgeAndSex));

        return dest;
    }

    private PopulationByAgeAndSexType marshalPopulationByAgeAndSex(PopulationByAgeAndSex src) {
        PopulationByAgeAndSexType dest = factory.createPopulationByAgeAndSexType();

        if (src.getAgeAndSex() != null)
            dest.setAgeAndSex(helper.getGMLMarshaller().marshalCode(src.getAgeAndSex()));

        if (src.getNumber() != null)
            dest.setNumber(BigInteger.valueOf(src.getNumber()));

        return dest;
    }

    private PopulationByAgeAndSexPropertyType marshalPopulationByAgeAndSexProperty(PopulationByAgeAndSexProperty src) {
        PopulationByAgeAndSexPropertyType dest = factory.createPopulationByAgeAndSexPropertyType();

        if (src.isSetObject())
            dest.setPopulationByAgeAndSex(marshalPopulationByAgeAndSex(src.getObject()));

        return dest;
    }

    private PublicTransitAccessibilityType marshalPublicTransitAccessibility(PublicTransitAccessibility src) {
        PublicTransitAccessibilityType dest = factory.createPublicTransitAccessibilityType();
        marshalStatisticalGrid(src, dest);

        dest.setAvailability(src.getAvailability());

        return dest;
    }

    private LandPriceType marshalLandPrice(LandPrice src) {
        LandPriceType dest = factory.createLandPriceType();
        marshalStatisticalGrid(src, dest);

        for (LandPricePerLandUseProperty landPrice : src.getLandPrice())
            dest.getLandPrice().add(marshalLandPricePerLandUseProperty(landPrice));

        if (src.getCurrencyUnit() != null)
            dest.setCurrencyUnit(helper.getGMLMarshaller().marshalCode(src.getCurrencyUnit()));

        return dest;
    }

    private LandPricePerLandUseType marshalLandPricePerLandUse(LandPricePerLandUse src) {
        LandPricePerLandUseType dest = factory.createLandPricePerLandUseType();

        if (src.getLandUse() != null)
            dest.setLandUse(helper.getGMLMarshaller().marshalCode(src.getLandUse()));

        if (src.getLandPrice() != null)
            dest.setLandPrice(BigInteger.valueOf(src.getLandPrice()));

        return dest;
    }

    private LandPricePerLandUsePropertyType marshalLandPricePerLandUseProperty(LandPricePerLandUseProperty src) {
        LandPricePerLandUsePropertyType dest = factory.createLandPricePerLandUsePropertyType();

        if (src.isSetObject())
            dest.setLandPricePerLandUse(marshalLandPricePerLandUse(src.getObject()));

        return dest;
    }

    private LandUseDiversionType marshalLandUseDiversion(LandUseDiversion src) {
        LandUseDiversionType dest = factory.createLandUseDiversionType();
        marshalStatisticalGrid(src, dest);

        for (NumberOfAnnualDiversionsProperty numberOfAnnualDiversion : src.getNumberOfAnnualDiversion())
            dest.getNumberOfAnnualDiversion().add(marshalNumberOfAnnualDiversionsProperty(numberOfAnnualDiversion));

        for (AreaOfAnnualDiversionsProperty areaOfAnnualDiversion : src.getAreaOfAnnualDiversion())
            dest.getAreaOfAnnualDiversion().add(marshalAreaOfAnnualDiversionsProperty(areaOfAnnualDiversion));

        return dest;
    }

    private NumberOfAnnualDiversionsType marshalNumberOfAnnualDiversions(NumberOfAnnualDiversions src) {
        NumberOfAnnualDiversionsType dest = factory.createNumberOfAnnualDiversionsType();

        if (src.getYear() != null)
            dest.setYear(marshaller.toCalendar(src.getYear()));

        if (src.getCount() != null)
            dest.setCount(BigInteger.valueOf(src.getCount()));

        return dest;
    }

    private NumberOfAnnualDiversionsPropertyType marshalNumberOfAnnualDiversionsProperty(NumberOfAnnualDiversionsProperty src) {
        NumberOfAnnualDiversionsPropertyType dest = factory.createNumberOfAnnualDiversionsPropertyType();

        if (src.isSetObject())
            dest.setNumberOfAnnualDiversions(marshalNumberOfAnnualDiversions(src.getObject()));

        return dest;
    }

    private AreaOfAnnualDiversionsType marshalAreaOfAnnualDiversions(AreaOfAnnualDiversions src) {
        AreaOfAnnualDiversionsType dest = factory.createAreaOfAnnualDiversionsType();

        if (src.getYear() != null)
            dest.setYear(marshaller.toCalendar(src.getYear()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        return dest;
    }

    private AreaOfAnnualDiversionsPropertyType marshalAreaOfAnnualDiversionsProperty(AreaOfAnnualDiversionsProperty src) {
        AreaOfAnnualDiversionsPropertyType dest = factory.createAreaOfAnnualDiversionsPropertyType();

        if (src.isSetObject())
            dest.setAreaOfAnnualDiversions(marshalAreaOfAnnualDiversions(src.getObject()));

        return dest;
    }

    private HouseholdsType marshalHouseholds(Households src) {
        HouseholdsType dest = factory.createHouseholdsType();
        marshalStatisticalGrid(src, dest);

        if (src.getNumberOfOrdinaryHousehold() != null)
            dest.setNumberOfOrdinaryHousehold(BigInteger.valueOf(src.getNumberOfOrdinaryHousehold()));

        for (NumberOfHouseholdsProperty numberOfHouseholdsByOwnership : src.getNumberOfHouseholdsByOwnership())
            dest.getNumberOfHouseholdsByOwnership().add(marshalNumberOfHouseholdsProperty(numberOfHouseholdsByOwnership));

        for (NumberOfHouseholdsProperty numberOfHouseholdsByStructure : src.getNumberOfHouseholdsByStructure())
            dest.getNumberOfHouseholdsByStructure().add(marshalNumberOfHouseholdsProperty(numberOfHouseholdsByStructure));

        if (src.getNumberOfMainHousehold() != null)
            dest.setNumberOfMainHousehold(BigInteger.valueOf(src.getNumberOfMainHousehold()));

        return dest;
    }

    private NumberOfHouseholdsType marshalNumberOfHouseholds(NumberOfHouseholds src) {
        NumberOfHouseholdsType dest = factory.createNumberOfHouseholdsType();

        if (src.getClassifier() != null)
            dest.setClazz(helper.getGMLMarshaller().marshalCode(src.getClassifier()));

        if (src.getNumber() != null)
            dest.setNumber(BigInteger.valueOf(src.getNumber()));

        return dest;
    }

    private NumberOfHouseholdsPropertyType marshalNumberOfHouseholdsProperty(NumberOfHouseholdsProperty src) {
        NumberOfHouseholdsPropertyType dest = factory.createNumberOfHouseholdsPropertyType();

        if (src.isSetObject())
            dest.setNumberOfHouseholds(marshalNumberOfHouseholds(src.getObject()));

        return dest;
    }

    private OfficesAndEmployeesType marshalOfficesAndEmployees(OfficesAndEmployees src) {
        OfficesAndEmployeesType dest = factory.createOfficesAndEmployeesType();
        marshalStatisticalGrid(src, dest);

        if (src.getNumberOfOffices() != null)
            dest.setNumberOfOffices(BigInteger.valueOf(src.getNumberOfOffices()));

        if (src.getNumberOfEmployees() != null)
            dest.setNumberOfEmployees(BigInteger.valueOf(src.getNumberOfEmployees()));

        if (src.getSalesAmount() != null)
            dest.setSalesAmount(BigInteger.valueOf(src.getSalesAmount()));

        return dest;
    }

    private GenericGridCellType marshalGenericGridCell(GenericGridCell src) {
        GenericGridCellType dest = factory.createGenericGridCellType();
        marshalStatisticalGrid(src, dest);

        for (KeyValuePairProperty genericValue : src.getGenericValue())
            dest.getGenericValue().add(marshalKeyValuePairProperty(genericValue));

        return dest;
    }

    private KeyValuePairType marshalKeyValuePair(KeyValuePair src) {
        KeyValuePairType dest = factory.createKeyValuePairType();

        if (src.getKey() != null)
            dest.setKey(helper.getGMLMarshaller().marshalCode(src.getKey()));

        dest.setStringValue(src.getStringValue());

        if (src.getIntValue() != null)
            dest.setIntValue(BigInteger.valueOf(src.getIntValue()));

        dest.setDoubleValue(src.getDoubleValue());

        if (src.getCodeValue() != null)
            dest.setCodeValue(helper.getGMLMarshaller().marshalCode(src.getCodeValue()));

        if (src.getMeasuredValue() != null)
            dest.setMeasuredValue(helper.getGMLMarshaller().marshalMeasure(src.getMeasuredValue()));

        if (src.getDateValue() != null)
            dest.setDateValue(marshaller.toCalendar(src.getDateValue()));

        dest.setUriValue(src.getUriValue());

        return dest;
    }

    private KeyValuePairPropertyType marshalKeyValuePairProperty(KeyValuePairProperty src) {
        KeyValuePairPropertyType dest = factory.createKeyValuePairPropertyType();

        if (src.isSetObject())
            dest.setKeyValuePair(marshalKeyValuePair(src.getObject()));

        return dest;
    }

    private StatusOfSightseeingType marshalStatusOfSightseeing(StatusOfSightseeing src) {
        StatusOfSightseeingType dest = factory.createStatusOfSightseeingType();
        marshalStatisticalGrid(src, dest);

        if (src.getNumOfHotels() != null)
            dest.setNumOfHotels(BigInteger.valueOf(src.getNumOfHotels()));

        if (src.getNumOfRyokan() != null)
            dest.setNumOfRyokan(BigInteger.valueOf(src.getNumOfRyokan()));

        if (src.getNumOfPublicInn() != null)
            dest.setNumOfPublicInn(BigInteger.valueOf(src.getNumOfPublicInn()));

        if (src.getNumOfInn() != null)
            dest.setNumOfInn(BigInteger.valueOf(src.getNumOfInn()));

        if (src.getNumOfCotage() != null)
            dest.setNumOfCotage(BigInteger.valueOf(src.getNumOfCotage()));

        if (src.getNumOfTempleHotel() != null)
            dest.setNumOfTempleHotel(BigInteger.valueOf(src.getNumOfTempleHotel()));

        if (src.getNumOfRentaVilla() != null)
            dest.setNumOfRentaVilla(BigInteger.valueOf(src.getNumOfRentaVilla()));

        if (src.getNumOfYouthHostel() != null)
            dest.setNumOfYouthHostel(BigInteger.valueOf(src.getNumOfYouthHostel()));

        if (src.getNumOfCapsuleHotel() != null)
            dest.setNumOfCapsuleHotel(BigInteger.valueOf(src.getNumOfCapsuleHotel()));

        if (src.getNumOfTrainingCenter() != null)
            dest.setNumOfTrainingCenter(BigInteger.valueOf(src.getNumOfTrainingCenter()));

        if (src.getTotalAccomodations() != null)
            dest.setTotalAccomodations(BigInteger.valueOf(src.getTotalAccomodations()));

        if (src.getTotalCapacity() != null)
            dest.setTotalCapacity(BigInteger.valueOf(src.getTotalCapacity()));

        if (src.getTotalRooms() != null)
            dest.setTotalRooms(BigInteger.valueOf(src.getTotalRooms()));

        return dest;
    }

    private LandslideDisasterType marshalLandslideDisaster(LandslideDisaster src) {
        LandslideDisasterType dest = factory.createLandslideDisasterType();
        marshalStatisticalGrid(src, dest);

        if (src.getDateOfOccurence() != null)
            dest.setDateOfOccurence(marshaller.toCalendar(src.getDateOfOccurence()));

        if (src.getLandSlideType() != null)
            dest.setLandSlideType(jp.geospatial.iur._3_1.urg.LandSlideTypeValue.fromValue(src.getLandSlideType().value()));

        if (src.getMaximumRainfallPerDay() != null)
            dest.setMaximumRainfallPerDay(helper.getGMLMarshaller().marshalLength(src.getMaximumRainfallPerDay()));

        if (src.getMaximumRainfallPerHour() != null)
            dest.setMaximumRainfallPerHour(helper.getGMLMarshaller().marshalLength(src.getMaximumRainfallPerHour()));

        if (src.getSlope() != null)
            dest.setSlope(BigInteger.valueOf(src.getSlope()));

        if (src.getSedimentDischarge() != null)
            dest.setSedimentDischarge(BigInteger.valueOf(src.getSedimentDischarge()));

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        return dest;
    }

    private JAXBElement<?> createPopulation(Population src) {
        return factory.createPopulation(marshalPopulation(src));
    }

    private JAXBElement<?> createPopulationByAgeAndSex(PopulationByAgeAndSex src) {
        return factory.createPopulationByAgeAndSex(marshalPopulationByAgeAndSex(src));
    }

    private JAXBElement<?> createPublicTransitAccessibility(PublicTransitAccessibility src) {
        return factory.createPublicTransitAccessibility(marshalPublicTransitAccessibility(src));
    }

    private JAXBElement<?> createLandPrice(LandPrice src) {
        return factory.createLandPrice(marshalLandPrice(src));
    }

    private JAXBElement<?> createLandPricePerLandUse(LandPricePerLandUse src) {
        return factory.createLandPricePerLandUse(marshalLandPricePerLandUse(src));
    }

    private JAXBElement<?> createLandUseDiversion(LandUseDiversion src) {
        return factory.createLandUseDiversion(marshalLandUseDiversion(src));
    }

    private JAXBElement<?> createNumberOfAnnualDiversions(NumberOfAnnualDiversions src) {
        return factory.createNumberOfAnnualDiversions(marshalNumberOfAnnualDiversions(src));
    }

    private JAXBElement<?> createAreaOfAnnualDiversions(AreaOfAnnualDiversions src) {
        return factory.createAreaOfAnnualDiversions(marshalAreaOfAnnualDiversions(src));
    }

    private JAXBElement<?> createHouseholds(Households src) {
        return factory.createHouseholds(marshalHouseholds(src));
    }

    private JAXBElement<?> createNumberOfHouseholds(NumberOfHouseholds src) {
        return factory.createNumberOfHouseholds(marshalNumberOfHouseholds(src));
    }

    private JAXBElement<?> createOfficesAndEmployees(OfficesAndEmployees src) {
        return factory.createOfficesAndEmployees(marshalOfficesAndEmployees(src));
    }

    private JAXBElement<?> createGenericGridCell(GenericGridCell src) {
        return factory.createGenericGridCell(marshalGenericGridCell(src));
    }

    private JAXBElement<?> createKeyValuePair(KeyValuePair src) {
        return factory.createKeyValuePair(marshalKeyValuePair(src));
    }

    private JAXBElement<?> createStatusOfSightseeing(StatusOfSightseeing src) {
        return factory.createStatusOfSightseeing(marshalStatusOfSightseeing(src));
    }

    private JAXBElement<?> createLandslideDisaster(LandslideDisaster src) {
        return factory.createLandslideDisaster(marshalLandslideDisaster(src));
    }

    private JAXBElement<?> createFiscalYearOfPublicationProperty(FiscalYearOfPublicationProperty src) {
        return factory.createFiscalYearOfPublication(marshaller.toCalendar(src.getValue()));
    }

    private JAXBElement<?> createLanguageProperty(LanguageProperty src) {
        return factory.createLanguage(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }
}
