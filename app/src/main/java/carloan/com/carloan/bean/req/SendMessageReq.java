package carloan.com.carloan.bean.req;

import carloan.com.carloan.constant.SendSMSEnum;
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
    /**
     * 发送短信类型
     * @see SendSMSEnum
     */
    private String sendType;
    /**
     * MD5加密 from+mobile+sendType+key
     */
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

}
