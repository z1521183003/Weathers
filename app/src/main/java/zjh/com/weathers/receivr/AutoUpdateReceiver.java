package zjh.com.weathers.receivr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import zjh.com.weathers.service.AutoUpdateService;

/**
 * 包名：zjh.com.weathers.receivr.
 * 项目名：Weathers.
 * 创建者： ZJH.
 * 创建时间： 2017/8/3 20:51.
 * 描述： TDD
 */
public class AutoUpdateReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
