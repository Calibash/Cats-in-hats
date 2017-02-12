/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats.in.dapper.hats;

/**
 *Serves as a instantiation and storage point for persistent traits for a given
 * pets interactive profile within the game. 
 * 
 * -final product should be a set of characteristics which can be both input and
 * saved from an already "instantiated" personality object to produce the "same" 
 * pet a user has been interacting with. in essence, it should save the core 
 * elements of the "individual's" internal decision making processes such that 
 * it can be re-instantiated from a saved state, or cloned.
 * 
 * -provide a degree of uniqueness between otherwise similar members of a 
 * particular class of entities, with enough complexity that the possibility of 
 * two randomly generated entities behaving exactly the same in all situations
 * is borderline non-existent. (note that this is the eventual goal)
 * 
 * -provide a degree of user engrossment with the qualities displayed by an 
 * interactive entity. such entities should not be perceptively artificial, 
 * there should be a degree of consistency mixed with a degree of agency.
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
        //TODO - CLS - add in sanity checks for input values being viable
        
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
