package pojo;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VehicleID")
    private int id;
    @Column(name = "VehicleMake")
    private String vMake;
    @Column(name = "VehicleModel")
    private String vModel;
    @Column(name = "VehicleYear")
    private int vYear;
    @Column(name = "NewOrUsed")
    private boolean newOrUsed;
    @Column(name = "VehiclePrice")
    private BigDecimal vPrice;
    @Column(name = "VehicleNotes")
    private String vNotes;
    @Column(name = "LocationID")
    private int lId;

}
