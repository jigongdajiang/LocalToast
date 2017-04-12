package com.gjg.toast.test.toast;

import android.content.Context;
import android.widget.Toast;


/**
 * @author gaojigong
 * @version V1.0
 * @Description: Toast
 * @date 16/12/22
 */
public class ToastUitl {
    private static EToast toast;

    private static EToast initToast(Context context, CharSequence message, int duration) {
        return toast = EToast.makeText(context, message, duration);
    }

    /**
     * 短时间显示Toast
     *
     * @param message
     */
    public static void showShort(Context context, CharSequence message, boolean isVisible) {
        if (isVisible) {
            initToast(context, message, Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * 短时间显示Toast
     *
     * @param strResId
     */
    public static void showShort(Context context, int strResId, boolean isVisible) {
        if (isVisible) {
            initToast(context, context.getResources().getText(strResId), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 长时间显示Toast
     *
     * @param message
     */
    public static void showLong(Context context, CharSequence message, boolean isVisible) {
        if (isVisible) {
            initToast(context, message, Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 长时间显示Toast
     *
     * @param strResId
     */
    public static void showLong(Context context, int strResId, boolean isVisible) {
        if (isVisible) {
            initToast(context, context.getResources().getText(strResId), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 自定义显示Toast时间
     *
     * @param message
     * @param duration
     */
    public static void show(Context context, CharSequence message, int duration, boolean isVisible) {
        if (isVisible) {
            initToast(context, message, duration).show();
        }
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param strResId
     * @param duration
     */
    public static void show(Context context, int strResId, int duration, boolean isVisible) {
        if (isVisible) {
            initToast(context, context.getResources().getText(strResId), duration).show();
        }
    }

    public static void onInvisible() {
        if (toast != null) {
            toast.invisible();
        }
    }

    public static void onDestroy() {
        if (toast != null) {
            toast.destory();
        }
    }
}
