package com.testein.jenkins.api.models;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRunDetails {
        public TaskDetails run = new TaskDetails();
        public List<TaskDetails> tasks = new ArrayList<>();
}
