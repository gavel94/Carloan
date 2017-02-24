package carloan.com.carloan.network;

/**
 * Created by jiahua on 17-2-24.
 * Description：
 */

public class Res
{
    private String error;
    private String msg;

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

    @Override
    public String toString()
    {
        return "Res{" +
                "error='" + error + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
