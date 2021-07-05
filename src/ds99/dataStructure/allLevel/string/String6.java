package ds99.dataStructure.allLevel.string;

public class String6 {
    public static String countAndSay(int n) {

        if (n <= 0)
            return "";

        String result = "1";
        int i = 1;

        while (i < n) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            //result store current sequence so we will iterate over it each time
            for (int j = 1; j < result.length(); j++) {

                //now check whether current element is equal to previous element, so we will be still counting
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(result.charAt(j - 1));
                    count = 1;
                }
            }
    //Whenever we have repeated numbers at last then we would have count but for loop will not able to add it in result
    //for example 11, its result would be 21 but by the time we have count 2, jth value will be 2 which will not satisfy
    //for loop condition so we have to handle such case out of for loop.
            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            result = sb.toString();
            i++;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}
