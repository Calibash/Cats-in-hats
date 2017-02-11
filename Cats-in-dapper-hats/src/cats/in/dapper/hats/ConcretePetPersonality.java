/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats.in.dapper.hats;

/**
 *I am legitimately not sure what i am putting into this pet's personality. 
 * i assume it's going do be drunk as a skunk, just as i am right now
 * @author Calibash
 */
public class ConcretePetPersonality implements IPetPersonality{
    private Integer curiosityLevel;
    private Integer cheerfulnessLevel;
    private Integer stubbornnessLevel;
    private Integer sadnessLevel;
    public ConcretePetPersonality(
            Integer curiousityValue, 
            Integer cheerfullnessValue,
            Integer stubbornnessValue,
            Integer sadnessValue){
        this.cheerfulnessLevel = cheerfullnessValue;
        this.curiosityLevel = curiousityValue;
        this.stubbornnessLevel = stubbornnessValue;
        this.sadnessLevel = sadnessValue;
    };
    @Override
    public void experienceEvent() {
        System.out.println("an event just happened");
    }

    @Override
    public Integer curiosityTendency() {
        return this.curiosityLevel;
    }

    @Override
    public Integer cheerfulnessTendency() {
        return this.cheerfulnessLevel;
    }

    @Override
    public Integer stubbornnessTendency() {
        return this.stubbornnessLevel;
    }

    @Override
    public Integer sadnessTendency() {
        return this.sadnessLevel;
    }
    
}
