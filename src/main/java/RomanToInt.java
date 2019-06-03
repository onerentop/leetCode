import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wangren.
 * @Description: TODO()
 * @Date:Created in 2019-06-03 09:58.
 * @Modified By:
 */
public class RomanToInt {
    public static int romanToInt(String s) {
        int result=0;//存放结果
        Map<String,Integer> luomab = new HashMap<>();//建立罗马表
        //插入对应关系
        luomab.put("I",1);
        luomab.put("V", 5);
        luomab.put("X", 10);
        luomab.put("L", 50);
        luomab.put("C", 100);
        luomab.put("D", 500);
        luomab.put("M", 1000);
        luomab.put("F", 0);
        s = s + "F";
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            if ((i+1) == chars.length) continue;
            if(luomab.get(""+chars[i]+"")>=luomab.get(""+chars[i+1]+"")) {
                result+=luomab.get(""+chars[i]+"");
            }
            else
            {
                result+=(luomab.get(""+chars[i+1]+"")-luomab.get(""+chars[i]+""));
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int tv = RomanToInt.romanToInt("III");
        System.out.println(tv);
    }
}
