package com.mapworxxell.onefourone;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.Intent;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("record")) {

            String name = data.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);
            //Intent intent = new Intent("com.zello.ptt.down");
            //intent.putExtra("com.zello.stayHidden", true);
            //((CordovaActivity) this.cordova.getActivity()).sendBroadcast(intent);


            return true;

        } else {
            String name = data.getString(0);
            String message = "STOP, " + name;
            callbackContext.success(message);

            //Intent intent = new Intent("com.zello.ptt.up");
            //intent.putExtra("com.zello.stayHidden", true);
            //((CordovaActivity) this.cordova.getActivity()).sendBroadcast(intent);


            return false;

        }
    }
}
