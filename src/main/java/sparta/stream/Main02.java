package sparta.stream;

import java.util.Arrays;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {


        List<String> nameArr = Arrays.asList("조희찬", "조현종", "조희성", "김정묵", "최주동");


        int countCho = (int) nameArr.stream().filter(countNameCho -> countNameCho.startsWith("조")).count();

        int countKim = (int) nameArr.stream().filter(countNameKim -> countNameKim.startsWith("김")).count();

        int countchoi = (int) nameArr.stream().filter(countChoi -> countChoi.startsWith("최")).count();

        System.out.println(countCho);

        System.out.println("----------------------");

        System.out.println(countKim);

        System.out.println("----------------------");

        System.out.println(countchoi);

        for (int i = 0; i < nameArr.size(); i++) {
            if (nameArr.get(i).startsWith("조")) {
                System.out.println("조로 시작하는 이름입니다." + nameArr.get(i));
            } else if (nameArr.get(i).startsWith("김")) {
                System.out.println("김으로 시작하지 않는 이름입니다." + nameArr.get(i));
            } else if (nameArr.get(i).startsWith("최")) {
                System.out.println("최로 시작하는 이름입니다." + nameArr.get(i));
            }
        }
    }
}
