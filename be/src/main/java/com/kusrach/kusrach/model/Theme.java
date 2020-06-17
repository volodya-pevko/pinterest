package com.kusrach.kusrach.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Theme {

    //@Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String title;
    private String imageUrl;
}
