package pl.kfugat.productcatalog;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Collections;
import java.util.List;

public class SQLProductStorage implements ProductStorage {
    private JdbcTemplate jdbcTemplate;

    public SQLProductStorage(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<ProductData> allPublished(){
        return Collections.emptyList();
    }

    @Override
    public void save(ProductData newProduct) {

    }

    @Override
    public ProductData load(String productId) {
        return null;
    }

}
