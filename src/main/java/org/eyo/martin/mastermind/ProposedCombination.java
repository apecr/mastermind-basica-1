package org.eyo.martin.mastermind;

import java.util.Arrays;

/**
 * albertoeyo created on 10/10/2020
 **/
public class ProposedCombination implements Combination {


    String[] allowedCharacters = {"r", "b", "y", "g", "o", "p"};

    public static final String WRONG_PROPOSED_COMBINATION_LENGTH = "Wrong proposed combination length";
    public static final String WRONG_COLORS_THEY_MUST_BE = "Wrong colors, they must be: ";

    private static final int COMBINATION_SIZE = 4;

    private boolean isRightLength(String sCombination){
        return sCombination.length() == COMBINATION_SIZE;
    }

    private String getWrongColorErrorMessage(){
        return WRONG_COLORS_THEY_MUST_BE.concat(String.join("", allowedCharacters));
    }

    private boolean areCharactersAllowed(String sCombination){
        for (String element : sCombination.split("")){
            if (!Arrays.asList(allowedCharacters).contains(element))
                return false;
        }
        return true;
    }


    private boolean isCorrect(String sCombination) {
        return this.isRightLength(sCombination) && areCharactersAllowed(sCombination);
    }

    private String getReason(String sCombination){
        if (!this.isRightLength(sCombination))
            return WRONG_PROPOSED_COMBINATION_LENGTH;
        if (!this.areCharactersAllowed(sCombination))
            return this.getWrongColorErrorMessage();
        return null;
    }

    @Override
    public CombinationStatus check(String sCombination) {
        return new CombinationStatus(this.isCorrect(sCombination), this.getReason(sCombination));
    }
}
