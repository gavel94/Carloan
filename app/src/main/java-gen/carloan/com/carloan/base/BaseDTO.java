package carloan.com.carloan.base;

import java.io.Serializable;

import carloan.com.carloan.constant.ActTypeEnum;
import carloan.com.carloan.constant.PlatformEnum;

/**
 * Created by jiahua on 17-2-24.
 * Description：
 */

public class BaseDTO implements Serializable,Cloneable
{
    /**
     * 请求来源
     * @see PlatformEnum 默认Android
     */
    private int from = PlatformEnum.APP_ANDROID.getValue();
    /**
     * 操作命令
     *@see ActTypeEnum
     */
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
    protected BaseDTO clone()
    {
        try
        {
            return (BaseDTO)super.clone();
        } catch (CloneNotSupportedException e)
        {
            return null;
        }
    }
}
