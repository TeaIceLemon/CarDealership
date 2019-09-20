package pojo;

import Enums.SPTypes;

import javax.persistence.*;

@Entity
@Table(name = "salespeople")
public class SalesPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SalesPersonID")
    private int id;
    @Column(name = "SPType")
    private SPTypes type;
    @Column(name = "SPFirstName")
    private String name;
    @Column(name = "SPLastName")
    private String lastName;
    @Column(name = "DealID")
    private int dealId;
    @Column(name = "LocationID")
    private int locationId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SPTypes getType() {
        return type;
    }

    public void setType(SPTypes type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDealId() {
        return dealId;
    }

    public void setDealId(int dealId) {
        this.dealId = dealId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
}
