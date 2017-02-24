package carloan.com.carloan.net;

import carloan.com.carloan.bean.req.SendMessageReq;
import carloan.com.carloan.network.BaseRes;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by jiahua on 17-2-24.
 * Description：
 */

public interface ApiService
{
    //发送短信
    @POST("/appsrv")
    Observable<BaseRes> sendSMS(@Body SendMessageReq sendMessageReq);
}
