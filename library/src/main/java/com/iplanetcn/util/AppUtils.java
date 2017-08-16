package com.iplanetcn.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Application Utils.
 *
 * @author john
 * @since 2017-08-16
 */
public final class AppUtils {
    private AppUtils() {
    }


    /**
     * Get packageInfo.
     *
     * @param context context
     * @return packageInfo {@link PackageInfo}
     */
    public static PackageInfo getPackageInfo(Context context) {
        PackageInfo info = null;
        try {
            info = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace(System.err);
        }
        if (info == null) {
            info = new PackageInfo();
        }
        return info;
    }

    /**
     * Get versionName
     *
     * @param context context
     * @return versionName
     */
    public static String getVersionName(Context context) {
        return getPackageInfo(context).versionName;
    }

    /**
     * Get versionCode
     *
     * @param context context
     * @return versionCode
     */
    public static Integer getVersionCode(Context context) {
        return getPackageInfo(context).versionCode;
    }


}
