package org.eyo.martin.mastermind;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for combinations")
public class ProposedCombinationTest {

    private Combination proposedCombination = new ProposedCombination();

    @Test
    @DisplayName("Should check that the combination has the right length")
    void combination_length_3() {
        Boolean result = proposedCombination.isCorrect("rrr");
        assert result == Boolean.FALSE;
    }

}
