package com.rector;

import org.junit.Test;

public class CILabTest {
    
    @Test
    public void testGetSetString1()
    {
        CILab l = new CILab();
        l.setString("Cool string");
        assert l.getString().equals("Cool string");
    }

    @Test
    public void testGetSetString2()
    {
        CILab l = new CILab();
        l.setString("oisjdflasuehsar9w834h39j1e***");
        assert l.getString().equals("oisjdflasuehsar9w834h39j1e***");
    }

    @Test
    public void testGetSetString3()
    {
        CILab l = new CILab();
        l.setString("String\nString");
        assert !l.getString().equals("StringString");
    }

    @Test
    public void testDetectCapitalUse1()
    {
        CILab l = new CILab();
        l.setString("Firstlettercapitalized");
        assert l.detectCapitalUse();
    }

    @Test
    public void testDetectCapitalUse2()
    {
        CILab l = new CILab();
        l.setString("ALLCAPS");
        assert l.detectCapitalUse();
    }

    @Test
    public void testDetectCapitalUse3()
    {
        CILab l = new CILab();
        l.setString("alllowercase");
        assert l.detectCapitalUse();
    }

    @Test
    public void testDetectCapitalUse4()
    {
        CILab l = new CILab();
        l.setString("incorrectCaps");
        assert !l.detectCapitalUse();
    }

    @Test
    public void testDetectCapitalUse5()
    {
        CILab l = new CILab();
        l.setString("AnotherIncorrectCaps");
        assert !l.detectCapitalUse();
    }

    @Test
    public void testDetectCapitalUse6()
    {
        CILab l = new CILab();
        l.setString("invalid space test");
        assert !l.detectCapitalUse();
    }
}
