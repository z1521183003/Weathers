package zjh.com.weathers.model;

/**
 * 包名：zjh.com.weathers.model.
 * 项目名：Weathers.
 * 创建者： ZJH.
 * 创建时间： 2017/8/3 19:25.
 * 描述： 省
 */
public class Province {
    private int id;
    
    private String provinceName;
    
    private String provinceCode;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getProvinceName() {
        return provinceName;
    }
    
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    
    public String getProvinceCode() {
        return provinceCode;
    }
    
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
    
    
}
