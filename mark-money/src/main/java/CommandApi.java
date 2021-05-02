import java.math.BigDecimal;
import java.util.Scanner;

public interface CommandApi {
    /**
     * @param shopName
     * @param category
     * @param money
     * @return void
     * @Description 添加商品
     * @date 2021/5/2
     */
    void add(String shopName, String category, BigDecimal money);

    /**
     * @return java.lang.String
     * @Description 输出按商店分类的金额报告
     * @date 2021/5/2
     */
    void reportShop();

    /**
     * @return java.lang.String
     * @Description 输出按类别分类的金额报告
     * @date 2021/5/2
     */
    void reportCategory();

    /**
     * @param shopName
     * @return java.lang.String
     * @Description 输出有关商店的信息：将每个单独的条目显示出来
     * @author Ghost
     * @date 2021/5/2
     */
    void details(String shopName);

    void exit(Scanner scanner);
}
