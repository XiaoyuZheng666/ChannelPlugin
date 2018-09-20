package com.xy.channel;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by mac005 on 2018/6/5.
 */

public class ChannelPlugin  extends CordovaPlugin{

    private CallbackContext mCallbackContext;
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        this.mCallbackContext = callbackContext;
        if("getChannel".equals(action)){

            String channelNumber = getAppMetaData(cordova.getActivity(), "ZHIKU_CHANNEL");//获取app当前的渠道号


            callbackContext.success(channelNumber);
            return true;
        }
        mCallbackContext.error("error");
        return false;
    }

/**
 * 获取app当前的渠道号或application中指定的meta-data
 *
 * @return 如果没有获取成功(没有对应值，或者异常)，则返回值为空
 */
public static String getAppMetaData(Context context, String key) {
    if (context == null || TextUtils.isEmpty(key)) {
        return null;
    }
    String channelNumber = null;
    try {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            if (applicationInfo != null) {
                if (applicationInfo.metaData != null) {
                      channelNumber = applicationInfo.metaData.getString(key);
                      channelNumber=channelNumber.substring(3);                    
                }
            }
        }
    } catch (PackageManager.NameNotFoundException e) {
        e.printStackTrace();
    }
    return channelNumber;
}
    
}
