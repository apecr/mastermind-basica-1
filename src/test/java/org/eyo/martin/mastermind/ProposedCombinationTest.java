package org.eyo.martin.mastermind;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for combinations")
public class ProposedCombinationTest {

    private Combination proposedCombination = new ProposedCombination();

    @Test
    @DisplayName("Should check that the combination has the right length")
    void combination_length_3() {
        assert !proposedCombination.check("rrr").isCorrect;
        assert proposedCombination.check("rrr").reason.equals("Wrong proposed combination length");
    }

    @Test
    @DisplayName("Should check that the combination has the right colors. x is not a color")
    void combination_incorrect_x(){
        assert proposedCombination.check("rxrr").isCorrect == false;
        assertEquals("Wrong colors, they must be: rbygop", proposedCombination.check("rxrr").reason);
    }

    @Test
    @DisplayName("Should check that the combination has the right colors. a is not a color")
    void combination_incorrect_a(){
        assert proposedCombination.check("rarr").isCorrect == false;
    }

    @Test
    @DisplayName("Should check that the combination has the right colors")
    void combination_correct(){
        assert proposedCombination.check("rrrr").isCorrect == true;
        assertEquals(null, proposedCombination.check("rrrr").reason);
    }

    @Test
    @DisplayName("Should check that the combination has the lenght. 5")
    void combination_incorrect_length_5(){
        assert proposedCombination.check("rybgpo").isCorrect == false;
    }

    @Test
    @DisplayName("Should check that the combination has right colors. Ñ is not a color")
    void combination_incorrect_length_nh(){
        assert proposedCombination.check("rybÑ").isCorrect == false;
    }


}
