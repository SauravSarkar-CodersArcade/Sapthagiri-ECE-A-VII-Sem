package com.advanced.greedy;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Activity {
    int start;
    int finish;
    Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
}
public class ActivitySelection {
    // Comparator to sort the activities according to finish time
    static class ActivityComparator implements Comparator<Activity>{
        public int compare(Activity a1, Activity a2){
            return a1.finish - a2.finish; // Ascending Order
            // return a2.finish - a1.finish; // Descending Order
        }
    }
    static void printMaxActivities(List<Activity> activities){
        // Sort the activities according to their finish times
        activities.sort(new ActivityComparator());
        // Always select the activity that finishes earliest
        int lastSelected = 0;
        // (1,4)(5,7)(8,9)
        System.out.print("(" + activities.get(lastSelected).start + "," +
                activities.get(lastSelected).finish + ")");
        // We can traverse the list & perform the check
        // The start time of the next activity should be equal or greater
        // than the finish time of the current/last activity
        for (int i=1; i<activities.size(); i++){
           if(activities.get(i).start >= activities.get(lastSelected).finish){
               System.out.print("(" + activities.get(i).start + "," +
                       activities.get(i).finish + ")");
               lastSelected = i; // Move to the next selected activity (i)
           }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
             new Activity(5,7),
             new Activity(8,9),
             new Activity(1,4),
             new Activity(5,9),
             new Activity(0,6),
             new Activity(3,5)
        );
        printMaxActivities(activities);
    }
}
