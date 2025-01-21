package com.example.scheduler.config;

import java.util.List;

import org.quartz.JobListener;
import org.quartz.TriggerListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
public class QuartzConfig {

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(List<JobListener> jobListeners, List<TriggerListener> triggerListeners) {
        SchedulerFactoryBean factoryBean = new SchedulerFactoryBean();

        // 전역 JobListener 등록
        factoryBean.setGlobalJobListeners(jobListeners.toArray(new JobListener[0]));

        // 전역 TriggerListener 등록
        factoryBean.setGlobalTriggerListeners(triggerListeners.toArray(new TriggerListener[0]));

        return factoryBean;
    }
}