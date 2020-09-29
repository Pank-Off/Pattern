package com.pattern.structural.facade;

public class WorkFlow {
    Director director = new Director();
    Job job = new Job();
    Worker worker = new Worker();

    void doJob() {
        job.startProject();
        worker.doJob();
        director.observe(worker);
        if (director.isFinished()) {
            System.out.println("Job is Finished!");
        }
    }
}
