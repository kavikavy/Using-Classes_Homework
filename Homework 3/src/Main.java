public class Main {
    public static void main(String[] args) {
        int len = 0;
        String firstArg = args[0];  // First command-line argument
        String secondArg = args[1]; // Second command-line argument
        int location = firstArg.indexOf(secondArg);
        if (location == 0) {
            len += secondArg.length();
        }

        while (len < firstArg.length()) {
            if ((firstArg.substring(len)).contains(secondArg)) {
                int instance = (firstArg.substring(len)).indexOf(secondArg);
                String temp = firstArg.substring(len, len + instance);
                if (temp.length() != 0)
                    System.out.print(temp + " ");
                len = len + secondArg.length() + instance;
            }
            else {
                String temp = firstArg.substring(len);
                System.out.print(temp + " ");
                len = len + (firstArg.substring(len)).length();
            }
        }
    }
}
