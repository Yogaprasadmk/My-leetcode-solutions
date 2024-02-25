class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int t = arrivalTime  + delayedTime;
        return t % 24;
    }
}
