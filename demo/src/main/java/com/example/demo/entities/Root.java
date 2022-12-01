package com.example.demo.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@Embeddable
public class Root {

    @Id
    @Column(name = "fucked_up_id")
    private Integer id;

    @Column(name = "title")
    private String title;

//    @JsonProperty("items")
////    @ElementCollection
//    @OneToMany(fetch = FetchType.EAGER)
//    public List<Item> itemsList;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Item> items = new ArrayList<>();

}
