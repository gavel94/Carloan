package carloan.com.carloan.other;

import android.os.Environment;

import java.io.File;

/**
 * Created by jhhuang on 2017/2/22.
 * QQ:781913268
 * Description：应用配置信息
 */
public class Config
{
    /**
     * 点击防抖动  单位毫秒
     */
    public static final int TIME_THROTTLE = 2000;
    /**
     * text改变响应 单位毫秒
     */
    public static final int TIME_DEBOUNCE = 500;

    public final static String DEFAULT_SAVE_FILE_PATH = Environment
            .getExternalStorageDirectory()
            + File.separator
            + "kangaroo"
            + File.separator
            + "download"
            + File.separator;
}