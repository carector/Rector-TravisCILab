package com.rector;

public class CILab implements CILabInterface {
    private String myString;

    public CILab()
    {
        myString = "";
    }

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        
        // Cases where valid:
        // - All chars are uppercase
        // - All chars are lowercase
        // - All chars except first are lowercase
        
        if(myString.length() == 0)
            return false;         
        if(myString.length() == 1)
            return true;
            
        boolean firstCharCapitalized = Character.isUpperCase(myString.charAt(0));
        boolean secondCharCapitalized = Character.isUpperCase(myString.charAt(1)); 

        if(!firstCharCapitalized && secondCharCapitalized) return false;

        for(int i = 2; i < myString.length(); i++)
            if(Character.isUpperCase(myString.charAt(i)) != secondCharCapitalized || myString.charAt(i) == ' ')
                return false;

        return true;
    }

}

