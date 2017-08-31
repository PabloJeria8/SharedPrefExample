package cl.empresapjm.sharedprefexample;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Pablo on 30-08-2017.
 */

public class MySharedPreference {


    private static final String GROUP_KEY = "cl.empresapjm.sharedprefexample.KEY.GROUP_KEY";
    private static final String PREFERENCE_KEY = "cl.empresapjm.sharedprefexample.KEY.PREFERENCE_KEY";
    private Context context;

    public MySharedPreference(Context context) {
        this.context = context;
    }

    public void save (String text){

        SharedPreferences sharedPreferences = context.getSharedPreferences(GROUP_KEY, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PREFERENCE_KEY, text);
        editor.apply();
       /* editor.commit();*/

    }

    public String get(){

        SharedPreferences sharedPreferences = context.getSharedPreferences(GROUP_KEY, Context.MODE_PRIVATE);
        String value = sharedPreferences.getString(PREFERENCE_KEY, null);
        return value;
    }


}
