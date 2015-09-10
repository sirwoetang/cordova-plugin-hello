package com.mapworxxell.onefourone;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.app.Activity;
import android.app.Activity.*;
import android.content.Intent;
import android.content.Intent.*;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);

            Intent intent = new Intent("com.zello.ptt.down");
            intent.putExtra("com.zello.stayHidden", true);
            activity.sendBroadcast(intent);

            return true;

        } else {

            Intent intent = new Intent("com.zello.ptt.up");
            intent.putExtra("com.zello.stayHidden", true);
            activity.sendBroadcast(intent);
            

            return false;

        }
    }
}
