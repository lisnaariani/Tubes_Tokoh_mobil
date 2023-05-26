package id.lisna.mobil.controller;

import id.lisna.mobil.dao.CategoryDAO;
import id.lisna.mobil.dao.CategoryDAOMySQL;
import id.lisna.mobil.model.Category;
import java.util.List;

public class CategoryController {
    private CategoryDAO dao = new CategoryDAOMySQL();
    
    public List<Category> getAllData() {
        return dao.getAllCategory();
    }
}
