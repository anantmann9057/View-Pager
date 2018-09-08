package com.example.jatun.myapplication;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private SlideAdapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = (ViewPager) findViewById(R.id.viewpager);
        myadapter = new SlideAdapter(this);
        pager.setAdapter(myadapter);
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new mytimer(),2000,4000);

    }
        public class mytimer extends TimerTask
        {

            @Override
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (pager.getCurrentItem()==0)
                        {
                            pager.setCurrentItem(1);
                        }else if(pager.getCurrentItem()==1)
                        {
                            pager.setCurrentItem(2);


                        }else if (pager.getCurrentItem()==2)
                            {
                                pager.setCurrentItem(3);
                            }
                            else if (pager.getCurrentItem()==3)
                            {
                                pager.setCurrentItem(4);
                            }
                            else if (pager.getCurrentItem()==4)
                            {
                                pager.setCurrentItem(5);
                            }
                            else if(pager.getCurrentItem()==5)
                            {
                                pager.setCurrentItem(6);
                            }
                            else if (pager.getCurrentItem()==6)
                                {
                                    pager.setCurrentItem(0);
                                }
                                else
                                    {
                                        pager.setCurrentItem(0);
                                    }

                    }
                });
            }
        }

    }
