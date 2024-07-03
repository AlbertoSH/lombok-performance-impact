package com.github.albertosh.lombokperformance;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

public class SimpleBenchmark {

    private static final RegularPoint regularPoint = new RegularPoint(0, 0);
    private static final LombokPoint lombokPoint = new LombokPoint(0, 0);
    private static final RecordPoint recordPoint = new RecordPoint(0, 0);
    private static final DataPoint dataPoint = new DataPoint(0, 0);
    private static final RecordDataPoint recordDataPoint = new RecordDataPoint(0, 0);

    @Benchmark
    public void regularPoint(Blackhole blackhole) {
        if (regularPoint.getX() != 0 && regularPoint.getY() != 0) {
            blackhole.consume(0);
        } else {
            blackhole.consume(1);
        }
    }

    @Benchmark
    public void lombokPoint(Blackhole blackhole) {
        if (lombokPoint.getX() != 0 && lombokPoint.getY() != 0) {
            blackhole.consume(0);
        } else {
            blackhole.consume(1);
        }
    }

    @Benchmark
    public void recordPoint(Blackhole blackhole) {
        if (recordPoint.x() != 0 && recordPoint.y() != 0) {
            blackhole.consume(0);
        } else {
            blackhole.consume(1);
        }
    }

    @Benchmark
    public void dataPoint(Blackhole blackhole) {
        if (recordPoint.x() != 0 && recordPoint.y() != 0) {
            blackhole.consume(0);
        } else {
            blackhole.consume(1);
        }
    }

    @Benchmark
    public void recordDataPoint(Blackhole blackhole) {
        if (recordPoint.x() != 0 && recordPoint.y() != 0) {
            blackhole.consume(0);
        } else {
            blackhole.consume(1);
        }
    }
}
