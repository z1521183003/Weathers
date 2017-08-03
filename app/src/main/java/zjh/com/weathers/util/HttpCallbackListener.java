package zjh.com.weathers.util;

/**
 * 包名：zjh.com.weathers.util.
 * 项目名：Weathers.
 * 创建者： ZJH.
 * 创建时间： 2017/8/3 19:50.
 * 描述： TDD
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    
    void onError(Exception e);
}
