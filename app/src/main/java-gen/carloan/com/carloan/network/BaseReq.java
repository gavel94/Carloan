package carloan.com.carloan.network;

/**
 * Created by jiahua on 17-2-24.
 * Description：发送请求的实体类
 */

public class BaseReq
{
    /**
     * 请求来源
     */
    private int from = 2;
    private int actType;

    public int getFrom()
    {
        return from;
    }

    public void setFrom(int from)
    {
        this.from = from;
    }

    public int getActType()
    {
        return actType;
    }

    public void setActType(int actType)
    {
        this.actType = actType;
    }

    @Override
    public String toString() {
        return "BaseReq{" +
                "from=" + from +
                ", actType=" + actType +
                '}';
    }
}
