
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        CommandImpl command = new CommandImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine().trim();


            String[] splitStr = str.split(" ");

            List<String> splitStrTrim = new ArrayList<>();
            for (String s : splitStr) {
                s = s.trim();
                if ("".equals(s)) {
                    continue;
                }
                splitStrTrim.add(s.toLowerCase());
            }

            if (splitStrTrim.size() == 0) {
                continue;
            }

            String prefix = splitStrTrim.get(0);
            switch (prefix) {
                case Commands.ADD:
                    command.add(splitStrTrim.get(1), splitStrTrim.get(2), new BigDecimal(splitStrTrim.get(3)));
                    continue;
                case "report":
                    String reportStr = prefix + " " + splitStrTrim.get(1);
                    if (reportStr.equals(Commands.REPORT_SHOP)) {
                        command.reportShop();
                    }
                    if (reportStr.equals(Commands.REPORT_CATEGORY)) {
                        command.reportCategory();
                    }
                    continue;
                case Commands.DETAILS:
                    command.details(splitStrTrim.get(1));
                    continue;
                case Commands.EXIT:
                    command.exit(scanner);
                    break;
                default:
                    break;
            }

        }


    }


}
