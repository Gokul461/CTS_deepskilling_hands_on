package com.country.orm_learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
@Id
@Column(name = "c_code")
private String code;

@Column(name = "c_name")
private String name;

//Getters and setters
public String getName() {
	return name;
}
public String getCode() {
	return code;
}
public void setName(String n) {
	name = n;
}
public void setCode(String n) {
	code = n;
}
@Override
public String toString() {
    return "Country [code=" + code + ", name=" + name + "]";
}


}
