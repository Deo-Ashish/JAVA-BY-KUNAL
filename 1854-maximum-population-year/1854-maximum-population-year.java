class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] years = new int[101];

        // Mark births and deaths
        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];

            years[birth - 1950]++;
            years[death - 1950]--;
        }

        int population = 0;
        int maxPopulation = 0;
        int answer = 1950;

        // Calculate population for each year
        for (int i = 0; i < 101; i++) {
            population += years[i];

            if (population > maxPopulation) {
                maxPopulation = population;
                answer = i + 1950;
            }
        }

        return answer;
    }
}