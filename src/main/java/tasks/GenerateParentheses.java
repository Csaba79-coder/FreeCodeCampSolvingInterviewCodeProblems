package tasks;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    // first solution!

    public List<String> generateParenthesisFirstSolution(int n) {
        ArrayList<String> result = new ArrayList<String>();
        dfs(result, "", n, n);
        return result;
    }
    /*
    left and right represents the remaining number of ( and ) that need to be added.
    When left > right, there are more ")" placed than "(". Such cases are wrong and the method stops.
    */
    public void dfs(ArrayList<String> result, String s, int left, int right){
        if(left > right)
            return;

        if(left==0 && right==0){
            result.add(s);
            return;
        }

        if(left > 0){
            dfs(result, s + "(", left-1, right);
        }

        if(right > 0){
            dfs(result, s + ")", left, right-1);
        }
    }

    // second solution

    public List<String> generateParenthesisSecondSolution(int n) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<Integer> diff = new ArrayList<>();

        result.add("");
        diff.add(0);

        for (int i = 0; i < 2 * n; i++) {
            ArrayList<String> temp1 = new ArrayList<>();
            ArrayList<Integer> temp2 = new ArrayList<>();

            for (int j = 0; j < result.size(); j++) {
                String s = result.get(j);
                int k = diff.get(j);

                if (i < 2 * n - 1) {
                    temp1.add(s + "(");
                    temp2.add(k + 1);
                }

                if (k > 0 && i < 2 * n - 1 || k == 1 && i == 2 * n - 1) {
                    temp1.add(s + ")");
                    temp2.add(k - 1);
                }
            }

            result = new ArrayList<>(temp1);
            diff = new ArrayList<>(temp2);
        }

        return result;
    }
}
