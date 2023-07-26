import java.util.*;

public class JobSequencing {
    static class Job{
        int deadline;
        int profit;
        int id; // 0(A), 1(B), 2(C)...

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i < jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs, (a,b) -> b.profit-a.profit); //descending order profit
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        // print seq
        System.out.println("max jobs = " + seq.size());
        for(int i = 0; i < seq.size(); i++){
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }   
}