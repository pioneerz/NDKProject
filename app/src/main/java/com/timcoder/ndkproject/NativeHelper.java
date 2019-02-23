package com.timcoder.ndkproject;

/**
 * @author Administrator
 * 2019/2/23 0023.
 */
public class NativeHelper {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    public NativeHelper() {

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native  String stringFromJNI();

    public native String buttonFromJNI();

}
