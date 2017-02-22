package carloan.com.carloan.db.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2016/12/19 0019.
 * Description：
 */
@Entity
public class UserInfo {
    @Id(autoincrement = true)
    private  long id;

    @Property(nameInDb = "salesman_id")
    @NotNull
    public int salesman_id;
    @Property(nameInDb = "real_name")
    public String real_name;
    @Property(nameInDb = "mobile")
    public String mobile;
    @Property(nameInDb = "company_name")
    public String company_name;
    @Generated(hash = 1781225155)
    public UserInfo(long id, int salesman_id, String real_name, String mobile,
            String company_name) {
        this.id = id;
        this.salesman_id = salesman_id;
        this.real_name = real_name;
        this.mobile = mobile;
        this.company_name = company_name;
    }
    @Generated(hash = 1279772520)
    public UserInfo() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getSalesman_id() {
        return this.salesman_id;
    }
    public void setSalesman_id(int salesman_id) {
        this.salesman_id = salesman_id;
    }
    public String getReal_name() {
        return this.real_name;
    }
    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }
    public String getMobile() {
        return this.mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getCompany_name() {
        return this.company_name;
    }
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
   
}
