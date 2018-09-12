package com.github.tianma8023.smscode.constant;


import com.github.tianma8023.smscode.BuildConfig;

/**
 * Preference相关的常量
 */
public interface PrefConst {

    String REMOTE_PREF_NAME = BuildConfig.APPLICATION_ID + "_preferences";
    String REMOTE_PREF_AUTHORITY = BuildConfig.APPLICATION_ID + ".preferences";

    String KEY_ENABLE = "pref_enable";
    boolean KEY_ENABLE_DEFAULT = false;

    String KEY_LISTEN_MODE = "pref_listen_mode";
    String KEY_LISTEN_MODE_STANDARD = "listen_mode_standard";
    String KEY_LISTEN_MODE_COMPATIBLE = "listen_mode_compatible";

    String KEY_SHOW_TOAST = "pref_show_toast";
    boolean KEY_SHOW_TOAST_DEFAULT = true;

    String KEY_CHOOSE_THEME = "pref_choose_theme";
    String KEY_CURRENT_THEME_INDEX = "pref_current_theme_index";
    int KEY_CURRENT_THEME_INDEX_DEFAULT = 0;

    String KEY_EXPERIMENTAL = "pref_experimental";

    String KEY_MARK_AS_READ = "pref_mark_as_read";
    boolean KEY_MARK_AS_READ_DEFAULT = false;

    String KEY_ENTRY_AUTO_INPUT_CODE = "pref_entry_auto_input_code";

    String KEY_SMSCODE_KEYWORDS = "pref_smscode_keywords";
    String KEY_SMSCODE_KEYWORDS_DEFAULT = SmsCodeConst.VERIFICATION_KEYWORDS_REGEX;

    String KEY_SMSCODE_TEST = "pref_smscode_test";

    String KEY_ABOUT = "pref_about";
    String KEY_VERSION = "pref_version";
    String KEY_SOURCE_CODE = "pref_source_code";
    String KEY_DONATE_BY_ALIPAY = "pref_donate_by_alipay";
    String KEY_DONATE_BY_WECHAT = "pref_donate_by_wechat";

    String KEY_ENABLE_AUTO_INPUT_CODE = "pref_enable_auto_input_code";
    boolean KEY_ENABLE_AUTO_INPUT_CODE_DEFAULT = false;
    String KEY_AUTO_INPUT_MODE = "pref_auto_input_mode";
    String AUTO_INPUT_MODE_DEFAULT = "";
    String AUTO_INPUT_MODE_ROOT = "auto_input_mode_root";
    String AUTO_INPUT_MODE_ACCESSIBILITY = "auto_input_mode_accessibility";
    String KEY_FOCUS_MODE = "pref_focus_mode";
    String KEY_FOCUS_MODE_AUTO = "focus_mode_auto";
    String KEY_FOCUS_MODE_MANUAL = "focus_mode_manual";

    String KEY_VERBOSE_LOG_MODE = "pref_verbose_log_mode";
    boolean KEY_VERBOSE_LOG_MODE_DEFAULT = false;
}