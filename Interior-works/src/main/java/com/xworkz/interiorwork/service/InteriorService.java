package com.xworkz.interiorwork.service;

import com.xworkz.interiorwork.entity.InteriorEntity;

import java.util.List;
import java.util.Map;

public interface InteriorService {
    InteriorEntity validation(InteriorEntity en);
    public void savedInterior(InteriorEntity entity);
    public InteriorEntity readInterior(InteriorEntity entity);
    public InteriorEntity updateInterior(InteriorEntity entity);
    public InteriorEntity deleteInterior(InteriorEntity entity);
    List<InteriorEntity> fetchAllInterior(InteriorEntity entity);
    public InteriorEntity getInteriorEntityByName(String shop);
    public InteriorEntity getInteriorEntityBytype(String type);
    public InteriorEntity getInteriorEntityByvariety(String variety);
    public InteriorEntity getInteriorEntityBywood(boolean wood );



    //4 methods
    List<InteriorEntity> getBySpecifictype(String entity);
    List<InteriorEntity> getBYSpecificvariety(String entity);
    public InteriorEntity getInteriorEntityByPrice(Integer price);
    public InteriorEntity getInteriorEntityBydoordelivery(String doordelivery);
    public InteriorEntity findByNameByTypedQuery(String n);
    public InteriorEntity updateById(String updatedtype,String updatedShop,Integer Id);
    InteriorEntity updateByPrice(String updatedVariety,Integer Price);
    InteriorEntity updateByShop(Boolean updateWood,String updateShop,Integer Id);
    List<String> getAllVarietynames();
    List<Integer>getAllPrice();
    List<Object>getAllWood();
    List<Object[]> FetchTwoColumns();


    //6/08/2025

    List<Object[]> FetchThreeColumns();








}
