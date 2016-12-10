package t;

import java.io.Serializable;

/**
 * Created by hanzhihua on 2016/11/29.
 */
public class Address implements Serializable{

    private String city;

    private String prov;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }
}
