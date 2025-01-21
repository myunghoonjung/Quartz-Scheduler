package com.example.scheduler.config;

import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TriggerConfig {

    @Bean
    public Trigger sampleTrigger(JobDetail sampleJobDetail) {
        return TriggerBuilder.newTrigger()
                .forJob(sampleJobDetail) // Job과 연결
                .withIdentity("sampleTrigger") // Trigger 이름 설정
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(30) // 30초마다 실행
                        .repeatForever()) // 계속 반복
                .build();
    }
}

