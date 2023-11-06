package lesson.lesson21.taski;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class InventoryServiceTest {
    private final InventoryService inventoryService = new InventoryService();


    private static Object testCheckProductStockValues() {
        return new Object[]{
                new Object[]{"ABC123", 100},
                new Object[]{"XYZ987", 200},
                new Object[]{"IJK654", 150}
        };
    }

    /**
     * Тест, который проверяет, возвращает ли метод checkProductStock(String sku) точное количество продуктов на
     * складе по String sku
     *
     * @param sku      - уникальный идентификатор продукта (String)
     * @param expected - количество продуктов на сладе (int)
     *                 ссылка на данные метод "testCheckProductStockValues"
     */
    @Test
    @Parameters(method = "testCheckProductStockValues")
    public void checkProductStockPositiveTest(String sku, int expected) {
        Assertions.assertEquals(expected, inventoryService.checkProductStock(sku));
    }

    private static Object testUpdateStockBooleanValues() {
        return new Object[]{
                new Object[]{"ABC123", -150, false},
                new Object[]{"XYZ987", -250, false},
                new Object[]{"IJK654", -350, false},
                new Object[]{"adada", 150, false},
                new Object[]{"ASdc", -350, false},
                new Object[]{"ABC123", 150, true},
                new Object[]{"XYZ987", 200, true},
                new Object[]{"IJK654", 350, true},
                new Object[]{"ABC123", -50, true},
                new Object[]{"XYZ987", -4, true},
                new Object[]{"IJK654", -20, true},
        };
    }

    /**
     * Тест, который проверяет, возвращает ли метод updateStock(String sku, int quantityChange) false если было передано
     * неправильное название продукта или хотят купить продуктов больше чем есть в складу.
     * Тест, который проверяет, возвращает ли метод updateStock(String sku, int quantityChange) true если было передано
     * правильное название продукта и если хотят купить продуктов меньше чем есть на складу
     *
     * @param sky            - уникальный идентификатор продукта (String)
     * @param quantityChange - количество продуктов (int)
     * @param expected       - что ожидаем получить
     *                       ссылка на данные метод "testUpdateStockBooleanValues"
     */
    @Test
    @Parameters(method = "testUpdateStockBooleanValues")
    public void updateStockBooleanTest(String sky, int quantityChange, boolean expected) {
        Assertions.assertEquals(expected, inventoryService.updateStock(sky, quantityChange));
    }

    private static Object testUpdateStockTrueValues() {
        return new Object[]{
                new Object[]{"ABC123", 150, 250},
                new Object[]{"XYZ987", 200, 400},
                new Object[]{"IJK654", 200, 350},
                new Object[]{"ABC123", -50, 50},
                new Object[]{"XYZ987", -20, 180},
                new Object[]{"IJK654", -50, 100}
        };
    }

    /**
     * Тест, который проверяет 1:
     * Возвращает ли метод updateStock(String sku, int quantityChange) true если мы успешно изменили количество продуктов
     * Тест, который проверяет 2:
     * Увеличилось ли количество продуктов в складу после успешного добавления если мы успешно добавили продукты
     *
     * @param sky            - уникальный идентификатор продукта (String)
     * @param quantityChange - количество продуктов (int)
     * @param expected       - что ожидаем получить
     *                        ссылка на данные метод "testUpdateStockTrueValues"
     */
    @Test
    @Parameters(method = "testUpdateStockTrueValues")
    public void updateStockProductAddMoreSameProductOnStockTest(String sky, int quantityChange, int expected) {
        Assertions.assertTrue(inventoryService.updateStock(sky, quantityChange));

        Assertions.assertEquals(expected, inventoryService.checkProductStock(sky));
    }
}