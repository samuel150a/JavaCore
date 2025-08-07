package com.xworkz.interiorwork.runner;

import com.xworkz.interiorwork.entity.InteriorEntity;
import com.xworkz.interiorwork.service.InteriorService;
import com.xworkz.interiorwork.service.InteriorServiceImple;

import javax.persistence.*;
import java.util.List;

public class InteriorRunner {
    public static void main(String[] args) {
        InteriorEntity interiorEntity1 = new InteriorEntity();

        interiorEntity1.setShop("Design me");
        interiorEntity1.setWood(false);
        interiorEntity1.setPrice(500);
        interiorEntity1.setDoordelivery("no");
        interiorEntity1.setVariety("office");
        interiorEntity1.setType("wood");

        InteriorService interiorService = new InteriorServiceImple();

        // interiorService.savedInterior(interiorEntity1);

//        InteriorEntity ref = interiorService.readInterior(interiorEntity1);
//        System.out.println(("the list of some readed data from Database"));
//        System.out.println(ref);

        //interiorService.updateInterior(interiorEntity1);
        //interiorService.deleteInterior(interiorEntity1);


        //interiorService.getInteriorEntityBytype("chigo");
        //interiorService.getInteriorEntityByvariety("hotel");
        //interiorService.getInteriorEntityBywood(false);

//        List<InteriorEntity> disp = interiorService.fetchAllInterior(interiorEntity1);
//        for (InteriorEntity e : disp) {
//            System.out.println(e);
//        }

//        List<InteriorEntity> disp1 = interiorService.getBySpecifictype("wood");
//        for (InteriorEntity e1 : disp1) {
//            System.out.println(e1);
//        }
//            List<InteriorEntity> disp2 = interiorService.getBYSpecificvariety("hotel");
//            for (InteriorEntity e2 : disp2) {
//                System.out.println(e2);
//            }
//                interiorService.getInteriorEntityByPrice(250);
//                interiorService.getInteriorEntityBydoordelivery("yeah");
                //interiorService.findByNameByTypedQuery("Storesza");
//        InteriorEntity interiorEntity = interiorService.updateById("plywood", "decor", 19);
//        System.out.println("main method"+interiorEntity);

//        InteriorEntity ref=interiorService.updateByPrice("hotelza",12);
//        System.out.println(ref);

//
//        List<String> ref=interiorService.getAllVarietynames();
//        for(String e:ref)
//        {
//            System.out.println(e);
//        }

//        List<Integer> ref1=interiorService.getAllPrice();
//        for(Integer e1:ref1)
//        {
//            System.out.println(e1);
//        }

//        List<Object> ref2=interiorService.getAllWood();
//        for(Object e2:ref2)
//        {
//            System.out.println(e2);
//        }

//        List<Object[]> ref2=interiorService.FetchTwoColumns();
//        for(Object[] e3:ref2)
//        {
//            System.out.println(" ID "+e3[0]+" variety "+e3[1]);
//        }
//
//        interiorService.FetchTwoColumns()
//                .forEach(e3 -> System.out.println(" ID " + e3[0] + " variety " + e3[1]));


interiorService.FetchThreeColumns().forEach(element-> System.out.println("Type: " +element[0] +" Shop: " +element[1]+" Variety: "+element[2]));
    }

        }



