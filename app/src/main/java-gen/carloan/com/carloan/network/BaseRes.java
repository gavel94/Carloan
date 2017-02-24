package carloan.com.carloan.network;

/**
 * Created by jiahua on 17-2-24.
 * Description：请求返回的实体类
 */

public class BaseRes
{
    private String error;
    private String msg;
    private String actType;

    public String getError()
    {
        return error;
    }

    public void setError(String error)
    {
        this.error = error;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public String getActType()
    {
        return actType;
    }

    public void setActType(String actType)
    {
        this.actType = actType;
    }

    @Override
    public String toString()
    {
        return "BaseRes{" +
                "error='" + error + '\'' +
                ", msg='" + msg + '\'' +
                ", actType='" + actType + '\'' +
                '}';
    }
}
