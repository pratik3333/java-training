public class StringEven_Length {
    public static void main(String[] args) {
        String str = "This is a sample string with even and odd length words";
        
        int start = 0;
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') 
            {
                if ((i - start) % 2 == 0) 
                {
                    System.out.println(str.substring(start, i));
                }
                start = i + 1;
            }
        }
    }
}
