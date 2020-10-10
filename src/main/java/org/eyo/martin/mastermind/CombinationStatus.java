package org.eyo.martin.mastermind;

/**
 * albertoeyo created on 10/10/2020
 **/
public class CombinationStatus {
    public boolean isCorrect;
    public String reason;

    public CombinationStatus(boolean isCorrect, String reason) {
        this.isCorrect = isCorrect;
        this.reason = reason;
    }
}
