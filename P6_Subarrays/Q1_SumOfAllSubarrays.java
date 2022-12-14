package P6_Subarrays;

public class Q1_SumOfAllSubarrays {
    public long subarraySum(int[] A) {
        
        long total_sum = 0;
        int N = A.length;
        for(int i =0;i<A.length;i++){
            total_sum += (long)A[i] * (i+1) * (N-i);
        }
        return total_sum;
    }
}
