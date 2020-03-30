
public class Myapp {
    public static void main(String[] args){
        String n = new String();
        StringBuilder str = new StringBuilder();
        for (String arg : args) str.append(arg);                             //命令行读取参数
        char[] ch = str.toString().toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '-' && ch[i+1] == 'n')
                for(;ch[i+2] >= '0' && ch[i+2] <= '9';i++)
                    n += ch[i+2];                                           //题目数量
            if(ch[i] == '-' && ch[i+1] == 'r')
                ;
        }
    }
}
