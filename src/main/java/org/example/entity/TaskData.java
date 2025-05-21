package org.example.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        Set<Task> result = new HashSet<>();
        switch (name.toLowerCase()) {
            case "ann":
                result.addAll(annsTasks);
                break;
            case "bob":
                result.addAll(bobsTasks);
                break;
            case "carol":
                result.addAll(carolsTasks);
                break;
            case "all":
                result.addAll(annsTasks);
                result.addAll(bobsTasks);
                result.addAll(carolsTasks);
                break;
        }
        return result;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }


    public final Set<Task> getUnion(Set<Task>... sets) {
        Set<Task> result = new HashSet<>();
        for (Set<Task> set : sets) {
            result.addAll(set);
        }
        return result;
    }

    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        Set<Task> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
        Set<Task> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

}
