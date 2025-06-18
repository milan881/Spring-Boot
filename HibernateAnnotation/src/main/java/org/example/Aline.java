package org.example;

import javax.persistence.*;

//Entity => represents a table in the database
//Table => represents the name of the table in the database
//Id => represents the primary key of the table
//Column => represents a column in the table
//Transient => indicates that the field should not be persisted in the database

@Entity
@Table(name = "Alines")
public class Aline {

    @Id
    private int aId;
    
    @Column(name = "aName")
    private String aName;

    @Transient
    private String aTech;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaTech() {
        return aTech;
    }

    public void setaTech(String aTech) {
        this.aTech = aTech;
    }

    @Override
    public String toString() {
        return "Aline{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aTech='" + aTech + '\'' +
                '}';
    }
}
