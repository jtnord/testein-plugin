package com.testein.jenkins.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskDetails {
    public String id = "";
    public TaskStatus status;
    public String testName = "";
    public int percentage = 0;
    public List<RunnerDetail> runnerDetails = new ArrayList<>();
}
