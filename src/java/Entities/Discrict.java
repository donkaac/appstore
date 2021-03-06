package Entities;
// Generated Sep 9, 2016 6:59:56 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Discrict generated by hbm2java
 */
public class Discrict  implements java.io.Serializable {


     private Integer idDiscrict;
     private Province province;
     private String discrictName;
     private boolean state;
     private Set<City> cities = new HashSet<City>(0);

    public Discrict() {
    }

	
    public Discrict(Province province, boolean state) {
        this.province = province;
        this.state = state;
    }
    public Discrict(Province province, String discrictName, boolean state, Set<City> cities) {
       this.province = province;
       this.discrictName = discrictName;
       this.state = state;
       this.cities = cities;
    }
   
    public Integer getIdDiscrict() {
        return this.idDiscrict;
    }
    
    public void setIdDiscrict(Integer idDiscrict) {
        this.idDiscrict = idDiscrict;
    }
    public Province getProvince() {
        return this.province;
    }
    
    public void setProvince(Province province) {
        this.province = province;
    }
    public String getDiscrictName() {
        return this.discrictName;
    }
    
    public void setDiscrictName(String discrictName) {
        this.discrictName = discrictName;
    }
    public boolean isState() {
        return this.state;
    }
    
    public void setState(boolean state) {
        this.state = state;
    }
    public Set<City> getCities() {
        return this.cities;
    }
    
    public void setCities(Set<City> cities) {
        this.cities = cities;
    }




}


