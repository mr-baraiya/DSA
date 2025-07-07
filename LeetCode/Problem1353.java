class Solution {
    public int maxEvents(int[][] events) {

        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int day = 1;
        int i = 0;
        int n = events.length;
        int count = 0;

        int lastDay = 0;
        for (int[] e : events) {
            lastDay = Math.max(lastDay, e[1]);
        }

        for (day = 1; day <= lastDay; day++) {

            while (i < n && events[i][0] == day) {
                minHeap.offer(events[i][1]);
                i++;
            }

            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            if (!minHeap.isEmpty()) {
                minHeap.poll();
                count++;
            }
            
        }
        return count;
    }
}

// class Solution {
//     public int maxEvents(int[][] events) {
        // Arrays.sort(events, (a, b) -> {
        //     if(a[0] != b[0]) return Integer.compare(a[0], b[0]);
        //     return Integer.compare(a[1],b[1]);
        // });

        // for(int i = 0; i < events.length - 1; i++) {
        //     int min = i;
        //     for(int j = i + 1; j < events.length; j++) {
        //         if(events[j][0] < events[min][0]) {
        //             min = j; // smaller start time
        //         } else if(events[j][0] == events[min][0] && events[j][1] < events[min][1]) {
        //             min = j; // same start time but smaller end time
        //         }
        //     }

        //     if(min != i) {
        //         int temp[] = events[i];
        //         events[i] = events[min];
        //         events[min] = temp;
        //     }
        // }

        // int attendedEventCount = 0;
        // int currentDay = 1; 
        // for(int i=0; i<events.length; i++){
        //     int start = events[i][0];
        //     int end = events[i][1];
            
        //     // Jump currentDay to event start if needed
        //     if (currentDay < start) {
        //         currentDay = start;
        //     }

        //     if (currentDay <= end) {
        //         attendedEventCount++;
        //         currentDay++; // move to next available day
        //     }

        // }
        // return attendedEventCount;
//     }
// }
