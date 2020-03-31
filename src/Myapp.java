
class Myapp {
    public static void main(String[] args) {
        int n = 0;
        int r = -1;
        Double[] Nums = new Double[4];
        char[] compute = {'+', '-', '*', '/'};
        for (int i = 0; i < args.length; ++i) {
            if (args[i].equals("-n"))
                n = Integer.valueOf(args[i + 1]);              //n道题
            if (args[i].equals("-r")) {
                r = Integer.valueOf(args[i + 1]);             //控制题目中数值
            }
        }
        if (r == -1) {
            System.out.println("请给定参数");
        } else {
            for (int j = 0; j < Nums.length; ++j)            //生成随机数
                Nums[j] = Math.random() * r;
        }
    }
}

