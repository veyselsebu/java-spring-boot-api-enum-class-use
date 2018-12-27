package com.infotech.app.entities;

import com.infotech.app.enums.EnumDegerleri1.gunler;

import javax.persistence.*;

@Entity
@Table(name="enum_deneme")
public class EnumDeneme {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Long ID;

    @Enumerated(EnumType.STRING)
    @Column(name="enum_degerleri")
    private gunler enumDegeri;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public gunler getEnumDegeri() {
        return enumDegeri;
    }

    public void setEnumDegeri(gunler enumDegeri) {
        this.enumDegeri = enumDegeri;
    }
}
