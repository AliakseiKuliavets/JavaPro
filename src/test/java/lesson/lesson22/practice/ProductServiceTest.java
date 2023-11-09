package lesson.lesson22.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;


public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private MerchService merchService;

    private static final Product product = new Product("Banana", 20.0, "China");

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        productService.save(product);
        productService.save(new Product("Orange", 20.0, "India"));
        productService.save(new Product("Mango", 20.0, "Indonesia"));
    }

    @Test
    public void saveTest() {
        Product product = new Product("Apple", 20.0, "China");
        doNothing().when(merchService).setArticle(product);
        productService.save(product);

        Assertions.assertEquals(4, productService.getProducts().size());
        verify(merchService).setArticle(product);
    }

    @Test
    public void getAllWithoutSupplier() {
        when(merchService.withoutSupplierInfo()).thenReturn(true);
        List<Product> products = productService.getAll();

        for (Product product : products) {
            Assertions.assertNull(product.getSupplier());
        }
        verify(merchService).withoutSupplierInfo();
    }

    @Test
    public void getAllWithSupplier() {
        when(merchService.withoutSupplierInfo()).thenReturn(false);
        List<Product> products = productService.getAll();

        for (Product product : products) {
            Assertions.assertNotNull(product.getSupplier());
        }
        verify(merchService).withoutSupplierInfo();
    }

    @Test
    public void getByIdWithMarkup() {
        when(merchService.getMarkup()).thenReturn(10.0);
        int id = product.getId();

        double price = productService.getById(id).getPrice();
        Assertions.assertEquals(22.0, price);

        verify(merchService).getMarkup();
    }

    @Test
    public void deleteFullDeletion(){
        when(merchService.fullDeletion()).thenReturn(true);
        int id = product.getId();

        productService.delete(id);
        Assertions.assertNull(productService.getById(id));

        verify(merchService).fullDeletion();
    }

    @Test
    public void deleteActive(){
        when(merchService.fullDeletion()).thenReturn(false);
        int id = product.getId();

        productService.delete(id);
        Assertions.assertFalse(productService.getById(id).isActive());

        verify(merchService).fullDeletion();
    }
}