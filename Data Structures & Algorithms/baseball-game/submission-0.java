class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String c : operations) {
            if (c.matches("-?\\d+")) {
                // c is an integer (e.g., "5", "-3")
                st.push(Integer.parseInt(c));
            } else if (c.equals( "+")) {
                int temp1 = st.pop();
                int temp2 = st.pop();
                int sum = temp1 + temp2;
                st.push(temp2);
                st.push(temp1);
                st.push(sum);

            } else if (c.equals("D")) {
                int temp1 = st.pop();
                int d = temp1 * 2;
                st.push(temp1);
                st.push(d);
            } else if (c.equals("C")) {
                st.pop();
            }
        }
        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}