/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats.in.dapper.hats;

/**
 *
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
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer sadnessTendency() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
