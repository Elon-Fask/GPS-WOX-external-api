package com.testgpswox.dev.model.request;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetInfoRequest {

    private String lang;
    private String userApiHash;
}
