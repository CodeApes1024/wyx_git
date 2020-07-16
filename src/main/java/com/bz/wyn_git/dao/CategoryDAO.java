package com.bz.wyn_git.dao;

import java.util.List;

public interface CategoryDAO {
    List<CategoryDAO> queryByCategory(String name);
    List<CategoryDAO> queryByAll(String name);
}
