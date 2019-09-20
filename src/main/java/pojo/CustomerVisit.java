package pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "custormervisits")
public class CustomerVisit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerVisitID")
    private int id;
    @Column(name = "VisitDate")
    private Date visitDate;
    @Column(name = "TestDrive")
    private boolean testDrive;
    @Column(name = "CustVisitNotes")
    private String custVisitNotes;
    @Column(name = "SalesPersonID")
    private int spId;
    @Column(name = "CustomerID")
    private int custId;
    @Column(name = "LocationID")
    private int lId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public boolean isTestDrive() {
        return testDrive;
    }

    public void setTestDrive(boolean testDrive) {
        this.testDrive = testDrive;
    }

    public String getCustVisitNotes() {
        return custVisitNotes;
    }

    public void setCustVisitNotes(String custVisitNotes) {
        this.custVisitNotes = custVisitNotes;
    }

    public int getSpId() {
        return spId;
    }

    public void setSpId(int spId) {
        this.spId = spId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }
}
