import java.util.Random;

public class Myapp {
    public static void main(String[] args) {
        int n = -1;
        int r = -1;
        //int an = -1;                                        //题目答案
        char[] compute = {'+', '-', '*', '/'};
        for (int i = 0; i < args.length; ++i) {
            if (args[i].equals("-n"))
                n = Integer.parseInt(args[i + 1]);              //n道题
            if (args[i].equals("-r"))
                r = Integer.parseInt(args[i + 1]);             //控制题目中数值
        }
        if (r == -1) {
            System.out.println("ERROR,请给定参数");
        }
        Random r1 = new Random();
        for (int j = 0; j < n; ++j) {
            StringBuilder s = new StringBuilder();
            String ch = (j + 1) + ".";
            s.append(ch);
            int k = r1.nextInt(3);                          //运算符随机个数，0代表一个，以此类推
            switch (k) {
                case 0:
                    s.append(new Myapp().generateData(r));
                    s.append(" ");
                    s.append(compute[r1.nextInt(4)]);
                    s.append(" ");
                    s.append(new Myapp().generateData(r));
                    s.append(" ");
                    break;
                case 1:
                    s.append(new Myapp().generateData(r));
                    s.append(" ");
                    s.append(compute[r1.nextInt(4)]);
                    s.append(" ");
                    s.append(new Myapp().generateData(r));
                    s.append(" ");
                    s.append(compute[r1.nextInt(4)]);
                    s.append(" ");
                    s.append(new Myapp().generateData(r));
                    break;
                case 2:
                    s.append(new Myapp().generateData(r));
                    s.append(" ");
                    s.append(compute[r1.nextInt(4)]);
                    s.append(" ");
                    s.append(new Myapp().generateData(r));
                    s.append(" ");
                    s.append(compute[r1.nextInt(4)]);
                    s.append(" ");
                    s.append(new Myapp().generateData(r));
                    s.append(" ");
                    s.append(compute[r1.nextInt(4)]);
                    s.append(" ");
                    s.append(new Myapp().generateData(r));
                    break;
                default:
                    System.out.println("程序错误");
            }
            s.append(" ");
            s.append("=");
        }
    }

    private StringBuilder generateData(int r) {                       //生成数据
        int nums = -1;
        int[] integer = new int[2];
        StringBuilder str = new StringBuilder();
        Random ran = new Random();
        integer[0] = ran.nextInt(r);
        integer[1] = ran.nextInt(r) + 1;
        if (integer[0] % integer[1] == 0) {
            nums = integer[0] / integer[1];
            str.append(nums);
        } else {
            int g = gcd(integer[0], integer[1]);
            str.append(integer[0] / g);
            str.append('/');
            str.append(integer[1] / g);
        }
        return str;
    }

    private static int gcd(int a, int b) {              //最大公因数函数
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}

