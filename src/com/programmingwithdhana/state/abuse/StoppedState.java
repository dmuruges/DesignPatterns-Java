package com.programmingwithdhana.state.abuse;

public class StoppedState implements  State {
    private StopWatch stopwatch;

    public StoppedState(StopWatch stopwatch)
    {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new RunningState(stopwatch));
        System.out.println("Running");
    }
}