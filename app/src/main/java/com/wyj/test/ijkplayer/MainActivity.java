package com.wyj.test.ijkplayer;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wyj.test.ijkplayer.widget.media.IRenderView;
import com.wyj.test.ijkplayer.widget.media.IjkVideoView;

public class MainActivity extends AppCompatActivity {
    private IjkVideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (IjkVideoView) findViewById(R.id.video_view);
        videoView.setAspectRatio(IRenderView.AR_ASPECT_FIT_PARENT);
        videoView.setVideoURI(Uri.parse("http://mp4.vjshi.com/2013-05-28/2013052815051372.mp4"));
        videoView.start();
    }
}
