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
        l.setString("test with spaces");
        assert !l.detectCapitalUse();
    }
}
