import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ввели строку: ");
        String in = "сенсация: поп яица снес";
        System.out.println(in);
        char[] arrChar = in.toCharArray();
        int sizeArr = VisitToArr(arrChar);
        char[] filtredArr = FiltredArr(arrChar, sizeArr);
        Answer(filtredArr);

    }

    public static void Answer(char[] in) {
        for (int i = 0; i <= in.length / 2 - 1; i++) {
            if (in[i] != in[in.length - i - 1]) {
                System.out.println("Эта фраза не является палиндромом.");
                break;
            } else if (i == in.length / 2 - 1)
                System.out.println("Эта фраза является палиндромом.");
        }

    }

    public static int VisitToArr(char[] in) {
        int sizeFiltArr = 0;
        Filter filter = new Filter();
        for (int i = 0; i < in.length; i++) {
            boolean k = Filter.isValid(in[i]);
            if (k == true) { // Почему работает толко через доп переменную? Почему нельзя вместо "к" указать "filter"?
                sizeFiltArr++;
            }
        }
        return sizeFiltArr;
    }


    public static char[] FiltredArr(char[] in, int sizeFiltArr) {
        char[] filtredArr = new char[sizeFiltArr];
        boolean k;
        int n = 0;
        Filter filter = new Filter();
        for (int i = 0; i < in.length; i++) {
            k = Filter.isValid(in[i]);
            if (k == true) {
                filtredArr[n] = in[i];
                n++;
            }
        }
        return filtredArr;
    }

}