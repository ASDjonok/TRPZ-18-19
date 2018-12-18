package lab6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class МузичнийАльбом {
    private static int МАКСИМАЛЬНА_КІЛЬКІСТЬ_КОМПОЗИЦІЙ_В_АЛЬБОМІ = 12;
    private МузичнаКомпозиція[] музичніКомпозиції = new МузичнаКомпозиція[МАКСИМАЛЬНА_КІЛЬКІСТЬ_КОМПОЗИЦІЙ_В_АЛЬБОМІ];
    private int підраховувач;

    public void додати(МузичнаКомпозиція музичнаКомпозиція){
        музичніКомпозиції[підраховувач++] = музичнаКомпозиція;
    }

    @Override
    public String toString() {
        String результат = "======== Альбом =========\n";
        for (int i = 0; i < підраховувач; i++) {
            результат += i + 1 + ". " + музичніКомпозиції[i].toString() + "\n";
        }
        return результат + "=========================";
    }

    public int віддайТривалість() {
//        int result =
        int result = 0;
        for (МузичнаКомпозиція музичнаКомпозиція : музичніКомпозиції) {
            if (музичнаКомпозиція != null) {
                result += музичнаКомпозиція.віддайТривалість();
            }
        }
        return result;
        /*return Arrays.stream(музичніКомпозиції).parallel()
                .map(МузичнаКомпозиція::віддайТривалість)
                .collect(Collectors.summingInt(i->i == null ? i : 0));*/
    }
}
