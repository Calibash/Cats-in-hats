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
    private Integer curiousityLevel;
    private Integer cheerfulnessLevel;
    private Integer stubbornnessLevel;
    private Integer sadnessLevel;
    public ConcretePetPersonality(
            Integer curiousityValue, 
            Integer cheerfullnessValue,
            Integer stubbornnessValue,
            Integer sadnessValue){
        this.curiousityLevel = curiousityValue;
        this.cheerfulnessLevel = curiousityValue;
        this.stubbornnessLevel = stubbornnessValue;
        this.sadnessLevel = sadnessValue;
    };
    @Override
    public void experienceEvent() {
        System.out.println("an event just happened");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer curiosityTendency() {
        return this.cheerfulnessLevel;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer cheerfulnessTendency() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer stubbornnessTendency() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer sadnessTendency() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
