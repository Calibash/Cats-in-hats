/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats.in.dapper.hats;

/**
 * serve as an integration point for personality weights which belonging to an 
 * entity.
 * 
 * development hurdles; presented interface values seem under-representative of 
 * what will be needed in near future to "describe" various tendencies. Integer 
 * use is static, and will most likely tie things in too closely.
 * 
 * alternatives; separate component classes, narrowing definition of expressed
 * personality traits to a finer grain. 
 * 
 * @author Calibash
 */
public interface IPetPersonality {
    //method representing a pet having an experience which may influence it
    void experienceEvent();//TODO determine interface element
    //method for determining a pet's tendency towards curiosity
    Integer curiosityTendency();
    //method for determining a pet's cheerfulness, how easily it becomes happy
    Integer cheerfulnessTendency();
    //method for determing a pet's innate stubbornness
    Integer stubbornnessTendency();
    //method for determing how easily a pet becomes sad
    Integer sadnessTendency();
}
