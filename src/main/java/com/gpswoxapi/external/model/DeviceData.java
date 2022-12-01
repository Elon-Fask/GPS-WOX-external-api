package com.gpswoxapi.external.model;


import java.util.List;
import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "user_id",
        "active",
        "name",
        "sensors",
        "users"
})
@Getter
@Setter
@NoArgsConstructor
public class DeviceData {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("user_id")
    public Integer userId;
    @JsonProperty("active")
    public Integer active;
    @JsonProperty("name")
    public String name;
    @JsonProperty("sensors")
    public List<Sensor> sensors;

    @JsonProperty("users")
    public Users users;


}

