public class HelloWorld {
    public static void main(String[] args) {
        int marks[] = {3, 5, 4, 8, 9, 2, 2, 10};

        for (int i = 0; i <= marks.length; i++){

                int t = marks[i];
            marks[i] = marks[i + 1];
                marks[i + 1] = t;

            }

        System.out.println("m[" + i + "]=" + marks[i]);
    }
}

//   int x = (int) (Math.random() * 21 - 10);

