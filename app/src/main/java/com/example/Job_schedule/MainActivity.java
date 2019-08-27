package com.example.Job_schedule;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
JobScheduler js;
JobInfo ji;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onResume() {
        super.onResume();
        ComponentName cn=new ComponentName(this,Scheduler.class);

        JobInfo.Builder builder=new JobInfo.Builder(101,cn);
        builder.setPeriodic(15*60*1000);//min time period
        builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY);
        builder.setPersisted(true);

        ji=builder.build();
        js= (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
        js.schedule(ji);
    }
}
