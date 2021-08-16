package com.company;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class StopWatch {
    public LocalTime startTime;
    public LocalTime endTime;
    StopWatch() {
    }
    public start() {
        startTime = LocalTime.now();
    }
    public stop() {
        endTime = LocalTime.now();
    }
//    public getElapsedTime() {
//        return
//    }

}
