package com.mr13.recipeapp.controllers;

import com.mr13.recipeapp.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;

public class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController controller;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        controller = new IndexController(recipeService);
    }

    @Test
    public void getIndexPage() {

        String viewName = controller.getIndexPage(model);

        assertEquals("index", viewName);

        Mockito.verify(recipeService, times(1)).getRecipes();
        Mockito.verify(model, times(1)).addAttribute(eq("recipes"), anySet());

    }
}












