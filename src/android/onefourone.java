package com.mapworxxell.onefourone;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;


import android.content.Intent;


public class onefourone extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "Hello, " + name;

            Intent intent = new Intent("com.zello.ptt.down");
            intent.putExtra("com.zello.stayHidden", true);
            ((CordovaActivity) this.cordova.getActivity()).sendBroadcast(intent);
            callbackContext.success(message);


            return true;

        } else {

            return false;

        }
    }
}