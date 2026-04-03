class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    //key-num: value-frequency
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            }

        PriorityQueue<int []> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        /*
        a[0]-b[0]: smallest element at the top.
        The Heap: This creates a Min-Heap of integer arrays. 
        Each array inside will look like [frequency, value].
        */
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        heap.offer(new int[]{entry.getValue(), entry.getKey()});
        /*
        If the heap size grows larger than k, we poll() (remove) the top element.
        heap.offer: We push every unique number and its frequency into the heap.
        */
                if(heap.size() > k) {
                heap.poll();
            }
        }
        //Result: After the loop, the heap only contains the k elements with the highest frequencies.

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll()[1];
        //heap.poll()[1]: We empty the heap one by one, grabbing the second value in our pair (the actual number, not the count) and putting it into our result array.
        }
        return res;

        }
    }

    //Time Complexity: O(n log k)