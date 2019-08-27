package com.example.Job_schedule;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.widget.Toast;

public class Scheduler extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        Toast.makeText(getApplicationContext(),"job_schedule",Toast.LENGTH_LONG).show();
        jobFinished(params,false);
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return true;
    }
}
