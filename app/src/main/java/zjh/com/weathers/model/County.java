package zjh.com.weathers.model;

/**
 * 包名：zjh.com.weathers.model.
 * 项目名：Weathers.
 * 创建者： ZJH.
 * 创建时间： 2017/8/3 19:25.
 * 描述： 县
 */
public class County {
    private int id;
    
    private String countyName;
    
    private String countyCode;
    
    private int cityId;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getCountyName() {
        return countyName;
    }
    
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    
    public String getCountyCode() {
        return countyCode;
    }
    
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }
    
    public int getCityId() {
        return cityId;
    }
    
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
