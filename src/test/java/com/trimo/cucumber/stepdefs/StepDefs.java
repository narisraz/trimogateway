package com.trimo.cucumber.stepdefs;

import com.trimo.TrimogatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TrimogatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
