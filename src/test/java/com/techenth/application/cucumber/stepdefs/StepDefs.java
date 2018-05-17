package com.techenth.application.cucumber.stepdefs;

import com.techenth.application.SampleApplicationJhipApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SampleApplicationJhipApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
