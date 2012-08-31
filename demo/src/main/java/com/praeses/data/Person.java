/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praeses.data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author dculpepper
 */
@DatabaseTable(tableName="person")
public class Person {
    @DatabaseField(id=true) private String name;
    @DatabaseField private String phone;
    @DatabaseField private String address;
    
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
