package com.example.administrator.downloadwithservice;

/**
 * Created by Administrator on 2017\5\31 0031.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCancled();
}
