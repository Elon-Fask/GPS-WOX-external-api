package com.gpswoxapi.external.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class DeviceResponse {

    @JsonProperty("items")
    public List<Item> items;



}
