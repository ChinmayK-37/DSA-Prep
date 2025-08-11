class Solution {
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer> powersList = new ArrayList<>();

        String binaryRepresentation = Integer.toBinaryString(n);
        
        for (int bitIndex = 0; bitIndex < binaryRepresentation.length(); bitIndex++) {
            if (binaryRepresentation.charAt(bitIndex) == '1') {
                powersList.add(1 << (binaryRepresentation.length() - 1 - bitIndex));
            }
        }
        Collections.sort(powersList);

        int[] results = new int[queries.length];
        final int MOD = 1_000_000_007;

        for (int queryIndex = 0; queryIndex < queries.length; queryIndex++) {
            int start = queries[queryIndex][0];
            int end = queries[queryIndex][1];
            long product = 1;
            while (start <= end) {
                product = (product * powersList.get(start)) % MOD;
                start++;
            }
            results[queryIndex] = (int) product;
        }
        return results;
    }
}
