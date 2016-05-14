package com.olsys.utils;


import com.olsys.boardgamegeekexampleapp.BuildConfig;

/**
 * Main class for logging.
 * @author Przemysław Czaus (przemyslaw@czaus.pl)
 */
public class Log {

    private Log() {
    }

    /**
     * Send a {@link #VERBOSE} log message.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int v(String tag, String msg) {
        if (isDebug()) {
            return android.util.Log.v(tag, msg);
        }
        return 0;
    }
    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static int v(String tag, String msg, Throwable tr) {
        if (isDebug()) {
            return android.util.Log.v(tag, msg, tr);
        }
        return 0;
    }
    /**
     * Send a {@link #DEBUG} log message.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int d(String tag, String msg) {
        if (isDebug()) {
            return android.util.Log.d(tag, msg);
        }
        return 0;
    }
    /**
     * Send a {@link #DEBUG} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static int d(String tag, String msg, Throwable tr) {
        if (isDebug()) {
            return android.util.Log.d(tag, msg, tr);
        }
        return 0;
    }
    /**
     * Send an {@link #INFO} log message.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int i(String tag, String msg) {
        if (isDebug()) {
            return android.util.Log.i(tag, msg);
        }
        return 0;
    }
    /**
     * Send a {@link #INFO} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static int i(String tag, String msg, Throwable tr) {
        if (isDebug()) {
            return android.util.Log.i(tag, msg, tr);
        }
        return 0;
    }
    /**
     * Send a {@link #WARN} log message.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int w(String tag, String msg) {
        if (isDebug()) {
            return android.util.Log.w(tag, msg);
        }
        return 0;
    }
    /**
     * Send a {@link #WARN} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static int w(String tag, String msg, Throwable tr) {
        if (isDebug()) {
            return android.util.Log.w(tag, msg, tr);
        }
        return 0;
    }
    /*
     * Send a {@link #WARN} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param tr An exception to log
     */
    public static int w(String tag, Throwable tr) {
        if (isDebug()) {
            return android.util.Log.w(tag, tr);
        }
        return 0;
    }
    /**
     * Send an {@link #ERROR} log message.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int e(String tag, String msg) {
        if (isDebug()) {
            return android.util.Log.e(tag, msg);
        }
        return 0;
    }
    /**
     * Send a {@link #ERROR} log message and log the exception.
     * @param tag Used to identify the source of a log message.  It usually identifies
     *        the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static int e(String tag, String msg, Throwable tr) {
        if (isDebug()) {
            return android.util.Log.e(tag, msg, tr);
        }
        return 0;
    }
    /**
     * What a Terrible Failure: Report a condition that should never happen.
     * The error will always be logged at level ASSERT with the call stack.
     * Depending on system configuration, a report may be added to the
     * {@link android.os.DropBoxManager} and/or the process may be terminated
     * immediately with an error dialog.
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     */
    public static int wtf(String tag, String msg) {
        if (isDebug()) {
            return android.util.Log.wtf(tag,msg);
        }
        return 0;
    }
    /**
     * What a Terrible Failure: Report an exception that should never happen.
     * Similar to {@link #wtf(String, String)}, with an exception to log.
     * @param tag Used to identify the source of a log message.
     * @param tr An exception to log.
     */
    public static int wtf(String tag, Throwable tr) {
        if (isDebug()) {
            return android.util.Log.wtf(tag, tr);
        }
        return 0;
    }
    /**
     * What a Terrible Failure: Report an exception that should never happen.
     * Similar to {@link #wtf(String, Throwable)}, with a message as well.
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     * @param tr An exception to log.  May be null.
     */
    public static int wtf(String tag, String msg, Throwable tr) {
        if (isDebug()) {
            return android.util.Log.wtf(tag,msg, tr);
        }
        return 0;
    }

    private static boolean isDebug() {
        return BuildConfig.DEBUG&&BuildConfig.BUILD_TYPE.equals("debug");
    }
}
