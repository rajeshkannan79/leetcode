class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            al.add(arr[i]);
        }

        Collections.sort(al);
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        // Step 3: Assign ranks to the elements in the sorted array
        for (int nums : al) {
            if (!rankMap.containsKey(nums)) {
                rankMap.put(nums, rank++);
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        
        return result;
    }}