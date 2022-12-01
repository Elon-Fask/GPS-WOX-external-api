package com.gpswoxapi.external.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.gpswoxapi.external.dto.ItemDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class DeviceResponse {

    @JsonProperty("itemDtos")
    public List<ItemDto> itemDtos;



}
