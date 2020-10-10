package org.eyo.martin.mastermind;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for combinations")
public class ProposedCombinationTest {

    private Combination proposedCombination = new ProposedCombination();

    @Test
    @DisplayName("Should check that the combination has the right length")
    void combination_length_3() {
        assert !proposedCombination.isCorrect("rrr");
    }

    @Test
    @DisplayName("Should check that the combination has the right colors. x is not a color")
    void combination_incorrect(){
        assert proposedCombination.isCorrect("rxrr") == false;
    }

    @Test
    @DisplayName("Should check that the combination has the right colors")
    void combination_correct(){
        assert proposedCombination.isCorrect("rrrr") == true;
    }

}
