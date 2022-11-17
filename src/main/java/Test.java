import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {


    public static void main(String[] args) {
        System.out.println("시간 : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        Test test = new Test();

        Consumer a = s -> {System.out.println("===> " + s);};

        a.accept("심성보");

        Function<String,String> b = data -> {
            return data + " 안녕하세요 ";
        };

        String msg = b.apply("파람");

        System.out.println(msg);

    }
}
