package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class FurnitureDto {
    private String name;
    private String material;
    private int price;
    private boolean isWooden;
    private String category;
}
