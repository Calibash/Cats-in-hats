/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats.in.dapper.hats;

/**
 * serve as an integration point for personality weights which belonging to an 
 * entity
 * @author Calibash
 */
public interface IPetPersonality {
    //method representing a pet having an experience which may influence it
    void experienceEvent();//TODO determine interface element
    //method for determining a pet's tendency towards curiosity
    Integer curiosityTendency();
    //method for determining a pet's cheerfulness, becomes happy
    Integer cheerfulnessTendency();
    //method for determing a pet's innate stubbornness
    Integer stubbornnessTendency();
    //method for determing how easily a pet becomes sad
    Integer sadnessTendency();
}
