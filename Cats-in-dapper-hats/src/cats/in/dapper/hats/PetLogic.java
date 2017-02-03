/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats.in.dapper.hats;

/**
 *provide the logical behavior of a "pet" in the game. 
 * 
 * the original idea was something along the lines of having a bunch of floating
 * cat/bunny/puppy/etc heads that made homes in hats. Play on words and all 
 * that, and rather than fully grown cats, they'd be juvenile. 
 * playing up the cute angle.
 * 
 * The development of the idea brought up the possibility of the cats engaging 
 * in different sorts of behaviors. specifically, interacting with each other 
 * as well as potentially the user via interest, affection, curiosity, dislike, 
 * and so on.
 * 
 * preliminary expressed emotions;
 * interest;pet should have certain preferred categories of items/individuals
 * affection; pet should respond to "favorable" actions with enthusiasm
 * dislike; pet should have learned an innate negative preferences
 * curiosity; pet should have a variable level of general and specific interest
 * happiness; pet should have an expressed measure of contentment
 * sadness; pet should have an expressed measure of discontent when appropriate
 * 
 * each instantiated pet unit should also have a slightly different personality,
 * expressing more of some trait and less of others, or veering towards specific
 * preprogrammed or generated behavioral patterns. pattern composition should be
 * used to provide an almost endless variation matrix.
 * 
 * current obstacles; 
 * -communicating emotions to outside of class
 * -storing and quantifying pet emotions
 * -instantiating and storing innate preference profiles
 * -varying emotional states over time and due to stimuli
 * @author Calibash
 */
public class PetLogic {
    private IPetPersonality storedPersonalityProfile;
    public PetLogic(IPetPersonality personality){}
    
    
}
