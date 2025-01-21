package com.example.scheduler.config;

import org.quartz.Job;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.spi.JobFactory;
import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;

public class CustomJobFactory implements JobFactory {

    private final AutowireCapableBeanFactory beanFactory;

    public CustomJobFactory(ApplicationContext applicationContext) {
        this.beanFactory = applicationContext.getAutowireCapableBeanFactory();
    }

    @Override
    public Job newJob(TriggerFiredBundle bundle, Scheduler scheduler) throws SchedulerException {
        try {
            Job job = (Job) beanFactory.createBean(bundle.getJobDetail().getJobClass());
            beanFactory.autowireBean(job);
            return job;
        } catch (Exception e) {
            throw new SchedulerException("Failed to create and autowire job instance", e);
        }
    }
}
