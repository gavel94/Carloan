package carloan.com.carloan.bean.req;

import carloan.com.carloan.network.BaseReq;

/**
 * Created by jiahua on 17-2-24.
 * QQ:781913268
 * Description：
 */

public class SendMessageReq extends BaseReq
{
    /**
     * 手机号
     */
    private String mobile;

    private String sendType;
    private String key;

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getSendType()
    {
        return sendType;
    }

    public void setSendType(String sendType)
    {
        this.sendType = sendType;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    @Override
    public String toString()
    {
        return super.toString() + "SendMessageReq{" +
                "mobile='" + mobile + '\'' +
                ", sendType='" + sendType + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
